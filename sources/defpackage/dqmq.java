package defpackage;

import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqmq implements dqnm {
    public final EditText a;
    public final boolean b;
    public final dqkk c;
    public final List d = new ArrayList();
    public TextWatcher e;

    public dqmq(EditText editText, boolean z, dqkk dqkkVar) {
        this.a = editText;
        this.b = z;
        this.c = dqkkVar;
    }

    @Override // defpackage.dqmn
    public final void b(CharSequence charSequence) {
        Editable text = this.a.getText();
        text.getClass();
        if (text.length() > 0) {
            c("\n");
        }
        c(charSequence);
    }

    @Override // defpackage.dqmn
    public final void c(CharSequence charSequence) {
        this.a.getText().append(charSequence);
        this.a.setSelection(this.a.getText().length());
    }

    @Override // defpackage.dqmn
    public final void d() {
        this.a.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // defpackage.dqmn
    public final void e() {
        throw null;
    }

    @Override // defpackage.dqmn
    public final void f(dqrp dqrpVar) {
        SpannableString spannableString = new SpannableString(dqrpVar.b.a());
        spannableString.setSpan(new dqmm(dqrpVar), 0, spannableString.length(), 256);
        g(spannableString);
    }

    @Override // defpackage.dqmn
    public final void g(CharSequence charSequence) {
        EditText editText = this.a;
        int selectionStart = editText.getSelectionStart();
        editText.getText().replace(selectionStart, editText.getSelectionEnd(), charSequence);
        int length = selectionStart + charSequence.length();
        dqno dqnoVar = new dqno(length, length);
        int i = dqnoVar.a;
        int length2 = this.a.length();
        this.a.setSelection(ffmk.g(i, length2), ffmk.g(dqnoVar.b, length2));
    }

    @Override // defpackage.dqmn
    public final void i(CharSequence charSequence) {
        this.a.setText(charSequence);
        this.a.setSelection(this.a.getText().length());
    }

    @Override // defpackage.dqmn
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final String a() {
        return this.a.getText().toString();
    }

    @Override // defpackage.dqnm
    public final void k(dqnl dqnlVar) {
        throw null;
    }

    @Override // defpackage.dqnm
    public final void l(dqnl dqnlVar) {
        throw null;
    }

    @Override // defpackage.dqmn
    public final /* synthetic */ void h() {
    }
}
