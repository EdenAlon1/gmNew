package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajen implements ejxk {
    final /* synthetic */ ajem a;

    public ajen(ajem ajemVar) {
        this.a = ajemVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        ejxj.a(th);
        ((enrr) ((enrr) ajem.a.j()).g(th).h("com/google/android/apps/messaging/penpal/entrypoint/PenpalEntryPointImpl$settingReadSubscriptionMixinCallback$1", "onLoadError", 83, "PenpalEntryPointImpl.kt")).q("Failed to get the Penpal entrypoint setting");
    }

    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
            ajem ajemVar = this.a;
            ajemVar.f = booleanValue;
            ajemVar.d.invoke();
        }
    }
}
