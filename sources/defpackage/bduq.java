package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bduq {
    public static final cskc a = cskc.g("BugleAnnotation", "MessageAnnotationData");
    public volatile ConversationIdType b;
    public volatile MessageIdType c = bdhb.a;
    public final ArrayList d = new ArrayList();
    private final Object e = new Object();

    public static SuggestionData a(ConversationIdType conversationIdType, MessageIdType messageIdType, fbva fbvaVar) {
        fbwz fbwzVar = (fbwz) fbxa.a.createBuilder();
        fbwx fbwxVar = (fbwx) fbwy.b.createBuilder();
        String b = messageIdType.b();
        fbwxVar.copyOnWrite();
        fbwy fbwyVar = (fbwy) fbwxVar.instance;
        b.getClass();
        fbwyVar.m = b;
        String a2 = conversationIdType.a();
        fbwxVar.copyOnWrite();
        fbwy fbwyVar2 = (fbwy) fbwxVar.instance;
        a2.getClass();
        fbwyVar2.n = a2;
        fbwxVar.copyOnWrite();
        ((fbwy) fbwxVar.instance).k = "CopyOTP";
        fbri fbriVar = fbri.COPY_OTP;
        fbwxVar.copyOnWrite();
        ((fbwy) fbwxVar.instance).l = fbriVar.a();
        fbwzVar.copyOnWrite();
        fbxa fbxaVar = (fbxa) fbwzVar.instance;
        fbwy fbwyVar3 = (fbwy) fbwxVar.build();
        fbwyVar3.getClass();
        fbxaVar.e = fbwyVar3;
        fbxaVar.b |= 1;
        fbwzVar.copyOnWrite();
        fbxa fbxaVar2 = (fbxa) fbwzVar.instance;
        fbvaVar.getClass();
        fbxaVar2.d = fbvaVar;
        fbxaVar2.c = 18;
        return new SmartSuggestionItemSuggestionData((fbxa) fbwzVar.build());
    }

    public final Optional b() {
        return Collection.EL.stream(this.d).filter(new Predicate() { // from class: bduj
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
                return ((fbuk) obj).e == 1;
            }
        }).findFirst();
    }

    public final List c() {
        final ArrayList arrayList = new ArrayList();
        b().ifPresent(new Consumer() { // from class: bdui
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                bduq bduqVar = bduq.this;
                fbuk fbukVar = (fbuk) obj;
                arrayList.add(bduq.a(bduqVar.b, bduqVar.c, fbukVar.c == 2 ? (fbva) fbukVar.d : fbva.a));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return arrayList;
    }

    public final void d(List list) {
        Set set = (Set) Collection.EL.stream(list).map(new Function() { // from class: bduk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Optional.ofNullable(((btrw) obj).m());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).flatMap(new Function() { // from class: bdul
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Stream) ((Optional) obj).map(new Function() { // from class: bdug
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Stream.CC.of((MessageIdType) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElseGet(new bduf());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: bdum
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MessageIdType) obj).toString();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.b);
        if (!list.isEmpty() && set.size() != 1) {
            csjb b = a.b();
            b.I("bind should only be called with annotations for a single message. Message IDs: ");
            Iterator it = set.iterator();
            while (it.hasNext()) {
                b.d(bdhb.b((String) it.next()));
            }
            b.r();
        }
        Stream flatMap = Collection.EL.stream(list).map(new Function() { // from class: bdun
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final btrw btrwVar = (btrw) obj;
                return Optional.ofNullable(btrwVar.n()).map(new Function() { // from class: bduh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        fbuj fbujVar = (fbuj) ((fbuk) obj2).toBuilder();
                        int k = btrw.this.k();
                        fbujVar.copyOnWrite();
                        ((fbuk) fbujVar.instance).e = k;
                        return (fbuk) fbujVar.build();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).flatMap(new Function() { // from class: bduo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Stream) ((Optional) obj).map(new Function() { // from class: bdup
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Stream.CC.of((fbuk) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElseGet(new bduf());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        List list2 = (List) flatMap.collect(endq.a);
        if (!list.isEmpty()) {
            btrw btrwVar = (btrw) enjk.j(list);
            ConversationIdType l = btrwVar.l();
            MessageIdType m = btrwVar.m();
            synchronized (this.e) {
                if (l.b()) {
                    csjb e = a.e();
                    e.I("conversationId was null for annotation");
                    e.I(btrwVar);
                    e.r();
                } else {
                    this.b = l;
                }
                if (m.c()) {
                    csjb e2 = a.e();
                    e2.I("messageId was null for annotation");
                    e2.I(btrwVar);
                    e2.r();
                } else {
                    this.c = m;
                }
            }
        }
        synchronized (this.e) {
            this.d.clear();
            this.d.addAll(list2);
        }
    }
}
