package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddsz extends vt {
    private final int a;
    private final int b;

    public ddsz(Context context) {
        Resources resources = context.getResources();
        this.a = resources.getDimensionPixelSize(R.dimen.zero_state_search_photo_margin);
        this.b = resources.getDimensionPixelSize(R.dimen.zero_state_search_video_margin);
    }

    @Override // defpackage.vt
    public final void a(Rect rect, View view, RecyclerView recyclerView, wo woVar) {
        vk vkVar = recyclerView.n;
        vkVar.getClass();
        vk vkVar2 = vkVar instanceof cxpo ? ((cxpo) vkVar).a : vkVar;
        int i = vkVar2 instanceof ddtd ? this.a : vkVar2 instanceof dduz ? this.b : 0;
        vx vxVar = recyclerView.o;
        vxVar.getClass();
        emxf.a(vxVar instanceof GridLayoutManager);
        int gp = recyclerView.gp(view);
        int i2 = ((GridLayoutManager) vxVar).b;
        emxf.a(i2 > 0);
        int i3 = gp / i2;
        int a = vkVar.a() / i2;
        if (i3 > 0) {
            rect.top = i;
        }
        if (i3 < a) {
            rect.bottom = i;
        }
        rect.left = i;
        rect.right = i;
    }
}
