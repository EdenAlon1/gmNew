package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uuf implements ejwd<Boolean> {
    final /* synthetic */ uuy a;

    public uuf(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        csjy.p("Bugle", th, "Couldn't get CanUseLinkPreviewByDefault capability");
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.aG = ((Boolean) obj).booleanValue();
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
