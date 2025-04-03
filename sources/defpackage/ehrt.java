package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehrt {
    public Object a;
    public Drawable b;
    public CharSequence c;
    public CharSequence d;
    public View f;
    public TabLayout h;
    public ehrw i;
    public int e = -1;
    public int g = 1;
    public int j = -1;

    public final CharSequence a() {
        ehrw ehrwVar = this.i;
        if (ehrwVar == null) {
            return null;
        }
        return ehrwVar.getContentDescription();
    }

    public final void b() {
        TabLayout tabLayout = this.h;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.m(this);
    }

    public final void c() {
        ehrw ehrwVar = this.i;
        if (ehrwVar != null) {
            ehrwVar.b();
        }
    }

    public final void d(CharSequence charSequence) {
        this.d = charSequence;
        c();
    }

    public final void e(Drawable drawable) {
        this.b = drawable;
        TabLayout tabLayout = this.h;
        if (tabLayout.u == 1 || tabLayout.x == 2) {
            tabLayout.v(true);
        }
        c();
    }

    public final void f(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence)) {
            this.i.setContentDescription(charSequence);
        }
        this.c = charSequence;
        c();
    }

    public final void g(int i) {
        TabLayout tabLayout = this.h;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        e(ku.a(tabLayout.getContext(), i));
    }

    public final void h(int i) {
        TabLayout tabLayout = this.h;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        f(tabLayout.getResources().getText(i));
    }
}
