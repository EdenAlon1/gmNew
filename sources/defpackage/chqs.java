package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chqs implements chqc {
    public final errl a;
    public final aqkp b;
    public final amhs c;
    public final asmr d;
    private final errl e;
    private final ffbr f;
    private final aqvh g;

    public chqs(errl errlVar, errl errlVar2, ffbr ffbrVar, aqvh aqvhVar, aqkp aqkpVar, amhs amhsVar, asmr asmrVar) {
        this.a = errlVar;
        this.e = errlVar2;
        this.f = ffbrVar;
        this.g = aqvhVar;
        this.b = aqkpVar;
        this.c = amhsVar;
        this.d = asmrVar;
    }

    private final elfl h(ConversationId conversationId) {
        conversationId.getClass();
        final BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
        return elfo.g(new Callable() { // from class: chqq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return chqs.this.c.H(bugleConversationId, true);
            }
        }, this.e).i(new eroh() { // from class: chqr
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((BugleConversation) obj).g().b();
            }
        }, this.a);
    }

    @Override // defpackage.chqc
    public final elfl a(final ConversationId conversationId) {
        return h(conversationId).h(new emwl() { // from class: chqg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (enip) Collection.EL.stream((engw) obj).map(new Function() { // from class: chqd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((aqux) obj2).m();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: chqj
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
                    public final boolean test(Object obj2) {
                        return ((Optional) obj2).isPresent();
                    }
                }).map(new Function() { // from class: chqk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (aoku) ((Optional) obj2).get();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.b);
            }
        }, this.a).i(new eroh() { // from class: chqi
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final chqs chqsVar = chqs.this;
                aqkp aqkpVar = chqsVar.b;
                ConversationId conversationId2 = conversationId;
                enip enipVar = (enip) obj;
                final elfl e = chqsVar.e(aqkpVar.d(conversationId2).b(), enipVar);
                final elfl e2 = chqsVar.e(chqsVar.b.a(conversationId2).b(), enipVar);
                return elfo.m(e, e2).a(eldl.m(new Callable() { // from class: chqp
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        engw engwVar = (engw) erqt.q(e);
                        chqs chqsVar2 = chqs.this;
                        engw f = chqsVar2.f(engwVar);
                        final enip enipVar2 = (enip) Collection.EL.stream(f).map(new Function() { // from class: chqh
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                esao esaoVar = ((esal) obj2).c;
                                if (esaoVar == null) {
                                    esaoVar = esao.a;
                                }
                                return esaoVar.d;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(endq.b);
                        Stream filter = Collection.EL.stream(chqsVar2.f((engw) erqt.q(e2))).filter(new Predicate() { // from class: chqf
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
                            public final boolean test(Object obj2) {
                                esao esaoVar = ((esal) obj2).c;
                                if (esaoVar == null) {
                                    esaoVar = esao.a;
                                }
                                return !enip.this.contains(esaoVar.d);
                            }
                        });
                        int i = engw.d;
                        engw engwVar2 = (engw) filter.collect(endq.a);
                        engr engrVar = new engr();
                        engrVar.j(f);
                        engrVar.j(engwVar2);
                        return engrVar.g();
                    }
                }), chqsVar.a);
            }
        }, this.a);
    }

    @Override // defpackage.chqc
    public final elfl b(ConversationIdType conversationIdType) {
        return conversationIdType.b() ? d() : c(new BugleConversationId(conversationIdType));
    }

    @Override // defpackage.chqc
    public final elfl c(ConversationId conversationId) {
        return h(conversationId).h(new chql(this), this.a);
    }

    @Override // defpackage.chqc
    public final elfl d() {
        return this.g.c().b().h(new chql(this), this.a);
    }

    public final elfl e(elfl elflVar, final enip enipVar) {
        return elflVar.h(new emwl() { // from class: chqo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Stream stream = Collection.EL.stream((engw) obj);
                final enip enipVar2 = enip.this;
                Stream filter = stream.filter(new Predicate() { // from class: chqm
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
                    public final boolean test(Object obj2) {
                        return !enip.this.contains(((ResolvedRecipient) obj2).g());
                    }
                });
                int i = engw.d;
                return (engw) filter.collect(endq.a);
            }
        }, this.a);
    }

    public final engw f(engw engwVar) {
        Stream map = Collection.EL.stream(engwVar).map(new Function() { // from class: chqn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj;
                String str = resolvedRecipient.F().a;
                chqs chqsVar = chqs.this;
                esak g = chqsVar.g(str, (chqsVar.d.a() || ((Boolean) cfma.a.e()).booleanValue()) ? resolvedRecipient.g().l() : resolvedRecipient.g().o(), resolvedRecipient.g().G().a, resolvedRecipient.w());
                g.copyOnWrite();
                esal esalVar = (esal) g.instance;
                esal esalVar2 = esal.a;
                esalVar.g = false;
                escs escsVar = (escs) escu.a.createBuilder();
                escsVar.copyOnWrite();
                ((escu) escsVar.instance).b = esct.a(3);
                escu escuVar = (escu) escsVar.build();
                g.copyOnWrite();
                esal esalVar3 = (esal) g.instance;
                escuVar.getClass();
                esalVar3.h = escuVar;
                esalVar3.b |= 4;
                return (esal) g.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return (engw) map.collect(endq.a);
    }

    public final esak g(String str, String str2, String str3, String str4) {
        esam esamVar = (esam) esao.a.createBuilder();
        esamVar.copyOnWrite();
        esao esaoVar = (esao) esamVar.instance;
        str.getClass();
        esaoVar.d = str;
        esamVar.copyOnWrite();
        ((esao) esamVar.instance).b = esan.a(3);
        if ((this.d.a() || ((Boolean) cfma.a.e()).booleanValue()) && str2 != null) {
            esamVar.copyOnWrite();
            ((esao) esamVar.instance).c = str2;
        }
        esak esakVar = (esak) esal.a.createBuilder();
        esao esaoVar2 = (esao) esamVar.build();
        esakVar.copyOnWrite();
        esal esalVar = (esal) esakVar.instance;
        esaoVar2.getClass();
        esalVar.c = esaoVar2;
        esalVar.b |= 1;
        String b = chqb.b(((cttz) this.f.b()).d(crjn.a(str2)));
        esakVar.copyOnWrite();
        esal esalVar2 = (esal) esakVar.instance;
        b.getClass();
        esalVar2.f = b;
        esakVar.copyOnWrite();
        ((esal) esakVar.instance).n = esad.a(2);
        String b2 = emxe.b(str3);
        esakVar.copyOnWrite();
        ((esal) esakVar.instance).o = b2;
        String b3 = emxe.b(str4);
        esakVar.copyOnWrite();
        ((esal) esakVar.instance).e = b3;
        esakVar.copyOnWrite();
        ((esal) esakVar.instance).i = true;
        return esakVar;
    }
}
