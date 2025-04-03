package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dkyv implements dkyw {
    private static final eyee b = eyee.A("hades-persephone");
    public final etfv a;

    public dkyv() {
        etol.a();
        this.a = new etfv(etsd.a.c());
    }

    protected abstract etga a();

    @Override // defpackage.dkyw
    public final etga b() {
        return a().c();
    }

    @Override // defpackage.dkyw
    public final byte[] c(eyee eyeeVar, eyee eyeeVar2) {
        byte[] I;
        etfq etfqVar = (etfq) a().f(etth.a, etfq.class);
        byte[] I2 = eyeeVar.I();
        if (eyeeVar2 == null || (I = eyeeVar2.I()) == null) {
            I = b.I();
        }
        byte[] a = etfqVar.a(I2, I);
        a.getClass();
        return a;
    }
}
