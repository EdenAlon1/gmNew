package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cglm implements cglg {
    public static final Long a = 0L;
    public final cskc b = cskc.g("Lighter", "LighterSyncManagerImpl");
    public final ffbr c;
    public final ffbr d;
    public final errl e;
    public final errl f;
    public final cglf g;
    public final ffbr h;

    public cglm(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, errl errlVar2, cglf cglfVar, ffbr ffbrVar3) {
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = errlVar;
        this.f = errlVar2;
        this.g = cglfVar;
        this.h = ffbrVar3;
    }

    public final elfl a() {
        ((cevh) this.g.a.b()).f("lighter_incremental_sync");
        try {
            ((cevh) this.g.a.b()).e("lighter_incremental_sync", "incremental_sync_cancelation_tag");
        } catch (IndexOutOfBoundsException unused) {
            this.b.p("There is no running task to cancel");
        }
        return ((cgkv) this.c.b()).d(false);
    }
}
