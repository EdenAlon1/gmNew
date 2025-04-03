package defpackage;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbe implements hjk {
    public final long a;
    public final fgd b;
    public final long c;
    public fbh d;
    public fcv e;
    public final hvi f;

    public /* synthetic */ fbe(long j, fgd fgdVar, long j2) {
        hvi a;
        fbh fbhVar = fbh.a;
        this.a = j;
        this.b = fgdVar;
        this.c = j2;
        this.d = fbhVar;
        fbb fbbVar = new fbb(this);
        fbf fbfVar = new fbf(fbbVar, fgdVar, j);
        hvi a2 = fek.a(hvi.e, new fbg(fbbVar, fgdVar, j), fbfVar);
        int i = ikq.b;
        a = a2.a(new PointerHoverIconModifierElement(ikp.b));
        this.f = a;
    }

    @Override // defpackage.hjk
    public final void g() {
        fcv fcvVar = this.e;
        if (fcvVar != null) {
            this.b.g(fcvVar);
            this.e = null;
        }
    }

    @Override // defpackage.hjk
    public final void h() {
        fcv fcvVar = this.e;
        if (fcvVar != null) {
            this.b.g(fcvVar);
            this.e = null;
        }
    }

    @Override // defpackage.hjk
    public final void i() {
        fcs fcsVar = new fcs(this.a, new fbc(this), new fbd(this));
        this.b.i(fcsVar);
        this.e = fcsVar;
    }
}
