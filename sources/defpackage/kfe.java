package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kfe extends kez {
    final /* synthetic */ kff c;

    public kfe(kff kffVar) {
        this.c = kffVar;
    }

    @Override // defpackage.kez
    protected final String d() {
        kfb kfbVar = (kfb) this.c.a.get();
        if (kfbVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + kfbVar.a + "]";
    }
}
