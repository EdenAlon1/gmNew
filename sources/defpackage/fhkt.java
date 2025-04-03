package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhkt {
    public int a;
    public final int[] b = new int[10];

    public final int a(int i) {
        return this.b[i];
    }

    public final int b() {
        if ((this.a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public final int d() {
        return (this.a & 16) != 0 ? this.b[4] : Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final void e(fhkt fhktVar) {
        fhktVar.getClass();
        for (int i = 0; i < 10; i++) {
            if (fhktVar.f(i)) {
                g(i, fhktVar.a(i));
            }
        }
    }

    public final boolean f(int i) {
        return ((1 << i) & this.a) != 0;
    }

    public final void g(int i, int i2) {
        if (i < 0 || i >= 10) {
            return;
        }
        this.a = (1 << i) | this.a;
        this.b[i] = i2;
    }
}
