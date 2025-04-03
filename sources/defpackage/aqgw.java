package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.InitiateClientSideFallbackAction;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqgw implements aqgl {
    public static final entd a = entd.c("BugleRcs");
    public final bdmr b;
    public final aqvh c;
    public final csjk d;
    public final errl e;
    public final errl f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final elfk j = new elfk();
    public final bafw k;
    private final errl l;
    private final ctyx m;
    private final ffbr n;
    private final auqm o;

    public aqgw(bdmr bdmrVar, aqvh aqvhVar, csjk csjkVar, errl errlVar, errl errlVar2, errl errlVar3, ctyx ctyxVar, bafw bafwVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, auqm auqmVar) {
        this.b = bdmrVar;
        this.c = aqvhVar;
        this.d = csjkVar;
        this.e = errlVar;
        this.f = errlVar2;
        this.l = errlVar3;
        this.m = ctyxVar;
        this.k = bafwVar;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
        this.n = ffbrVar4;
        this.o = auqmVar;
    }

    @Override // defpackage.aqgl
    public final elfl a(final MessageCoreData messageCoreData, final eokl eoklVar) {
        if (!messageCoreData.cX()) {
            return elfo.e(new aqgj(messageCoreData.B(), 7));
        }
        if (!aqgn.a(eoklVar)) {
            emxf.b(!Objects.equals(eoklVar, eokl.UNKNOWN_LATCH_REASON), "unknown fallback latch reason");
            if (!Objects.equals(eoklVar, eokl.EMERGENCY_RCS_PROTOCOL_DETERMINATION_MESSAGE_FAILED) && !d()) {
                return elfo.e(new aqgj(messageCoreData.B(), 5));
            }
        }
        if (messageCoreData.m() != 0 || clbh.a(messageCoreData.aa(), clbg.RCS_PENPAL_NAMESPACE, "LOCALE").isPresent() || ((Boolean) messageCoreData.ae().map(new Function() { // from class: aqgu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((aoku) obj).A());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue()) {
            ((ensz) a.n().h("com/google/android/apps/messaging/shared/api/messaging/protocol/fallback/RcsFallbackControllerImpl", "attemptClientSideFallback", 127, "RcsFallbackControllerImpl.java")).q("Penpal message fallback blocked");
            return elfo.e(new aqgj(messageCoreData.B(), 8));
        }
        if (((Boolean) this.n.b()).booleanValue() && (cmlh.a(messageCoreData) || clbh.a(messageCoreData.aa(), clbg.RCS_EDIT_NAMESPACE, "Edited-Message-Id").isPresent())) {
            ((ensz) a.n().h("com/google/android/apps/messaging/shared/api/messaging/protocol/fallback/RcsFallbackControllerImpl", "attemptClientSideFallback", 133, "RcsFallbackControllerImpl.java")).q("Message edits not allowed in fallback");
            return elfo.e(new aqgj(messageCoreData.B(), 9));
        }
        if (!((ersq) ((aupq) this.o).a.b()).a("bugle.do_not_fallback_reactions") || (cncq.a(messageCoreData.aa()) == cmrm.REACTION_ACTION_UNSPECIFIED && !clbh.a(messageCoreData.aa(), clbg.REACTIONS_NAMESPACE, "Message-Reply-Type").isPresent())) {
            return elfo.g(new Callable() { // from class: aqgp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ((bczy) aqgw.this.h.b()).G(messageCoreData.z()).map(new Function() { // from class: aqgs
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bczx bczxVar = (bczx) obj;
                            entd entdVar = aqgw.a;
                            boolean z = false;
                            if (bczxVar.a() == 0 && !bczxVar.b()) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                }
            }, this.l).i(new eroh() { // from class: aqgq
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Optional optional = (Optional) obj;
                    boolean isEmpty = optional.isEmpty();
                    final MessageCoreData messageCoreData2 = messageCoreData;
                    if (isEmpty || !((Boolean) optional.get()).booleanValue()) {
                        return elfo.e(new aqgj(messageCoreData2.B(), 8));
                    }
                    final eokl eoklVar2 = eoklVar;
                    final aqgw aqgwVar = aqgw.this;
                    return aqgwVar.c.d(messageCoreData2.v()).h(new emwl() { // from class: aqgr
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            Optional optional2 = (Optional) obj2;
                            boolean isEmpty2 = optional2.isEmpty();
                            MessageCoreData messageCoreData3 = messageCoreData2;
                            if (isEmpty2) {
                                return new aqgj(messageCoreData3.B(), 6);
                            }
                            aqgw aqgwVar2 = aqgw.this;
                            int b = ((aqux) optional2.get()).b();
                            int a2 = aqgwVar2.b.a(messageCoreData3, b);
                            Optional of = Objects.equals(((csmz) aqgwVar2.d.a()).d(a2, b), csod.AVAILABLE) ? Optional.of(Integer.valueOf(a2)) : Optional.empty();
                            if (of.isEmpty()) {
                                return new aqgj(messageCoreData3.B(), 6);
                            }
                            eokl eoklVar3 = eoklVar2;
                            int b2 = ((aqux) optional2.get()).b();
                            bafw bafwVar = aqgwVar2.k;
                            MessageIdType B = messageCoreData3.B();
                            cqoh cqohVar = (cqoh) bafwVar.b.b();
                            cqohVar.getClass();
                            altk altkVar = (altk) bafwVar.c.b();
                            altkVar.getClass();
                            akzt akztVar = (akzt) bafwVar.d.b();
                            akztVar.getClass();
                            cvlf cvlfVar = (cvlf) bafwVar.e.b();
                            cvlfVar.getClass();
                            ckds ckdsVar = (ckds) bafwVar.f.b();
                            ckdsVar.getClass();
                            dtuu dtuuVar = (dtuu) bafwVar.g.b();
                            dtuuVar.getClass();
                            bdmr bdmrVar = (bdmr) bafwVar.h.b();
                            bdmrVar.getClass();
                            B.getClass();
                            eoklVar3.getClass();
                            new InitiateClientSideFallbackAction(bafwVar.a, cqohVar, altkVar, akztVar, cvlfVar, ckdsVar, dtuuVar, bdmrVar, B, b2, eoklVar3).x(0L);
                            int i = true != aqgn.a(eoklVar3) ? 3 : 2;
                            ((altk) aqgwVar2.g.b()).aI(messageCoreData3, ((Integer) of.get()).intValue(), eqyl.UNKNOWN_RCS_TYPE, b2, i);
                            return new aqgj(messageCoreData3.B(), i);
                        }
                    }, aqgwVar.e);
                }
            }, this.f);
        }
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/api/messaging/protocol/fallback/RcsFallbackControllerImpl", "attemptClientSideFallback", 139, "RcsFallbackControllerImpl.java")).q("Message reactions not allowed in fallback");
        return elfo.e(new aqgj(messageCoreData.B(), 10));
    }

    @Override // defpackage.aqgl
    public final elfl b(final MessageIdType messageIdType, final eokl eoklVar) {
        return elfo.h(new erog() { // from class: aqgo
            @Override // defpackage.erog
            public final ListenableFuture a() {
                aqgw aqgwVar = aqgw.this;
                bdmq bdmqVar = (bdmq) aqgwVar.i.b();
                MessageIdType messageIdType2 = messageIdType;
                MessageCoreData v = bdmqVar.v(messageIdType2);
                if (v != null) {
                    return aqgwVar.a(v, eoklVar);
                }
                ensz enszVar = (ensz) aqgw.a.h();
                enszVar.Y(csux.b, messageIdType2);
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/protocol/fallback/RcsFallbackControllerImpl", "attemptClientSideFallback", 219, "RcsFallbackControllerImpl.java")).q("Fallback not initiated as message not found");
                return elfo.e(new aqgj(messageIdType2, 1));
            }
        }, this.l);
    }

    @Override // defpackage.aqgl
    public final engw c(engw engwVar, final eokl eoklVar) {
        Stream map = Collection.EL.stream(engwVar).map(new Function() { // from class: aqgv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final MessageCoreData messageCoreData = (MessageCoreData) obj;
                final aqgw aqgwVar = aqgw.this;
                final eokl eoklVar2 = eoklVar;
                return elfl.g(aqgwVar.j.a(new erog() { // from class: aqgt
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        return aqgw.this.a(messageCoreData, eoklVar2);
                    }
                }, aqgwVar.f));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return (engw) map.collect(endq.a);
    }

    @Override // defpackage.aqgl
    public final boolean d() {
        return this.m.q("auto_fallback_rcs", false);
    }
}
