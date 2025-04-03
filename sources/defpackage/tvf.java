package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvf extends vt {
    private final cuxh a;
    private final int b;
    private final int c;
    private final int d;

    public tvf(Context context, cuxh cuxhVar) {
        this.a = cuxhVar;
        this.b = context.getResources().getDimensionPixelSize(R.dimen.badge_in_group_margin);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.badge_between_groups_margin);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.badge_edge_margin);
    }

    private static boolean c(RecyclerView recyclerView, int i, int i2) {
        vk vkVar = recyclerView.n;
        vx vxVar = recyclerView.o;
        if (vkVar != null && vxVar != null && vkVar.a() > i2) {
            View U = vxVar.U(i);
            View U2 = vxVar.U(i2);
            return U == null || U2 == null || ((tvr) recyclerView.k(U)).a().h == ((tvr) recyclerView.k(U2)).a().h;
        }
        return true;
    }

    @Override // defpackage.vt
    public final void a(Rect rect, View view, RecyclerView recyclerView, wo woVar) {
        vx vxVar = recyclerView.o;
        int gq = recyclerView.gq(view);
        if (this.a.d()) {
            if (vxVar != null && gq == vxVar.av() - 1) {
                rect.left = this.d;
            }
            if (gq == 0) {
                rect.right = this.d;
                return;
            } else {
                rect.right = c(recyclerView, gq, gq + (-1)) ? this.b : this.c;
                return;
            }
        }
        if (vxVar != null && gq == vxVar.av() - 1) {
            rect.right = this.d;
        }
        if (gq == 0) {
            rect.left = this.d;
        } else {
            rect.left = c(recyclerView, gq + (-1), gq) ? this.b : this.c;
        }
    }
}
