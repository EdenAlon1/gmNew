package defpackage;

import android.content.Context;
import android.os.Debug;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eckc implements ecje, ecgn {
    private final Context a;
    private final errm b;
    private final ffbr c;
    private final ffbr d;
    private final Random e;
    private final ffbr f;
    private final ecgt g;

    public eckc(Context context, errm errmVar, emxc<Boolean> emxcVar, ffbr<ecke> ffbrVar, ffbr<ecke> ffbrVar2, Random random, ffbr<emxc<ecjw>> ffbrVar3, ecgt ecgtVar) {
        this.a = context;
        this.b = errmVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = random;
        this.f = ffbrVar3;
        this.g = ecgtVar;
    }

    public static /* synthetic */ ListenableFuture a(eckc eckcVar, ecke eckeVar) {
        Debug.startMethodTracingSampling(eckeVar.c, eckeVar.h, eckeVar.i);
        return eckcVar.b.schedule(new Runnable() { // from class: ecka
            @Override // java.lang.Runnable
            public final void run() {
                Debug.stopMethodTracing();
            }
        }, eckcVar.e(eckeVar.f, eckeVar.g), TimeUnit.MILLISECONDS);
    }

    private final int e(int i, int i2) {
        return i2 == 0 ? i : this.e.nextInt(i2) + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(final ecke eckeVar) {
        if (eckeVar.b) {
            emxc emxcVar = (emxc) this.f.b();
            if (!emxcVar.g() || ((ecjw) emxcVar.c()).c()) {
                erqt.k(new erog() { // from class: ecjz
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        return eckc.a(eckc.this, eckeVar);
                    }
                }, e(eckeVar.d, eckeVar.e), TimeUnit.MILLISECONDS, this.b);
            }
        }
    }

    @Override // defpackage.ecgn
    public void j(ecda ecdaVar) {
        this.g.b(this);
        this.b.execute(new Runnable() { // from class: eckb
            @Override // java.lang.Runnable
            public final void run() {
                dubc.b(r0.a, new Runnable() { // from class: ecjx
                    @Override // java.lang.Runnable
                    public final void run() {
                        r0.f((ecke) eckc.this.c.b());
                    }
                });
            }
        });
    }

    @Override // defpackage.ecje
    public void n() {
        Boolean bool = Boolean.FALSE;
        bool.getClass();
        if (bool.booleanValue()) {
            dubc.b(this.a, new Runnable() { // from class: ecjy
                @Override // java.lang.Runnable
                public final void run() {
                    r0.f((ecke) eckc.this.d.b());
                }
            });
        }
        this.g.a(this);
    }

    @Override // defpackage.ecgn
    public /* synthetic */ void i(ecda ecdaVar) {
    }
}
