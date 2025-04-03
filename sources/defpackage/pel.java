package defpackage;

import android.R;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pel extends pee {
    public vm a;
    public final /* synthetic */ ViewPager2 b;
    private final kyg c = new pei(this);
    private final kyg d = new pej(this);

    public pel(ViewPager2 viewPager2) {
        this.b = viewPager2;
    }

    @Override // defpackage.pee
    public final boolean a(int i) {
        return i == 8192 || i == 4096;
    }

    public final void b(int i) {
        ViewPager2 viewPager2 = this.b;
        if (viewPager2.h) {
            viewPager2.i(i);
        }
    }

    public final void c() {
        int a;
        ViewPager2 viewPager2 = this.b;
        int i = R.id.accessibilityActionPageLeft;
        kvo.n(viewPager2, R.id.accessibilityActionPageLeft);
        kvo.n(viewPager2, R.id.accessibilityActionPageRight);
        kvo.n(viewPager2, R.id.accessibilityActionPageUp);
        kvo.n(viewPager2, R.id.accessibilityActionPageDown);
        if (this.b.c() == null || (a = this.b.c().a()) == 0) {
            return;
        }
        ViewPager2 viewPager22 = this.b;
        if (viewPager22.h) {
            int i2 = a - 1;
            if (viewPager22.a() != 0) {
                if (this.b.b < i2) {
                    kvo.y(viewPager2, new kxr(R.id.accessibilityActionPageDown, (CharSequence) null), this.c);
                }
                if (this.b.b > 0) {
                    kvo.y(viewPager2, new kxr(R.id.accessibilityActionPageUp, (CharSequence) null), this.d);
                    return;
                }
                return;
            }
            boolean g = this.b.g();
            int i3 = true != g ? 16908361 : 16908360;
            if (true == g) {
                i = 16908361;
            }
            if (this.b.b < i2) {
                kvo.y(viewPager2, new kxr(i3, (CharSequence) null), this.c);
            }
            if (this.b.b > 0) {
                kvo.y(viewPager2, new kxr(i, (CharSequence) null), this.d);
            }
        }
    }
}
