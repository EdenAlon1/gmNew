package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbxf {
    public static final cskc a = cskc.g("Bugle", "UpdateMessageVerificationStatusWorkHelper");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/verifiedsmsworkers/UpdateMessageVerificationStatusWorkHelper");
    public final baam c;
    public final akzt d;
    public final crji e;
    public final ffbr f;
    public final ffbr g;
    public final cqoh h;
    public final cbgf i;
    public final dtuu j;
    public final altk k;
    public final ffbr l;
    public final ffbr m;

    public cbxf(baam baamVar, akzt akztVar, crji crjiVar, ffbr ffbrVar, ffbr ffbrVar2, cqoh cqohVar, cbgf cbgfVar, dtuu dtuuVar, altk altkVar, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.c = baamVar;
        this.d = akztVar;
        this.e = crjiVar;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = cqohVar;
        this.i = cbgfVar;
        this.j = dtuuVar;
        this.k = altkVar;
        this.l = ffbrVar3;
        this.m = ffbrVar4;
    }

    public final void a(long j, boolean z) {
        this.d.g(true != z ? "Bugle.VerifiedSms.WorkManager.VerificationChain.V2.Failure.Latency" : "Bugle.VerifiedSms.WorkManager.VerificationChain.V2.Success.Latency", j > 0 ? this.h.f().toEpochMilli() - j : -1L);
    }

    public final void b(boolean z, long j) {
        this.d.g(true != z ? "Bugle.VerifiedSms.WorkManager.UpdateVerificationStatus.Failure.Latency" : "Bugle.VerifiedSms.WorkManager.UpdateVerificationStatus.Success.Latency", this.h.f().toEpochMilli() - j);
    }
}
