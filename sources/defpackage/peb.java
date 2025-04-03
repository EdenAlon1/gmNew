package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class peb extends peh {
    final /* synthetic */ ViewPager2 a;

    public peb(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.peh
    public final void a(int i) {
        if (i == 0) {
            this.a.f();
        }
    }

    @Override // defpackage.peh
    public final void b(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.b != i) {
            viewPager2.b = i;
            ((pel) viewPager2.j).c();
        }
    }
}
