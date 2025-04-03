package defpackage;

import android.util.Size;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpnm extends fflr {
    final /* synthetic */ dpnn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpnm(dpnn dpnnVar) {
        super(null);
        this.a = dpnnVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        View view = this.a.a;
        Size size = (Size) obj2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = size != null ? size.getWidth() : -1;
        layoutParams.height = size != null ? size.getHeight() : -2;
        view.setLayoutParams(layoutParams);
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
