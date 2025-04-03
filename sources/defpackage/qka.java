package defpackage;

import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qka implements qlf {
    public static final qka a = new qka();

    private qka() {
    }

    @Override // defpackage.qlf
    public final /* bridge */ /* synthetic */ Object a(qlk qlkVar, float f) {
        boolean z = qlkVar.q() == 1;
        if (z) {
            qlkVar.h();
        }
        double a2 = qlkVar.a();
        double a3 = qlkVar.a();
        double a4 = qlkVar.a();
        double a5 = qlkVar.q() == 7 ? qlkVar.a() : 1.0d;
        if (z) {
            qlkVar.j();
        }
        if (a2 <= 1.0d && a3 <= 1.0d && a4 <= 1.0d) {
            a2 *= 255.0d;
            a3 *= 255.0d;
            a4 *= 255.0d;
            if (a5 <= 1.0d) {
                a5 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) a5, (int) a2, (int) a3, (int) a4));
    }
}
