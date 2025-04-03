package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crko extends rip {
    private final int b;
    private final boolean c;
    private final qdb d;

    public crko(ImageView imageView, int i, boolean z) {
        super(imageView);
        this.b = i;
        this.c = z;
        this.d = new qdb();
    }

    @Override // defpackage.rix
    public final void a(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.rip
    protected final void b(Drawable drawable) {
        this.d.h();
        this.d.i();
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.rix
    public final /* bridge */ /* synthetic */ void c(Object obj, rjh rjhVar) {
        this.d.x((qci) obj);
        this.d.v(this.b);
        if (this.c) {
            this.d.l();
        }
        ((ImageView) this.a).setImageDrawable(this.d);
    }

    @Override // defpackage.rip
    protected final void j(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }
}
