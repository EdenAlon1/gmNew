package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ciof implements erqj {
    final /* synthetic */ ciog a;

    public ciof(ciog ciogVar) {
        this.a = ciogVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cink cinkVar = (cink) obj;
        if (cinkVar == null) {
            ((ensz) ((ensz) ciog.a.i()).h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl$3", "onSuccess", 737, "BugleNotificationManagerImpl.java")).q("No notification created for Auto-moved spam");
        } else if (this.a.aa(cinkVar)) {
            ((cugd) this.a.d.b()).b(new ffji() { // from class: cuga
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    ereu ereuVar = (ereu) obj2;
                    cfup cfupVar = cugd.a;
                    ereuVar.getClass();
                    erdn erdnVar = (erdn) erdo.a.createBuilder();
                    erdnVar.getClass();
                    eyfy build = erdnVar.build();
                    build.getClass();
                    erdp erdpVar = ereuVar.a;
                    erdpVar.copyOnWrite();
                    erdq erdqVar = (erdq) erdpVar.instance;
                    erdq erdqVar2 = erdq.a;
                    erdqVar.c = (erdo) build;
                    erdqVar.b = 2;
                    return ffcu.a;
                }
            });
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((ensz) ((ensz) ((ensz) ciog.a.i()).g(th)).h("com/google/android/apps/messaging/shared/notification/BugleNotificationManagerImpl$3", "onFailure", (char) 744, "BugleNotificationManagerImpl.java")).q("Auto-moved spam creation future failed");
    }
}
