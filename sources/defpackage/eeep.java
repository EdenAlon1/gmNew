package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.lang.Thread;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeep {
    public final List d;
    public final List e;
    public eeet f;
    public eeeu g;
    public boolean h;
    public Optional i;
    public Optional j;
    public Optional k;
    public Optional l;
    public static final dktn a = new dktn("DnsClient.Builder");
    private static final Optional m = Optional.empty();
    private static final Optional n = Optional.empty();
    public static final errl b = errs.a(Executors.newFixedThreadPool(2, new ThreadFactory() { // from class: eedw
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            dktn dktnVar = eeep.a;
            Thread thread = new Thread(runnable, String.format(Locale.US, "DnsClientWorker[%d]", Integer.valueOf(new AtomicInteger(0).getAndIncrement())));
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: eeea
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread2, Throwable th) {
                    dkty.j(th, eeep.a, "unhandled exception executing DNS query", new Object[0]);
                }
            });
            return thread;
        }
    }));
    public static final ExecutorService c = Executors.newSingleThreadExecutor();

    public eeep() {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new eeet() { // from class: eeej
            @Override // defpackage.eeet
            public final void a(eeer eeerVar) {
                dktn dktnVar = eeep.a;
            }
        };
        this.g = new eeeu() { // from class: eeek
            @Override // defpackage.eeeu
            public final void a(eees eeesVar) {
                dktn dktnVar = eeep.a;
            }
        };
        this.h = false;
        this.i = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.l = Optional.empty();
    }

    public static int a() {
        return ((Integer) m.orElse(53)).intValue();
    }

    public static eeev b() {
        return (eeev) n.orElse(eeev.UDP);
    }

    public final String toString() {
        List list = this.e;
        return "Builder[DnsTransportAddresses:" + this.d.toString() + ", Async:" + this.h + ", FallbackDnsTransportAddresses:" + list.toString() + ", LocalAddress:" + String.valueOf(this.i) + ", resolverTimeout:" + String.valueOf(this.j) + ", resolverRetries:" + String.valueOf(this.k) + "]";
    }

    public eeep(eeep eeepVar) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.e = arrayList2;
        this.f = new eeet() { // from class: eeej
            @Override // defpackage.eeet
            public final void a(eeer eeerVar) {
                dktn dktnVar = eeep.a;
            }
        };
        this.g = new eeeu() { // from class: eeek
            @Override // defpackage.eeeu
            public final void a(eees eeesVar) {
                dktn dktnVar = eeep.a;
            }
        };
        this.h = false;
        this.i = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.l = Optional.empty();
        arrayList.addAll(eeepVar.d);
        arrayList2.addAll(eeepVar.e);
        this.f = eeepVar.f;
        this.g = eeepVar.g;
        this.h = eeepVar.h;
        this.i = eeepVar.i.map(new Function() { // from class: eeel
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                InetAddress inetAddress = (InetAddress) obj;
                dktn dktnVar = eeep.a;
                return inetAddress;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.j = eeepVar.j.map(new Function() { // from class: eeem
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Integer num = (Integer) obj;
                dktn dktnVar = eeep.a;
                return num;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.k = eeepVar.k.map(new Function() { // from class: eeen
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Integer num = (Integer) obj;
                dktn dktnVar = eeep.a;
                return num;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.l = eeepVar.l.map(new Function() { // from class: eeeo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eeds eedsVar = (eeds) obj;
                dktn dktnVar = eeep.a;
                return eedsVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
