package defpackage;

import android.database.DataSetObserver;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbws extends DataSetObserver {
    public final WeakReference a;
    private final Runnable b = new dbwr(this);

    public dbws(SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView) {
        this.a = new WeakReference(spannedMultiAutoCompleteTextView);
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView = (SpannedMultiAutoCompleteTextView) this.a.get();
        if (spannedMultiAutoCompleteTextView == null || spannedMultiAutoCompleteTextView.j == null) {
            return;
        }
        spannedMultiAutoCompleteTextView.post(this.b);
    }
}
