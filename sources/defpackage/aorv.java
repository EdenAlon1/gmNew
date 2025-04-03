package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aorv implements aoyy, coxh, azzx {
    public static final /* synthetic */ int f = 0;
    private static final engw g;
    public final aozf a;
    public final errl b;
    public final buxm c;
    public final List d;
    public final Object e = new Object();

    static {
        int i = engw.d;
        g = enou.a;
    }

    public aorv(dtuu dtuuVar, errl errlVar) {
        this.b = errlVar;
        buxo d = MessagesTable.d();
        d.z("MessageChangeObserver");
        d.e(new Function() { // from class: aoro
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buum buumVar = (buum) obj;
                int i = aorv.f;
                return new buun[]{buumVar.a, buumVar.n, buumVar.k, buumVar.G, buumVar.b};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.h(new Function() { // from class: aorp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                int i = aorv.f;
                buxzVar.B(false);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.c = d.b();
        this.d = new ArrayList();
        this.a = new aozf(dtuuVar, new Consumer() { // from class: aorq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                engw n;
                engw engwVar = (engw) obj;
                aorv aorvVar = aorv.this;
                synchronized (aorvVar.e) {
                    n = engw.n(aorvVar.d);
                }
                int size = engwVar.size();
                for (int i = 0; i < size; i++) {
                    final alyc alycVar = (alyc) engwVar.get(i);
                    final engw engwVar2 = (engw) Collection.EL.stream(n).map(new Function() { // from class: aorl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            int i2 = aorv.f;
                            return ((alyd) obj2).a(alyc.this);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(endq.a);
                    if (!engwVar2.isEmpty()) {
                        axnw.h(elfo.h(new erog() { // from class: aorm
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                int i2 = aorv.f;
                                return elfo.a(engw.this);
                            }
                        }, aorvVar.b));
                    }
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.coxh
    public final void b(boolean z) {
        e();
    }

    @Override // defpackage.aoyy
    public final ctbx c(final alyd alydVar) {
        synchronized (this.e) {
            this.d.add(alydVar);
            if (this.d.size() == 1) {
                this.c.L(this.a);
            }
        }
        return new ctbx() { // from class: aorn
            @Override // defpackage.ctbx
            public final void a() {
                alyd alydVar2 = alydVar;
                aorv aorvVar = aorv.this;
                synchronized (aorvVar.e) {
                    aorvVar.d.remove(alydVar2);
                    if (aorvVar.d.isEmpty()) {
                        aorvVar.c.P(aorvVar.a);
                    }
                }
            }

            @Override // defpackage.ctbx, java.io.Closeable, java.lang.AutoCloseable
            public final /* synthetic */ void close() {
                ctbw.a(this);
            }
        };
    }

    @Override // defpackage.azzx
    public final void d(String str, String str2, long j) {
        engw n;
        synchronized (this.e) {
            n = engw.n(this.d);
        }
        final apsl apslVar = new apsl(alxd.INSERT, new CoreBugleMessageId(bdhb.b(str), -1L), new BugleConversationId(str2), Instant.ofEpochMilli(j), 0);
        final engw engwVar = (engw) Collection.EL.stream(n).map(new Function() { // from class: aorr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = aorv.f;
                return ((alyd) obj).a(alyc.this);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a);
        if (engwVar.isEmpty()) {
            return;
        }
        axnw.h(elfo.h(new erog() { // from class: aors
            @Override // defpackage.erog
            public final ListenableFuture a() {
                int i = aorv.f;
                return elfo.a(engw.this);
            }
        }, this.b));
    }

    public final void e() {
        synchronized (this.e) {
            if (this.d.isEmpty()) {
                return;
            }
            this.c.P(this.a);
        }
    }

    @Override // defpackage.coxh
    public final void fE(boolean z) {
        engw n;
        synchronized (this.e) {
            if (this.d.isEmpty()) {
                n = g;
            } else {
                this.c.L(this.a);
                n = engw.n(this.d);
            }
        }
        Stream map = Collection.EL.stream(n).map(new Function() { // from class: aort
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((alyd) obj).b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        final engw engwVar = (engw) map.collect(endq.a);
        if (engwVar.isEmpty()) {
            return;
        }
        axnw.h(elfo.h(new erog() { // from class: aoru
            @Override // defpackage.erog
            public final ListenableFuture a() {
                int i2 = aorv.f;
                return elfo.a(engw.this);
            }
        }, this.b));
    }
}
