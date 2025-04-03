package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehsb {
    public final TabLayout a;
    public final ViewPager2 b;
    public vk c;
    public boolean d;
    public ehrz e;
    public ehrp f;
    public vm g;

    public ehsb(TabLayout tabLayout, ViewPager2 viewPager2) {
        this.a = tabLayout;
        this.b = viewPager2;
    }

    public final void a() {
        this.a.k();
        vk vkVar = this.c;
        if (vkVar != null) {
            int a = vkVar.a();
            for (int i = 0; i < a; i++) {
                ehrt e = this.a.e();
                if (i == 0) {
                    e.h(R.string.label_debug_trace_completed);
                } else {
                    if (i != 1) {
                        throw new IndexOutOfBoundsException();
                    }
                    e.h(R.string.label_debug_trace_active);
                }
                e.g = 1;
                TabLayout tabLayout = e.h;
                if (tabLayout.u == 1 || tabLayout.x == 2) {
                    tabLayout.v(true);
                }
                e.c();
                this.a.h(e, false);
            }
            if (a > 0) {
                int min = Math.min(this.b.b, this.a.b() - 1);
                if (min != this.a.a()) {
                    TabLayout tabLayout2 = this.a;
                    tabLayout2.m(tabLayout2.d(min));
                }
            }
        }
    }
}
