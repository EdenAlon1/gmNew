package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bspt extends dtrr {
    public byys a;
    public long b;

    public bspt() {
        super(bsqp.b().P());
        this.a = byys.b(0);
        this.b = 0L;
    }

    public final bspr a() {
        bsps bspsVar = new bsps();
        bspsVar.aC(aB());
        bspsVar.a = this.a;
        bspsVar.b = this.b;
        bspsVar.cK = aC();
        return bspsVar;
    }

    public final void b(byys byysVar) {
        aE(0);
        this.a = byysVar;
    }

    public final void c(long j) {
        aE(1);
        this.b = j;
    }
}
