package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqfw extends vk {
    public static final /* synthetic */ ffmx[] a;
    public int d;
    public final ffls e = new dqfv(this);

    static {
        ffko ffkoVar = new ffko(dqfw.class, "view", "getView()Landroid/view/View;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar};
    }

    @Override // defpackage.vk
    public final int a() {
        return this.d;
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return 1;
    }

    @Override // defpackage.vk
    public final wr e(ViewGroup viewGroup, int i) {
        View view = (View) this.e.c(a[0]);
        if (view == null) {
            throw new IllegalStateException("View must be set before this adapter gets invoked");
        }
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new dqfu(view);
    }

    @Override // defpackage.vk
    public final void g(wr wrVar, int i) {
        wrVar.getClass();
    }
}
