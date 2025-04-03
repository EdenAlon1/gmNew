package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dby extends ffkk implements ffji {
    public static final dby a = new dby();

    public dby() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        cxy cxyVar = (cxy) obj;
        float f = cxyVar.a;
        float f2 = cxyVar.b;
        return new jzt((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }
}
