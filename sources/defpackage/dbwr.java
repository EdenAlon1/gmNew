package defpackage;

import android.widget.ListAdapter;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbwr implements Runnable {
    final /* synthetic */ dbws a;

    public dbwr(dbws dbwsVar) {
        this.a = dbwsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListAdapter listAdapter;
        SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView = (SpannedMultiAutoCompleteTextView) this.a.a.get();
        if (spannedMultiAutoCompleteTextView == null || (listAdapter = spannedMultiAutoCompleteTextView.j) == null) {
            return;
        }
        spannedMultiAutoCompleteTextView.k(listAdapter.getCount());
    }
}
