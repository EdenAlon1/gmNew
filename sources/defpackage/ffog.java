package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffog implements ffnl, ffnd {
    public final ffnl a;
    public final int b;

    public ffog(ffnl ffnlVar, int i) {
        this.a = ffnlVar;
        this.b = i;
    }

    @Override // defpackage.ffnl
    public final Iterator a() {
        return new ffof(this);
    }

    @Override // defpackage.ffnd
    public final ffnl b(int i) {
        int i2 = this.b;
        return i >= i2 ? ffne.a : new ffoe(this.a, i, i2);
    }

    @Override // defpackage.ffnd
    public final ffnl c(int i) {
        return i >= this.b ? this : new ffog(this.a, i);
    }
}
