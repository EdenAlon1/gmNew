package defpackage;

import android.widget.FrameLayout;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddyf implements ljv {
    public static final cskc a = cskc.g("Bugle", "RecyclerViewPreInflationManager");
    public final ffbr b;
    private Future c;
    private final errl d;

    public ddyf(errl errlVar, ffbr ffbrVar) {
        this.d = errlVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        this.c.cancel(true);
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        this.c.cancel(true);
    }

    public final void g(final ddye ddyeVar) {
        this.c = this.d.submit(eldl.l(new Runnable() { // from class: ddyd
            @Override // java.lang.Runnable
            public final void run() {
                ekzz f = eleg.f("RecyclerViewPreInflationManager#inflationInternal");
                ddye ddyeVar2 = ddyeVar;
                try {
                    FrameLayout frameLayout = new FrameLayout(ddyeVar2.e);
                    for (int i = ddyeVar2.a; i > 0; i--) {
                        try {
                            ddyeVar2.d.e(ddyeVar2.c.n(frameLayout, ddyeVar2.b));
                        } catch (RuntimeException e) {
                            ddyf.a.s("Failed to inflate ViewHolder in background, inflate in main thread instead", e);
                        }
                    }
                    f.close();
                    if (ddyeVar2.f == 2) {
                        ((aemg) ddyf.this.b.b()).a(aemg.d);
                    }
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }));
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}
