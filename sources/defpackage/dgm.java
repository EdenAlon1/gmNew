package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dgm implements idh {
    public static final dgm a = new dgm();

    private dgm() {
    }

    @Override // defpackage.idh
    public final icr a(long j, kah kahVar, jzn jznVar) {
        float eo = jznVar.eo(30.0f);
        return new icp(new iam(0.0f, -eo, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)) + eo));
    }
}
