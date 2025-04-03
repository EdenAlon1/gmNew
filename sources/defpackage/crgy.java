package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crgy {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/transport/SimChatTransportManager");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final AtomicBoolean f;
    private final AtomicReference g;

    public crgy(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        new emar();
        this.f = new AtomicBoolean(false);
        this.g = new AtomicReference(enoz.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0195, code lost:
    
        if ((r2 instanceof defpackage.crgs) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0197, code lost:
    
        r0 = defpackage.crgu.a.j();
        r0.Y(defpackage.ente.a, "BugleTransport");
        r0 = (defpackage.enrr) r0;
        r2 = (defpackage.crgs) r2;
        r0.Y(defpackage.csux.Z, r2.a);
        ((defpackage.enrr) r0.h("com/google/android/apps/messaging/shared/transport/ChatTransportSelector", "selectEligibleSimFallback", 62, "ChatTransportSelector.kt")).q("Fallback to selecting single NON-Tachygram SIM as eligible for registration, despite multiple sims available.");
        r0 = defpackage.ffew.c(new defpackage.ffcf(r2.a, r2.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d2, code lost:
    
        if ((r2 instanceof defpackage.crgr) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01d4, code lost:
    
        r0 = defpackage.crgu.a.h();
        r0.Y(defpackage.ente.a, "BugleTransport");
        ((defpackage.enrr) r0.h("com/google/android/apps/messaging/shared/transport/ChatTransportSelector", "selectEligibleSimFallback", 68, "ChatTransportSelector.kt")).q("No sims are eligible for registration, should never happen.");
        r0 = defpackage.ffem.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ff, code lost:
    
        throw new defpackage.ffcd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0158, code lost:
    
        if ((r2 instanceof defpackage.crgt) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015a, code lost:
    
        r0 = defpackage.crgu.a.j();
        r0.Y(defpackage.ente.a, "BugleTransport");
        r0 = (defpackage.enrr) r0;
        r2 = (defpackage.crgt) r2;
        r0.Y(defpackage.csux.Z, r2.a);
        ((defpackage.enrr) r0.h("com/google/android/apps/messaging/shared/transport/ChatTransportSelector", "selectEligibleSimFallback", 53, "ChatTransportSelector.kt")).q("Fallback to selecting single Tachygram SIM as eligible for registration, despite multiple sims available.");
        r0 = defpackage.ffew.c(new defpackage.ffcf(r2.a, defpackage.crgf.c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f6, code lost:
    
        defpackage.ffig.a(r1, null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void c(java.util.Map r11) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crgy.c(java.util.Map):void");
    }

    public final enhk a() {
        ekzz f = eleg.f("SimChatTransportManager#simIdToChatTransport");
        try {
            if (!this.f.get()) {
                b(((crgz) this.d.b()).a());
            }
            Object obj = this.g.get();
            obj.getClass();
            enhk enhkVar = (enhk) obj;
            ffig.a(f, null);
            return enhkVar;
        } finally {
        }
    }

    public final void b(Map map) {
        ekzz f = eleg.f("SimChatTransportManager#populateTransportRegistrationState");
        try {
            c(map);
            ffig.a(f, null);
        } finally {
        }
    }
}
