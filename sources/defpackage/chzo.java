package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class chzo implements Runnable {
    public final /* synthetic */ chzz a;

    /* JADX WARN: Type inference failed for: r2v19, types: [emyl, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        enip o;
        final chzz chzzVar = this.a;
        ekzm b = chzzVar.i.b("BindHandlerImpl#checkMessageIdsAndPull");
        try {
            synchronized (chzzVar.n) {
                o = enip.o(chzzVar.s);
                chzzVar.s = new HashSet();
            }
            if (o.isEmpty()) {
                ensk h = chzz.c.h();
                h.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "checkMessageIdsAndPull", 289, "BindHandlerImpl.java")).q("checkMessageIdsAndPull called without any msg ID, potentially a bug");
                chzzVar.f();
            } else {
                ensk e = chzz.c.e();
                e.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "checkMessageIdsAndPull", 294, "BindHandlerImpl.java")).B("%s BindHandler: Checking if %d tickled messages have all been received.", epkl.a(chzzVar.J), o.size());
                if (chzzVar.z.b(o)) {
                    ensk h2 = chzz.c.h();
                    h2.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "checkMessageIdsAndPull", 299, "BindHandlerImpl.java")).t("%s BindHandler: All tickled message IDs have been received recently. Skip pulling.", epkl.a(chzzVar.J));
                    chzzVar.f();
                    ((akzt) chzzVar.w.b()).e("Bugle.Ditto.Binding.TicklePulling.Counts", 2);
                } else {
                    ((akzt) chzzVar.w.b()).e("Bugle.Ditto.Binding.TicklePulling.Counts", 3);
                    ensk h3 = chzz.c.h();
                    h3.Y(ente.a, "BugleNetwork");
                    ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "checkMessageIdsAndPull", 314, "BindHandlerImpl.java")).t("%s BindHandler: Initiate a pull because some tickled IDs haven't been seen", epkl.a(chzzVar.J));
                    ((cigx) chzzVar.C.get().get()).a().e(Exception.class, new emwl() { // from class: chzr
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            ensk h4 = chzz.c.h();
                            h4.Y(ente.a, "BugleNetwork");
                            ((enrr) ((enrr) ((enrr) h4).g((Exception) obj)).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "checkMessageIdsAndPull", 325, "BindHandlerImpl.java")).t("%s BindHandler: Pull message failed", epkl.a(chzz.this.J));
                            return null;
                        }
                    }, chzzVar.x).h(new emwl() { // from class: chzs
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            chzz.this.f();
                            return null;
                        }
                    }, chzzVar.x);
                }
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
