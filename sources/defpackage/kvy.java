package defpackage;

import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class kvy extends ffkh implements ffji {
    public static final kvy a = new kvy();

    public kvy() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}
