package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egnh extends llf {
    public emxc a;
    public emxc h;
    public emxc i;
    private final eghy j;
    private final eghu k;
    private final egig l;
    private final boolean m;

    public egnh(eghy eghyVar, eghu eghuVar, egig egigVar, boolean z) {
        emux emuxVar = emux.a;
        this.a = emuxVar;
        this.h = emuxVar;
        this.i = emuxVar;
        this.j = eghyVar;
        this.k = eghuVar;
        this.l = egigVar;
        this.m = z;
        b();
    }

    public final void b() {
        if (this.j.a().o() || this.k.e.o() || this.l.a().o()) {
            return;
        }
        if (!this.m) {
            p(this.j.a(), new llh() { // from class: egne
                @Override // defpackage.llh
                public final void a(Object obj) {
                    emxc j = emxc.j((egih) obj);
                    egnh egnhVar = egnh.this;
                    egnhVar.a = j;
                    egnhVar.c();
                }
            });
        }
        eghu eghuVar = this.k;
        p(eghuVar.e, new llh() { // from class: egnf
            @Override // defpackage.llh
            public final void a(Object obj) {
                emxc j = emxc.j((eghw) obj);
                egnh egnhVar = egnh.this;
                egnhVar.h = j;
                egnhVar.c();
            }
        });
        p(this.l.a(), new llh() { // from class: egng
            @Override // defpackage.llh
            public final void a(Object obj) {
                emxc j = emxc.j((egih) obj);
                egnh egnhVar = egnh.this;
                egnhVar.i = j;
                egnhVar.c();
            }
        });
    }

    public final void c() {
        if (this.m && this.h.g() && this.i.g()) {
            Object c = this.h.c();
            Object c2 = this.i.c();
            int i = engw.d;
            engw engwVar = enou.a;
            j(new egmt(new eghp(engwVar, emux.a, false, engwVar), (eghw) c, (egih) c2));
            q(this.k.e);
            q(this.l.a());
            return;
        }
        if (!this.m && this.a.g() && this.h.g() && this.i.g()) {
            Object c3 = this.a.c();
            egih egihVar = (egih) c3;
            j(new egmt(egihVar, (eghw) this.h.c(), (egih) this.i.c()));
            q(this.j.a());
            q(this.k.e);
            q(this.l.a());
        }
    }
}
