package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsol implements dsoe {
    private static final enru f = enru.c("com/google/android/libraries/compose/ui/keyboard/persistence/KeyboardDataPersistenceProtoDataStore");
    public final dlpw a;
    public final effy b;
    public final ffsk c;
    public final dqkk d;
    public volatile dson e;
    private final Activity g;
    private ffud h;
    private int i;
    private dsmm j;

    public dsol(Activity activity, dlpw dlpwVar, effy effyVar, ffsk ffskVar, dqkk dqkkVar) {
        activity.getClass();
        dlpwVar.getClass();
        effyVar.getClass();
        ffskVar.getClass();
        dqkkVar.getClass();
        this.g = activity;
        this.a = dlpwVar;
        this.b = effyVar;
        this.c = ffskVar;
        this.d = dqkkVar;
        this.j = dsmm.d;
    }

    private final void a(dsmm dsmmVar, int i) {
        Integer valueOf;
        if (dsmmVar != dsmm.a || i < 0) {
            return;
        }
        if (dskj.f(this.g)) {
            dson dsonVar = this.e;
            if (dsonVar != null) {
                valueOf = Integer.valueOf(dsonVar.c);
            }
            valueOf = null;
        } else {
            dson dsonVar2 = this.e;
            if (dsonVar2 != null) {
                valueOf = Integer.valueOf(dsonVar2.d);
            }
            valueOf = null;
        }
        if (valueOf != null && i == valueOf.intValue()) {
            return;
        }
        this.e = null;
        boolean f2 = dskj.f(this.g);
        ((enrr) f.h().h("com/google/android/libraries/compose/ui/keyboard/persistence/KeyboardDataPersistenceProtoDataStore", "saveHeightToDataStore", 89, "KeyboardDataPersistenceProtoDataStore.kt")).x("Saving keyboard height of %d (is portrait: %s)", i, f2);
        ffud ffudVar = this.h;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        this.h = ffqy.d(this.c, null, null, new dsoi(this, f2, i, null), 3);
    }

    @Override // defpackage.dsmn
    public final void l(int i) {
        this.i = i;
        a(this.j, i);
    }

    @Override // defpackage.dsmn
    public final void m(dsmm dsmmVar) {
        dsmmVar.getClass();
        this.j = dsmmVar;
        a(dsmmVar, this.i);
    }
}
