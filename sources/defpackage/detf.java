package defpackage;

import android.content.Context;
import android.content.Intent;
import j$.time.Duration;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class detf {
    public final Context a;
    public final ExecutorService b;

    public detf(Context context, ExecutorService executorService) {
        this.a = context.getApplicationContext();
        this.b = executorService;
    }

    public final Object a(detd detdVar, Duration duration) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        Intent intent = new Intent("com.google.android.apps.tycho.psd.api.ACTION_BIND_PSD_SERVICE").setPackage("com.google.android.apps.tycho");
        detc detcVar = new detc(this, detdVar, atomicReference, countDownLatch, atomicReference2);
        try {
            if (!this.a.bindService(intent, detcVar, 1)) {
                throw new dete("Fi product-specific data service is not available");
            }
            if (!countDownLatch.await(duration.toNanos(), TimeUnit.NANOSECONDS)) {
                throw new TimeoutException("Timed out waiting for response from Fi app");
            }
            if (atomicReference2.get() == null) {
                return atomicReference.get();
            }
            throw ((dete) atomicReference2.get());
        } finally {
            this.a.unbindService(detcVar);
        }
    }
}
