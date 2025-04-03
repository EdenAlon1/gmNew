package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anyb implements ctbj {
    final /* synthetic */ anye a;

    public anyb(anye anyeVar) {
        this.a = anyeVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        bvhc c;
        final anye anyeVar = this.a;
        becj becjVar = anyeVar.a;
        c = ctrt.c(anyeVar.g.a, null, null);
        final anye anyeVar2 = this.a;
        aqgd aqgdVar = new aqgd() { // from class: anxy
            @Override // defpackage.aqgd
            public final elfl a() {
                return anye.this.d();
            }
        };
        final anye anyeVar3 = this.a;
        aqgd aqgdVar2 = new aqgd() { // from class: anxz
            @Override // defpackage.aqgd
            public final elfl a() {
                return anye.this.d();
            }
        };
        final anye anyeVar4 = this.a;
        anyeVar.k = ctbt.b(becjVar.a(c, "SmartSuggestionObservableSupplier#suggestionsQuery").f(new ctbf() { // from class: anxp
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return anye.this.d();
            }
        }, "SmartSuggestionObservableSupplier::register", "SmartSuggestionObservableSupplier::callback", "SmartSuggestionObservableSupplier::unregister"), anyeVar2.h.a(aqgdVar), anyeVar3.i.a(aqgdVar2), anyeVar4.j.a(new aqgd() { // from class: anya
            @Override // defpackage.aqgd
            public final elfl a() {
                return anye.this.d();
            }
        }));
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ctbx ctbxVar = this.a.k;
        if (ctbxVar != null) {
            ctbxVar.a();
        }
        this.a.k = null;
    }
}
