package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fer extends ffkk implements ffji {
    public static final fer a = new fer();

    public fer() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        long j = ((iak) obj).a;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            return fez.a;
        }
        return new cxy(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
