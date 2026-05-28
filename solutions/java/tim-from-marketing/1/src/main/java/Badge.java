class Badge {
    public String print(Integer id, String name, String department) {
        String deptLabel;

        if (department == null) {
            // Owner has no department
            deptLabel = "OWNER";
        } else {
            // Normal employee department, always uppercase
            deptLabel = department.toUpperCase();
        }

        if (id == null) {
            // New employee without ID
            return name + " - " + deptLabel;
        } else {
            // Employee with ID
            return "[" + id + "] - " + name + " - " + deptLabel;
        }
    }
}