package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egmy extends lml {
    public final eghy a;
    public final eghu b;
    public final egig c;
    public final egrb d;
    public final llf e;
    public final egnh f;
    public int g;

    public egmy(eghy eghyVar, eghu eghuVar, egig egigVar, egrb egrbVar) {
        this.a = eghyVar;
        this.b = eghuVar;
        this.c = egigVar;
        this.d = egrbVar;
        if (fdrm.q()) {
            this.f = new egnh(eghyVar, eghuVar, egigVar, egrbVar.e);
        } else {
            this.f = new egnh(eghyVar, eghuVar, egigVar, false);
        }
        llf llfVar = new llf();
        this.e = llfVar;
        llfVar.p(this.f, new llh() { // from class: egmx
            @Override // defpackage.llh
            public final void a(Object obj) {
                engw s;
                egmz egmzVar = (egmz) obj;
                egdp egdpVar = (egdp) egmzVar.a().a().a(egmzVar.b().a()).a(egmzVar.c().a()).f();
                egmy egmyVar = egmy.this;
                if (egdpVar == null) {
                    llf llfVar2 = egmyVar.e;
                    if (egmzVar.b().c().isEmpty()) {
                        s = !egmzVar.a().b().isEmpty() ? engw.s(egnd.a(egmzVar.a()), egnd.b(egmzVar.c(), 31, new egnc() { // from class: egna
                            @Override // defpackage.egnc
                            public final egnl a(engw engwVar) {
                                engwVar.getClass();
                                return new egmp(engwVar);
                            }
                        })) : !egmzVar.c().c().isEmpty() ? engw.r(egnd.b(egmzVar.c(), 39, new egnc() { // from class: egna
                            @Override // defpackage.egnc
                            public final egnl a(engw engwVar) {
                                engwVar.getClass();
                                return new egmp(engwVar);
                            }
                        })) : enou.a;
                    } else {
                        s = engw.t(egnd.b(egmzVar.b(), true != fdrm.n() ? 7 : 48, new egnc() { // from class: egnb
                            @Override // defpackage.egnc
                            public final egnl a(engw engwVar) {
                                engwVar.getClass();
                                return new egmr(engwVar);
                            }
                        }), egnd.a(egmzVar.a()), egnd.b(egmzVar.c(), 23, new egnc() { // from class: egna
                            @Override // defpackage.egnc
                            public final egnl a(engw engwVar) {
                                engwVar.getClass();
                                return new egmp(engwVar);
                            }
                        }));
                    }
                    llfVar2.j(new egmu(s, 4, emux.a));
                    return;
                }
                if (!fdrm.x()) {
                    llf llfVar3 = egmyVar.e;
                    egmyVar.g = 5;
                    llfVar3.j(egni.d(5));
                } else {
                    egmyVar.g = 5;
                    llf llfVar4 = egmyVar.e;
                    int i = engw.d;
                    llfVar4.j(new egmu(enou.a, 5, emxc.j(egdpVar)));
                }
            }
        });
        this.g = 1;
        llfVar.j(egni.d(1));
    }
}
