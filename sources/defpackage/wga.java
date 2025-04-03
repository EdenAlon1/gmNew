package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class wga implements ejlr<eyjv<cvqb>, Void> {
    private static final cvqb d(eyjv eyjvVar) {
        return (cvqb) eyjvVar.a(cvqb.a, eyfc.a());
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ensz enszVar = (ensz) wgb.a.h();
        ensn ensnVar = wgb.b;
        int c = cvpz.c(d((eyjv) obj).d);
        if (c == 0) {
            c = 1;
        }
        enszVar.Y(ensnVar, cvpz.a(c));
        ((ensz) enszVar.h("com/google/android/apps/messaging/conversation/star/menu/StarMenuExtension$1", "onSuccess", 88, "StarMenuExtension.java")).q("Updated starred state successfully.");
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        ensz enszVar = (ensz) wgb.a.j();
        ensn ensnVar = wgb.b;
        int c = cvpz.c(d((eyjv) obj).d);
        if (c == 0) {
            c = 1;
        }
        enszVar.Y(ensnVar, cvpz.a(c));
        ((ensz) ((ensz) enszVar.g(th)).h("com/google/android/apps/messaging/conversation/star/menu/StarMenuExtension$1", "onFailure", 98, "StarMenuExtension.java")).q("Failed to update starred state.");
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
