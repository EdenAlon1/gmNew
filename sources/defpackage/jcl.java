package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcl extends hvh implements jhw {
    public ViewGroup a;

    public jcl(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // defpackage.jhw
    public final Object b(ioc iocVar, ffix ffixVar, ffgu ffguVar) {
        long a = iod.a(iocVar);
        Object invoke = ffixVar.invoke();
        iam f = invoke != null ? ((iam) invoke).f(a) : null;
        if (f != null) {
            this.a.requestRectangleOnScreen(icz.a(f), false);
        }
        return ffcu.a;
    }
}
