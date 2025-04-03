package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class drwv extends ffkh implements ffji {
    public drwv(Object obj) {
        super(1, obj, drwz.class, "onActiveScreenChanged", "onActiveScreenChanged(Lcom/google/android/libraries/compose/ui/screen/HugoScreen;)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fgcm fgcmVar;
        dtaa dtaaVar = (dtaa) obj;
        drwz drwzVar = (drwz) this.g;
        int i = drwz.al;
        drzi drziVar = drwzVar.c;
        if (drziVar != null) {
            drziVar.n.d(drzi.a[2], dtaaVar);
            if (((drxd) drwzVar.bA()).f && (dtaaVar instanceof dtae)) {
                drzi drziVar2 = drwzVar.c;
                if (drziVar2 == null) {
                    ffkj.c("searchController");
                    drziVar2 = null;
                }
                drziVar2.e();
            }
            if (((drxd) drwzVar.bA()).d && (fgcmVar = drwzVar.e) != null) {
                fgcmVar.f(dtaaVar != null ? dtaaVar.t() : null);
            }
        }
        drwzVar.aU(null);
        return ffcu.a;
    }
}
