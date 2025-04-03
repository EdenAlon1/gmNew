package defpackage;

import android.view.Surface;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dubf implements Runnable {
    public final /* synthetic */ dubi a;

    @Override // java.lang.Runnable
    public final void run() {
        dubi dubiVar = this.a;
        if (dubiVar.e == null || dubiVar.j != null) {
            return;
        }
        dubiVar.k = new exmf(dubiVar.b);
        dubiVar.f = new Surface(dubiVar.e);
        dubiVar.j = dubiVar.k.a(dubiVar.f);
        exmf exmfVar = dubiVar.k;
        EGLSurface eGLSurface = dubiVar.j;
        exmfVar.b(eGLSurface, eGLSurface);
        dubiVar.l = new exml();
        dubiVar.l.c();
        dubiVar.d.set(true);
    }
}
