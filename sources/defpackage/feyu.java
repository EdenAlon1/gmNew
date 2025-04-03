package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feyu {
    public final feys a;
    public final fezn b;
    public int c;
    public final feyr d;

    public feyu(feys feysVar, fezn feznVar) {
        this.a = feysVar;
        feznVar.getClass();
        this.b = feznVar;
        this.c = 65535;
        this.d = new feyr(this, 0, 65535, null);
    }

    public final void a(boolean z, feyr feyrVar, fhmt fhmtVar, boolean z2) {
        fhmtVar.getClass();
        int b = feyrVar.b();
        boolean d = feyrVar.d();
        int i = (int) fhmtVar.b;
        if (d || b < i) {
            if (!d && b > 0) {
                feyrVar.c(fhmtVar, b, false);
            }
            feyrVar.a.id(fhmtVar, (int) fhmtVar.b);
            feyrVar.d = z | feyrVar.d;
        } else {
            feyrVar.c(fhmtVar, i, z);
        }
        if (z2) {
            b();
        }
    }

    public final void b() {
        try {
            this.b.d();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void c() {
        feyr[] s = this.a.s();
        Collections.shuffle(Arrays.asList(s));
        int length = s.length;
        int i = this.d.b;
        while (true) {
            int i2 = 0;
            if (length <= 0 || i <= 0) {
                break;
            }
            int ceil = (int) Math.ceil(i / length);
            for (int i3 = 0; i3 < length && i > 0; i3++) {
                feyr feyrVar = s[i3];
                int min = Math.min(i, Math.min(feyrVar.a(), ceil));
                if (min > 0) {
                    feyrVar.c += min;
                    i -= min;
                }
                if (feyrVar.a() > 0) {
                    s[i2] = feyrVar;
                    i2++;
                }
            }
            length = i2;
        }
        feyt feytVar = new feyt();
        for (feyr feyrVar2 : this.a.s()) {
            feyrVar2.e(feyrVar2.c, feytVar);
            feyrVar2.c = 0;
        }
        if (feytVar.a()) {
            b();
        }
    }

    public final void d(feyr feyrVar, int i) {
        if (feyrVar == null) {
            this.d.f(i);
            c();
            return;
        }
        feyrVar.f(i);
        feyt feytVar = new feyt();
        feyrVar.e(feyrVar.b(), feytVar);
        if (feytVar.a()) {
            b();
        }
    }
}
