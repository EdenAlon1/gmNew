package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqos {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public cqos(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
    }

    public final cqvc a() {
        return (((crgh) this.e.b()).d() == eqna.TRANSPORT_TACHYGRAM || ((Boolean) ((cfup) avyb.a.get()).e()).booleanValue()) ? (cqvc) this.a.b() : (cqvc) this.b.b();
    }

    public final crdb b() {
        return ((crgh) this.e.b()).d() == eqna.TRANSPORT_TACHYGRAM ? (crdb) this.c.b() : (crdb) this.d.b();
    }
}
