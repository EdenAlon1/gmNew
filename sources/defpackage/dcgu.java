package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcgu extends uh {
    final /* synthetic */ dcgy c;

    public dcgu(dcgy dcgyVar) {
        this.c = dcgyVar;
    }

    @Override // defpackage.uh, defpackage.xy
    public final View b(vx vxVar) {
        View U;
        if (((LinearLayoutManager) vxVar).L() != 0 || (U = vxVar.U(0)) == null) {
            return null;
        }
        int width = this.c.q + (U.getWidth() / 2);
        return (!this.c.E() ? U.getRight() <= width : U.getLeft() >= this.c.b.getRight() - width) ? U : vxVar.U(1);
    }

    @Override // defpackage.uh, defpackage.xy
    public final int[] c(vx vxVar, View view) {
        int[] c = super.c(vxVar, view);
        vy vyVar = (vy) view.getLayoutParams();
        int width = this.c.b.getWidth() - ((view.getWidth() + vyVar.leftMargin) + vyVar.rightMargin);
        int i = this.c.q - vyVar.leftMargin;
        int I = this.c.I() / 2;
        int i2 = c[0];
        int i3 = ((width / 2) - i) - I;
        if (this.c.E()) {
            i3 = -i3;
        }
        c[0] = i2 + i3;
        return c;
    }
}
