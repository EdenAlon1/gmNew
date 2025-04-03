package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bwih extends dtrr {
    public long a;
    public Instant b;
    public String c;
    public String d;

    public bwih() {
        super(bwjh.b());
        this.b = bdgw.b(0L);
    }

    public final bwif a() {
        bwig bwigVar = new bwig();
        bwigVar.aC(aB());
        bwigVar.a = this.a;
        bwigVar.b = this.b;
        bwigVar.c = this.c;
        bwigVar.d = this.d;
        bwigVar.cK = aC();
        return bwigVar;
    }

    public final void b(String str) {
        aE(3);
        this.d = str;
    }

    public final void c(String str) {
        aE(2);
        this.c = str;
    }
}
