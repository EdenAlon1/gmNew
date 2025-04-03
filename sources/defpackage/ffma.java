package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffma extends ffly implements Serializable {
    private static final long serialVersionUID = 0;
    private int c;
    private int d;
    private int e = 0;
    private int f = 0;
    private int g;
    private int h;

    public ffma(int i, int i2) {
        this.c = i;
        this.d = i2;
        int i3 = ~i;
        this.g = i3;
        this.h = (i << 10) ^ (i2 >>> 4);
        if ((i | i2 | i3) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        for (int i4 = 0; i4 < 64; i4++) {
            b();
        }
    }

    @Override // defpackage.ffly
    public final int a(int i) {
        return fflz.b(b(), i);
    }

    @Override // defpackage.ffly
    public final int b() {
        int i = this.c;
        int i2 = i ^ (i >>> 2);
        this.c = this.d;
        this.d = this.e;
        this.e = this.f;
        int i3 = this.g;
        this.f = i3;
        int i4 = ((i2 ^ (i2 + i2)) ^ i3) ^ (i3 << 4);
        this.g = i4;
        int i5 = this.h + 362437;
        this.h = i5;
        return i4 + i5;
    }
}
