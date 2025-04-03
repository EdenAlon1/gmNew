package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rh extends rd {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public rh(SeekBar seekBar) {
        super(seekBar);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = seekBar;
    }

    private final void c() {
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.f || this.g) {
                Drawable mutate = drawable.mutate();
                this.c = mutate;
                if (this.f) {
                    mutate.setTintList(this.d);
                }
                if (this.g) {
                    this.c.setTintMode(this.e);
                }
                if (this.c.isStateful()) {
                    this.c.setState(this.b.getDrawableState());
                }
            }
        }
    }

    @Override // defpackage.rd
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, i);
        yt l = yt.l(this.b.getContext(), attributeSet, kt.h, i, 0);
        TypedArray typedArray = l.b;
        SeekBar seekBar = this.b;
        kvo.o(seekBar, seekBar.getContext(), kt.h, attributeSet, typedArray, i, 0);
        Drawable i2 = l.i(0);
        if (i2 != null) {
            this.b.setThumb(i2);
        }
        Drawable h = l.h(1);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = h;
        if (h != null) {
            h.setCallback(this.b);
            h.setLayoutDirection(this.b.getLayoutDirection());
            if (h.isStateful()) {
                h.setState(this.b.getDrawableState());
            }
            c();
        }
        this.b.invalidate();
        if (l.q(3)) {
            this.e = td.a(l.c(3, -1), this.e);
            this.g = true;
        }
        if (l.q(2)) {
            this.d = l.g(2);
            this.f = true;
        }
        l.o();
        c();
    }
}
