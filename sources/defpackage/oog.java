package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oog extends ktb {
    final /* synthetic */ ooh a;

    public oog(ooh oohVar) {
        this.a = oohVar;
    }

    @Override // defpackage.ktb
    public final void c(View view, kxu kxuVar) {
        this.a.d.c(view, kxuVar);
        RecyclerView recyclerView = this.a.c;
        int gp = recyclerView.gp(view);
        vk vkVar = recyclerView.n;
        if (vkVar instanceof ooa) {
            ((ooa) vkVar).m(gp);
        }
    }

    @Override // defpackage.ktb
    public final boolean i(View view, int i, Bundle bundle) {
        return this.a.d.i(view, i, bundle);
    }
}
