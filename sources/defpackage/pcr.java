package defpackage;

import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pcr implements Runnable {
    final /* synthetic */ ViewPager a;

    public pcr(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.o(0);
        this.a.f();
    }
}
