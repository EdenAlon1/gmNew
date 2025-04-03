package defpackage;

import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class org {
    private final Map a = new HashMap();
    private final Object b;

    public org(Object obj) {
        ksw.a(true);
        this.b = obj;
    }

    final Object a(MotionEvent motionEvent) {
        orh orhVar = new orh(motionEvent.getToolType(0), motionEvent.getSource());
        Object obj = this.a.get(orhVar);
        if (obj == null) {
            obj = this.a.get(new orh(orhVar.a));
        }
        return obj != null ? obj : this.b;
    }

    final void b(orh orhVar, Object obj) {
        if (obj == null && this.a.containsKey(orhVar)) {
            this.a.remove(orhVar);
        } else {
            this.a.put(orhVar, obj);
        }
    }
}
