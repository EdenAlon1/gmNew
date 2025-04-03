package defpackage;

import android.view.View;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kch {
    public static final View a(hvh hvhVar) {
        View q = isx.d(hvhVar.p).q();
        if (q != null) {
            return q;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final boolean b(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }
}
