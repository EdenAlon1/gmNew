package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dgl extends isz implements itg {
    private final deb a;
    private final dfx b;
    private final ebe c;

    public dgl(isw iswVar, deb debVar, dfx dfxVar, ebe ebeVar) {
        this.a = debVar;
        this.b = dfxVar;
        this.c = ebeVar;
        M(iswVar);
    }

    private static final boolean a(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // defpackage.itg
    public final void s(ifo ifoVar) {
        boolean z;
        char c;
        boolean z2;
        this.a.f(ifoVar.b());
        if (iar.g(ifoVar.b())) {
            ifoVar.p();
            return;
        }
        ifoVar.p();
        this.a.b.a();
        Canvas a = iav.a(ifoVar.t().b());
        dfx dfxVar = this.b;
        if (dfxVar.l()) {
            EdgeEffect c2 = dfxVar.c();
            float f = -Float.intBitsToFloat((int) (ifoVar.b() & 4294967295L));
            z = a(270.0f, (Float.floatToRawIntBits(ifoVar.em(this.c.b(ifoVar.q()))) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), c2, a);
        } else {
            z = false;
        }
        if (dfxVar.r()) {
            c = ' ';
            z = a(0.0f, (((long) Float.floatToRawIntBits(ifoVar.em(((ebf) this.c).a))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), dfxVar.g(), a) || z;
        } else {
            c = ' ';
        }
        if (dfxVar.o()) {
            z = a(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits((-((float) ffln.b(Float.intBitsToFloat((int) (ifoVar.b() >> c))))) + ifoVar.em(this.c.c(ifoVar.q())))) & 4294967295L), dfxVar.e(), a) || z;
        }
        if (dfxVar.i()) {
            EdgeEffect a2 = dfxVar.a();
            z2 = a(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (ifoVar.b() >> c)))) << c) | (4294967295L & ((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (ifoVar.b() & 4294967295L))) + ifoVar.em(((ebf) this.c).b)))), a2, a) || z;
        } else {
            z2 = z;
        }
        if (z2) {
            this.a.e();
        }
    }

    @Override // defpackage.itg
    public final /* synthetic */ void u() {
    }
}
