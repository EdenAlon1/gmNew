package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crld extends Drawable {
    private final Picture a;

    public crld(rnh rnhVar) {
        Picture b;
        float g;
        rmh rmhVar = rnhVar.a;
        rlr rlrVar = rmhVar.c;
        if (rlrVar != null) {
            float g2 = rlrVar.g();
            rle rleVar = rmhVar.w;
            if (rleVar != null) {
                g = (rleVar.d * g2) / rleVar.c;
            } else {
                rlr rlrVar2 = rmhVar.d;
                g = rlrVar2 != null ? rlrVar2.g() : g2;
            }
            b = rnhVar.b((int) Math.ceil(g2), (int) Math.ceil(g));
        } else {
            b = rnhVar.b(512, 512);
        }
        this.a = b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        canvas.drawPicture(this.a, getBounds());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
