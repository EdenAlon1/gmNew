package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvtx {
    public dvtv a;
    public dvtw b;
    private final ViewTreeObserver.OnPreDrawListener c;
    private final View d;
    private WeakReference e;
    private dvtt f;
    private dvtt g;
    private boolean h;

    public dvtx(View view) {
        view.getClass();
        this.d = view;
        this.f = new dvtt();
        this.g = new dvtt();
        this.c = new dvtu(this);
        this.h = false;
    }

    private final View c() {
        WeakReference weakReference = this.e;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0038, code lost:
    
        if (r0 == r2) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvtx.a():void");
    }

    public final void b(View view) {
        if (view == c()) {
            a();
            return;
        }
        this.e = new WeakReference(view);
        dvtv dvtvVar = this.a;
        if (dvtvVar != null && view == null) {
            ((dvto) dvtvVar).a();
        }
        ViewTreeObserver viewTreeObserver = this.d.getViewTreeObserver();
        if (view != null && !this.h) {
            viewTreeObserver.addOnPreDrawListener(this.c);
            this.h = true;
        }
        if (view == null && this.h) {
            viewTreeObserver.removeOnPreDrawListener(this.c);
            this.h = false;
        }
        if (view != null) {
            a();
            return;
        }
        if (this.g.b()) {
            this.g.a();
            dvtw dvtwVar = this.b;
            if (dvtwVar != null) {
                dvtwVar.b(this.g);
            }
        }
    }
}
