package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeoa implements aeoj {
    private final Context a;
    private final aeot b;
    private final int c;
    private final Paint d;
    private Drawable e;
    private float f = 0.0f;

    public aeoa(Context context, aeot aeotVar, int i, int i2) {
        this.a = context;
        this.b = aeotVar;
        this.c = i2;
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(ehdr.d(context, i, "SwipeActionCallback"));
    }

    @Override // defpackage.aeoj
    public final void a() {
        if (this.e == null) {
            Drawable b = this.b.b();
            this.e = b;
            this.b.c(b, ehdr.d(this.a, this.c, "SwipeActionCallback"));
        }
    }

    @Override // defpackage.aeoj
    public final void b(Canvas canvas, RecyclerView recyclerView, wr wrVar, float f, boolean z) {
        aeny aenyVar = new aeny();
        aenyVar.a = this.a;
        aenyVar.f(this.b);
        aenyVar.e(this.e);
        aenyVar.b = this.d;
        aenyVar.b(canvas);
        aenyVar.c = recyclerView;
        aenyVar.d = wrVar;
        aenyVar.c(f);
        aenyVar.d(this.f);
        aenyVar.g(z);
        aenyVar.h();
        this.f = aeoi.a(aenyVar.a());
    }
}
