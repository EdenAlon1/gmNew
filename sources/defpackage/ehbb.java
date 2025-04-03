package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehbb implements kyg {
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;

    public ehbb(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.a = i;
        this.b = bottomSheetBehavior;
    }

    @Override // defpackage.kyg
    public final boolean a(View view) {
        this.b.D(this.a);
        return true;
    }
}
