package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyvx extends AsyncTask {
    final /* synthetic */ dyvz a;

    public dyvx(dyvz dyvzVar) {
        this.a = dyvzVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        dyhw.b();
        final dywa dywaVar = this.a.s;
        return dytm.a(dywaVar.d, new Callable() { // from class: dyvv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dywa dywaVar2 = dywa.this;
                dyvz dyvzVar = dywaVar2.c;
                Uri uri = dyvzVar.k;
                String[] strArr = dyvzVar.l;
                String str = dyvzVar.m;
                String[] strArr2 = dyvzVar.n;
                String str2 = dyvzVar.p;
                Cursor h = dywaVar2.d.h(uri, strArr, str, strArr2, dyvzVar.o, dyvzVar.q);
                try {
                    Object apply = dywaVar2.c.a.apply(h);
                    if (h != null) {
                        h.close();
                    }
                    return apply;
                } catch (Throwable th) {
                    if (h == null) {
                        throw th;
                    }
                    try {
                        h.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.os.AsyncTask
    protected final void onPostExecute(Object obj) {
        this.a.i();
        dyvz dyvzVar = this.a;
        dyvzVar.r = false;
        if (dyvzVar.d) {
            dyhr.a("DatabaseUriMonitor", "delivering: ".concat(String.valueOf(String.valueOf(dyvzVar.j))));
            dyvzVar.s.c(obj);
        }
    }
}
