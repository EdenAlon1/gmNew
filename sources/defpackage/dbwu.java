package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbwu implements View.OnClickListener {
    public View.OnClickListener a;
    final /* synthetic */ SpannedMultiAutoCompleteTextView b;

    public dbwu(SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView) {
        this.b = spannedMultiAutoCompleteTextView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView = this.b;
        if (spannedMultiAutoCompleteTextView.h != null && spannedMultiAutoCompleteTextView.l()) {
            this.b.j();
        }
        View.OnClickListener onClickListener = this.a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
