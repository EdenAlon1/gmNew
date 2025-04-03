package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccix {
    public static final cskc a = cskc.g("BugleCms", "CmsDeletedMessagesBufferPersister");
    public final cqoh b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffhd f;
    public final ffsk g;
    public final int h;
    public final Duration i;
    public final cbwj j;

    public ccix(cbwj cbwjVar, cqoh cqohVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffhd ffhdVar, ffsk ffskVar) {
        cbwjVar.getClass();
        cqohVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        this.j = cbwjVar;
        this.b = cqohVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffhdVar;
        this.g = ffskVar;
        Object e = csgj.D.e();
        e.getClass();
        this.h = ((Number) e).intValue();
        Object e2 = csgj.E.e();
        e2.getClass();
        Duration ofDays = Duration.ofDays(((Number) e2).longValue());
        ofDays.getClass();
        this.i = ofDays;
    }

    public final void a(String str, bqmn bqmnVar) {
        str.getClass();
        bqmnVar.getClass();
        axol.k(this.g, null, new cciu(this, str, bqmnVar, null), 3);
    }
}
