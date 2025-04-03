package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehaw implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ BottomSheetBehavior c;

    public ehaw(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.a = view;
        this.b = i;
        this.c = bottomSheetBehavior;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.G(this.a, this.b, false);
    }
}
