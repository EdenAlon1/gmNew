package defpackage;

import android.os.Handler;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecpv {
    public final dlpw a;
    public final ffbr b;
    public final ecpj c;
    public final Handler d;
    public final ecjc e;
    public int f = 0;
    public long g = -1;
    public volatile long h = -1;
    volatile boolean i = false;
    final AtomicReference j = new AtomicReference(erre.a);
    public final ecfe k;
    private final errm l;

    public ecpv(dlpw dlpwVar, errm errmVar, ecfe ecfeVar, ffbr ffbrVar, ecpj ecpjVar, ecjc ecjcVar, Handler handler) {
        this.a = dlpwVar;
        this.l = errmVar;
        this.k = ecfeVar;
        this.b = ffbrVar;
        this.c = ecpjVar;
        this.d = handler;
        this.e = ecjcVar;
    }

    public final void a(Runnable runnable, int i) {
        if (this.i) {
            AtomicReference atomicReference = this.j;
            SettableFuture create = SettableFuture.create();
            atomicReference.set(create);
            if (this.i) {
                create.m(this.l.schedule(runnable, i, TimeUnit.MILLISECONDS));
            }
        }
    }

    final void b() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.j.set(erqt.l(new ecps(this), this.l));
    }
}
