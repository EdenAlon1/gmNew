package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxd extends ClickableSpan {
    private final jlw a;

    public jxd(jlw jlwVar) {
        this.a = jlwVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.b();
    }
}
