package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyxh implements erqj {
    final /* synthetic */ dyxi a;
    public final dzcf b;
    private final Random c = new Random();
    private int d = 0;
    private long e = 0;
    private final SettableFuture f;

    public dyxh(dyxi dyxiVar, dzcf dzcfVar, SettableFuture settableFuture) {
        this.a = dyxiVar;
        this.b = dzcfVar;
        this.f = settableFuture;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        this.f.set(obj);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        long min;
        if (this.d == 0) {
            min = ((dywz) ((dywx) this.b.a).a).c;
        } else {
            double d = this.e;
            dywz dywzVar = (dywz) ((dywx) this.b.a).a;
            min = Math.min((long) (d * dywzVar.d), dywzVar.b);
        }
        long nextInt = this.c.nextInt(((dywz) ((dywx) this.b.a).a).e);
        if (this.d >= ((dywz) ((dywx) this.b.a).a).a || !dyxi.a(Status.c(th))) {
            this.f.setException(th);
            return;
        }
        long j = min + nextInt;
        this.d++;
        this.e = j;
        this.a.a.postDelayed(new Runnable() { // from class: dyxg
            @Override // java.lang.Runnable
            public final void run() {
                final dzcf dzcfVar = dyxh.this.b;
                erqt.r(erqt.n(new erog() { // from class: dyxc
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        return dzci.g(dzcf.this.b);
                    }
                }, dyia.b().a), this, erpp.a);
            }
        }, j);
    }
}
