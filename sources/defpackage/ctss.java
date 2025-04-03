package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctss extends ceut {
    public final ffbr a;
    public final barw b;
    public final errm c;
    public final ffbr d;
    public final ffbr e;
    public final cqoh f;
    private final bauu g;

    public ctss(bauu bauuVar, barw barwVar, ffbr ffbrVar, errm errmVar, ffbr ffbrVar2, ffbr ffbrVar3, cqoh cqohVar) {
        this.a = ffbrVar;
        this.b = barwVar;
        this.g = bauuVar;
        this.c = errmVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = cqohVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("RequestSmartSuggestionsHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ctsu.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final ctsu ctsuVar = (ctsu) eyhsVar;
        return elfo.h(new erog() { // from class: ctsq
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ctss ctssVar = ctss.this;
                if (!((cttn) ctssVar.a.b()).b()) {
                    ctss.D.n("Handler was called even though smart replies are not enabled.");
                    return elfo.e(ceyt.i());
                }
                ctsu ctsuVar2 = ctsuVar;
                ConversationIdType b = bdgq.b(ctsuVar2.b);
                MessageIdType b2 = bdhb.b(ctsuVar2.c);
                int i = ctsuVar2.d;
                if (!ctsuVar2.e) {
                    int i2 = engw.d;
                    return ctssVar.k(b, b2, i, enou.a);
                }
                List M = ((bdmq) ctssVar.d.b()).M(b, i);
                if (M.isEmpty() || !((MessageCoreData) M.get(0)).B().equals(b2)) {
                    return elfo.e(ceyt.i());
                }
                engw a = ctpm.a(((ctqh) ctssVar.e.b()).d(b2), ctssVar.f);
                return a.isEmpty() ? elfo.e(ceyt.i()) : ctssVar.k(b, b2, i, a);
            }
        }, this.c);
    }

    public final elfl k(ConversationIdType conversationIdType, final MessageIdType messageIdType, int i, final engw engwVar) {
        try {
            bauu bauuVar = this.g;
            return bauuVar.a(bauuVar.b(conversationIdType, messageIdType, i)).i(new eroh() { // from class: ctsr
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final ctje ctjeVar = (ctje) obj;
                    if (ctjeVar == null) {
                        return elfo.e(ceyt.i());
                    }
                    final engw engwVar2 = engwVar;
                    ArrayList arrayList = new ArrayList(ctjeVar.b);
                    List list = ctjeVar.a;
                    if (!engwVar2.isEmpty()) {
                        list = (List) Collection.EL.stream(list).filter(new Predicate() { // from class: ctsk
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
                                return (((fbxa) obj2).b & 1) != 0;
                            }
                        }).filter(new Predicate() { // from class: ctsl
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
                                fbwy fbwyVar = ((fbxa) obj2).e;
                                if (fbwyVar == null) {
                                    fbwyVar = fbwy.b;
                                }
                                return fbwyVar.p != 0;
                            }
                        }).collect(endq.a);
                    }
                    MessageIdType messageIdType2 = messageIdType;
                    final ctss ctssVar = ctss.this;
                    final ArrayList arrayList2 = new ArrayList(list);
                    return ctssVar.b.d(messageIdType2, arrayList, new Supplier() { // from class: ctsm
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return arrayList2;
                        }
                    }, new Supplier() { // from class: ctsn
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return ctje.this.c;
                        }
                    }, new Supplier() { // from class: ctso
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return ctje.this.d;
                        }
                    }).h(new emwl() { // from class: ctsp
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            engw engwVar3 = engwVar2;
                            if (!engwVar3.isEmpty()) {
                                ((ctqh) ctss.this.e.b()).o(engwVar3);
                            }
                            return ceyt.i();
                        }
                    }, ctssVar.c);
                }
            }, this.c);
        } catch (IllegalStateException unused) {
            csjb b = D.b();
            b.I(String.format("Caught an exception while requesting smart suggestions for conversationId: %s, targetMessageId: %s", conversationIdType, messageIdType));
            b.r();
            return elfo.e(ceyt.i());
        }
    }
}
