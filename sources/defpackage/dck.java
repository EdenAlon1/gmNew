package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dck extends ffkk implements ffji {
    public static final dck a = new dck();

    public dck() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        cxy cxyVar = (cxy) obj;
        float f = cxyVar.a;
        float f2 = cxyVar.b;
        return new iak((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }
}
