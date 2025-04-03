package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azgo {
    public final azgp a;
    public final azgp b;
    final azgp[] c;

    public azgo() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.g(true);
        m.d(true);
        m.e(true);
        dtqsVar.b = new Supplier() { // from class: azgi
            @Override // java.util.function.Supplier
            public final Object get() {
                return azjm.b.a;
            }
        };
        dtqsVar.a = "group_members.group_token";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: azgj
            @Override // java.util.function.Supplier
            public final Object get() {
                return azhc.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: azgk
        };
        azgp azgpVar = new azgp(m.a());
        this.a = azgpVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.l(true);
        m2.g(true);
        m2.d(true);
        m2.e(true);
        dtqsVar2.b = new Supplier() { // from class: azgl
            @Override // java.util.function.Supplier
            public final Object get() {
                return azdt.b.a;
            }
        };
        dtqsVar2.a = "group_members.destination_token";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: azgm
            @Override // java.util.function.Supplier
            public final Object get() {
                return azhc.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: azgn
        };
        azgp azgpVar2 = new azgp(m2.a());
        this.b = azgpVar2;
        this.c = new azgp[]{azgpVar, azgpVar2};
    }
}
