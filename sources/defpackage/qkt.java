package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qkt implements qlf {
    public static final qkt a = new qkt();

    private qkt() {
    }

    @Override // defpackage.qlf
    public final /* bridge */ /* synthetic */ Object a(qlk qlkVar, float f) {
        int q = qlkVar.q();
        if (q == 1) {
            return qkm.c(qlkVar, f);
        }
        if (q == 3) {
            return qkm.c(qlkVar, f);
        }
        if (q != 7) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(qlj.a(q)));
        }
        PointF pointF = new PointF(((float) qlkVar.a()) * f, ((float) qlkVar.a()) * f);
        while (qlkVar.o()) {
            qlkVar.n();
        }
        return pointF;
    }
}
