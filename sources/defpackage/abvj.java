package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvj extends alhh implements abvb {
    public static final cfva a = cfvl.i(cfvl.b, "enable_custodian_clearcut_reporter", true);
    private static final entd b = entd.c("ClearcutReporter");

    public abvj(ffbr ffbrVar, abvm abvmVar, Executor executor) {
        super(ffbrVar, abvmVar, executor);
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: abve
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((epwl) obj).mergeFrom((epwl) obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    @Override // defpackage.abuy
    public final void b(final abux abuxVar) {
        if (((Boolean) a.e()).booleanValue()) {
            abuu abuuVar = (abuu) abuxVar;
            int ordinal = abuuVar.a.ordinal();
            if (ordinal != 1) {
                if (ordinal == 3) {
                    final Optional optional = abuuVar.e;
                    emxf.b(optional.isPresent() && !((engw) optional.get()).isEmpty(), "NEW_CONVERSATION_WITH_EXISTING_RCS_GROUP_ID error has no forkedConversationJoinStates");
                    ((ensz) b.n().h("com/google/android/apps/messaging/custodian/reporter/sinks/clearcut/ClearcutReporter", "logNewConversationWithExistingRcsGroupId", 134, "ClearcutReporter.java")).q("Logging NewConversationWithExistingRcsGroupId event to Clearcut");
                    o(new Supplier() { // from class: abvc
                        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable, java.lang.Object] */
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            cfva cfvaVar = abvj.a;
                            final epwv epwvVar = (epwv) epww.a.createBuilder();
                            ?? r1 = Optional.this.get();
                            epwvVar.copyOnWrite();
                            epww epwwVar = (epww) epwvVar.instance;
                            eygi eygiVar = epwwVar.c;
                            if (!eygiVar.c()) {
                                epwwVar.c = eyfy.mutableCopy(eygiVar);
                            }
                            abux abuxVar2 = abuxVar;
                            eydl.addAll(r1, epwwVar.c);
                            abuu abuuVar2 = (abuu) abuxVar2;
                            abuuVar2.f.ifPresent(new Consumer() { // from class: abvh
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    int intValue = ((Integer) obj).intValue();
                                    epwv epwvVar2 = epwv.this;
                                    epwvVar2.copyOnWrite();
                                    epww epwwVar2 = (epww) epwvVar2.instance;
                                    epww epwwVar3 = epww.a;
                                    epwwVar2.b |= 1;
                                    epwwVar2.d = intValue;
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            epwl epwlVar = (epwl) epwo.a.createBuilder();
                            epwlVar.copyOnWrite();
                            epwo epwoVar = (epwo) epwlVar.instance;
                            epwoVar.e = abuuVar2.a.h;
                            epwoVar.b |= 1;
                            epwlVar.copyOnWrite();
                            epwo epwoVar2 = (epwo) epwlVar.instance;
                            epww epwwVar2 = (epww) epwvVar.build();
                            epwwVar2.getClass();
                            epwoVar2.d = epwwVar2;
                            epwoVar2.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                            return (epwo) epwlVar.build();
                        }
                    });
                    return;
                }
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        ((ensz) b.n().h("com/google/android/apps/messaging/custodian/reporter/sinks/clearcut/ClearcutReporter", "logConversationForking", 115, "ClearcutReporter.java")).q("Logging Conversation Forking event to Clearcut");
                        if (abuuVar.g.isPresent()) {
                            o(new Supplier() { // from class: abvi
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    cfva cfvaVar = abvj.a;
                                    epwl epwlVar = (epwl) epwo.a.createBuilder();
                                    epwlVar.copyOnWrite();
                                    epwo epwoVar = (epwo) epwlVar.instance;
                                    abuu abuuVar2 = (abuu) abux.this;
                                    epwoVar.e = abuuVar2.a.h;
                                    epwoVar.b |= 1;
                                    Object obj = abuuVar2.g.get();
                                    epwlVar.copyOnWrite();
                                    epwo epwoVar2 = (epwo) epwlVar.instance;
                                    epwoVar2.d = obj;
                                    epwoVar2.c = 102;
                                    return (epwo) epwlVar.build();
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (ordinal != 6) {
                        return;
                    }
                    ((ensz) b.n().h("com/google/android/apps/messaging/custodian/reporter/sinks/clearcut/ClearcutReporter", "logMixedUpParticipantStatistics", 103, "ClearcutReporter.java")).q("Logging Mixed Up Participant event to Clearcut");
                    if (abuuVar.h.isPresent()) {
                        o(new Supplier() { // from class: abvg
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                cfva cfvaVar = abvj.a;
                                epwl epwlVar = (epwl) epwo.a.createBuilder();
                                epwlVar.copyOnWrite();
                                epwo epwoVar = (epwo) epwlVar.instance;
                                abuu abuuVar2 = (abuu) abux.this;
                                epwoVar.e = abuuVar2.a.h;
                                epwoVar.b |= 1;
                                Object obj = abuuVar2.h.get();
                                epwlVar.copyOnWrite();
                                epwo epwoVar2 = (epwo) epwlVar.instance;
                                epwoVar2.d = obj;
                                epwoVar2.c = 103;
                                return (epwo) epwlVar.build();
                            }
                        });
                        return;
                    }
                    return;
                }
            }
            ((ensz) b.n().h("com/google/android/apps/messaging/custodian/reporter/sinks/clearcut/ClearcutReporter", "logSimpleError", 93, "ClearcutReporter.java")).t("Logging [%s] event to Clearcut", abuuVar.a);
            o(new Supplier() { // from class: abvf
                @Override // java.util.function.Supplier
                public final Object get() {
                    cfva cfvaVar = abvj.a;
                    final epwl epwlVar = (epwl) epwo.a.createBuilder();
                    epwlVar.copyOnWrite();
                    epwo epwoVar = (epwo) epwlVar.instance;
                    abuu abuuVar2 = (abuu) abux.this;
                    epwoVar.e = abuuVar2.a.h;
                    epwoVar.b |= 1;
                    abuuVar2.c.ifPresent(new Consumer() { // from class: abvd
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            int intValue = ((Integer) obj).intValue();
                            epwl epwlVar2 = epwl.this;
                            epwlVar2.copyOnWrite();
                            epwo epwoVar2 = (epwo) epwlVar2.instance;
                            epwo epwoVar3 = epwo.a;
                            epwoVar2.b |= 2;
                            epwoVar2.f = intValue;
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return (epwo) epwlVar.build();
                }
            });
        }
    }
}
