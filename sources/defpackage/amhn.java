package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amhn implements ctbj {
    final /* synthetic */ amho a;

    public amhn(amho amhoVar) {
        this.a = amhoVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        engr engrVar = new engr();
        engrVar.h(this.a.j.a(new aqgd() { // from class: amhj
            @Override // defpackage.aqgd
            public final elfl a() {
                return amhn.this.a.e();
            }
        }));
        engrVar.h(this.a.h.f(new ctbf() { // from class: amhk
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return amhn.this.a.e();
            }
        }, "BugleConversationPropertiesSupplier::register", "BugleConversationPropertiesSupplier::callback", "BugleConversationPropertiesSupplier::unregister"));
        if (((Boolean) ((cfup) ctjd.aF.get()).e()).booleanValue() || ((Boolean) ((cfup) ctjd.aG.get()).e()).booleanValue()) {
            amho amhoVar = this.a;
            engrVar.h(amhoVar.k.a(new aqgd() { // from class: amhl
                @Override // defpackage.aqgd
                public final elfl a() {
                    return amhn.this.a.e();
                }
            }));
        }
        if (((ausa) this.a.p.b()).a()) {
            engrVar.h(this.a.m.b().a(new aqgd() { // from class: amhm
                @Override // defpackage.aqgd
                public final elfl a() {
                    return amhn.this.a.e();
                }
            }));
        }
        this.a.l = ctbt.a(engrVar.g());
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ctbx ctbxVar = this.a.l;
        ctbxVar.getClass();
        ctbxVar.a();
        this.a.l = null;
    }
}
