package defpackage;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehbf implements Runnable {
    final /* synthetic */ ehbg a;

    public ehbf(ehbg ehbgVar) {
        this.a = ehbgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ehbg ehbgVar = this.a;
        ehbgVar.b = false;
        lab labVar = ehbgVar.c.y;
        if (labVar != null && labVar.l()) {
            ehbg ehbgVar2 = this.a;
            ehbgVar2.a(ehbgVar2.a);
            return;
        }
        ehbg ehbgVar3 = this.a;
        BottomSheetBehavior bottomSheetBehavior = ehbgVar3.c;
        if (bottomSheetBehavior.x == 2) {
            bottomSheetBehavior.E(ehbgVar3.a);
        }
    }
}
