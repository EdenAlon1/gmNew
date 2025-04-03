package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zbo {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/customthemes/CustomThemesSelectionUiAdapterImpl");
    public final zcb b;
    public final ffsk c;

    public zbo(zcb zcbVar, ffsk ffskVar) {
        zcbVar.getClass();
        ffskVar.getClass();
        this.b = zcbVar;
        this.c = ffskVar;
    }

    public final zcm a(final ajiy ajiyVar) {
        ajiyVar.getClass();
        return new zcm(this.b.f, new zcj(new ffji() { // from class: zbk
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                zch zchVar = (zch) obj;
                ((enrr) zbo.a.h().h("com/google/android/apps/messaging/conversation2/customthemes/CustomThemesSelectionUiAdapterImpl", "createUiData$lambda$0", 37, "CustomThemesSelectionUiAdapterImpl.kt")).t("Selected theme: %s", zchVar);
                zbo zboVar = zbo.this;
                axol.k(zboVar.c, null, new zbn(zboVar, zchVar, null), 3);
                ajiyVar.a();
                return ffcu.a;
            }
        }, new ffix() { // from class: zbl
            @Override // defpackage.ffix
            public final Object invoke() {
                ajiy.this.a();
                return ffcu.a;
            }
        }), new ffix() { // from class: zbm
            @Override // defpackage.ffix
            public final Object invoke() {
                ajiy.this.a();
                return ffcu.a;
            }
        }, 10);
    }
}
