package defpackage;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbco {
    private static final Logger a = Logger.getLogger(fbco.class.getName());

    private fbco() {
    }

    public static fbch a(ffbr ffbrVar, ffbr ffbrVar2) {
        fbcg fbcmVar;
        try {
            Collection collection = (Collection) ((fbbb) ffbrVar2).a;
            if (collection.isEmpty()) {
                fbcmVar = fbcg.a;
            } else {
                fbcmVar = collection.size() == 1 ? new fbcm((fbcg) enjk.l(collection)) : new fbcj(collection);
            }
            return fbcmVar.a(((fbbb) ffbrVar).a);
        } catch (RuntimeException e) {
            a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "createMonitorForComponent", "RuntimeException while constructing monitor factories.", (Throwable) e);
            return fbch.a;
        }
    }

    public static void b(RuntimeException runtimeException, fbcg fbcgVar, Object obj) {
        a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logCreateException", a.j(obj, fbcgVar, "RuntimeException while calling ProductionComponentMonitor.Factory.create on factory ", " with component "), (Throwable) runtimeException);
    }

    public static void c(RuntimeException runtimeException, fbcc fbccVar, String str, Object obj) {
        a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorArgMethodException", "RuntimeException while calling ProducerMonitor." + str + " on monitor " + fbccVar + " with " + obj, (Throwable) runtimeException);
    }

    public static void d(RuntimeException runtimeException, fbch fbchVar, fbcd fbcdVar) {
        a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorForException", a.j(fbcdVar, fbchVar, "RuntimeException while calling ProductionComponentMonitor.producerMonitorFor on monitor ", " with token "), (Throwable) runtimeException);
    }

    public static void e(RuntimeException runtimeException, fbcc fbccVar, String str) {
        a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorMethodException", a.o(fbccVar, str, "RuntimeException while calling ProducerMonitor.", " on monitor "), (Throwable) runtimeException);
    }
}
