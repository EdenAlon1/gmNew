package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcel {
    public final bcem a;
    public final bcem b;
    public final bcem c;
    final bcem[] d;

    public bcel() {
        dtsb m = dtsd.m();
        dtqs dtqsVar = (dtqs) m;
        dtqsVar.e = 1;
        dtqsVar.a = "backup_metadata.created_timestamp";
        m.i(0);
        dtqsVar.d = new Supplier() { // from class: bcef
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcfa.b();
            }
        };
        dtqsVar.c = new dtsc() { // from class: bceg
        };
        bcem bcemVar = new bcem(m.a());
        this.a = bcemVar;
        dtsb m2 = dtsd.m();
        dtqs dtqsVar2 = (dtqs) m2;
        dtqsVar2.e = 1;
        dtqsVar2.a = "backup_metadata.schema_version";
        m2.i(0);
        dtqsVar2.d = new Supplier() { // from class: bceh
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcfa.b();
            }
        };
        dtqsVar2.c = new dtsc() { // from class: bcei
        };
        bcem bcemVar2 = new bcem(m2.a());
        this.b = bcemVar2;
        dtsb m3 = dtsd.m();
        dtqs dtqsVar3 = (dtqs) m3;
        dtqsVar3.e = 4;
        dtqsVar3.a = "backup_metadata.backup_id";
        m3.i(0);
        dtqsVar3.d = new Supplier() { // from class: bcej
            @Override // java.util.function.Supplier
            public final Object get() {
                return bcfa.b();
            }
        };
        dtqsVar3.c = new dtsc() { // from class: bcek
        };
        bcem bcemVar3 = new bcem(m3.a());
        this.c = bcemVar3;
        this.d = new bcem[]{bcemVar, bcemVar2, bcemVar3};
    }
}
