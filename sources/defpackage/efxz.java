package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efxz extends lml {
    public final egfd a;
    public final llf b;
    public emxc c;
    public emxc d;
    public int e;

    public efxz(egfd egfdVar) {
        emux emuxVar = emux.a;
        this.c = emuxVar;
        this.d = emuxVar;
        this.a = egfdVar;
        llf llfVar = new llf();
        this.b = llfVar;
        llfVar.p(egfdVar.b, new llh() { // from class: efxx
            @Override // defpackage.llh
            public final void a(Object obj) {
                emxc j = emxc.j((egff) obj);
                efxz efxzVar = efxz.this;
                efxzVar.d = j;
                efxzVar.a();
            }
        });
        llfVar.p(egfdVar.c, new llh() { // from class: efxy
            @Override // defpackage.llh
            public final void a(Object obj) {
                emxc j = emxc.j((egeb) obj);
                efxz efxzVar = efxz.this;
                efxzVar.c = j;
                efxzVar.a();
            }
        });
        this.e = 1;
    }

    public final void a() {
        if (this.d.g() && this.c.g()) {
            llf llfVar = this.b;
            engw j = engw.j(((egff) this.d.c()).c());
            engw j2 = engw.j(((egff) this.d.c()).b());
            engw j3 = engw.j(((egeb) this.c.c()).b());
            emxc a = ((egff) this.d.c()).a().a(((egeb) this.c.c()).a());
            engw s = engw.s(((egff) this.d.c()).d(), ((egeb) this.c.c()).c());
            if (s == null) {
                throw new NullPointerException("Null events");
            }
            if (j != null && j2 != null && j3 != null) {
                llfVar.j(new efya(j, j2, j3, a, s));
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (j == null) {
                sb.append(" suggestedImages");
            }
            if (j2 == null) {
                sb.append(" suggestedCollections");
            }
            if (j3 == null) {
                sb.append(" categories");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
    }
}
