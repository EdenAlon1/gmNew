package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aenz extends aeod {
    public final Context a;
    public final aeot b;
    public final Drawable c;
    public final Paint d;
    public final Canvas e;
    public final RecyclerView f;
    public final wr g;
    public final float h;
    public final float i;
    public final boolean j;
    public final float k;

    public aenz(Context context, aeot aeotVar, Drawable drawable, Paint paint, Canvas canvas, RecyclerView recyclerView, wr wrVar, float f, float f2, boolean z, float f3) {
        this.a = context;
        this.b = aeotVar;
        this.c = drawable;
        this.d = paint;
        this.e = canvas;
        this.f = recyclerView;
        this.g = wrVar;
        this.h = f;
        this.i = f2;
        this.j = z;
        this.k = f3;
    }

    @Override // defpackage.aeod
    public final float a() {
        return this.h;
    }

    @Override // defpackage.aeod
    public final float b() {
        return this.i;
    }

    @Override // defpackage.aeod
    public final float c() {
        return this.k;
    }

    @Override // defpackage.aeod
    public final Context d() {
        return this.a;
    }

    @Override // defpackage.aeod
    public final Canvas e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeod) {
            aeod aeodVar = (aeod) obj;
            if (this.a.equals(aeodVar.d()) && this.b.equals(aeodVar.j()) && this.c.equals(aeodVar.g()) && this.d.equals(aeodVar.f()) && this.e.equals(aeodVar.e()) && this.f.equals(aeodVar.i()) && this.g.equals(aeodVar.h()) && Float.floatToIntBits(this.h) == Float.floatToIntBits(aeodVar.a()) && Float.floatToIntBits(this.i) == Float.floatToIntBits(aeodVar.b()) && this.j == aeodVar.k() && Float.floatToIntBits(this.k) == Float.floatToIntBits(aeodVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aeod
    public final Paint f() {
        return this.d;
    }

    @Override // defpackage.aeod
    public final Drawable g() {
        return this.c;
    }

    @Override // defpackage.aeod
    public final wr h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ Float.floatToIntBits(this.h)) * 1000003) ^ Float.floatToIntBits(this.i)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.k);
    }

    @Override // defpackage.aeod
    public final RecyclerView i() {
        return this.f;
    }

    @Override // defpackage.aeod
    public final aeot j() {
        return this.b;
    }

    @Override // defpackage.aeod
    public final boolean k() {
        return this.j;
    }

    public final String toString() {
        wr wrVar = this.g;
        RecyclerView recyclerView = this.f;
        Canvas canvas = this.e;
        Paint paint = this.d;
        Drawable drawable = this.c;
        aeot aeotVar = this.b;
        return "IconDrawParameters{context=" + this.a.toString() + ", iconProvider=" + aeotVar.toString() + ", drawable=" + drawable.toString() + ", backgroundPaint=" + paint.toString() + ", canvas=" + canvas.toString() + ", recyclerView=" + recyclerView.toString() + ", viewHolder=" + wrVar.toString() + ", dX=" + this.h + ", dXLast=" + this.i + ", isCurrentlyActive=" + this.j + ", swipeThreshold=" + this.k + "}";
    }
}
