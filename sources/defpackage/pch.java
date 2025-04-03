package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pch extends Drawable.ConstantState {
    int a;
    pcg b;
    ColorStateList c;
    PorterDuff.Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;

    public pch() {
        this.c = null;
        this.d = pcj.a;
        this.b = new pcg();
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        pcg pcgVar = this.b;
        pcgVar.a(pcgVar.d, pcg.a, canvas, i, i2);
    }

    public final boolean b() {
        pcg pcgVar = this.b;
        if (pcgVar.k == null) {
            pcgVar.k = Boolean.valueOf(pcgVar.d.b());
        }
        return pcgVar.k.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new pcj(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new pcj(this);
    }

    public pch(pch pchVar) {
        this.c = null;
        this.d = pcj.a;
        if (pchVar != null) {
            this.a = pchVar.a;
            this.b = new pcg(pchVar.b);
            Paint paint = pchVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = pchVar.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = pchVar.c;
            this.d = pchVar.d;
            this.e = pchVar.e;
        }
    }
}
