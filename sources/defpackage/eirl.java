package defpackage;

import android.content.Context;
import android.graphics.PointF;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eirl extends ug {
    final /* synthetic */ SpannedGridLayoutManager f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eirl(SpannedGridLayoutManager spannedGridLayoutManager, Context context) {
        super(context);
        this.f = spannedGridLayoutManager;
    }

    @Override // defpackage.wn
    public final PointF m(int i) {
        return new PointF(0.0f, this.f.a.d(i) - this.f.f);
    }
}
