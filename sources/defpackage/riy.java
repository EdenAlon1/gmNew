package defpackage;

import android.util.Log;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class riy implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference a;

    public riy(riz rizVar) {
        this.a = new WeakReference(rizVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (Log.isLoggable("ViewTarget", 2)) {
            Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=".concat(toString()));
        }
        riz rizVar = (riz) this.a.get();
        if (rizVar == null || rizVar.c.isEmpty()) {
            return true;
        }
        int b = rizVar.b();
        int a = rizVar.a();
        if (!riz.d(b, a)) {
            return true;
        }
        ArrayList arrayList = new ArrayList(rizVar.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((riw) arrayList.get(i)).g(b, a);
        }
        rizVar.c();
        return true;
    }
}
