package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeny extends aeoc {
    public Context a;
    public Paint b;
    public RecyclerView c;
    public wr d;
    private aeot e;
    private Drawable f;
    private Canvas g;
    private float h;
    private float i;
    private boolean j;
    private float k;
    private byte l;

    @Override // defpackage.aeoc
    public final aeod a() {
        Context context;
        aeot aeotVar;
        Drawable drawable;
        Paint paint;
        Canvas canvas;
        RecyclerView recyclerView;
        wr wrVar;
        if (this.l == 15 && (context = this.a) != null && (aeotVar = this.e) != null && (drawable = this.f) != null && (paint = this.b) != null && (canvas = this.g) != null && (recyclerView = this.c) != null && (wrVar = this.d) != null) {
            return new aenz(context, aeotVar, drawable, paint, canvas, recyclerView, wrVar, this.h, this.i, this.j, this.k);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" context");
        }
        if (this.e == null) {
            sb.append(" iconProvider");
        }
        if (this.f == null) {
            sb.append(" drawable");
        }
        if (this.b == null) {
            sb.append(" backgroundPaint");
        }
        if (this.g == null) {
            sb.append(" canvas");
        }
        if (this.c == null) {
            sb.append(" recyclerView");
        }
        if (this.d == null) {
            sb.append(" viewHolder");
        }
        if ((this.l & 1) == 0) {
            sb.append(" dX");
        }
        if ((this.l & 2) == 0) {
            sb.append(" dXLast");
        }
        if ((this.l & 4) == 0) {
            sb.append(" isCurrentlyActive");
        }
        if ((this.l & 8) == 0) {
            sb.append(" swipeThreshold");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.aeoc
    public final void b(Canvas canvas) {
        if (canvas == null) {
            throw new NullPointerException("Null canvas");
        }
        this.g = canvas;
    }

    @Override // defpackage.aeoc
    public final void c(float f) {
        this.h = f;
        this.l = (byte) (this.l | 1);
    }

    @Override // defpackage.aeoc
    public final void d(float f) {
        this.i = f;
        this.l = (byte) (this.l | 2);
    }

    @Override // defpackage.aeoc
    public final void e(Drawable drawable) {
        if (drawable == null) {
            throw new NullPointerException("Null drawable");
        }
        this.f = drawable;
    }

    @Override // defpackage.aeoc
    public final void f(aeot aeotVar) {
        if (aeotVar == null) {
            throw new NullPointerException("Null iconProvider");
        }
        this.e = aeotVar;
    }

    @Override // defpackage.aeoc
    public final void g(boolean z) {
        this.j = z;
        this.l = (byte) (this.l | 4);
    }

    @Override // defpackage.aeoc
    public final void h() {
        this.k = 0.5f;
        this.l = (byte) (this.l | 8);
    }
}
