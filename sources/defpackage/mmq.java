package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmq {
    public final Handler a;
    public final mgi b;

    public mmq(Handler handler, mgi mgiVar) {
        this.a = mgiVar == null ? null : handler;
        this.b = mgiVar;
    }

    public final void a(final meb mebVar) {
        mebVar.a();
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: mmf
                @Override // java.lang.Runnable
                public final void run() {
                    mebVar.a();
                    int i = lvf.a;
                    mgi mgiVar = mmq.this.b;
                    mlh mlhVar = (mlh) mgiVar.a.j;
                    mlhVar.J(mlhVar.H(), 1013, new lud() { // from class: mkd
                        @Override // defpackage.lud
                        public final void a(Object obj) {
                        }
                    });
                    mgl mglVar = mgiVar.a;
                }
            });
        }
    }
}
