package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pcs implements kud {
    final /* synthetic */ ViewPager a;
    private final Rect b = new Rect();

    public pcs(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // defpackage.kud
    public final kxh ey(View view, kxh kxhVar) {
        kxh g = kvo.g(view, kxhVar);
        if (g.t()) {
            return g;
        }
        Rect rect = this.b;
        rect.left = g.b();
        rect.top = g.d();
        rect.right = g.c();
        rect.bottom = g.a();
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            kxh f = kvo.f(this.a.getChildAt(i), g);
            rect.left = Math.min(f.b(), rect.left);
            rect.top = Math.min(f.d(), rect.top);
            rect.right = Math.min(f.c(), rect.right);
            rect.bottom = Math.min(f.a(), rect.bottom);
        }
        kww kwvVar = Build.VERSION.SDK_INT >= 34 ? new kwv(g) : Build.VERSION.SDK_INT >= 30 ? new kwu(g) : Build.VERSION.SDK_INT >= 29 ? new kwt(g) : new kws(g);
        kwvVar.c(kpt.c(rect));
        return kwvVar.a();
    }
}
