package defpackage;

import android.util.Log;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rin implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;

    public rin(rio rioVar) {
        this.a = new WeakReference(rioVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (Log.isLoggable("CustomViewTarget", 2)) {
            Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=".concat(toString()));
        }
        rio rioVar = (rio) this.a.get();
        if (rioVar == null || rioVar.c.isEmpty()) {
            return true;
        }
        int b = rioVar.b();
        int a = rioVar.a();
        if (!rio.d(b, a)) {
            return true;
        }
        ArrayList arrayList = new ArrayList(rioVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((riw) arrayList.get(i)).g(b, a);
        }
        rioVar.c();
        return true;
    }
}
