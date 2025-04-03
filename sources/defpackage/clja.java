package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageExtensionHeader;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clja {
    public final avtv a;
    public final clik b;
    public final cqoh c;
    public final clhi d;
    public final cljc e;
    public final ffbr f;
    public final awor g;
    private final errl h;

    public clja(errl errlVar, avtv avtvVar, clik clikVar, cqoh cqohVar, clhi clhiVar, cljc cljcVar, ffbr ffbrVar, awor aworVar) {
        this.h = errlVar;
        this.a = avtvVar;
        this.b = clikVar;
        this.c = cqohVar;
        this.d = clhiVar;
        this.e = cljcVar;
        this.f = ffbrVar;
        this.g = aworVar;
    }

    public final elfl a(final MessageNotification messageNotification) {
        return elfo.g(new Callable() { // from class: cliu
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Collection] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                MessageNotification messageNotification2 = messageNotification;
                Conversation a = messageNotification2.a();
                Message b = messageNotification2.b();
                final awxh awxhVar = (awxh) awxk.b.createBuilder();
                RcsDestinationId a2 = b.a();
                clja cljaVar = clja.this;
                awui a3 = cljaVar.b.a(a2, false);
                awxhVar.copyOnWrite();
                awxk awxkVar = (awxk) awxhVar.instance;
                a3.getClass();
                awxkVar.d = a3;
                awxkVar.c |= 1;
                awui a4 = cljaVar.b.a(a.a(), a.c() == 2);
                awxhVar.copyOnWrite();
                awxk awxkVar2 = (awxk) awxhVar.instance;
                a4.getClass();
                awxkVar2.g = a4;
                awxkVar2.c |= 8;
                String h = b.h();
                awxhVar.copyOnWrite();
                awxk awxkVar3 = (awxk) awxhVar.instance;
                awxkVar3.c |= 256;
                awxkVar3.l = h;
                String b2 = a.b();
                awxhVar.copyOnWrite();
                awxk awxkVar4 = (awxk) awxhVar.instance;
                awxkVar4.c |= 512;
                awxkVar4.m = b2;
                engw c = b.c();
                HashMap hashMap = new HashMap();
                int size = c.size();
                for (int i = 0; i < size; i++) {
                    MessageExtensionHeader messageExtensionHeader = (MessageExtensionHeader) c.get(i);
                    fayx fayxVar = (fayx) hashMap.get(messageExtensionHeader.b());
                    if (fayxVar == null) {
                        fayxVar = (fayx) fayz.a.createBuilder();
                        hashMap.put(messageExtensionHeader.b(), fayxVar);
                    }
                    fayxVar.b(messageExtensionHeader.a(), messageExtensionHeader.c());
                }
                final fayt faytVar = (fayt) fayv.a.createBuilder();
                Map.EL.forEach(hashMap, new BiConsumer() { // from class: clil
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        fayz fayzVar = (fayz) ((fayx) obj2).build();
                        fayt.this.a((String) obj, fayzVar);
                    }

                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                    }
                });
                fayv fayvVar = (fayv) faytVar.build();
                awxhVar.copyOnWrite();
                awxk awxkVar5 = (awxk) awxhVar.instance;
                fayvVar.getClass();
                awxkVar5.n = fayvVar;
                awxkVar5.c |= 1024;
                Optional g = b.g();
                final cqoh cqohVar = cljaVar.c;
                cqohVar.getClass();
                eyja b3 = eykj.b((Instant) g.orElseGet(new Supplier() { // from class: cliw
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return cqoh.this.f();
                    }
                }));
                awxhVar.copyOnWrite();
                awxk awxkVar6 = (awxk) awxhVar.instance;
                b3.getClass();
                awxkVar6.p = b3;
                awxkVar6.c |= 2048;
                eopq a5 = cljaVar.d.a();
                awxhVar.copyOnWrite();
                awxk awxkVar7 = (awxk) awxhVar.instance;
                a5.getClass();
                awxkVar7.q = a5;
                awxkVar7.c |= 4096;
                ((chco) cljaVar.f.b()).c().ifPresentOrElse(new Consumer() { // from class: clix
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        awxh awxhVar2 = awxh.this;
                        awui awuiVar = (awui) obj;
                        awxhVar2.copyOnWrite();
                        awxk awxkVar8 = (awxk) awxhVar2.instance;
                        eygj eygjVar = awxk.a;
                        awuiVar.getClass();
                        awxkVar8.j = awuiVar;
                        awxkVar8.c |= 64;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Runnable() { // from class: cliy
                    @Override // java.lang.Runnable
                    public final void run() {
                        throw new IllegalArgumentException("RCS self identity is not present.");
                    }
                });
                engw b4 = b.b();
                int size2 = b4.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Message.MessageContent messageContent = (Message.MessageContent) b4.get(i2);
                    if (!eigl.CHAT.equals(messageContent.a())) {
                        throw new IllegalArgumentException("Unsupported type ".concat(String.valueOf(String.valueOf(messageContent.a()))));
                    }
                    awxhVar.c((awul) cljaVar.a.m().fP(messageContent.b()));
                }
                if (messageNotification2.b().d().isPresent()) {
                    Stream stream = Collection.EL.stream(messageNotification2.b().d().get());
                    final cljc cljcVar = cljaVar.e;
                    awxhVar.a((Iterable) stream.map(new Function() { // from class: cliz
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (awxj) cljc.this.fP((eigj) obj);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(endq.b));
                } else {
                    awxhVar.d(awxj.POSITIVE_DELIVERY);
                    awxhVar.d(awxj.DISPLAY);
                }
                return (awxk) awxhVar.build();
            }
        }, this.h).i(new eroh() { // from class: cliv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return clja.this.g.a((awxk) obj);
            }
        }, this.h);
    }
}
