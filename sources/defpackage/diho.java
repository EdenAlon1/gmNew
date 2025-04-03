package defpackage;

import android.content.Context;
import android.os.Process;
import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diho {
    public static final Duration a = Duration.ofDays(6);
    public static final dktn b = new dktn("SystemBindingMonitor");
    public final Context c;
    public final errm d;
    public final dlpw e;
    public final emyg f;
    public final dikg g;
    public final long h;
    public boolean i = false;
    public dihn j = null;
    private int n = 1;
    private Duration k = Duration.ZERO;
    private Duration l = Duration.ZERO;
    private Duration m = Duration.ZERO;

    public diho(Context context, errm errmVar, dlpw dlpwVar, dikg dikgVar) {
        long startElapsedRealtime;
        this.c = context;
        this.d = errmVar;
        this.e = dlpwVar;
        this.g = dikgVar;
        startElapsedRealtime = Process.getStartElapsedRealtime();
        this.h = startElapsedRealtime;
        this.f = new emyg(emtt.a);
    }

    public final synchronized Duration a() {
        d(this.n);
        return this.k;
    }

    public final synchronized Duration b() {
        d(this.n);
        return this.l;
    }

    public final synchronized Duration c() {
        d(this.n);
        return this.m;
    }

    public final synchronized void d(int i) {
        int i2 = this.n;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 1) {
            this.k = this.k.plus(this.f.d());
        } else if (i3 == 2) {
            this.l = this.l.plus(this.f.d());
        } else if (i3 == 3) {
            this.m = this.m.plus(this.f.d());
        }
        if (a.compareTo(this.k.plus(this.l).plus(this.m)) <= 0) {
            this.k = Duration.ZERO;
            this.l = Duration.ZERO;
            this.m = Duration.ZERO;
            final dikg dikgVar = this.g;
            final Context context = this.c;
            dikgVar.L(new Callable() { // from class: dike
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    eyzk eyzkVar = (eyzk) eyzl.a.createBuilder();
                    eyzn eyznVar = (eyzn) eyzo.a.createBuilder();
                    eyznVar.copyOnWrite();
                    eyzo eyzoVar = (eyzo) eyznVar.instance;
                    eyzoVar.c = 6;
                    eyzoVar.b |= 1;
                    eyzkVar.copyOnWrite();
                    eyzl eyzlVar = (eyzl) eyzkVar.instance;
                    eyzo eyzoVar2 = (eyzo) eyznVar.build();
                    eyzoVar2.getClass();
                    eyzlVar.c = eyzoVar2;
                    eyzlVar.b = 3;
                    dikg.this.A(context, (eyzl) eyzkVar.build());
                    return null;
                }
            }, new Function() { // from class: dikf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i4 = dikg.b;
                    dkty.i((Throwable) obj, "Fail to log network status times reset event to clearcut!", new Object[0]);
                    return null;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        this.n = i;
        emyg emygVar = this.f;
        emygVar.e();
        emygVar.f();
    }
}
