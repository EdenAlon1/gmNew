package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egzs implements egzo {
    final /* synthetic */ egzt a;

    public egzs(egzt egztVar) {
        this.a = egztVar;
    }

    @Override // defpackage.egzj
    public final void hj(AppBarLayout appBarLayout, int i) {
        egzt egztVar = this.a;
        egztVar.e = i;
        kxh kxhVar = egztVar.f;
        int d = kxhVar != null ? kxhVar.d() : 0;
        int childCount = this.a.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.a.getChildAt(i2);
            egzr egzrVar = (egzr) childAt.getLayoutParams();
            egzz f = egzt.f(childAt);
            int i3 = egzrVar.a;
            if (i3 == 1) {
                f.c(kqp.b(-i, 0, this.a.d(childAt)));
            } else if (i3 == 2) {
                f.c(Math.round((-i) * egzrVar.b));
            }
        }
        this.a.j();
        egzt egztVar2 = this.a;
        if (egztVar2.d != null && d > 0) {
            egztVar2.postInvalidateOnAnimation();
        }
        egzt egztVar3 = this.a;
        int height = egztVar3.getHeight();
        int minimumHeight = height - egztVar3.getMinimumHeight();
        int e = height - this.a.e();
        int i4 = minimumHeight - d;
        int i5 = this.a.e + i4;
        float abs = Math.abs(i);
        float f2 = i4;
        float f3 = e / f2;
        this.a.a.B(Math.min(1.0f, f3));
        ehhs ehhsVar = this.a.a;
        ehhsVar.d = i5;
        float f4 = abs / f2;
        ehhsVar.A(f4);
        this.a.b.B(Math.min(1.0f, f3));
        ehhs ehhsVar2 = this.a.b;
        ehhsVar2.d = i5;
        ehhsVar2.A(f4);
    }
}
