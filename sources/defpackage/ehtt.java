package defpackage;

import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehtt implements Runnable {
    final /* synthetic */ TextInputLayout a;

    public ehtt(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ehtc ehtcVar = this.a.b;
        ehtcVar.d.performClick();
        ehtcVar.d.jumpDrawablesToCurrentState();
    }
}
