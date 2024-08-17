package edu.learn.studentrecord;

import edu.learn.studentrecord.dtos.Student;

public interface OnItemClickListener {
    void onEditClick(Student student);
    void onDeleteClick(Student student);
}
