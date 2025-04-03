package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adzm implements adze {
    public final lkk a;
    public boolean b;
    public final adhr c;
    private final ffsk d;
    private final atxu e;

    public adzm(adhr adhrVar, ffsk ffskVar, lkk lkkVar, atxu atxuVar) {
        ffskVar.getClass();
        lkkVar.getClass();
        this.c = adhrVar;
        this.d = ffskVar;
        this.a = lkkVar;
        this.e = atxuVar;
    }

    @Override // defpackage.adze
    public final void a(ffjm ffjmVar) {
        if (this.b) {
            return;
        }
        this.b = true;
        if (((ersq) ((atxl) this.e).a.b()).a("bugle.enable_account_menu_event_adapter_lifecycle_fix")) {
            axol.k(this.d, null, new adzj(this, ffjmVar, null), 3).hZ(new ffji() { // from class: adzf
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    adzm.this.b = false;
                    return ffcu.a;
                }
            });
        } else {
            axol.k(this.d, null, new adzl(this, ffjmVar, null), 3).hZ(new ffji() { // from class: adzg
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    adzm.this.b = false;
                    return ffcu.a;
                }
            });
        }
    }
}
