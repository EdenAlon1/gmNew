package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class covh {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/sms/EarlySendCache");
    public final ConcurrentHashMap a;
    private final ffbr c;

    public covh(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.c = ffbrVar;
        this.a = new ConcurrentHashMap();
    }

    public final elfl a(bdhg bdhgVar, Executor executor, final ffix ffixVar) {
        executor.getClass();
        elfl b2 = b(bdhgVar);
        final ffji ffjiVar = new ffji() { // from class: covf
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return ffix.this.invoke();
            }
        };
        return b2.h(new emwl() { // from class: covg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }
        }, executor);
    }

    public final elfl b(bdhg bdhgVar) {
        ffss ffssVar;
        if (bdhgVar == null) {
            ffssVar = null;
        } else {
            ffssVar = (ffss) this.a.get(bdhgVar);
            if (ffssVar != null && ffssVar.y()) {
                this.a.remove(bdhgVar, ffssVar);
            }
        }
        elfl a = ffssVar != null ? axol.a(ffssVar) : null;
        if (a != null) {
            return a;
        }
        ((enrr) b.e().h("com/google/android/apps/messaging/shared/sms/EarlySendCache", "getSaveFuture", 84, "EarlySendCache.kt")).t("No save future found for %s", String.valueOf(bdhgVar));
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }

    public final void c(bdhg bdhgVar, int i) {
        if (!bdhg.l(bdhgVar) || b(bdhgVar).isDone()) {
            return;
        }
        ((akzt) this.c.b()).e("Bugle.EarlySend.SaveNotFinished.Count", i - 1);
    }
}
