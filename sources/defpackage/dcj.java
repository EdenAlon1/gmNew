package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcj extends ffkk implements ffji {
    public static final dcj a = new dcj();

    public dcj() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        long j = ((iak) obj).a;
        return new cxy(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
