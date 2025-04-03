package defpackage;

import com.google.communication.synapse.security.scytale.EventPublisher;
import com.google.scytale.logging.ScytaleLoggingProto$ScytaleEvent;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cafh extends EventPublisher {
    public final ffbr a;
    public final Optional b;
    private final Executor c;

    public cafh(ffbr ffbrVar, Optional optional, Executor executor) {
        this.a = ffbrVar;
        this.b = optional;
        this.c = executor;
    }

    @Override // com.google.communication.synapse.security.scytale.EventPublisher
    public final void onScytaleEvent(final ScytaleLoggingProto$ScytaleEvent scytaleLoggingProto$ScytaleEvent) {
        axnw.h(elfo.f(new Runnable() { // from class: cafg
            @Override // java.lang.Runnable
            public final void run() {
                ekzz f = eleg.f("ScytaleEventPublisher::onScytaleEvent");
                ScytaleLoggingProto$ScytaleEvent scytaleLoggingProto$ScytaleEvent2 = scytaleLoggingProto$ScytaleEvent;
                cafh cafhVar = cafh.this;
                try {
                    eotc eotcVar = (eotc) eotf.a.createBuilder();
                    eotcVar.copyOnWrite();
                    eotf eotfVar = (eotf) eotcVar.instance;
                    scytaleLoggingProto$ScytaleEvent2.getClass();
                    eotfVar.d = scytaleLoggingProto$ScytaleEvent2;
                    eotfVar.b |= 2;
                    eovw eovwVar = csjc.a;
                    eotcVar.copyOnWrite();
                    eotf eotfVar2 = (eotf) eotcVar.instance;
                    eotfVar2.e = eovwVar.x;
                    eotfVar2.b |= 4;
                    if (cafhVar.b.isPresent()) {
                        Object obj = cafhVar.b.get();
                        eotcVar.copyOnWrite();
                        eotf eotfVar3 = (eotf) eotcVar.instance;
                        eotfVar3.c = ((eote) obj).i;
                        eotfVar3.b |= 1;
                    }
                    eolu eoluVar = (eolu) eolv.a.createBuilder();
                    eolt eoltVar = eolt.BUGLE_SCYTALE_EVENT;
                    eoluVar.copyOnWrite();
                    eolv eolvVar = (eolv) eoluVar.instance;
                    eolvVar.j = eoltVar.dk;
                    eolvVar.b |= 1;
                    eotf eotfVar4 = (eotf) eotcVar.build();
                    eoluVar.copyOnWrite();
                    eolv eolvVar2 = (eolv) eoluVar.instance;
                    eotfVar4.getClass();
                    eolvVar2.R = eotfVar4;
                    eolvVar2.c |= 8192;
                    ((akxl) cafhVar.a.b()).j(eoluVar);
                    f.close();
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, this.c));
    }
}
