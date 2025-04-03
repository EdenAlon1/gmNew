package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfnh {
    public final cfni a;
    public final cfni b;
    public final cfni c;
    public final cfni d;
    public final cfni e;
    final cfni[] f;

    public cfnh() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 4;
        m.l(true);
        m.k(true);
        m.g(true);
        m.d(true);
        dtqsVar.a = "mls_epoch_records.identity_id";
        m.i(-1);
        dtqsVar.d = new Supplier() { // from class: cfmx
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfnv.a();
            }
        };
        dtqsVar.c = new dtsc() { // from class: cfmy
        };
        cfni cfniVar = new cfni(m.a());
        this.a = cfniVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 4;
        m2.l(true);
        m2.k(true);
        m2.g(true);
        m2.d(true);
        dtqsVar2.a = "mls_epoch_records.group_id";
        m2.i(-1);
        dtqsVar2.d = new Supplier() { // from class: cfmz
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfnv.a();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: cfna
        };
        cfni cfniVar2 = new cfni(m2.a());
        this.b = cfniVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 2;
        m3.l(true);
        m3.k(true);
        m3.g(true);
        m3.d(true);
        dtqsVar3.a = "mls_epoch_records.epoch_id";
        m3.i(-1);
        dtqsVar3.d = new Supplier() { // from class: cfnb
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfnv.a();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: cfnc
        };
        cfni cfniVar3 = new cfni(m3.a());
        this.c = cfniVar3;
        dtsb m4 = dtsd.m();
        dtqs dtqsVar4 = (dtqs) m4;
        dtqsVar4.e = 5;
        m4.k(true);
        dtqsVar4.a = "mls_epoch_records.epoch_data";
        m4.i(-1);
        dtqsVar4.d = new Supplier() { // from class: cfnd
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfnv.a();
            }
        };
        dtqsVar4.c = new dtsc() { // from class: cfne
        };
        cfni cfniVar4 = new cfni(m4.a());
        this.d = cfniVar4;
        dtsb m5 = dtsd.m();
        dtqs dtqsVar5 = (dtqs) m5;
        dtqsVar5.e = 2;
        m5.k(true);
        dtqsVar5.a = "mls_epoch_records.creation_timestamp";
        m5.i(-1);
        dtqsVar5.d = new Supplier() { // from class: cfnf
            @Override // java.util.function.Supplier
            public final Object get() {
                return cfnv.a();
            }
        };
        dtqsVar5.c = new dtsc() { // from class: cfng
        };
        cfni cfniVar5 = new cfni(m5.a());
        this.e = cfniVar5;
        this.f = new cfni[]{cfniVar, cfniVar2, cfniVar3, cfniVar4, cfniVar5};
    }
}
