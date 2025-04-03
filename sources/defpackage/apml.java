package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apml implements aqge {
    public final awti a;
    public final aolr b;
    public final ExecutorService c;
    public final cqoh d;
    public final BugleConversationId e;
    public final aqge f;
    public final ctbl g;
    public ctbx h = null;

    public apml(awti awtiVar, ctbk ctbkVar, aolr aolrVar, ExecutorService executorService, cqoh cqohVar, BugleConversationId bugleConversationId, aqge aqgeVar) {
        this.a = awtiVar;
        this.g = ctbkVar.a(new apmk(this));
        this.b = aolrVar;
        this.c = executorService;
        this.d = cqohVar;
        this.e = bugleConversationId;
        this.f = aqgeVar;
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.g.a(new ctbf() { // from class: apma
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "ActiveComposersSupplier::register", "ActiveComposersSupplier::callback", "ActiveComposersSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        return this.a.b().i(new eroh() { // from class: apmg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final apml apmlVar = apml.this;
                final enhk enhkVar = (enhk) ((enhk) obj).getOrDefault(apmlVar.e.a, enoz.a);
                if (!enhkVar.isEmpty()) {
                    return apmlVar.f.b().h(new emwl() { // from class: apmh
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            Stream stream = Collection.EL.stream(enhkVar.entrySet());
                            final apml apmlVar2 = apml.this;
                            final enhk enhkVar2 = (enhk) stream.collect(endq.a(new Function() { // from class: apmb
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    return apml.this.b.b((awui) ((Map.Entry) obj3).getKey());
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: apmc
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    return (Instant) ((Map.Entry) obj3).getValue();
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }));
                            Stream map = Collection.EL.stream((engw) obj2).filter(new Predicate() { // from class: apmd
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
                                public final boolean test(Object obj3) {
                                    ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj3;
                                    aoku g = resolvedRecipient.g();
                                    enhk enhkVar3 = enhkVar2;
                                    if (enhkVar3.containsKey(g)) {
                                        return ((Instant) enhkVar3.get(resolvedRecipient.g())).isAfter(apml.this.d.f());
                                    }
                                    return false;
                                }
                            }).map(new Function() { // from class: apme
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj3;
                                    if (resolvedRecipient == null) {
                                        throw new NullPointerException("Null recipient");
                                    }
                                    Instant instant = (Instant) enhk.this.get(resolvedRecipient.g());
                                    instant.getClass();
                                    return new aplj(resolvedRecipient, instant);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int i = engw.d;
                            return (engw) map.collect(endq.a);
                        }
                    }, apmlVar.c);
                }
                int i = engw.d;
                return elfo.e(enou.a);
            }
        }, this.c);
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final elfl d() {
        return elfo.f(new Runnable() { // from class: aplz
            @Override // java.lang.Runnable
            public final void run() {
                apml.this.g.c(new Supplier() { // from class: apmf
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return null;
                    }
                }, "ActiveComposersNotify");
            }
        }, this.c);
    }
}
