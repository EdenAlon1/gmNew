package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class djp implements idh {
    public static final djp a = new djp();

    private djp() {
    }

    @Override // defpackage.idh
    public final icr a(long j, kah kahVar, jzn jznVar) {
        float eo = jznVar.eo(30.0f);
        return new icp(new iam(-eo, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + eo, Float.intBitsToFloat((int) (j & 4294967295L))));
    }
}
