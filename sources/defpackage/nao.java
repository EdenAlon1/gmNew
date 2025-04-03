package defpackage;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nao {
    public final Handler a;
    public final mgi b;

    public nao(Handler handler, mgi mgiVar) {
        if (mgiVar != null) {
            lti.f(handler);
        } else {
            handler = null;
        }
        this.a = handler;
        this.b = mgiVar;
    }

    public final void a(final meb mebVar) {
        mebVar.a();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: nam
                @Override // java.lang.Runnable
                public final void run() {
                    final meb mebVar2 = mebVar;
                    mebVar2.a();
                    int i = lvf.a;
                    mgi mgiVar = nao.this.b;
                    mlh mlhVar = (mlh) mgiVar.a.j;
                    mlhVar.J(mlhVar.H(), 1020, new lud() { // from class: mki
                        @Override // defpackage.lud
                        public final void a(Object obj) {
                            ((miu) obj).g(meb.this);
                        }
                    });
                    mgl mglVar = mgiVar.a;
                }
            });
        }
    }

    public final void b(final Object obj) {
        Handler handler = this.a;
        if (handler != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: nah
                @Override // java.lang.Runnable
                public final void run() {
                    int i = lvf.a;
                    mgi mgiVar = nao.this.b;
                    mlh mlhVar = (mlh) mgiVar.a.j;
                    mis I = mlhVar.I();
                    final Object obj2 = obj;
                    mlhVar.J(I, 26, new lud() { // from class: mkv
                        @Override // defpackage.lud
                        public final void a(Object obj3) {
                        }
                    });
                    mgl mglVar = mgiVar.a;
                    if (mglVar.t == obj2) {
                        mglVar.h.f(26, new lud() { // from class: mgh
                            @Override // defpackage.lud
                            public final void a(Object obj3) {
                                ((lrm) obj3).u();
                            }
                        });
                    }
                }
            });
        }
    }

    public final void c(final lsl lslVar) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: naf
                @Override // java.lang.Runnable
                public final void run() {
                    int i = lvf.a;
                    mgl mglVar = nao.this.b.a;
                    final lsl lslVar2 = lslVar;
                    mglVar.y = lslVar2;
                    mglVar.h.f(25, new lud() { // from class: mgg
                        @Override // defpackage.lud
                        public final void a(Object obj) {
                            int i2 = mgi.b;
                            ((lrm) obj).C(lsl.this);
                        }
                    });
                }
            });
        }
    }
}
