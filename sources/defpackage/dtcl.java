package defpackage;

import com.google.android.libraries.compose.ui.views.RoundedImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtcl extends fflr {
    final /* synthetic */ RoundedImageView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtcl(RoundedImageView roundedImageView) {
        super(null);
        this.a = roundedImageView;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        this.a.requestLayout();
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
