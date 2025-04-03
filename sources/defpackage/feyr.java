package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feyr {
    public int b;
    public int c;
    final /* synthetic */ feyu e;
    private final int f;
    private final feyq g;
    public final fhmt a = new fhmt();
    public boolean d = false;

    public feyr(feyu feyuVar, int i, int i2, feyq feyqVar) {
        this.e = feyuVar;
        this.f = i;
        this.b = i2;
        this.g = feyqVar;
    }

    final int a() {
        return Math.max(0, Math.min(this.b, (int) this.a.b)) - this.c;
    }

    final int b() {
        return Math.min(this.b, this.e.d.b);
    }

    final void c(fhmt fhmtVar, int i, boolean z) {
        while (true) {
            int min = Math.min(i, ((fezv) ((fexn) ((fexm) this.e.b).b).b).a);
            int i2 = -min;
            this.e.d.f(i2);
            f(i2);
            try {
                boolean z2 = false;
                if (fhmtVar.b == min && z) {
                    z2 = true;
                }
                boolean z3 = z2;
                fezn feznVar = this.e.b;
                int i3 = this.f;
                fhmt fhmtVar2 = fhmtVar;
                ((fexm) feznVar).c.b(2, i3, fhmtVar2, min, z3);
                try {
                    ((fexn) ((fexm) feznVar).b).b.c(z3, i3, fhmtVar2, min);
                } catch (IOException e) {
                    ((fexm) feznVar).a.a(e);
                }
                this.g.m(min);
                i -= min;
                if (i <= 0) {
                    return;
                } else {
                    fhmtVar = fhmtVar2;
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    final boolean d() {
        return this.a.b > 0;
    }

    final void e(int i, feyt feytVar) {
        int min = Math.min(i, b());
        int i2 = 0;
        while (d() && min > 0) {
            fhmt fhmtVar = this.a;
            long j = min;
            long j2 = fhmtVar.b;
            if (j >= j2) {
                int i3 = (int) j2;
                i2 += i3;
                c(fhmtVar, i3, this.d);
            } else {
                i2 += min;
                c(fhmtVar, min, false);
            }
            feytVar.a++;
            min = Math.min(i - i2, b());
        }
    }

    final void f(int i) {
        if (i <= 0 || Alert.DURATION_SHOW_INDEFINITELY - i >= this.b) {
            this.b += i;
            return;
        }
        throw new IllegalArgumentException("Window size overflow for stream: " + this.f);
    }
}
