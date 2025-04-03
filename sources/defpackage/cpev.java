package defpackage;

import j$.util.DesugarArrays;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpev {
    public static final cfup a = cfvl.e(cfvl.b, "message_in_memory_window_sec", 15);
    public static final enru b;
    public static final cskc c;
    public static final ecda d;
    public static final ecda e;
    public static final engw f;
    public static final engw g;
    public static final engw h;
    public static final engw i;
    public static final cfva j;
    public static final cfva k;
    public static final cfva l;
    public static final cfva m;
    public static final cfva n;
    private static final ecda v;
    private static final ecda w;
    private static final ecda x;
    private final ConcurrentHashMap B;
    public final ecrj o;
    public final cqoh p;
    public final ffbr q;
    public final ffbr r;
    public final engw u;
    private final errm y;
    private final ffbr z;
    public final AtomicInteger s = new AtomicInteger(0);
    private long A = 0;
    public final AtomicInteger t = new AtomicInteger();

    static {
        cfvl.e(cfvl.b, "receive_message_timer_removal_delay_sec", 45);
        b = enru.c("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics");
        c = cskc.g("MessageLatencyAnalytics", "Performance");
        v = new ecda("MLA::NamedTrace::pressButtonToVisible");
        w = new ecda("MLA::NamedTrace::pressButtonToVisibleFromDisk");
        d = new ecda("MLA::NamedTrace::pressButtonToTachygramStartingSend");
        e = new ecda("MLA::NamedTrace::pressButtonToTachygramFinishedSend");
        x = new ecda("MLA::NamedTrace::pressButtonToSentVisible");
        engw r = engw.r(cpeu.SEND_BUTTON_ACCURATE);
        f = r;
        engr engrVar = new engr();
        engrVar.j(r);
        engrVar.h(cpeu.NOTIFICATION);
        engw g2 = engrVar.g();
        g = g2;
        engr engrVar2 = new engr();
        engrVar2.j(g2);
        engrVar2.h(cpeu.TACHYGRAM_FINISHED_SENDING);
        h = engrVar2.g();
        i = engw.s(cpeu.TICKLE_ARRIVED, cpeu.TACHYGRAM_MESSAGE_ARRIVED);
        j = cfvl.r(239071186, "enable_prime_metrics_for_message_latency");
        k = cfvl.r(239071186, "enable_prime_metrics_for_compose_view_peer");
        l = cfvl.r(249281779, "enable_prime_metrics_for_receive_message_latency");
        m = cfvl.r(249281779, "enable_tachygram_to_sent_visible_latency");
        n = cfvl.r(248087153, "enable_macro_benchmark_named_trace");
    }

    public cpev(ecrj ecrjVar, cqoh cqohVar, errm errmVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        Stream map = DesugarArrays.stream(cpeu.values()).map(new Function() { // from class: cpen
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cfup cfupVar = cpev.a;
                return new ConcurrentHashMap();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = engw.d;
        this.u = (engw) map.collect(endq.a);
        this.B = new ConcurrentHashMap();
        this.o = ecrjVar;
        this.p = cqohVar;
        this.y = errmVar;
        this.z = ffbrVar;
        this.q = ffbrVar2;
        this.r = ffbrVar3;
    }

    public static ecda a(int i2) {
        switch (i2) {
            case -1:
            case 4:
            case 5:
            case 6:
                return new ecda("Unknown");
            case 0:
                return new ecda("Sms");
            case 1:
            case 2:
                return new ecda("Mms");
            case 3:
                return new ecda("Rcs");
            default:
                return new ecda("UnknownDefault");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void p(String str, ecda ecdaVar, fgmh fgmhVar, engw engwVar) {
        for (int i2 = 0; i2 < ((enou) engwVar).c; i2++) {
            cpeu cpeuVar = (cpeu) engwVar.get(i2);
            ecda a2 = ecda.a(cpeuVar.f, ecdaVar);
            cpes cpesVar = (cpes) ((ConcurrentHashMap) this.u.get(cpeuVar.ordinal())).get(str);
            if (cpesVar == null) {
                ((enrr) ((enrr) b.f()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "sendTimerEvent", 935, "MessageLatencyAnalytics.java")).J("Timer is not tracked. traceId=%s, timerName=%s, startPoint=%s", str, ecdaVar, cpeuVar);
            } else if (this.A > cpesVar.a) {
                ((enrr) ((enrr) b.e()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "sendTimerEvent", 944, "MessageLatencyAnalytics.java")).D("Conversation opened after timer was started. traceId=%s, timerName=%s", str, ecdaVar);
            } else {
                cpesVar.b(a2, fgmhVar);
            }
        }
    }

    private final void q() {
        ffbr ffbrVar = this.q;
        int incrementAndGet = this.t.incrementAndGet();
        ((alse) ffbrVar.b()).b(v, incrementAndGet);
        ((alse) this.q.b()).b(w, incrementAndGet);
        ((alse) this.q.b()).b(d, incrementAndGet);
        ((alse) this.q.b()).b(e, incrementAndGet);
        ((alse) this.q.b()).b(x, incrementAndGet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(cpeu cpeuVar, String str, cpes cpesVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.u.get(cpeuVar.ordinal());
        if (concurrentHashMap.mappingCount() > 300) {
            ((enrr) ((enrr) b.j()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "addTracker", 352, "MessageLatencyAnalytics.java")).q("Exceeded limit of tracked messages");
            concurrentHashMap.clear();
        }
        if (((cpes) concurrentHashMap.putIfAbsent(str, cpesVar)) != null) {
            ((enrr) ((enrr) b.j()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "logDuplicateTimer", 250, "MessageLatencyAnalytics.java")).D("Duplicate trace for startPoint=%s and traceId=%s. Ignoring", new evhq(evhp.NO_USER_DATA, cpeuVar.f), str);
        }
    }

    public final void c() {
        ((enrr) ((enrr) b.e()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "conversationScreenOpened", 876, "MessageLatencyAnalytics.java")).q("Recording new conversation screen open time.");
        this.A = this.p.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(String str, String str2) {
        if (((Boolean) l.e()).booleanValue()) {
            engw engwVar = this.u;
            int size = engwVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) engwVar.get(i2);
                if (concurrentHashMap.containsKey(str)) {
                    concurrentHashMap.put(str2, (cpes) concurrentHashMap.get(str));
                }
            }
        }
    }

    public final void e(cpeu cpeuVar, String str) {
        cpes cpesVar = (cpes) this.B.remove(cpeuVar);
        if (cpesVar == null) {
            return;
        }
        b(cpeuVar, str, cpesVar);
    }

    public final void f(final String str, int i2, final engw engwVar) {
        axnw.e(this.y.schedule(eldl.l(new Runnable() { // from class: cpeo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = 0;
                while (true) {
                    engw engwVar2 = engwVar;
                    if (i3 >= ((enou) engwVar2).c) {
                        return;
                    }
                    String str2 = str;
                    cpev cpevVar = cpev.this;
                    ((ConcurrentHashMap) cpevVar.u.get(((cpeu) engwVar2.get(i3)).ordinal())).remove(str2);
                    i3++;
                }
            }
        }), i2, TimeUnit.SECONDS));
    }

    public final void g(cpeu cpeuVar, String str) {
        if (((Boolean) j.e()).booleanValue()) {
            b(cpeuVar, str, new cpes(this));
            if (((Boolean) n.e()).booleanValue() && cpeuVar.equals(cpeu.SEND_BUTTON_ACCURATE)) {
                q();
            }
        }
    }

    public final void h(cpeu cpeuVar) {
        if (((Boolean) j.e()).booleanValue()) {
            if (((cpes) this.B.put(cpeuVar, new cpes(this))) != null) {
                ((enrr) ((enrr) b.j()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "startTrackingGlobal", 231, "MessageLatencyAnalytics.java")).t("Previous global tracker for start point was still not consumed. %s", cpeuVar.f);
            }
            if (((Boolean) n.e()).booleanValue() && cpeuVar.equals(cpeu.SEND_BUTTON_ACCURATE)) {
                q();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(String str, ecda ecdaVar, engw engwVar) {
        for (int i2 = 0; i2 < ((enou) engwVar).c; i2++) {
            cpeu cpeuVar = (cpeu) engwVar.get(i2);
            ecda a2 = ecda.a(cpeuVar.f, ecdaVar);
            cpes cpesVar = (cpes) ((ConcurrentHashMap) this.u.get(cpeuVar.ordinal())).get(str);
            if (cpesVar == null) {
                ((enrr) ((enrr) b.g()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "sendTimerEvent", 898, "MessageLatencyAnalytics.java")).J("Timer is not tracked. traceId=%s, timerName=%s, startPoint=%s", str, ecdaVar, cpeuVar);
            } else if (this.A > cpesVar.a) {
                ((enrr) ((enrr) b.g()).h("com/google/android/apps/messaging/shared/stuckmessages/MessageLatencyAnalytics", "sendTimerEvent", 907, "MessageLatencyAnalytics.java")).D("Conversation opened after timer was started. traceId=%s, timerName=%s", str, ecdaVar);
            } else {
                cpesVar.a(a2);
            }
        }
    }

    public final void j(String str, fgmh fgmhVar, int i2) {
        ecda ecdaVar = new ecda("ToVisible");
        if (fgmhVar != null) {
            p(str, ecdaVar, fgmhVar, i);
        }
        engw engwVar = i;
        i(str, ecdaVar, engwVar);
        i(str, ecda.a(ecdaVar, a(i2)), engwVar);
    }

    public final void k(String str, fgmh fgmhVar, int i2) {
        ecda ecdaVar = new ecda("ToDeliveredVisible");
        if (fgmhVar != null) {
            p(str, ecdaVar, fgmhVar, g);
            p(str, ecdaVar, fgmhVar, i);
        }
        engw engwVar = g;
        i(str, ecdaVar, engwVar);
        i(str, ecdaVar, i);
        i(str, ecda.a(ecdaVar, a(i2)), engwVar);
    }

    public final void l(String str, fgmh fgmhVar, int i2) {
        if (((Boolean) n.e()).booleanValue()) {
            ((alse) this.q.b()).f(x, this.t.get());
        }
        ecda ecdaVar = new ecda("ToSentVisible");
        if (fgmhVar != null) {
            p(str, ecdaVar, fgmhVar, h);
        }
        i(str, ecdaVar, g);
        i(str, ecda.a(ecdaVar, a(i2)), h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(String str, fgmh fgmhVar, int i2) {
        if (((Boolean) n.e()).booleanValue()) {
            ((alse) this.q.b()).f(v, this.t.get());
        }
        ecda ecdaVar = new ecda("ToVisible");
        engw engwVar = g;
        p(str, ecdaVar, fgmhVar, engwVar);
        i(str, ecdaVar, engwVar);
        i(str, ecda.a(ecdaVar, a(i2)), f);
        ((ConcurrentHashMap) this.u.get(cpeu.SEND_BUTTON_ACCURATE.ordinal())).get(str);
    }

    public final void n(String str, fgmh fgmhVar, int i2) {
        if (((Boolean) n.e()).booleanValue()) {
            ((alse) this.q.b()).f(w, this.t.get());
        }
        ecda ecdaVar = new ecda("ToVisibleFromDisk");
        engw engwVar = f;
        p(str, ecdaVar, fgmhVar, engwVar);
        i(str, ecda.a(ecdaVar, a(i2)), engwVar);
    }

    public final void o(String str, ecda ecdaVar, cpeu... cpeuVarArr) {
        i(str, ecdaVar, engw.p(cpeuVarArr));
    }
}
