package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehky implements Runnable {
    final /* synthetic */ ehlb a;

    public ehky(ehlb ehlbVar) {
        this.a = ehlbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ehlb ehlbVar = this.a;
        ((ehlw) ehlbVar.getCurrentDrawable()).l(false, false, true);
        if ((ehlbVar.getProgressDrawable() == null || !ehlbVar.getProgressDrawable().isVisible()) && (ehlbVar.getIndeterminateDrawable() == null || !ehlbVar.getIndeterminateDrawable().isVisible())) {
            ehlbVar.setVisibility(4);
        }
        this.a.e = -1L;
    }
}
