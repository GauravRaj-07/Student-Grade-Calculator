# 🎓 Student Grade Calculator (Java Swing)

This Java Swing application allows students to input their marks in five subjects and calculates the total marks, percentage, and corresponding grade. It is a simple, interactive GUI app ideal for learning Java Swing and basic logic implementation.

---

## 🧮 Features

- Fields for:
  - 📘 Math
  - 🔬 Science
  - 📖 English
  - 🌍 Social Studies
  - 💻 Computer
- Calculates:
  - Total Marks (out of 500)
  - Percentage
  - Grade
- Grade is calculated based on percentage range
- Handles:
  - Invalid input (non-numeric values)
  - Out-of-range marks (below 0 or above 100)
- Displays result in a dialog using `JOptionPane`
- Clean and user-friendly GUI layout

---

## 🎖️ Grading Criteria

| Percentage   | Grade     |
|--------------|-----------|
| 90–100       | A+        |
| 80–89        | A         |
| 70–79        | B         |
| 60–69        | C         |
| 50–59        | D         |
| Below 50     | F (Fail)  |

---

## 📸 Screenshots

### 🖥️ Application Startup
![Screenshot 2025-06-22 133907](https://github.com/user-attachments/assets/e2beb32a-f359-4814-be5e-7f9fda949ca6)
![Startup]


---

### 🧾 Entering Student Data
![Screenshot 2025-06-22 133950](https://github.com/user-attachments/assets/64e658dc-523e-4774-9688-6b4827c97ddd)
![Input]

---

### ✅ Final Grade Display
![Screenshot 2025-06-22 134005](https://github.com/user-attachments/assets/70a98e6f-73f5-46c9-ac1b-60eb1b7b7cb0)
![Result]

---

## ▶️ How to Run

```bash
javac GradeCalculatorGUI.java
java GradeCalculatorGUI
```

## 📜 License

This project is open-source and intended for educational, personal, or academic use.

---

## 👨‍💻 Author

**Gaurav Raj**

> Future enhancements may include:
> - Subject weighting
> - PDF report generation
> - Persistent student records

