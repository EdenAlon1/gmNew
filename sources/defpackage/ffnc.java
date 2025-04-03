package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffnc implements ffnl, ffnd {
    public final ffnl a;
    public final int b;

    public ffnc(ffnl ffnlVar, int i) {
        this.a = ffnlVar;
        this.b = i;
    }

    @Override // defpackage.ffnl
    public final Iterator a() {
        return new ffnb(this);
    }

    @Override // defpackage.ffnd
    public final ffnl b(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new ffnc(this, i) : new ffnc(this.a, i2);
    }

    @Override // defpackage.ffnd
    public final ffnl c(int i) {
        int i2 = this.b;
        int i3 = i2 + i;
        return i3 < 0 ? new ffog(this, i) : new ffoe(this.a, i2, i3);
    }
}
