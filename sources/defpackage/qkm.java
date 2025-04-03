package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qkm {
    private static final qli a = qli.a("x", "y");

    static float a(qlk qlkVar) {
        int q = qlkVar.q();
        int i = q - 1;
        if (i != 0) {
            if (i == 6) {
                return (float) qlkVar.a();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(qlj.a(q)));
        }
        qlkVar.h();
        float a2 = (float) qlkVar.a();
        while (qlkVar.o()) {
            qlkVar.n();
        }
        qlkVar.j();
        return a2;
    }

    static int b(qlk qlkVar) {
        qlkVar.h();
        double a2 = qlkVar.a() * 255.0d;
        double a3 = qlkVar.a() * 255.0d;
        double a4 = qlkVar.a() * 255.0d;
        while (qlkVar.o()) {
            qlkVar.n();
        }
        int i = (int) a3;
        int i2 = (int) a2;
        qlkVar.j();
        return Color.argb(PrivateKeyType.INVALID, i2, i, (int) a4);
    }

    static PointF c(qlk qlkVar, float f) {
        int q = qlkVar.q() - 1;
        if (q == 0) {
            qlkVar.h();
            float a2 = (float) qlkVar.a();
            float a3 = (float) qlkVar.a();
            while (qlkVar.q() != 2) {
                qlkVar.n();
            }
            qlkVar.j();
            return new PointF(a2 * f, a3 * f);
        }
        if (q != 2) {
            if (q != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(qlj.a(qlkVar.q())));
            }
            float a4 = (float) qlkVar.a();
            float a5 = (float) qlkVar.a();
            while (qlkVar.o()) {
                qlkVar.n();
            }
            return new PointF(a4 * f, a5 * f);
        }
        qlkVar.i();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (qlkVar.o()) {
            int c = qlkVar.c(a);
            if (c == 0) {
                f2 = a(qlkVar);
            } else if (c != 1) {
                qlkVar.m();
                qlkVar.n();
            } else {
                f3 = a(qlkVar);
            }
        }
        qlkVar.k();
        return new PointF(f2 * f, f3 * f);
    }

    static List d(qlk qlkVar, float f) {
        ArrayList arrayList = new ArrayList();
        qlkVar.h();
        while (qlkVar.q() == 1) {
            qlkVar.h();
            arrayList.add(c(qlkVar, f));
            qlkVar.j();
        }
        qlkVar.j();
        return arrayList;
    }
}
