package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfr extends rfe implements qwq {
    public rfr(rfp rfpVar) {
        super(rfpVar);
    }

    @Override // defpackage.qwv
    public final int a() {
        rfw rfwVar = ((rfp) this.a).a.a;
        qrh qrhVar = (qrh) rfwVar.a;
        return qrhVar.a.limit() + qrhVar.c.length + (qrhVar.d.length * 4) + rfwVar.j;
    }

    @Override // defpackage.qwv
    public final Class b() {
        return rfp.class;
    }

    @Override // defpackage.rfe, defpackage.qwq
    public final void d() {
        ((rfp) this.a).a().prepareToDraw();
    }

    @Override // defpackage.qwv
    public final void e() {
        qxd qxdVar;
        ((rfp) this.a).stop();
        rfp rfpVar = (rfp) this.a;
        rfpVar.b = true;
        rfw rfwVar = rfpVar.a.a;
        rfwVar.b.clear();
        rfwVar.d();
        rfwVar.f();
        rft rftVar = rfwVar.e;
        if (rftVar != null) {
            rfwVar.c.l(rftVar);
            rfwVar.e = null;
        }
        rft rftVar2 = rfwVar.g;
        if (rftVar2 != null) {
            rfwVar.c.l(rftVar2);
            rfwVar.g = null;
        }
        rft rftVar3 = rfwVar.i;
        if (rftVar3 != null) {
            rfwVar.c.l(rftVar3);
            rfwVar.i = null;
        }
        qrh qrhVar = (qrh) rfwVar.a;
        qrhVar.f = null;
        byte[] bArr = qrhVar.c;
        if (bArr != null) {
            qrhVar.j.b(bArr);
        }
        int[] iArr = qrhVar.d;
        if (iArr != null && (qxdVar = qrhVar.j.b) != null) {
            qxdVar.c(iArr);
        }
        Bitmap bitmap = qrhVar.g;
        if (bitmap != null) {
            qrhVar.j.a(bitmap);
        }
        qrhVar.g = null;
        qrhVar.a = null;
        qrhVar.h = null;
        byte[] bArr2 = qrhVar.b;
        if (bArr2 != null) {
            qrhVar.j.b(bArr2);
        }
        rfwVar.f = true;
    }
}
