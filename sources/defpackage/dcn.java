package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcn extends ffkk implements ffji {
    public static final dcn a = new dcn();

    public dcn() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        long j = ((iar) obj).a;
        return new cxy(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
