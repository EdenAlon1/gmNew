package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmd extends ffkk implements ffji {
    public static final dmd a = new dmd();

    public dmd() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dmb dmbVar = (dmb) obj;
        float f = dmbVar.a;
        long j = dmbVar.b;
        long j2 = j >> 32;
        return new cya(f, Float.intBitsToFloat((int) j2), Float.intBitsToFloat((int) (j & 4294967295L)), dmbVar.c);
    }
}
