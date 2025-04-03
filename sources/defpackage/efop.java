package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efop extends ktb {
    final /* synthetic */ EditText a;
    final /* synthetic */ TextView b;

    public efop(EditText editText, TextView textView) {
        this.a = editText;
        this.b = textView;
    }

    @Override // defpackage.ktb
    public final void c(View view, kxu kxuVar) {
        super.c(view, kxuVar);
        String obj = this.a.getText() != null ? this.a.getText().toString() : "";
        EditText editText = this.a;
        TextView textView = this.b;
        CharSequence w = a.w(textView.getText() != null ? textView.getText().toString() : "", editText.getHint() != null ? editText.getHint().toString() : "", " ");
        kxuVar.C(w);
        kxuVar.O(obj.isEmpty());
        if (obj.isEmpty()) {
            kxuVar.R(w);
        } else {
            kxuVar.R(obj);
        }
    }
}
