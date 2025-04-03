package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.atomic.DesugarAtomicInteger;
import j$.util.function.Consumer$CC;
import j$.util.function.IntUnaryOperator$CC;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgcy {
    public final Handler a;
    public final dfwc b;
    public final dgda c;
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger e = new AtomicInteger();

    public dgcy(Handler handler, dfwc dfwcVar, dgda dgdaVar) {
        dfwv.b(dfwcVar.d == handler.getLooper(), "GmsClient invokes callbacks is on an unexpected worker thread");
        this.a = handler;
        this.b = dfwcVar;
        this.c = dgdaVar;
    }

    public static void b(dgcx dgcxVar, dfwc dfwcVar, dhri dhriVar) {
        try {
            dhriVar.b(dgcxVar.a(dfwcVar));
        } catch (dfqu e) {
            dhriVar.a(e);
        }
    }

    final int a() {
        return this.d.get();
    }

    public final void c(final dgcx dgcxVar, final dhri dhriVar) {
        this.c.a.add(new Consumer() { // from class: dgct
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                dgcy dgcyVar = dgcy.this;
                Status status = (Status) obj;
                dfwv.d(dgcyVar.a);
                boolean d = status.d();
                dhri dhriVar2 = dhriVar;
                if (d) {
                    dgcy.b(dgcxVar, dgcyVar.b, dhriVar2);
                } else {
                    dhriVar2.a(dfve.a(status));
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final dhre d(final int i, final int i2, final dgcx dgcxVar) {
        this.e.incrementAndGet();
        final dhri dhriVar = new dhri();
        Runnable runnable = new Runnable() { // from class: dgcu
            @Override // java.lang.Runnable
            public final void run() {
                dgcy dgcyVar = dgcy.this;
                dfwv.d(dgcyVar.a);
                dgcx dgcxVar2 = dgcxVar;
                dhri dhriVar2 = dhriVar;
                if (dgcyVar.b.p()) {
                    dgcy.b(dgcxVar2, dgcyVar.b, dhriVar2);
                    return;
                }
                if (dgcyVar.b.q()) {
                    dgcyVar.c(dgcxVar2, dhriVar2);
                } else if (i - 1 != 0) {
                    dhriVar2.a(dfve.a(dgcyVar.c.b.d() ? new Status(8, "GmsClient is disconnected with SUCCESS connection status.") : dgcyVar.c.b));
                } else {
                    dgcyVar.c(dgcxVar2, dhriVar2);
                    dgcyVar.b.A();
                }
            }
        };
        Handler handler = this.a;
        if (Looper.myLooper() == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
        dhrm dhrmVar = dhriVar.a;
        final Handler handler2 = this.a;
        dhrmVar.o(new Executor() { // from class: dgcv
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable2) {
                handler2.post(runnable2);
            }
        }, new dhqs() { // from class: dgcw
            @Override // defpackage.dhqs
            public final void a(dhre dhreVar) {
                int updateAndGet;
                dgcy dgcyVar = dgcy.this;
                dfwv.d(dgcyVar.a);
                dfwv.d(dgcyVar.a);
                if (dhreVar.m()) {
                    int i3 = i2 - 1;
                    updateAndGet = i3 != 0 ? i3 != 2 ? dgcyVar.d.get() : DesugarAtomicInteger.updateAndGet(dgcyVar.d, new IntUnaryOperator() { // from class: dgcs
                        public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                            return IntUnaryOperator$CC.$default$andThen(this, intUnaryOperator);
                        }

                        @Override // java.util.function.IntUnaryOperator
                        public final int applyAsInt(int i4) {
                            return Math.max(i4 - 1, 0);
                        }

                        public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                            return IntUnaryOperator$CC.$default$compose(this, intUnaryOperator);
                        }
                    }) : dgcyVar.d.incrementAndGet();
                } else {
                    updateAndGet = dgcyVar.d.get();
                }
                int decrementAndGet = dgcyVar.e.decrementAndGet();
                if (updateAndGet > 0 || decrementAndGet > 0 || !dgcyVar.b.p()) {
                    return;
                }
                dgcyVar.b.m();
            }
        });
        return dhrmVar;
    }
}
