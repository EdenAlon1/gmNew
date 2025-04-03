package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rir extends rja implements rjg {
    private Animatable c;

    public rir(ImageView imageView) {
        super(imageView);
    }

    private final void p(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.c = animatable;
        animatable.start();
    }

    private final void q(Object obj) {
        b(obj);
        p(obj);
    }

    @Override // defpackage.rik, defpackage.rix
    public final void a(Drawable drawable) {
        q(null);
        k(drawable);
    }

    protected abstract void b(Object obj);

    @Override // defpackage.rix
    public final void c(Object obj, rjh rjhVar) {
        if (rjhVar == null || !rjhVar.a(obj, this)) {
            q(obj);
        } else {
            p(obj);
        }
    }

    @Override // defpackage.rik, defpackage.rix
    public final void f(Drawable drawable) {
        this.b.c();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        q(null);
        k(drawable);
    }

    @Override // defpackage.rik, defpackage.rix
    public final void g(Drawable drawable) {
        q(null);
        k(drawable);
    }

    @Override // defpackage.rjg
    public final Drawable j() {
        return ((ImageView) this.a).getDrawable();
    }

    @Override // defpackage.rjg
    public final void k(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.rik, defpackage.rgu
    public final void n() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.rik, defpackage.rgu
    public final void o() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Deprecated
    public rir(ImageView imageView, byte[] bArr) {
        super(imageView);
        l();
    }
}
