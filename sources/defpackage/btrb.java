package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btrb {
    public final btrc a;
    final btrc[] b;

    public btrb() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 1;
        m.l(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "linked_account.account_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: btqz
            @Override // java.util.function.Supplier
            public final Object get() {
                return btro.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: btra
        };
        btrc btrcVar = new btrc(m.a());
        this.a = btrcVar;
        this.b = new btrc[]{btrcVar};
    }
}
