package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amfk implements alxl {
    private final Map a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public amfk(Map map, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.a = map;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
    }

    private final elfl H(final BiFunction biFunction, engw engwVar) {
        Stream stream = Collection.EL.stream(engwVar);
        amfh amfhVar = new amfh(this);
        amfi amfiVar = new amfi();
        int i = engw.d;
        return elfo.l((Iterable) Collection.EL.stream(((HashMap) stream.collect(Collectors.groupingBy(amfhVar, amfiVar, endq.a))).entrySet()).map(new Function() { // from class: amfj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                Map.Entry entry = (Map.Entry) obj;
                apply = BiFunction.this.apply((amev) entry.getKey(), (engw) entry.getValue());
                return (elfl) apply;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a)).a(new Callable() { // from class: amey
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.alxl
    public final elfl A(ConversationId conversationId, Uri uri) {
        return G(conversationId).A(conversationId, uri);
    }

    @Override // defpackage.alxl
    public final elfl B(ConversationId conversationId) {
        return G(conversationId).B(conversationId);
    }

    @Override // defpackage.alxl
    public final elfl C(ConversationId conversationId, eoko eokoVar) {
        return G(conversationId).C(conversationId, eokoVar);
    }

    @Override // defpackage.alxl
    public final aqge D(int i) {
        amev amevVar = (amev) this.a.get(amwk.BUGLE);
        amevVar.getClass();
        return amevVar.D(i);
    }

    @Override // defpackage.alxl
    public final elfl E(engw engwVar, final int i) {
        return H(new BiFunction() { // from class: amff
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((amev) obj).E((engw) obj2, i);
            }
        }, engwVar);
    }

    @Override // defpackage.alxl
    public final elfl F(engw engwVar, final int i) {
        return H(new BiFunction() { // from class: amfa
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((amev) obj).F((engw) obj2, i);
            }
        }, engwVar);
    }

    final amev G(ConversationId conversationId) {
        emxf.a(conversationId != InvalidConversationId.a);
        amev amevVar = (amev) this.a.get(conversationId.a());
        amevVar.getClass();
        return amevVar;
    }

    @Override // defpackage.alxl
    public final Conversation a(ConversationId conversationId, alxk alxkVar) {
        return G(conversationId).a(conversationId, alxkVar);
    }

    @Override // defpackage.alxl
    public final ConversationId b(amwl amwlVar) {
        amwk b = amwk.b(amwlVar.b);
        if (b == null) {
            b = amwk.UNRECOGNIZED;
        }
        emxf.a(b != amwk.UNKNOWN);
        Map map = this.a;
        amwk b2 = amwk.b(amwlVar.b);
        if (b2 == null) {
            b2 = amwk.UNRECOGNIZED;
        }
        amev amevVar = (amev) map.get(b2);
        amevVar.getClass();
        return amevVar.G(amwlVar);
    }

    @Override // defpackage.alxl
    public final ConversationId c(byte[] bArr) {
        try {
            amwl amwlVar = (amwl) eyfy.parseFrom(amwl.a, bArr, eyfc.a());
            amwk b = amwk.b(amwlVar.b);
            if (b == null) {
                b = amwk.UNRECOGNIZED;
            }
            if (b == amwk.UNKNOWN) {
                return null;
            }
            return b(amwlVar);
        } catch (eygu unused) {
            return null;
        }
    }

    @Override // defpackage.alxl
    public final aqge d(ConversationId conversationId) {
        return G(conversationId).d(conversationId);
    }

    @Override // defpackage.alxl
    public final elfl e(ConversationId conversationId, eoko eokoVar) {
        return G(conversationId).e(conversationId, eokoVar);
    }

    @Override // defpackage.alxl
    public final elfl f(ConversationId conversationId) {
        return G(conversationId).f(conversationId);
    }

    @Override // defpackage.alxl
    public final elfl g(anvc anvcVar) {
        amev amevVar = (amev) this.a.get(amwk.BUGLE);
        amevVar.getClass();
        return amevVar.g(anvcVar);
    }

    @Override // defpackage.alxl
    public final elfl h(azcr azcrVar) {
        amev amevVar = (amev) this.a.get(amwk.BUGLE);
        amevVar.getClass();
        return amevVar.h(azcrVar);
    }

    @Override // defpackage.alxl
    public final elfl i(engw engwVar) {
        amev amevVar = (amev) this.a.get(amwk.BUGLE);
        amevVar.getClass();
        return amevVar.i(engwVar);
    }

    @Override // defpackage.alxl
    public final elfl j() {
        Stream map = Collection.EL.stream(((enhk) this.a).values()).map(new Function() { // from class: amex
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((amev) obj).j();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return elfo.a((engw) map.collect(endq.a)).h(new emwl() { // from class: amfe
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Stream flatMap = Collection.EL.stream((List) obj).flatMap(new Function() { // from class: amfg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Collection.EL.stream((engw) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i2 = engw.d;
                return (engw) flatMap.collect(endq.a);
            }
        }, erpp.a);
    }

    @Override // defpackage.alxl
    public final elfl k(engw engwVar, String str) {
        if (((asvn) this.b.b()).a() && ((enou) engwVar).c == 1 && ((Recipient) engwVar.get(0)).g().C()) {
            amev amevVar = (amev) this.a.get(amwk.SATELLITE);
            amevVar.getClass();
            return amevVar.k(engwVar, str);
        }
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && ((aspy) this.c.b()).a() && ((enou) engwVar).c == 1 && ((Recipient) engwVar.get(0)).g().A()) {
            amev amevVar2 = (amev) this.a.get(amwk.PENPAL_BOT);
            amevVar2.getClass();
            return amevVar2.k(engwVar, str);
        }
        if (((askf) this.d.b()).a() && ((enou) engwVar).c == 1 && ((Recipient) engwVar.get(0)).g().B()) {
            amev amevVar3 = (amev) this.a.get(amwk.RBM);
            amevVar3.getClass();
            return amevVar3.k(engwVar, str);
        }
        if (((attl) this.e.b()).a() && ((enou) engwVar).c == 1 && ((Recipient) engwVar.get(0)).g().w()) {
            amev amevVar4 = (amev) this.a.get(amwk.EMERGENCY);
            amevVar4.getClass();
            return amevVar4.k(engwVar, str);
        }
        amev amevVar5 = (amev) this.a.get(amwk.BUGLE);
        amevVar5.getClass();
        return amevVar5.k(engwVar, str);
    }

    @Override // defpackage.alxl
    public final elfl l(azcr azcrVar, aqux aquxVar, amer amerVar) {
        amev amevVar = (amev) this.a.get(amwk.BUGLE);
        amevVar.getClass();
        return amevVar.l(azcrVar, aquxVar, amerVar);
    }

    @Override // defpackage.alxl
    public final elfl m(Optional optional, engw engwVar, String str) {
        if (((asvn) this.b.b()).a() && engwVar.size() == 1 && ((Recipient) engwVar.get(0)).g().C()) {
            amev amevVar = (amev) this.a.get(amwk.SATELLITE);
            amevVar.getClass();
            return amevVar.m(optional, engwVar, str);
        }
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && ((aspy) this.c.b()).a() && engwVar.size() == 1 && ((Recipient) engwVar.get(0)).g().A()) {
            amev amevVar2 = (amev) this.a.get(amwk.PENPAL_BOT);
            amevVar2.getClass();
            return amevVar2.m(optional, engwVar, str);
        }
        if (((askf) this.d.b()).a() && engwVar.size() == 1 && ((Recipient) engwVar.get(0)).g().B()) {
            amev amevVar3 = (amev) this.a.get(amwk.RBM);
            amevVar3.getClass();
            return amevVar3.m(optional, engwVar, str);
        }
        if (((attl) this.e.b()).a() && engwVar.size() == 1 && ((Recipient) engwVar.get(0)).g().w()) {
            amev amevVar4 = (amev) this.a.get(amwk.EMERGENCY);
            amevVar4.getClass();
            return amevVar4.m(optional, engwVar, str);
        }
        amev amevVar5 = (amev) this.a.get(amwk.BUGLE);
        amevVar5.getClass();
        return amevVar5.m(optional, engwVar, str);
    }

    @Override // defpackage.alxl
    public final elfl n(ConversationId conversationId, ampp amppVar, Recipient recipient) {
        return G(conversationId).n(conversationId, amppVar, recipient);
    }

    @Override // defpackage.alxl
    public final elfl o(ConversationId conversationId) {
        return G(conversationId).o(conversationId);
    }

    @Override // defpackage.alxl
    public final elfl p(engw engwVar) {
        final BiFunction biFunction = new BiFunction() { // from class: amfd
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((amev) obj).p((engw) obj2);
            }
        };
        Stream stream = Collection.EL.stream(engwVar);
        amfh amfhVar = new amfh(this);
        amfi amfiVar = new amfi();
        int i = engw.d;
        return elfo.a((Iterable) Collection.EL.stream(((HashMap) stream.collect(Collectors.groupingBy(amfhVar, amfiVar, endq.a))).entrySet()).map(new Function() { // from class: amfb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                Map.Entry entry = (Map.Entry) obj;
                apply = BiFunction.this.apply((amev) entry.getKey(), (engw) entry.getValue());
                return (elfl) apply;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a)).h(new emwl() { // from class: amfc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(Collection.EL.stream((List) obj).allMatch(new Predicate() { // from class: amez
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
                        return ((Boolean) obj2).booleanValue();
                    }
                }));
            }
        }, erpp.a);
    }

    @Override // defpackage.alxl
    public final elfl q(ConversationId conversationId, ampp amppVar) {
        return G(conversationId).q(conversationId, amppVar);
    }

    @Override // defpackage.alxl
    public final elfl r(Recipient recipient) {
        if (((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && ((aspy) this.c.b()).a() && recipient.g().A()) {
            return elfo.e(false);
        }
        if (((askf) this.d.b()).a() && recipient.g().B()) {
            return elfo.e(false);
        }
        if (((attl) this.e.b()).a() && recipient.g().w()) {
            return elfo.e(false);
        }
        amev amevVar = (amev) this.a.get(amwk.BUGLE);
        amevVar.getClass();
        return amevVar.r(recipient);
    }

    @Override // defpackage.alxl
    public final elfl s(ConversationId conversationId, String str) {
        return G(conversationId).s(conversationId, str);
    }

    @Override // defpackage.alxl
    public final elfl t(ConversationId conversationId, aqux aquxVar) {
        return G(conversationId).t(conversationId, aquxVar);
    }

    @Override // defpackage.alxl
    public final elfl u(ConversationId conversationId, String str, String str2, apmq apmqVar) {
        return G(conversationId).u(conversationId, str, str2, apmqVar);
    }

    @Override // defpackage.alxl
    public final elfl v(ConversationId conversationId, String str, Uri uri) {
        return G(conversationId).v(conversationId, str, uri);
    }

    @Override // defpackage.alxl
    public final elfl w(ConversationId conversationId, amny amnyVar) {
        return G(conversationId).w(conversationId, amnyVar);
    }

    @Override // defpackage.alxl
    public final elfl x(ConversationId conversationId, cuea cueaVar) {
        return G(conversationId).x(conversationId, cueaVar);
    }

    @Override // defpackage.alxl
    public final elfl y(ConversationId conversationId, eoko eokoVar) {
        return G(conversationId).y(conversationId, eokoVar);
    }

    @Override // defpackage.alxl
    public final elfl z(ConversationId conversationId, cuex cuexVar, String str, boolean z, cuea cueaVar) {
        return G(conversationId).z(conversationId, cuexVar, str, z, cueaVar);
    }
}
