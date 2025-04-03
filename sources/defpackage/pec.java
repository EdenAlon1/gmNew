package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pec extends peh {
    final /* synthetic */ ViewPager2 a;

    public pec(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.peh
    public final void b(int i) {
        this.a.clearFocus();
        if (this.a.hasFocus()) {
            this.a.f.requestFocus(2);
        }
    }
}
