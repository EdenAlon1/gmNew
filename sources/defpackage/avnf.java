package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class avnf extends dtrr {
    public String a;
    public Instant b;
    public avoi c;

    public avnf() {
        super(avod.a().P());
        this.b = Instant.EPOCH;
    }

    public final avnd a() {
        avne avneVar = new avne();
        avneVar.aC(aB());
        avneVar.a = this.a;
        avneVar.b = this.b;
        avneVar.c = this.c;
        avneVar.cK = aC();
        return avneVar;
    }

    public final void b(Instant instant) {
        aE(1);
        this.b = instant;
    }

    public final void c(String str) {
        aE(0);
        this.a = str;
    }

    public final void d(avoi avoiVar) {
        aE(2);
        this.c = avoiVar;
    }
}
