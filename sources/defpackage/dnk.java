package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnk implements cxt {
    private final cxt a;
    private final cxt b;
    private final cxt c;

    public dnk(cxt cxtVar, cxt cxtVar2, cxt cxtVar3) {
        this.a = cxtVar;
        this.b = cxtVar2;
        this.c = cxtVar3;
    }

    @Override // defpackage.cxt
    public final dcr a(dbv dbvVar) {
        return new dnj(dbvVar, ((dbu) this.a).c(), this.b.a(dcp.f), this.c.a(dcp.a));
    }
}
