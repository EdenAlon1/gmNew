package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qhz implements qih {
    public final List a;

    public qhz(List list) {
        this.a = list;
    }

    @Override // defpackage.qih
    public final qer a() {
        return ((qlx) this.a.get(0)).e() ? new qfc(this.a) : new qfb(this.a);
    }

    @Override // defpackage.qih
    public final List b() {
        return this.a;
    }

    @Override // defpackage.qih
    public final boolean c() {
        return this.a.size() == 1 && ((qlx) this.a.get(0)).e();
    }
}
