package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffoe implements ffnl, ffnd {
    public final ffnl a;
    public final int b;
    public final int c;

    public ffoe(ffnl ffnlVar, int i, int i2) {
        this.a = ffnlVar;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            throw new IllegalArgumentException(a.h(i, "startIndex should be non-negative, but is "));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(a.h(i2, "endIndex should be non-negative, but is "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a.r(i, i2, "endIndex should be not less than startIndex, but was ", " < "));
        }
    }

    private final int d() {
        return this.c - this.b;
    }

    @Override // defpackage.ffnl
    public final Iterator a() {
        return new ffod(this);
    }

    @Override // defpackage.ffnd
    public final ffnl b(int i) {
        if (i >= d()) {
            return ffne.a;
        }
        return new ffoe(this.a, this.b + i, this.c);
    }

    @Override // defpackage.ffnd
    public final ffnl c(int i) {
        if (i >= d()) {
            return this;
        }
        ffnl ffnlVar = this.a;
        int i2 = this.b;
        return new ffoe(ffnlVar, i2, i + i2);
    }
}
