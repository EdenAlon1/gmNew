package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqud implements cqun {
    public static final entd a = entd.c("BugleFileTransfer");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final errl g;
    public final avxt h;

    public cqud(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, errl errlVar, avxt avxtVar) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = errlVar;
        this.h = avxtVar;
    }

    public static cqxn a(eyee eyeeVar) {
        try {
            return (cqxn) eyfy.parseFrom(cqxn.a, eyeeVar, eyfc.a());
        } catch (eygu e) {
            throw new cquo(false, "Failed to parse file download extras.", cqpn.FILE_TRANSFER_FAILURE_REASON_INVALID_MESSAGE, (Throwable) e);
        }
    }
}
