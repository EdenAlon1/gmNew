package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eipp implements Runnable {
    final /* synthetic */ eipq a;

    public eipp(eipq eipqVar) {
        this.a = eipqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View peekDecorView = this.a.b.peekDecorView();
        if (peekDecorView != null) {
            eipn eipnVar = eipr.a;
            peekDecorView.setSystemUiVisibility(peekDecorView.getSystemUiVisibility() & (-5635));
            return;
        }
        eipq eipqVar = this.a;
        int i = eipqVar.c - 1;
        eipqVar.c = i;
        if (i >= 0) {
            eipqVar.a.post(eipqVar.d);
        } else {
            eipr.a.d("Cannot get decor view of window: ".concat(String.valueOf(String.valueOf(eipqVar.b))));
        }
    }
}
