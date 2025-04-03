package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lgr {
    public int a = 1;
    public lgy b;
    public lgy c;
    public int d;
    public int e;
    private final lgy f;
    private final boolean g;
    private final int[] h;

    public lgr(lgy lgyVar, boolean z, int[] iArr) {
        this.f = lgyVar;
        this.b = lgyVar;
        this.g = z;
        this.h = iArr;
    }

    public static boolean c(int i) {
        return i == 65039;
    }

    final lhc a() {
        return this.b.a;
    }

    final lhc b() {
        return this.c.a;
    }

    public final boolean d() {
        lhh f = this.b.a.f();
        int b = f.b(6);
        if ((b != 0 && f.b.get(b + f.a) != 0) || c(this.d)) {
            return true;
        }
        if (this.g) {
            if (this.h == null) {
                return true;
            }
            if (Arrays.binarySearch(this.h, this.b.a.a(0)) < 0) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        this.a = 1;
        this.b = this.f;
        this.e = 0;
    }
}
