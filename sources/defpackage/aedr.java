package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aedr {
    final cskc a = cskc.g("Bugle", "HomeScreenMenuHandler");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final ctvs e;
    private final ffbr f;

    public aedr(ffbr ffbrVar, ctvs ctvsVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.b = ffbrVar;
        this.e = ctvsVar;
        this.c = ffbrVar2;
        this.f = ffbrVar3;
        this.d = ffbrVar4;
    }

    public final void a(eisx eisxVar) {
        if (!this.e.d()) {
            this.a.r("Can't mark as read if it't not default default sms app");
        }
        aedq aedqVar = new aedq(this);
        bbfd bbfdVar = (bbfd) this.f.b();
        eisxVar.a();
        bbfdVar.l().p(aedqVar);
    }
}
