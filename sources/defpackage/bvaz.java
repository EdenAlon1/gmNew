package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bvaz extends dtrr {
    public bdhk a;
    public bdhl b;
    public Instant c;

    public bvaz() {
        super(bvbu.g());
        this.a = bdhk.a;
        this.b = bdhl.a;
        this.c = Instant.EPOCH;
    }

    public final bvax a() {
        bvay bvayVar = new bvay();
        bvayVar.aC(aB());
        bvayVar.a = this.a;
        bvayVar.b = this.b;
        bvayVar.c = this.c;
        bvayVar.cK = aC();
        return bvayVar;
    }

    public final void b(bdhl bdhlVar) {
        int i = this.aB;
        if (i < 54060) {
            dtub.w("feature", i);
        }
        aE(1);
        this.b = bdhlVar;
    }

    public final void c(bdhk bdhkVar) {
        aE(0);
        this.a = bdhkVar;
    }

    public final void d(Instant instant) {
        aE(2);
        this.c = instant;
    }
}
