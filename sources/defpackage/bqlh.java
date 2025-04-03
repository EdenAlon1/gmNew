package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqlh extends dtrr {
    public long a;
    public long b;
    public long c;
    public bqmn d;
    public long e;

    public bqlh() {
        super(bqmm.a().P());
        this.d = bqmn.a;
    }

    public final bqld a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        bqld bqldVar = (bqld) obj;
        bqldVar.aC(aB());
        bqldVar.a = this.a;
        bqldVar.b = this.b;
        bqldVar.c = this.c;
        bqldVar.d = this.d;
        bqldVar.e = this.e;
        bqldVar.cK = aC();
        return bqldVar;
    }

    public final void b(long j) {
        aE(4);
        this.e = j;
    }

    public final void c(bqmn bqmnVar) {
        aE(3);
        this.d = bqmnVar;
    }

    public final void d(long j) {
        aE(1);
        this.b = j;
    }
}
