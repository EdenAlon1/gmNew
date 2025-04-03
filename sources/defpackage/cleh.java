package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cleh {
    public static final cskc a = cskc.g("Bugle", "RcsLimboMessagesResolver");
    public static final Duration b = Duration.ofDays(2);
    public static final engw c = engw.s(1, 14);
    public final erqa d = new erqa();
    public final cqoh e;
    public final errl f;
    public final errl g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final azwa l;
    public final atky m;
    public final ffbr n;
    private final ffbr o;
    private final ffbr p;

    public cleh(cqoh cqohVar, errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, azwa azwaVar, ffbr ffbrVar6, ffbr ffbrVar7, atky atkyVar) {
        this.e = cqohVar;
        this.f = errlVar;
        this.g = errlVar2;
        this.h = ffbrVar;
        this.i = ffbrVar2;
        this.o = ffbrVar3;
        this.j = ffbrVar4;
        this.k = ffbrVar5;
        this.l = azwaVar;
        this.n = ffbrVar6;
        this.p = ffbrVar7;
        this.m = atkyVar;
    }

    public final elfl a() {
        return elfl.g(((djrv) this.p.b()).h());
    }

    public final void b(int i) {
        csjb a2 = a.a();
        a2.I("Found");
        a2.G(i);
        a2.I("message(s) in limbo.");
        a2.r();
        ((cisl) this.o.b()).d();
    }
}
