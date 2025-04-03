package defpackage;

import android.os.Trace;
import internal.J.N;
import org.chromium.net.impl.CronetLibraryLoader;
import org.chromium.net.impl.CronetUrlRequestContext;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiix implements Runnable {
    final /* synthetic */ fijb a;
    final /* synthetic */ CronetUrlRequestContext b;

    public fiix(CronetUrlRequestContext cronetUrlRequestContext, fijb fijbVar) {
        this.b = cronetUrlRequestContext;
        this.a = fijbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            new fiev("CronetUrlRequestContext#CronetUrlRequestContext initializing request context");
            try {
                CronetUrlRequestContext cronetUrlRequestContext = this.b;
                N.M6Dz0nZ5(cronetUrlRequestContext.c, cronetUrlRequestContext);
                Trace.endSection();
            } finally {
            }
        }
        fijb fijbVar = this.a;
        if (fijbVar != null) {
            fihu fihuVar = CronetLibraryLoader.e;
            int i = fihuVar.a;
            fihy fihyVar = fijbVar.a;
            fihyVar.d = i;
            fihyVar.e = fihuVar.b;
            fihyVar.f = fihuVar.c;
            fihyVar.g = fihuVar.d;
            int a = fijbVar.a();
            synchronized (fihyVar) {
                fijbVar.a.c = a;
                fijbVar.b();
            }
        }
    }
}
