package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egpq extends lml {
    public final egja a;
    public final egiu b;
    public final llf c;
    public egdx d;
    public egdx e;
    private egpn f;

    public egpq(egja egjaVar, egiu egiuVar) {
        this.a = egjaVar;
        this.b = egiuVar;
        llf llfVar = new llf();
        this.c = llfVar;
        this.d = egdx.g();
        this.e = egdx.g();
        b();
        llfVar.p(egjaVar.c, new llh() { // from class: egpo
            @Override // defpackage.llh
            public final void a(Object obj) {
                egpq egpqVar = egpq.this;
                egpqVar.d = (egdx) obj;
                egpqVar.b();
            }
        });
        llfVar.p(egiuVar.b, new llh() { // from class: egpp
            @Override // defpackage.llh
            public final void a(Object obj) {
                egpq egpqVar = egpq.this;
                egpqVar.e = (egdx) obj;
                egpqVar.b();
            }
        });
    }

    public final lld a() {
        return this.b.b;
    }

    public final void b() {
        emxc b = this.e.b();
        emxc b2 = this.d.b();
        emxc a = this.d.a().a(this.e.a());
        int i = engw.d;
        engr engrVar = new engr();
        engrVar.j(this.e.c());
        engrVar.j(this.d.c());
        egpi egpiVar = new egpi(b, b2, a, engrVar.g());
        if (egpiVar.equals(this.f)) {
            return;
        }
        this.f = egpiVar;
        this.c.j(egpiVar);
    }
}
