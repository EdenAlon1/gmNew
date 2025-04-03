package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqbo implements alxu {
    public static final /* synthetic */ int c = 0;
    private static final entd d = entd.c("BugleSending");
    public final errl a;
    public final elfk b = new elfk();
    private final ffbr e;
    private final ffbr f;
    private final Optional g;
    private final ffbr h;
    private final Optional i;
    private final ffbr j;
    private final ffbr k;

    public aqbo(ffbr ffbrVar, ffbr ffbrVar2, Optional optional, ffbr ffbrVar3, errl errlVar, Optional optional2, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = optional;
        this.h = ffbrVar3;
        this.a = errlVar;
        this.i = optional2;
        this.j = ffbrVar4;
        this.k = ffbrVar5;
    }

    @Override // defpackage.alxu
    public final elfl a(alxv alxvVar, Instant instant) {
        return !(alxvVar instanceof apro) ? elfo.d(new IllegalArgumentException("Unknown MessageEnvelope Type: ".concat(String.valueOf(String.valueOf(alxvVar.getClass()))))) : ((coja) this.g.get()).b(((apro) alxvVar).g(), instant).h(new emwl() { // from class: aqbl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int i = aqbo.c;
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.alxu
    public final elfl b(alxv alxvVar) {
        fjay fjayVar;
        if (!(alxvVar instanceof apro)) {
            return elfo.d(new IllegalArgumentException("Unknown MessageEnvelope Type: ".concat(String.valueOf(String.valueOf(alxvVar.getClass())))));
        }
        final apro aproVar = (apro) alxvVar;
        this.i.ifPresent(new Consumer() { // from class: aqbk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                int i = aqbo.c;
                ((aqbr) obj).am(apro.this);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        apsd f = aproVar.f();
        if (aproVar.g().aJ() != null) {
            fjayVar = aproVar.g().aJ();
            fjayVar.getClass();
        } else {
            fjayVar = fjay.a;
        }
        if (f != null) {
            apyv apyvVar = f.c == apyw.a ? f.b : null;
            alym alymVar = (alym) this.j.b();
            MessageId messageId = f.a;
            aqux g = aproVar.d().g();
            g.getClass();
            alymVar.c(messageId, apyvVar, g, fjayVar);
        }
        ((altk) this.f.b()).ae(aproVar.h().a, fjayVar, new akzo(aproVar.b(), aproVar.a()));
        altk altkVar = (altk) this.f.b();
        aproVar.g();
        aproVar.d();
        altkVar.aM();
        entd entdVar = d;
        ensz enszVar = (ensz) entdVar.h();
        enszVar.Y(csux.q, aproVar.d().f());
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/message/send/BugleMessageCourier", "send", 128, "BugleMessageCourier.java")).t("Sending prepared envelope: %s.", aproVar);
        ambs ambsVar = (ambs) this.e.b();
        aqux g2 = aproVar.d().g();
        g2.getClass();
        ambsVar.o(g2, aproVar.g(), aproVar.b(), aproVar.h());
        ((apmo) this.k.b()).h();
        ekzz f2 = eleg.f("MessageCourier::NotifySendMessageListeners");
        try {
            ensk o = entdVar.o();
            o.Y(csux.q, aproVar.d().f());
            ((ensz) o.h("com/google/android/apps/messaging/shared/api/messaging/message/send/BugleMessageCourier", "notifySendMessageListeners", 153, "BugleMessageCourier.java")).r("Notifying %d SendMessageListeners.", ((Set) this.h.b()).size());
            Stream map = Collection.EL.stream((Set) this.h.b()).map(new Function() { // from class: aqbm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    final aqbq aqbqVar = (aqbq) obj;
                    ekzz a = aqbqVar.a();
                    aqbo aqboVar = aqbo.this;
                    final apro aproVar2 = aproVar;
                    try {
                        elfl g3 = elfl.g(aqboVar.b.a(eldl.c(new erog() { // from class: aqbn
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                int i = aqbo.c;
                                return aqbq.this.b(aproVar2);
                            }
                        }), aqboVar.a));
                        a.b(g3);
                        a.close();
                        return g3;
                    } catch (Throwable th) {
                        try {
                            a.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            engw engwVar = (engw) map.collect(endq.a);
            if (!engwVar.isEmpty()) {
                ekzz f3 = eleg.f("SendMessageNotify");
                try {
                    elfl a = elfo.a(engwVar);
                    f3.b(a);
                    axnw.h(a);
                    f3.close();
                } finally {
                }
            }
            f2.close();
            return elfo.e(null);
        } finally {
        }
    }
}
