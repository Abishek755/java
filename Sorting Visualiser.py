import tkinter as tk
import random

barList = []
lengthList = []
worker = None
number = 30
canvas = None


def generate():
    global barList, lengthList, canvas
    canvas.delete('all')
    barList.clear()
    lengthList.clear()

    canvas_width = 980
    canvas_height = 400
    bar_width = canvas_width // number
    start_x = 10

    for _ in range(number):
        bar_height = random.randint(80, 360)
        rect = canvas.create_rectangle(start_x, canvas_height - bar_height, start_x + bar_width - 2, canvas_height, fill='#5DADE2', outline='')
        barList.append(rect)
        lengthList.append(bar_height)
        start_x += bar_width


def swap(pos_0, pos_1):
    bar11, _, bar12, _ = canvas.coords(pos_0)
    bar21, _, bar22, _ = canvas.coords(pos_1)

    canvas.itemconfig(pos_0, fill='#F1C40F')  
    canvas.itemconfig(pos_1, fill='#F1C40F')  

    canvas.move(pos_0, bar21 - bar11, 0)
    canvas.move(pos_1, bar12 - bar22, 0)
    canvas.update()

    window.after(50)  

    canvas.itemconfig(pos_0, fill='#5DADE2')  
    canvas.itemconfig(pos_1, fill='#5DADE2')  

def _insertion_sort():
    global barList, lengthList

    for i in range(len(lengthList)):
        cursor = lengthList[i]
        cursorBar = barList[i]
        pos = i

        while pos > 0 and lengthList[pos - 1] > cursor:
            lengthList[pos] = lengthList[pos - 1]
            barList[pos], barList[pos - 1] = barList[pos - 1], barList[pos]
            swap(barList[pos], barList[pos - 1])
            yield
            pos -= 1

        lengthList[pos] = cursor
        barList[pos] = cursorBar
        swap(barList[pos], cursorBar)
        yield

def _bubble_sort():
    global barList, lengthList

    for i in range(len(lengthList) - 1):
        for j in range(len(lengthList) - i - 1):
            if lengthList[j] > lengthList[j + 1]:
                lengthList[j], lengthList[j + 1] = lengthList[j + 1], lengthList[j]
                barList[j], barList[j + 1] = barList[j + 1], barList[j]
                swap(barList[j + 1], barList[j])
                yield

def _selection_sort():
    global barList, lengthList

    for i in range(len(lengthList)):
        min_index = i
        for j in range(i + 1, len(lengthList)):
            if lengthList[j] < lengthList[min_index]:
                min_index = j

        if min_index != i:
            lengthList[i], lengthList[min_index] = lengthList[min_index], lengthList[i]
            barList[i], barList[min_index] = barList[min_index], barList[i]
            swap(barList[i], barList[min_index])
            yield

def _quick_sort(start, end):
    if start < end:
        pivot_index = start
        pivot = lengthList[end - 1]
        for i in range(start, end - 1):
            if lengthList[i] <= pivot:
                lengthList[i], lengthList[pivot_index] = lengthList[pivot_index], lengthList[i]
                barList[i], barList[pivot_index] = barList[pivot_index], barList[i]
                swap(barList[i], barList[pivot_index])
                yield
                pivot_index += 1

        lengthList[pivot_index], lengthList[end - 1] = lengthList[end - 1], lengthList[pivot_index]
        barList[pivot_index], barList[end - 1] = barList[end - 1], barList[pivot_index]
        swap(barList[pivot_index], barList[end - 1])
        yield

        yield from _quick_sort(start, pivot_index)
        yield from _quick_sort(pivot_index + 1, end)

def merge(left, right):
    result = []
    i = j = 0
    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1
    result.extend(left[i:])
    result.extend(right[j:])
    return result

def _merge_sort(start, end):
    if end - start > 1:
        mid = (start + end) // 2
        yield from _merge_sort(start, mid)
        yield from _merge_sort(mid, end)

        left = lengthList[start:mid]
        right = lengthList[mid:end]

        merged = merge(left, right)

        for i in range(len(merged)):
            lengthList[start + i] = merged[i]

            canvas.itemconfig(barList[start + i], fill='#F1C40F')

            bar_coords = canvas.coords(barList[start + i])
            canvas.coords(barList[start + i], bar_coords[0], canvas.winfo_height() - merged[i], bar_coords[2], canvas.winfo_height())

            yield

            canvas.itemconfig(barList[start + i], fill='#5DADE2')

        for i in range(len(merged)):
            canvas.itemconfig(barList[start + i], fill='#5DADE2')

def insertion_sort():
    global worker
    worker = _insertion_sort()
    animate()

def selection_sort():
    global worker
    worker = _selection_sort()
    animate()

def bubble_sort():
    global worker
    worker = _bubble_sort()
    animate()

def quick_sort():
    global worker
    worker = _quick_sort(0, len(lengthList))
    animate()

def merge_sort():
    global worker
    worker = _merge_sort(0, len(lengthList))
    animate()


def animate():
    global worker
    try:
        next(worker)
        window.after(100, animate)
    except StopIteration:
        worker = None


def setup_visualizer():
    global canvas, window

    window = tk.Tk()
    window.title("Sorting Visualizer")
    window.configure(bg="#f0f2f5")
    window.geometry("1000x500")

    canvas = tk.Canvas(window, width=1000, height=400, bg='white', highlightthickness=0)
    canvas.grid(column=0, row=0, columnspan=6, pady=10)

    button_style = {'padx': 10, 'pady': 6, 'bg': '#4A90E2', 'fg': 'white', 'font': ('Arial', 10, 'bold')}

    tk.Button(window, text='Shuffle', command=generate, **button_style).grid(column=0, row=1, padx=5, pady=10)
    tk.Button(window, text='Insertion Sort', command=insertion_sort, **button_style).grid(column=1, row=1, padx=5)
    tk.Button(window, text='Selection Sort', command=selection_sort, **button_style).grid(column=2, row=1, padx=5)
    tk.Button(window, text='Bubble Sort', command=bubble_sort, **button_style).grid(column=3, row=1, padx=5)
    tk.Button(window, text='Quick Sort', command=quick_sort, **button_style).grid(column=4, row=1, padx=5)
    tk.Button(window, text='Merge Sort', command=merge_sort, **button_style).grid(column=5, row=1, padx=5)
    generate()

    window.mainloop()

def accept_value():
    global number
    try:
        number = int(entry.get())
    except ValueError:
        number = 50
    setup_visualizer()
    
input_win = tk.Tk()
input_win.geometry("400x200")
input_win.title("Input")
input_win.configure(bg="#f0f2f5")

tk.Label(input_win, text="Enter number of bars to visualize:", bg="#f0f2f5", font=('Arial', 12)).pack(pady=10)
entry = tk.Entry(input_win, width=20, font=('Arial', 12))
entry.pack()

tk.Button(input_win, text="Submit", command=accept_value, bg="#4A90E2", fg="white", font=('Arial', 10, 'bold')).pack(pady=20)

input_win.mainloop()
