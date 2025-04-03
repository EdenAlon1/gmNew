package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajjk implements ajjd, ajjc {
    private static final enru c = enru.c("com/google/android/apps/messaging/popups/PopupsUiAdapterImpl");
    public final fgcm a;
    public final ajjj b;
    private final fgdj d;

    public ajjk() {
        fgcm a = fgdm.a(null);
        this.a = a;
        this.d = a;
        this.b = new ajjj(this);
    }

    private final void h(ffix ffixVar) {
        if (((doau) this.a.c()) != null) {
            ((enrr) c.j().h("com/google/android/apps/messaging/popups/PopupsUiAdapterImpl", "checkAndSetUiData", 73, "PopupsUiAdapterImpl.kt")).q("Illegal popup state: Existing popup cannot be replaced with another popup. Dismiss the existing popup first.");
        } else {
            this.a.f(ffixVar.invoke());
        }
    }

    @Override // defpackage.ajjc
    public final /* synthetic */ void a(final dmfn dmfnVar) {
        b(new ffji() { // from class: ajja
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((ajiy) obj).getClass();
                return dmfn.this;
            }
        });
    }

    @Override // defpackage.ajjc
    public final void b(final ffji ffjiVar) {
        h(new ffix() { // from class: ajjf
            @Override // defpackage.ffix
            public final Object invoke() {
                ffji ffjiVar2 = ffji.this;
                final ajjk ajjkVar = this;
                final dmfn dmfnVar = (dmfn) ffjiVar2.invoke(ajjkVar.b);
                return dmfnVar.a(new ffix() { // from class: ajje
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ajjk.this.g();
                        dmfnVar.b().invoke();
                        return ffcu.a;
                    }
                });
            }
        });
    }

    @Override // defpackage.ajjc
    public final /* synthetic */ void c(final dmvt dmvtVar, boolean z) {
        d(z, new ffji() { // from class: ajiz
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((ajiy) obj).getClass();
                return dmvt.this;
            }
        });
    }

    @Override // defpackage.ajjc
    public final void d(final boolean z, final ffji ffjiVar) {
        h(new ffix() { // from class: ajjh
            @Override // defpackage.ffix
            public final Object invoke() {
                ffji ffjiVar2 = ffji.this;
                final ajjk ajjkVar = this;
                return ((dmvt) ffjiVar2.invoke(ajjkVar.b)).a(z, new ffix() { // from class: ajji
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ajjk.this.g();
                        return ffcu.a;
                    }
                });
            }
        });
    }

    @Override // defpackage.ajjc
    public final void e(final ffji ffjiVar) {
        h(new ffix() { // from class: ajjg
            @Override // defpackage.ffix
            public final Object invoke() {
                return (doau) ffji.this.invoke(this.b);
            }
        });
    }

    @Override // defpackage.ajjd
    public final fgdj f() {
        return this.d;
    }

    public final void g() {
        this.a.f(null);
    }
}
