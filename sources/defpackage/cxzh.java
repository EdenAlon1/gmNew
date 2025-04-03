package defpackage;

import android.transition.Slide;
import android.transition.TransitionManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxzh {
    public cxzg a;

    public final void a(boolean z) {
        cxzg cxzgVar = this.a;
        if (cxzgVar != null) {
            cxze cxzeVar = (cxze) cxzgVar;
            if (z == cxzeVar.m || cxzeVar.k == null) {
                return;
            }
            cxzeVar.m = z;
            Slide slide = new Slide();
            slide.setDuration(333L);
            slide.setSlideEdge(48);
            slide.addTarget(cxzeVar.k);
            TransitionManager.beginDelayedTransition(cxzeVar.k, slide);
            cxzeVar.k.setVisibility(true != z ? 0 : 8);
        }
    }

    public final void b() {
        cxyl cxylVar;
        cxzg cxzgVar = this.a;
        if (cxzgVar == null || (cxylVar = ((cxze) cxzgVar).p) == null) {
            return;
        }
        cxylVar.j();
    }
}
