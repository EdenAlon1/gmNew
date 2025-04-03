package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsmk extends fflr {
    final /* synthetic */ dsml a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsmk(Object obj, dsml dsmlVar) {
        super(obj);
        this.a = dsmlVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        WeakReference weakReference;
        View view;
        dsmm dsmmVar = (dsmm) obj2;
        if (dsmmVar == dsmm.d && (weakReference = this.a.e) != null && (view = (View) weakReference.get()) != null) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            this.a.e = null;
        }
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            ((dsmn) it.next()).m(dsmmVar);
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
