package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.add_edit_note.use_case

/**
 * This is the class that we will inject into our viewModels
 * It keeps it more concise than having to inject all of the individual use cases
 * */
data class NoteUseCases(
    val getNotesUseCase: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNoteUseCase: AddNoteUseCase,
    val getNoteUseCase: GetNoteUseCase
)
