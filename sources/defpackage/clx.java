package defpackage;

import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clx {
    public Drawable a;
    public final /* synthetic */ CardView b;

    public clx(CardView cardView) {
        this.b = cardView;
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.b.d.set(i, i2, i3, i4);
        super/*android.widget.FrameLayout*/.setPadding(i + this.b.c.left, i2 + this.b.c.top, i3 + this.b.c.right, i4 + this.b.c.bottom);
    }

    public final boolean b() {
        return this.b.b;
    }

    public final boolean c() {
        return this.b.a;
    }
}
