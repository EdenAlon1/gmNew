package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbyf {
    public static final enip a = enip.t(Status.Code.UNAVAILABLE, Status.Code.RESOURCE_EXHAUSTED, Status.Code.INTERNAL, Status.Code.DEADLINE_EXCEEDED);
    public static final enip b = enip.u("vsms_sender_id", "vsms_message_body", "vsms_mcc_key", "vsms_mnc_key", "vsms_imsi_key");
    public static final cskc c = cskc.g("Bugle", "VerifiedSmsRemoteVerificationWorkHelper");
    public final akzt d;
    public final cbgs e;
    public final cqoh f;
    public final cvdc g;
    public final cvbr h;
    public final errl i;
    public final errl j;
    public final ffbr k;
    private final altk l;

    public cbyf(akzt akztVar, cbgs cbgsVar, cqoh cqohVar, altk altkVar, errl errlVar, errl errlVar2, cvbr cvbrVar, cvdc cvdcVar, ffbr ffbrVar) {
        this.d = akztVar;
        this.e = cbgsVar;
        this.f = cqohVar;
        this.l = altkVar;
        this.i = errlVar;
        this.j = errlVar2;
        this.g = cvdcVar;
        this.h = cvbrVar;
        this.k = ffbrVar;
    }

    public final void a(eovo eovoVar, cvam cvamVar, long j) {
        this.l.ab(eovoVar, cvamVar, this.f.f().toEpochMilli() - j);
    }
}
