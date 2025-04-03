package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehbg {
    public int a;
    public boolean b;
    final /* synthetic */ BottomSheetBehavior c;
    private final Runnable d = new ehbf(this);

    public ehbg(BottomSheetBehavior bottomSheetBehavior) {
        this.c = bottomSheetBehavior;
    }

    public final void a(int i) {
        WeakReference weakReference = this.c.B;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.a = i;
        if (this.b) {
            return;
        }
        ((View) this.c.B.get()).postOnAnimation(this.d);
        this.b = true;
    }
}
