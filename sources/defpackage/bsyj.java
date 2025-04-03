package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bsyj extends dtrr {
    public String a;
    public aplf b;
    public Instant c;
    public Instant d;
    public long e;

    public bsyj() {
        super(bszm.a().P());
        this.c = Instant.EPOCH;
        this.d = Instant.EPOCH;
    }

    public final bsyh a() {
        bsyi bsyiVar = new bsyi();
        bsyiVar.aC(aB());
        bsyiVar.a = this.a;
        bsyiVar.b = this.b;
        bsyiVar.c = this.c;
        bsyiVar.d = this.d;
        bsyiVar.e = this.e;
        bsyiVar.cK = aC();
        return bsyiVar;
    }

    public final void b(String str) {
        aE(0);
        this.a = str;
    }

    public final void c(Instant instant) {
        aE(3);
        this.d = instant;
    }

    public final void d(long j) {
        aE(4);
        this.e = j;
    }

    public final void e(Instant instant) {
        aE(2);
        this.c = instant;
    }

    public final void f(aplf aplfVar) {
        aE(1);
        this.b = aplfVar;
    }
}
