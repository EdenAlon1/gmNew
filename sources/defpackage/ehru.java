package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehru implements pcx {
    public int a;
    public int b;
    private final WeakReference c;

    public ehru(TabLayout tabLayout) {
        this.c = new WeakReference(tabLayout);
    }

    @Override // defpackage.pcx
    public final void a(int i) {
        this.a = this.b;
        this.b = i;
        TabLayout tabLayout = (TabLayout) this.c.get();
        if (tabLayout != null) {
            tabLayout.G = this.b;
        }
    }

    @Override // defpackage.pcx
    public final void b(int i) {
        TabLayout tabLayout = (TabLayout) this.c.get();
        if (tabLayout == null || tabLayout.a() == i || i >= tabLayout.b()) {
            return;
        }
        int i2 = this.b;
        boolean z = true;
        if (i2 != 0 && (i2 != 2 || this.a != 0)) {
            z = false;
        }
        tabLayout.n(tabLayout.d(i), z);
    }

    @Override // defpackage.pcx
    public final void c(int i, float f) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.c.get();
        if (tabLayout != null) {
            int i2 = this.b;
            boolean z2 = true;
            if (i2 != 2 || this.a == 1) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            if (i2 == 2 && this.a == 0) {
                z = false;
            }
            tabLayout.p(i, f, z2, z, false);
        }
    }
}
