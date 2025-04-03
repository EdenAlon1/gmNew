package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egqy extends fy {
    final /* synthetic */ egqz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egqy(egqz egqzVar, fr frVar) {
        super(frVar);
        this.a = egqzVar;
    }

    @Override // defpackage.fy
    public final ea b(int i) {
        return (ea) ((egqf) this.a.aq.get(i)).g().b();
    }

    @Override // defpackage.fy, defpackage.pco
    public final void f(ViewGroup viewGroup, int i, Object obj) {
        super.f(viewGroup, i, obj);
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            dvxe c = dvxv.c(childAt);
            if (c != null) {
                if (h(childAt, obj)) {
                    if (c.h() == 2) {
                        c.i(1);
                    }
                } else if (c.h() == 1) {
                    c.i(2);
                }
            }
        }
    }

    @Override // defpackage.pco
    public final int j() {
        return this.a.aq.size();
    }

    @Override // defpackage.pco
    public final CharSequence k(int i) {
        egqz egqzVar = this.a;
        return egqzVar.Y(((egqf) egqzVar.aq.get(i)).a());
    }
}
