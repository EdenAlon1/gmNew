package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pav {
    private static final par b = new ozh();
    private static final ThreadLocal c = new ThreadLocal();
    public static final ArrayList a = new ArrayList();

    static cmh a() {
        cmh cmhVar;
        ThreadLocal threadLocal = c;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (cmhVar = (cmh) weakReference.get()) != null) {
            return cmhVar;
        }
        cmh cmhVar2 = new cmh();
        threadLocal.set(new WeakReference(cmhVar2));
        return cmhVar2;
    }

    public static void b(ViewGroup viewGroup, par parVar) {
        ArrayList arrayList = a;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (parVar == null) {
            parVar = b;
        }
        par clone = parVar.clone();
        d(viewGroup, clone);
        pab.a(viewGroup);
        c(viewGroup, clone);
    }

    public static void c(ViewGroup viewGroup, par parVar) {
        if (parVar == null || viewGroup == null) {
            return;
        }
        pau pauVar = new pau(parVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(pauVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(pauVar);
    }

    public static void d(ViewGroup viewGroup, par parVar) {
        ArrayList arrayList = (ArrayList) a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((par) arrayList.get(i)).u(viewGroup);
            }
        }
        if (parVar != null) {
            parVar.p(viewGroup, true);
        }
        if (((pab) viewGroup.getTag(R.id.transition_current_scene)) != null) {
            throw null;
        }
    }
}
