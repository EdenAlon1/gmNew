package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elbq implements TextWatcher {
    final /* synthetic */ TextWatcher a;
    final /* synthetic */ String b;
    final /* synthetic */ elbx c;

    public elbq(elbx elbxVar, TextWatcher textWatcher, String str) {
        this.a = textWatcher;
        this.b = str;
        this.c = elbxVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (ekyf.v()) {
            this.a.afterTextChanged(editable);
            return;
        }
        ekzm b = this.c.b(this.b);
        try {
            this.a.afterTextChanged(editable);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (ekyf.v()) {
            this.a.beforeTextChanged(charSequence, i, i2, i3);
            return;
        }
        ekzm b = this.c.b(this.b);
        try {
            this.a.beforeTextChanged(charSequence, i, i2, i3);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (ekyf.v()) {
            this.a.onTextChanged(charSequence, i, i2, i3);
            return;
        }
        ekzm b = this.c.b(this.b);
        try {
            this.a.onTextChanged(charSequence, i, i2, i3);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
