package com.wawra.posts.logic.models

enum class ErrorCodes(val code: Int) {
    POSTS_VIEW_MODEL_GET_POSTS(1),
    POST_DETAILS_VIEW_MODEL_GET_POST(2),
    DELETE_DIALOG_VIEW_MODEL_GET_POST(3),
    DELETE_DIALOG_VIEW_MODEL_DELETE_POST(4),
    POST_EDIT_VIEW_MODEL_GET_POST(5),
    POST_EDIT_VIEW_MODEL_SAVE_POST(6),
    POST_EDIT_VIEW_MODEL_CREATE_POST(7),
    POST_EDIT_VIEW_MODEL_SAVE_POST_NOT_SAVED(8),
    IMAGE_URL_DIALOG_NO_ACTIVITY(9),
    DELETED_POSTS_VIEW_MODEL_GET_POSTS(10),
    DELETED_POSTS_VIEW_MODEL_RESTORE_POST(11),
    DELETED_POSTS_VIEW_MODEL_RESTORE_POST_NOT_RESTORED(12),
}