package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckzy implements clas {
    public static final entd a = entd.c("BugleGroupManagement");
    static final cfup b = cfvl.e(cfvl.b, "sync_rcs_group_period_days", 7);
    public final clar c;
    public final ffbr d;
    public final ffbr e;
    public final cqoh f;
    private final clah g;
    private final clws h;
    private final akzt i;
    private final errl j;

    public ckzy(clar clarVar, clah clahVar, clws clwsVar, akzt akztVar, ffbr ffbrVar, ffbr ffbrVar2, cqoh cqohVar, errl errlVar) {
        this.c = clarVar;
        this.g = clahVar;
        this.h = clwsVar;
        this.i = akztVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = cqohVar;
        this.j = errlVar;
    }

    private final void b() {
        this.i.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 0);
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/PwqRecoverDisabledRcsGroupScheduler", "logRecoverDisabledRcsGroupChatNotReady", 273, "PwqRecoverDisabledRcsGroupScheduler.java")).q("Recover disabled RCS group disabled because Bugle is not ready to send and receive chat.");
    }

    public final void a(final ConversationIdType conversationIdType, final int i, final Optional optional) {
        if (i != 4) {
            if (i != 7) {
                axnw.h(elfo.f(new Runnable() { // from class: ckzw
                    @Override // java.lang.Runnable
                    public final void run() {
                        Function function = new Function() { // from class: ckzs
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function2) {
                                return Function$CC.$default$andThen(this, function2);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bseh bsehVar = (bseh) obj;
                                entd entdVar = ckzy.a;
                                return bsehVar;
                            }

                            public final /* synthetic */ Function compose(Function function2) {
                                return Function$CC.$default$compose(this, function2);
                            }
                        };
                        final ConversationIdType conversationIdType2 = conversationIdType;
                        bseh bsehVar = (bseh) bsom.j(conversationIdType2, function);
                        String S = bsehVar != null ? bsehVar.S() : null;
                        final Optional optional2 = optional;
                        final ckzy ckzyVar = ckzy.this;
                        Optional ofNullable = Optional.ofNullable(aqvf.c(S));
                        final bdtd bdtdVar = (bdtd) ckzyVar.d.b();
                        bdtdVar.getClass();
                        final boolean booleanValue = ((Boolean) ofNullable.map(new Function() { // from class: ckzt
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function2) {
                                return Function$CC.$default$andThen(this, function2);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return bdtd.this.f((SelfIdentityId) obj);
                            }

                            public final /* synthetic */ Function compose(Function function2) {
                                return Function$CC.$default$compose(this, function2);
                            }
                        }).map(new Function() { // from class: ckzu
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function2) {
                                return Function$CC.$default$andThen(this, function2);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Boolean.valueOf(Objects.nonNull((aztg) obj));
                            }

                            public final /* synthetic */ Function compose(Function function2) {
                                return Function$CC.$default$compose(this, function2);
                            }
                        }).orElse(false)).booleanValue();
                        enip enipVar = (enip) Collection.EL.stream(((crgh) ckzyVar.e.b()).e()).filter(new Predicate() { // from class: ckzx
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
                                ckzy ckzyVar2 = ckzy.this;
                                if (((crgh) ckzyVar2.e.b()).c((awui) obj) != crgf.c) {
                                    return false;
                                }
                                Optional optional3 = optional2;
                                return optional3.isEmpty() || ckzyVar2.f.f().isAfter(((Instant) optional3.get()).plus(Duration.ofDays((long) ((Integer) ckzy.b.e()).intValue()))) || !booleanValue;
                            }
                        }).collect(endq.b);
                        if (enipVar.isEmpty()) {
                            ((ensz) ckzy.a.n().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/PwqRecoverDisabledRcsGroupScheduler", "scheduleRecoveryIfNeededAsync", 142, "PwqRecoverDisabledRcsGroupScheduler.java")).t("Recover disabled RCS group disabled because this conversation is not in a recoverable join state: %s", byyq.a(i));
                        } else {
                            Iterable$EL.forEach(enipVar, new Consumer() { // from class: ckzv
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj) {
                                    awui awuiVar = (awui) obj;
                                    ((ensz) ckzy.a.n().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/PwqRecoverDisabledRcsGroupScheduler", "scheduleResyncForSelfIdentities", 157, "PwqRecoverDisabledRcsGroupScheduler.java")).q("Scheduling group metadata sync for RCS group");
                                    clap clapVar = (clap) claq.a.createBuilder();
                                    String a2 = conversationIdType2.a();
                                    clapVar.copyOnWrite();
                                    claq claqVar = (claq) clapVar.instance;
                                    a2.getClass();
                                    claqVar.c = a2;
                                    clapVar.copyOnWrite();
                                    claq claqVar2 = (claq) clapVar.instance;
                                    awuiVar.getClass();
                                    claqVar2.d = awuiVar;
                                    claqVar2.b |= 1;
                                    ckzy.this.c.a((claq) clapVar.build());
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                    }
                }, this.j));
                return;
            }
            this.i.c("Bugle.Rcs.Groups.Recovery.ConversationDowngradedFromChatApiToVanillaRcs.Triggered.Counts");
            if (!this.h.n()) {
                b();
                return;
            }
            ((ensz) a.n().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/PwqRecoverDisabledRcsGroupScheduler", "scheduleRecoverChatAPiToVanillaRcsDowngradedGroup", 242, "PwqRecoverDisabledRcsGroupScheduler.java")).q("Prerequisites to recover ChatAPI to Vanilla RCS downgraded group conversation met. Scheduling RecoverDisabledRcsGroupHandler");
            clah clahVar = this.g;
            claf clafVar = (claf) clag.a.createBuilder();
            String a2 = conversationIdType.a();
            clafVar.copyOnWrite();
            clag clagVar = (clag) clafVar.instance;
            a2.getClass();
            clagVar.b = a2;
            ((cevh) clahVar.a.b()).g(ceyr.g("recover_chat_api_to_vanilla_rcs_downgraded_rcs_group", (clag) clafVar.build()));
            return;
        }
        this.i.c("Bugle.Rcs.Groups.Recovery.ConversationRecoveredFromTelephony.Triggered.Counts");
        enip o = enip.o(((crgh) this.e.b()).e());
        if (o.isEmpty()) {
            b();
            return;
        }
        enqu listIterator = o.listIterator();
        while (listIterator.hasNext()) {
            awui awuiVar = (awui) listIterator.next();
            if (this.h.m(awuiVar)) {
                ((ensz) a.n().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/PwqRecoverDisabledRcsGroupScheduler", "scheduleRecoverDisabledRcsGroup", 222, "PwqRecoverDisabledRcsGroupScheduler.java")).q("Prerequisites to recover disabled RCS group conversation met. Scheduling RecoverDisabledRcsGroupHandler");
                clar clarVar = this.c;
                clap clapVar = (clap) claq.a.createBuilder();
                String a3 = conversationIdType.a();
                clapVar.copyOnWrite();
                claq claqVar = (claq) clapVar.instance;
                a3.getClass();
                claqVar.c = a3;
                clapVar.copyOnWrite();
                claq claqVar2 = (claq) clapVar.instance;
                awuiVar.getClass();
                claqVar2.d = awuiVar;
                claqVar2.b |= 1;
                clarVar.a((claq) clapVar.build());
            } else {
                b();
            }
        }
    }
}
