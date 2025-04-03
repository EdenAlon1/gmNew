package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxgs extends dtrr {
    public String a;
    public Instant b;
    public Instant c;

    public bxgs() {
        super(bxhr.b().P());
        this.b = bdgw.b(0L);
        this.c = bdgw.b(0L);
    }

    public final bxgq a() {
        bxgr bxgrVar = new bxgr();
        bxgrVar.aC(aB());
        bxgrVar.a = this.a;
        bxgrVar.b = this.b;
        bxgrVar.c = this.c;
        bxgrVar.cK = aC();
        return bxgrVar;
    }

    public final void b(Instant instant) {
        aE(2);
        this.c = instant;
    }

    public final void c(Instant instant) {
        aE(1);
        this.b = instant;
    }

    public final void d(String str) {
        aE(0);
        this.a = str;
    }
}
