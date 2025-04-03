package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class detc implements ServiceConnection {
    final /* synthetic */ detd a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ CountDownLatch c;
    final /* synthetic */ AtomicReference d;
    final /* synthetic */ detf e;
    private boolean f;

    public detc(detf detfVar, detd detdVar, AtomicReference atomicReference, CountDownLatch countDownLatch, AtomicReference atomicReference2) {
        this.a = detdVar;
        this.b = atomicReference;
        this.c = countDownLatch;
        this.d = atomicReference2;
        this.e = detfVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (this.f) {
            return;
        }
        this.f = true;
        detf detfVar = this.e;
        final detd detdVar = this.a;
        final AtomicReference atomicReference = this.b;
        final CountDownLatch countDownLatch = this.c;
        final AtomicReference atomicReference2 = this.d;
        detfVar.b.submit(new Runnable() { // from class: detb
            @Override // java.lang.Runnable
            public final void run() {
                detd detdVar2 = detd.this;
                final AtomicReference atomicReference3 = atomicReference;
                IBinder iBinder2 = iBinder;
                final AtomicReference atomicReference4 = atomicReference2;
                final CountDownLatch countDownLatch2 = countDownLatch;
                try {
                    detdVar2.a(iBinder2, new Consumer() { // from class: desz
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            atomicReference3.set(obj);
                            countDownLatch2.countDown();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }, new Consumer() { // from class: deta
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            atomicReference4.set(new dete((String) obj));
                            countDownLatch2.countDown();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                } catch (RemoteException e) {
                    atomicReference4.set(new dete(e));
                    countDownLatch2.countDown();
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
