package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsfq implements dsmn {
    final /* synthetic */ dsfv a;

    public dsfq(dsfv dsfvVar) {
        this.a = dsfvVar;
    }

    @Override // defpackage.dsmn
    public final void l(int i) {
        ((enrr) dsfv.b.h().h("com/google/android/libraries/compose/ui/HugoManagerImpl$keyboardStateListener$1", "onKeyboardHeightChanged", 171, "HugoManagerImpl.kt")).r("Keyboard height changed to %d", i);
        this.a.j.l(i);
        dsfv.s(this.a, i, 0, 2);
    }

    @Override // defpackage.dsmn
    public final void m(dsmm dsmmVar) {
        dsmmVar.getClass();
        ((enrr) dsfv.b.h().h("com/google/android/libraries/compose/ui/HugoManagerImpl$keyboardStateListener$1", "onKeyboardStateChanged", 164, "HugoManagerImpl.kt")).t("Keyboard state switched to %s", dsmmVar);
        this.a.g.f(dsmmVar);
        this.a.j.m(dsmmVar);
        dsfv.s(this.a, 0, 0, 3);
    }
}
