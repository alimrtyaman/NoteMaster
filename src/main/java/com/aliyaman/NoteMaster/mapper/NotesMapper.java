package com.aliyaman.NoteMaster.mapper;

import com.aliyaman.NoteMaster.dto.NoteCreateRequest;
import com.aliyaman.NoteMaster.dto.NoteResponse;
import com.aliyaman.NoteMaster.model.Note;

public class NotesMapper {

    public static NoteResponse toDto(Note note , NoteResponse noteResponse){
        noteResponse.setId(note.getId());
        noteResponse.setTitle(note.getTitle());
        noteResponse.setDescription(note.getDescription());
        noteResponse.setCreatedAt(note.getCreatedAt());
        return noteResponse;
    }

    public static Note toNote(NoteCreateRequest noteCreateRequest , Note note){
        note.setTitle(noteCreateRequest.getTitle());
        note.setDescription(noteCreateRequest.getDescription());
        return note;
    }
}
