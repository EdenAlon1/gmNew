package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmc extends ffkk implements ffji {
    public static final dmc a = new dmc();

    public dmc() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cya cyaVar = (cya) obj;
        float f = cyaVar.a;
        float f2 = cyaVar.b;
        float f3 = cyaVar.c;
        return new dmb(f, (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), cyaVar.d);
    }
}
