package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akmm extends fflr {
    final /* synthetic */ akmn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akmm(Object obj, akmn akmnVar) {
        super(obj);
        this.a = akmnVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        AppBarLayout appBarLayout;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue && (appBarLayout = this.a.d) != null) {
            appBarLayout.n(false, false);
        }
        int i = true != booleanValue ? 8 : 0;
        Iterator a = new kvt(this.a.b).a();
        while (a.hasNext()) {
            View view = (View) a.next();
            if (!ffkj.e(view, this.a.f)) {
                view.setVisibility(i);
            }
        }
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
