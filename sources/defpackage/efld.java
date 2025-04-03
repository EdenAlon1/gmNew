package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class efld {
    final Object a;
    public final String b;
    public final efla[] c;
    HashMap d;
    public int e;
    private final ffbr f;
    private boolean g = true;

    public efld(String str, ffbr ffbrVar, efla... eflaVarArr) {
        this.b = str;
        this.c = eflaVarArr;
        int length = eflaVarArr.length;
        HashMap hashMap = new HashMap(length > 0 ? 10 : 1);
        this.d = hashMap;
        if (length == 0) {
            hashMap.put(efkt.b, g());
        }
        this.e = 0;
        this.f = ffbrVar;
        this.a = new Object();
    }

    public final void c() {
        this.g = false;
    }

    protected final void d(Object obj, efkt efktVar) {
        synchronized (this.a) {
            efku efkuVar = (efku) this.d.get(efktVar);
            if (efkuVar == null) {
                efkuVar = g();
                this.d.put(efktVar, efkuVar);
            }
            efkuVar.b(obj);
            this.e++;
        }
        efle efleVar = ((eflf) this.f).c;
        if (efleVar != null) {
            efli efliVar = (efli) efleVar;
            if (efliVar.c.incrementAndGet() >= 100) {
                synchronized (efliVar.e) {
                    if (((efli) efleVar).c.get() >= 100) {
                        synchronized (((efli) efleVar).e) {
                            ScheduledFuture scheduledFuture = ((efli) efleVar).d;
                            if (scheduledFuture != null && !scheduledFuture.isDone() && !((efli) efleVar).d.isCancelled()) {
                                if (((efli) efleVar).d.getDelay(TimeUnit.MILLISECONDS) > 100) {
                                    ((efli) efleVar).a();
                                    final efli efliVar2 = (efli) efleVar;
                                    ((efli) efleVar).d = ((efli) efleVar).a.schedule(new Runnable() { // from class: eflh
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            efli.this.b();
                                        }
                                    }, 1L, TimeUnit.MILLISECONDS);
                                }
                            }
                            final efli efliVar3 = (efli) efleVar;
                            ((efli) efleVar).d = ((efli) efleVar).a.schedule(new Runnable() { // from class: eflh
                                @Override // java.lang.Runnable
                                public final void run() {
                                    efli.this.b();
                                }
                            }, 1L, TimeUnit.MILLISECONDS);
                        }
                        return;
                    }
                }
            }
            synchronized (efliVar.e) {
                ScheduledFuture scheduledFuture2 = ((efli) efleVar).d;
                if (scheduledFuture2 == null || scheduledFuture2.isDone() || ((efli) efleVar).d.isCancelled()) {
                    final efli efliVar4 = (efli) efleVar;
                    ((efli) efleVar).d = ((efli) efleVar).a.schedule(new Runnable() { // from class: eflh
                        @Override // java.lang.Runnable
                        public final void run() {
                            efli.this.b();
                        }
                    }, ((efli) efleVar).b, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    protected final void e(Object... objArr) {
        emxf.a(this.c.length == objArr.length);
        if (this.g) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    throw new NullPointerException("Streamz " + this.b + " has null parameter: " + Arrays.toString(objArr));
                }
                if (!this.c[i].b.isInstance(obj)) {
                    String str = this.b;
                    String obj2 = obj.toString();
                    Class<?> cls = obj.getClass();
                    efla[] eflaVarArr = this.c;
                    String valueOf = String.valueOf(cls);
                    efla eflaVar = eflaVarArr[i];
                    throw new IllegalArgumentException("Streamz " + str + " has parameter {index: " + i + ", value: " + obj2 + ", type: " + valueOf + "}, but expected: {name: " + eflaVar.a + ", type: " + eflaVar.b.toString() + "}");
                }
            }
        }
    }

    final void f(efla... eflaVarArr) {
        if (Arrays.equals(this.c, eflaVarArr)) {
            return;
        }
        throw new eflg("Streamz " + this.b + " with field diffs: " + Arrays.toString(this.c) + " and " + Arrays.toString(eflaVarArr));
    }

    public abstract efku g();
}
