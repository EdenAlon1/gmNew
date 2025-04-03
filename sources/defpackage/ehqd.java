package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehqd {
    public int a;
    public boolean b;
    final /* synthetic */ SideSheetBehavior c;
    private final Runnable d = new Runnable() { // from class: ehqc
        @Override // java.lang.Runnable
        public final void run() {
            ehqd ehqdVar = ehqd.this;
            ehqdVar.b = false;
            lab labVar = ehqdVar.c.d;
            if (labVar != null && labVar.l()) {
                ehqdVar.a(ehqdVar.a);
                return;
            }
            SideSheetBehavior sideSheetBehavior = ehqdVar.c;
            if (sideSheetBehavior.c == 2) {
                sideSheetBehavior.w(ehqdVar.a);
            }
        }
    };

    public ehqd(SideSheetBehavior sideSheetBehavior) {
        this.c = sideSheetBehavior;
    }

    public final void a(int i) {
        WeakReference weakReference = this.c.j;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.a = i;
        if (this.b) {
            return;
        }
        ((View) this.c.j.get()).postOnAnimation(this.d);
        this.b = true;
    }
}
