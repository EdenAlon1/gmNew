package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qo {
    public yr a;
    private final View b;
    private yr e;
    private yr f;
    private int d = -1;
    private final qu c = qu.d();

    public qo(View view) {
        this.b = view;
    }

    public final void a() {
        Drawable background = this.b.getBackground();
        if (background != null) {
            if (this.e != null) {
                if (this.f == null) {
                    this.f = new yr();
                }
                yr yrVar = this.f;
                yrVar.a = null;
                yrVar.d = false;
                yrVar.b = null;
                yrVar.c = false;
                View view = this.b;
                int[] iArr = kvo.a;
                ColorStateList c = kvd.c(view);
                if (c != null) {
                    yrVar.d = true;
                    yrVar.a = c;
                }
                PorterDuff.Mode d = kvd.d(this.b);
                if (d != null) {
                    yrVar.c = true;
                    yrVar.b = d;
                }
                if (yrVar.d || yrVar.c) {
                    ww.h(background, yrVar, this.b.getDrawableState());
                    return;
                }
            }
            yr yrVar2 = this.a;
            if (yrVar2 != null) {
                ww.h(background, yrVar2, this.b.getDrawableState());
                return;
            }
            yr yrVar3 = this.e;
            if (yrVar3 != null) {
                ww.h(background, yrVar3, this.b.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        yt l = yt.l(this.b.getContext(), attributeSet, kt.C, i, 0);
        TypedArray typedArray = l.b;
        View view = this.b;
        kvo.o(view, view.getContext(), kt.C, attributeSet, typedArray, i, 0);
        try {
            if (l.q(0)) {
                this.d = l.f(0, -1);
                ColorStateList a = this.c.a(this.b.getContext(), this.d);
                if (a != null) {
                    d(a);
                }
            }
            if (l.q(1)) {
                kvd.h(this.b, l.g(1));
            }
            if (l.q(2)) {
                kvd.i(this.b, td.a(l.c(2, -1), null));
            }
        } finally {
            l.o();
        }
    }

    public final void c(int i) {
        this.d = i;
        qu quVar = this.c;
        d(quVar != null ? quVar.a(this.b.getContext(), i) : null);
        a();
    }

    final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.e == null) {
                this.e = new yr();
            }
            yr yrVar = this.e;
            yrVar.a = colorStateList;
            yrVar.d = true;
        } else {
            this.e = null;
        }
        a();
    }

    public final void e() {
        this.d = -1;
        d(null);
        a();
    }
}
