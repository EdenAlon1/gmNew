package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.grpc.Status;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fehl implements ServiceConnection, feff {
    private static final Logger a = Logger.getLogger(fehl.class.getName());
    private final Intent b;
    private final int c;
    private final fefe d;
    private final Executor e;
    private Context f;
    private int g;
    private int h;

    public fehl(Executor executor, Context context, Intent intent, int i, fefe fefeVar) {
        synchronized (this) {
            this.b = intent;
            this.c = i;
            this.d = fefeVar;
            this.f = context;
            this.e = executor;
            this.g = 1;
            this.h = 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7 A[Catch: all -> 0x00d2, TRY_LEAVE, TryCatch #0 {all -> 0x00d2, blocks: (B:13:0x0045, B:15:0x00a1, B:17:0x00a7, B:19:0x00a9, B:20:0x00bc, B:27:0x00af, B:32:0x002e, B:34:0x0041, B:41:0x0071, B:39:0x008a, B:48:0x00d0, B:36:0x0033, B:37:0x003a), top: B:2:0x0001, inners: #2 }] */
    @Override // defpackage.feff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a() {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fehl.a():void");
    }

    public final void b(Status status) {
        Logger logger = a;
        logger.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound ", status);
        this.f = null;
        if (this.h != 4) {
            this.h = 4;
            logger.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound - notifying");
            this.d.b(status);
        }
    }

    final void c(final Status status) {
        Context context;
        synchronized (this) {
            int i = this.g;
            if (i != 2 && i != 3) {
                context = null;
                this.g = 4;
            }
            context = this.f;
            this.g = 4;
        }
        this.e.execute(new Runnable() { // from class: fehj
            @Override // java.lang.Runnable
            public final void run() {
                fehl.this.b(status);
            }
        });
        if (context != null) {
            context.unbindService(this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        c(Status.p.withDescription("onBindingDied: ".concat(String.valueOf(String.valueOf(componentName)))));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        c(Status.n.withDescription("onNullBinding: ".concat(String.valueOf(String.valueOf(componentName)))));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        synchronized (this) {
            if (this.g == 2) {
                this.g = 3;
                z = true;
            } else {
                z = false;
            }
        }
        if (z && this.h == 1) {
            this.h = 3;
            a.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyBound", "notify bound - notifying");
            this.d.a(iBinder);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c(Status.p.withDescription("onServiceDisconnected: ".concat(String.valueOf(String.valueOf(componentName)))));
    }
}
