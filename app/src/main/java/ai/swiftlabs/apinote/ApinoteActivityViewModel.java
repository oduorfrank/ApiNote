package ai.swiftlabs.apinote;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class ApinoteActivityViewModel extends ViewModel {
    private static final String ORIGINAL_COURSE_ID = "ai.swiftlabs.apinote.ORIGINAL_COURSE_ID";
    private static final String ORIGINAL_NOTE_TITLE = "ai.swiftlabs.apinote.ORIGINAL_NOTE_TITLE";
    private static final String ORIGINAL_NOTE_TEXT = "ai.swiftlabs.apinote.ORIGINAL_NOTE_TEXT";
    public String mOriginalCourseId;
    public String mOriginalNoteTitle;
    public String mOriginalNoteText;
    public boolean mIsNewlyCreated = true;

    public void saveState(Bundle outState) {
        outState.putString(ORIGINAL_COURSE_ID, mOriginalCourseId);
        outState.putString(ORIGINAL_NOTE_TITLE, mOriginalNoteTitle);
        outState.putString(ORIGINAL_NOTE_TEXT, mOriginalNoteText);
    }

    public void restoreState(Bundle inState) {
        mOriginalCourseId = inState.getString(ORIGINAL_COURSE_ID);
        mOriginalNoteTitle = inState.getString(ORIGINAL_NOTE_TITLE);
        mOriginalNoteText = inState.getString(ORIGINAL_NOTE_TEXT);
    }
}
