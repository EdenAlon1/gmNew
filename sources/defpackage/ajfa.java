package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajfa implements ahrc {
    public final Optional a;
    public final ajba b;
    public final ffbr c;
    public final ejvb d;
    private final ffsk e;
    private eisx f;

    public ajfa(ffsk ffskVar, Optional optional, ajba ajbaVar, ffbr ffbrVar, ejvb ejvbVar) {
        ffskVar.getClass();
        optional.getClass();
        ajbaVar.getClass();
        ffbrVar.getClass();
        ejvbVar.getClass();
        this.e = ffskVar;
        this.a = optional;
        this.b = ajbaVar;
        this.c = ffbrVar;
        this.d = ejvbVar;
    }

    @Override // defpackage.ahrc
    public final void a(eisx eisxVar) {
        if (!((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() || this.a.isEmpty() || ffkj.e(eisxVar, this.f)) {
            return;
        }
        this.f = eisxVar;
        axol.k(this.e, null, new ajez(this, eisxVar, null), 3);
    }
}
