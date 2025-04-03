package defpackage;

import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ozw extends pas {
    final /* synthetic */ Object a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ Object c;
    final /* synthetic */ ArrayList d;
    final /* synthetic */ FragmentTransitionSupport e;

    public ozw(FragmentTransitionSupport fragmentTransitionSupport, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = fragmentTransitionSupport;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // defpackage.pas, defpackage.pak
    public final void b(par parVar) {
        parVar.I(this);
    }

    @Override // defpackage.pas, defpackage.pak
    public final void e(par parVar) {
        Object obj = this.a;
        if (obj != null) {
            this.e.f(obj, this.b, (ArrayList) null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            this.e.f(obj2, this.d, (ArrayList) null);
        }
    }
}
