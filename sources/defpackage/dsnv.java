package defpackage;

import android.view.ViewGroup;
import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsnv extends fflr {
    final /* synthetic */ dsnw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsnv(Object obj, dsnw dsnwVar) {
        super(obj);
        this.a = dsnwVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        dsnu dsnuVar = (dsnu) obj2;
        dsnu dsnuVar2 = (dsnu) obj;
        if (dsnuVar2 instanceof dsns) {
            dsns dsnsVar = (dsns) dsnuVar2;
            dsnsVar.b.d(dsnm.a);
            dsnw dsnwVar = this.a;
            dsnwVar.d().removeView(dsnsVar.a);
        }
        if (dsnuVar instanceof dsns) {
            ViewGroup d = this.a.d();
            d.getClass();
            dsns dsnsVar2 = (dsns) dsnuVar;
            dsod dsodVar = dsnsVar2.a;
            if (d.getChildCount() > 0) {
                d.addView(dsodVar);
            } else {
                d.setOnHierarchyChangeListener(new dslj(d, d, dsodVar));
            }
            KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener = dsnsVar2.b;
            dsnw dsnwVar2 = this.a;
            keyboardDetectorViewInsetsListener.d(new dsnl(dsnwVar2.b, dsnsVar2.c));
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
