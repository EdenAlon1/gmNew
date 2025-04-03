package defpackage;

import com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageExtensionHeader;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eind extends eilj {
    static final emwd a = new einh();
    static final emwd b = new eilz();
    static final emwd c = new eimc();

    @Override // defpackage.eilj
    public final void c(Message message, clpb clpbVar) {
        engw n = engw.n((Collection) Collection.EL.stream(message.b()).map(new Function() { // from class: eimt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Message.MessageContent messageContent = (Message.MessageContent) obj;
                clpj clpjVar = (clpj) clpk.a.createBuilder();
                eyee b2 = messageContent.b().b();
                clpjVar.copyOnWrite();
                clpk clpkVar = (clpk) clpjVar.instance;
                clpkVar.b |= 2;
                clpkVar.d = b2;
                clnm clnmVar = (clnm) eind.b.m().fP(messageContent.b().a());
                clpjVar.copyOnWrite();
                clpk clpkVar2 = (clpk) clpjVar.instance;
                clnmVar.getClass();
                clpkVar2.c = clnmVar;
                clpkVar2.b |= 1;
                return (clpk) clpjVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList()));
        clpbVar.copyOnWrite();
        clpc clpcVar = (clpc) clpbVar.instance;
        eygj eygjVar = clpc.a;
        clpcVar.a();
        eydl.addAll(n, clpcVar.g);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.eilj
    public final void d(Message message, clpb clpbVar) {
        if (message.d().isEmpty()) {
            return;
        }
        Iterable iterable = (Iterable) Collection.EL.stream(message.d().get()).map(new Function() { // from class: eimy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (cloc) eind.c.m().fP((eigj) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.b);
        clpbVar.copyOnWrite();
        clpc clpcVar = (clpc) clpbVar.instance;
        eygj eygjVar = clpc.a;
        eygi eygiVar = clpcVar.k;
        if (!eygiVar.c()) {
            clpcVar.k = eyfy.mutableCopy(eygiVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            clpcVar.k.h(((cloc) it.next()).e);
        }
    }

    @Override // defpackage.eilj
    public final void e(Message message, clpb clpbVar) {
        if (message.c().isEmpty()) {
            return;
        }
        Map map = (Map) Collection.EL.stream(message.c()).collect(Collectors.groupingBy(new Function() { // from class: eims
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MessageExtensionHeader) obj).b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Collectors.collectingAndThen(Collectors.toMap(new Function() { // from class: eimu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MessageExtensionHeader) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: eimv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MessageExtensionHeader) obj).c();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }), new Function() { // from class: eimw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                fayx fayxVar = (fayx) fayz.a.createBuilder();
                fayxVar.a((Map) obj);
                return (fayz) fayxVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })));
        fayt faytVar = (fayt) fayv.a.createBuilder();
        faytVar.copyOnWrite();
        ((fayv) faytVar.instance).a().putAll(map);
        clpbVar.copyOnWrite();
        clpc clpcVar = (clpc) clpbVar.instance;
        fayv fayvVar = (fayv) faytVar.build();
        eygj eygjVar = clpc.a;
        fayvVar.getClass();
        clpcVar.i = fayvVar;
        clpcVar.c |= 16;
    }

    @Override // defpackage.eilj
    public final void f(Message message, clpb clpbVar) {
        clqw clqwVar = (clqw) clqx.a.createBuilder();
        String h = message.h();
        clqwVar.copyOnWrite();
        clqx clqxVar = (clqx) clqwVar.instance;
        clqxVar.b |= 1;
        clqxVar.c = h;
        clpbVar.copyOnWrite();
        clpc clpcVar = (clpc) clpbVar.instance;
        clqx clqxVar2 = (clqx) clqwVar.build();
        eygj eygjVar = clpc.a;
        clqxVar2.getClass();
        clpcVar.d = clqxVar2;
        clpcVar.c |= 1;
    }

    @Override // defpackage.eilj
    public final void g(Message message, final clpb clpbVar) {
        message.g().ifPresent(new Consumer() { // from class: eimz
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                eyja b2 = eykj.b((Instant) obj);
                clpb clpbVar2 = clpb.this;
                clpbVar2.copyOnWrite();
                clpc clpcVar = (clpc) clpbVar2.instance;
                eygj eygjVar = clpc.a;
                b2.getClass();
                clpcVar.h = b2;
                clpcVar.c |= 8;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.eilj
    public final void h(clpc clpcVar, eigi eigiVar) {
        eigiVar.c(engw.n((java.util.Collection) Collection.EL.stream(clpcVar.g).map(new Function() { // from class: einc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                clpk clpkVar = (clpk) obj;
                eidy eidyVar = new eidy();
                eidyVar.b(clpkVar.d);
                emwd emwdVar = eind.b;
                clnm clnmVar = clpkVar.c;
                if (clnmVar == null) {
                    clnmVar = clnm.a;
                }
                eidyVar.c((ContentType) emwdVar.fP(clnmVar));
                return AutoOneOf_Message_MessageContent.a(eidyVar.a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList())));
    }

    @Override // defpackage.eilj
    public final void i(clpc clpcVar, eigi eigiVar) {
        if (new eygk(clpcVar.k, clpc.a).isEmpty()) {
            return;
        }
        Stream stream = Collection.EL.stream(new eygk(clpcVar.k, clpc.a));
        final emwd emwdVar = c;
        eigiVar.d((enip) stream.map(new Function() { // from class: eina
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (eigj) emwd.this.fP((cloc) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.b));
    }

    @Override // defpackage.eilj
    public final void j(clpc clpcVar, final eigi eigiVar) {
        if ((clpcVar.c & 16) != 0) {
            fayv fayvVar = clpcVar.i;
            if (fayvVar == null) {
                fayvVar = fayv.a;
            }
            Map.EL.forEach(DesugarCollections.unmodifiableMap(fayvVar.b), new BiConsumer() { // from class: eimx
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    final String str = (String) obj;
                    java.util.Map unmodifiableMap = DesugarCollections.unmodifiableMap(((fayz) obj2).b);
                    final eigi eigiVar2 = eigi.this;
                    Map.EL.forEach(unmodifiableMap, new BiConsumer() { // from class: einb
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj3, Object obj4) {
                            eieq eieqVar = new eieq();
                            eieqVar.b((String) obj3);
                            eieqVar.c(str);
                            eieqVar.d((String) obj4);
                            MessageExtensionHeader a2 = eieqVar.a();
                            eieo eieoVar = (eieo) eigi.this;
                            if (eieoVar.a == null) {
                                if (eieoVar.b == null) {
                                    int i = engw.d;
                                    eieoVar.a = new engr();
                                } else {
                                    int i2 = engw.d;
                                    eieoVar.a = new engr();
                                    eieoVar.a.j(eieoVar.b);
                                    eieoVar.b = null;
                                }
                            }
                            eieoVar.a.h(a2);
                        }

                        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                            return BiConsumer$CC.$default$andThen(this, biConsumer);
                        }
                    });
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
        }
    }

    @Override // defpackage.eilj
    public final void k(clpc clpcVar, eigi eigiVar) {
        clqx clqxVar = clpcVar.d;
        if (clqxVar == null) {
            clqxVar = clqx.a;
        }
        eigiVar.f(clqxVar.c);
    }

    @Override // defpackage.eilj
    public final void l(clpc clpcVar, eigi eigiVar) {
        if ((clpcVar.c & 8) != 0) {
            eyja eyjaVar = clpcVar.h;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            eigiVar.j(eykj.d(eyjaVar));
        }
    }
}
