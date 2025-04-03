package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class chbw implements erqj {
    final /* synthetic */ String a;
    final /* synthetic */ chbx b;

    public chbw(chbx chbxVar, String str) {
        this.a = str;
        this.b = chbxVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ensk j = chbx.a.j();
        j.Y(ente.a, "BugleNetwork");
        enrr enrrVar = (enrr) ((enrr) j).g(th);
        enrrVar.aa(ensy.FULL);
        enrrVar.Y(csux.E, this.a);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProviderCache$1", "onFailure", 140, "PhoneRegistrationProviderCache.java")).q("Failed to create phone registration provider cache.");
        synchronized (this.b.c) {
            this.b.d.remove(this.a);
        }
    }
}
