package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qkc implements qlf {
    public static final qkc a = new qkc();
    private static final qli b = qli.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private qkc() {
    }

    @Override // defpackage.qlf
    public final /* bridge */ /* synthetic */ Object a(qlk qlkVar, float f) {
        qlkVar.i();
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 3;
        boolean z = true;
        while (qlkVar.o()) {
            switch (qlkVar.c(b)) {
                case 0:
                    str = qlkVar.g();
                    break;
                case 1:
                    str2 = qlkVar.g();
                    break;
                case 2:
                    f2 = (float) qlkVar.a();
                    break;
                case 3:
                    int b2 = qlkVar.b();
                    if (b2 > 2) {
                        i4 = 3;
                        break;
                    } else if (b2 >= 0) {
                        i4 = new int[]{1, 2, 3}[b2];
                        break;
                    } else {
                        i4 = 3;
                        break;
                    }
                case 4:
                    i = qlkVar.b();
                    break;
                case 5:
                    f3 = (float) qlkVar.a();
                    break;
                case 6:
                    f4 = (float) qlkVar.a();
                    break;
                case 7:
                    i2 = qkm.b(qlkVar);
                    break;
                case 8:
                    i3 = qkm.b(qlkVar);
                    break;
                case 9:
                    f5 = (float) qlkVar.a();
                    break;
                case 10:
                    z = qlkVar.p();
                    break;
                case 11:
                    qlkVar.h();
                    PointF pointF3 = new PointF(((float) qlkVar.a()) * f, ((float) qlkVar.a()) * f);
                    qlkVar.j();
                    pointF = pointF3;
                    break;
                case 12:
                    qlkVar.h();
                    PointF pointF4 = new PointF(((float) qlkVar.a()) * f, ((float) qlkVar.a()) * f);
                    qlkVar.j();
                    pointF2 = pointF4;
                    break;
                default:
                    qlkVar.m();
                    qlkVar.n();
                    break;
            }
        }
        qlkVar.k();
        return new qhn(str, str2, f2, i4, i, f3, f4, i2, i3, f5, z, pointF, pointF2);
    }
}
