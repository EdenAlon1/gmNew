package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anyu implements ctbj {
    final /* synthetic */ anyx a;

    public anyu(anyx anyxVar) {
        this.a = anyxVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        bvhc c;
        final anyx anyxVar = this.a;
        becj becjVar = anyxVar.b;
        c = ctrt.c(anyxVar.g.a, null, null);
        final anyx anyxVar2 = this.a;
        aqgd aqgdVar = new aqgd() { // from class: anyr
            @Override // defpackage.aqgd
            public final elfl a() {
                return anyx.this.d();
            }
        };
        final anyx anyxVar3 = this.a;
        aqgd aqgdVar2 = new aqgd() { // from class: anys
            @Override // defpackage.aqgd
            public final elfl a() {
                return anyx.this.d();
            }
        };
        final anyx anyxVar4 = this.a;
        anyxVar.l = ctbt.b(becjVar.a(c, "SmartSuggestionObservableSupplier#suggestionsQuery").f(new ctbf() { // from class: anyh
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return anyx.this.d();
            }
        }, "SmartSuggestionObservableSupplierV2::register", "SmartSuggestionObservableSupplierV2::callback", "SmartSuggestionObservableSupplierV2::unregister"), anyxVar2.h.a(aqgdVar), anyxVar3.i.a(aqgdVar2), anyxVar4.j.a(new aqgd() { // from class: anyt
            @Override // defpackage.aqgd
            public final elfl a() {
                return anyx.this.d();
            }
        }));
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ctbx ctbxVar = this.a.l;
        if (ctbxVar != null) {
            ctbxVar.a();
        }
        this.a.l = null;
    }
}
