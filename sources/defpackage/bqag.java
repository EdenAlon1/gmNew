package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqag extends dtrr {
    public long a;
    public cuen b;
    public cuef c;
    public Instant d;

    public bqag() {
        super(bqbh.a().P());
        this.b = cuen.b(0);
        this.c = cuef.b(0);
        this.d = Instant.EPOCH;
    }

    public final bqae a() {
        bqaf bqafVar = new bqaf();
        bqafVar.aC(aB());
        bqafVar.a = this.a;
        bqafVar.b = this.b;
        bqafVar.c = this.c;
        bqafVar.d = this.d;
        bqafVar.cK = aC();
        return bqafVar;
    }

    public final void b(cuef cuefVar) {
        aE(2);
        this.c = cuefVar;
    }

    public final void c(cuen cuenVar) {
        aE(1);
        this.b = cuenVar;
    }

    public final void d(Instant instant) {
        aE(3);
        this.d = instant;
    }

    public final void e(long j) {
        aE(0);
        this.a = j;
    }
}
