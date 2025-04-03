package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckar implements ckao {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/rbm/capabilities/BotIdResolverTransportProxy");
    private final enhk b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;

    public ckar(Map map, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.b = enhk.j(map);
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
    }

    @Override // defpackage.ckao
    public final elfl a(aoku aokuVar) {
        if (!((asur) this.d.b()).a() && !((asus) this.e.b()).a() && !((asut) this.f.b()).a()) {
            final eqna d = ((crgh) this.c.b()).d();
            Optional map = Collection.EL.stream(this.b.entrySet()).filter(new Predicate() { // from class: ckap
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((ckas) ((Map.Entry) obj).getKey()).c.equals(eqna.this);
                }
            }).findFirst().map(new Function() { // from class: ckaq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (ffbr) ((Map.Entry) obj).getValue();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (map.isEmpty()) {
                ensk j = a.j();
                j.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/rbm/capabilities/BotIdResolverTransportProxy", "getBotChatEndpoint", 84, "BotIdResolverTransportProxy.java")).t("getBotChatEndpoint: no BotIdResolver implementation registered for transport: %s", d.name());
                return elfo.e(Optional.empty());
            }
            ekzz f = eleg.f("BotIdResolverTransportProxy::getBotChatEndpoint2");
            try {
                elfl a2 = ((ckao) ((ffbr) map.get()).b()).a(aokuVar);
                f.b(a2);
                f.close();
                return a2;
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/rbm/capabilities/BotIdResolverTransportProxy", "getBotChatEndpoint", 62, "BotIdResolverTransportProxy.java")).q("getBotChatEndpoint: viaBotInfo is enabled");
        ffbr ffbrVar = (ffbr) this.b.get(ckas.BOT_INFO);
        if (ffbrVar == null) {
            ensk j2 = enruVar.j();
            j2.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/rbm/capabilities/BotIdResolverTransportProxy", "getBotChatEndpoint", 72, "BotIdResolverTransportProxy.java")).q("getBotChatEndpoint: no BotResolverStrategy.BOT_INFO impl");
            return elfo.e(Optional.empty());
        }
        ekzz f2 = eleg.f("BotIdResolverTransportProxy::getBotChatEndpoint1");
        try {
            elfl a3 = ((ckao) ffbrVar.b()).a(aokuVar);
            f2.b(a3);
            f2.close();
            return a3;
        } catch (Throwable th3) {
            try {
                f2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
