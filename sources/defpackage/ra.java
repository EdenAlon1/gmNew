package defpackage;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ra {
    private final ImageView a;
    private int b = 0;

    public ra(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        if (this.a.getDrawable() != null) {
            this.a.getDrawable().setLevel(this.b);
        }
    }

    public final void b() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            td.c(drawable);
        }
    }

    public final void c(AttributeSet attributeSet, int i) {
        int f;
        yt l = yt.l(this.a.getContext(), attributeSet, kt.g, i, 0);
        TypedArray typedArray = l.b;
        ImageView imageView = this.a;
        kvo.o(imageView, imageView.getContext(), kt.g, attributeSet, typedArray, i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (f = l.f(1, -1)) != -1 && (drawable = ku.a(this.a.getContext(), f)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                td.c(drawable);
            }
            if (l.q(2)) {
                this.a.setImageTintList(l.g(2));
            }
            if (l.q(3)) {
                this.a.setImageTintMode(td.a(l.c(3, -1), null));
            }
        } finally {
            l.o();
        }
    }

    public final void d(Drawable drawable) {
        this.b = drawable.getLevel();
    }

    public final void e(int i) {
        if (i != 0) {
            Drawable a = ku.a(this.a.getContext(), i);
            if (a != null) {
                td.c(a);
            }
            this.a.setImageDrawable(a);
        } else {
            this.a.setImageDrawable(null);
        }
        b();
    }

    public final boolean f() {
        return !(this.a.getBackground() instanceof RippleDrawable);
    }
}
