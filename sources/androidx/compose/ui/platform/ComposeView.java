package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.ffjm;
import defpackage.ffkd;
import defpackage.hfd;
import defpackage.hho;
import defpackage.hic;
import defpackage.hla;
import defpackage.iya;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ComposeView extends iya {
    private final hho a;
    private boolean b;

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final void a(ffjm ffjmVar) {
        this.b = true;
        this.a.b(ffjmVar);
        if (isAttachedToWindow()) {
            e();
        }
    }

    @Override // defpackage.iya
    protected final boolean c() {
        return this.b;
    }

    @Override // defpackage.iya
    public final void d(hfd hfdVar) {
        hfdVar.v(420213850);
        ffjm ffjmVar = (ffjm) this.a.a();
        if (ffjmVar == null) {
            hfdVar.v(358356153);
        } else {
            hfdVar.v(150107208);
            ffjmVar.a(hfdVar, 0);
        }
        hfdVar.o();
        hfdVar.o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new hic(null, hla.a);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, ffkd ffkdVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
