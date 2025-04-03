package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class viu extends vt {
    private final int a;

    public viu(Resources resources) {
        this.a = resources.getDimensionPixelSize(R.dimen.reaction_summary_item_margin);
    }

    @Override // defpackage.vt
    public final void a(Rect rect, View view, RecyclerView recyclerView, wo woVar) {
        rect.left = this.a;
        rect.right = this.a;
        rect.top = this.a;
        int gq = recyclerView.gq(view);
        if (recyclerView.n == null || gq != r3.a() - 1) {
            return;
        }
        rect.bottom = this.a;
    }
}
