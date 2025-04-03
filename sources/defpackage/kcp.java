package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kcp extends kbs {
    private final int A;
    private final String B;
    private hrd C;
    public final View w;
    public ffji x;
    public ffji y;
    private final hrc z;

    public kcp(Context context, hfr hfrVar, View view, ijj ijjVar, hrc hrcVar, int i, iwx iwxVar) {
        super(context, hfrVar, ijjVar, view, iwxVar);
        this.w = view;
        this.z = hrcVar;
        this.A = i;
        setClipChildren(false);
        String valueOf = String.valueOf(i);
        this.B = valueOf;
        Object a = hrcVar != null ? hrcVar.a(valueOf) : null;
        SparseArray<Parcelable> sparseArray = a instanceof SparseArray ? (SparseArray) a : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (hrcVar != null) {
            o(hrcVar.d(valueOf, new kcm(this)));
        }
        ffji ffjiVar = kcg.a;
        this.x = ffjiVar;
        this.y = ffjiVar;
    }

    public final void o(hrd hrdVar) {
        hrd hrdVar2 = this.C;
        if (hrdVar2 != null) {
            hrdVar2.a();
        }
        this.C = hrdVar;
    }
}
