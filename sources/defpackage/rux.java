package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rux extends igq implements hjk {
    public final Drawable a;
    public final hho c;
    public final hho b = new hic(0, hla.a);
    private final ffbz d = ffca.a(new ffix() { // from class: ruv
        @Override // defpackage.ffix
        public final Object invoke() {
            return new ruw(rux.this);
        }
    });

    public rux(Drawable drawable) {
        this.a = drawable;
        this.c = new hic(new iar(ruz.a(drawable)), hla.a);
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // defpackage.igq
    public final long a() {
        return ((iar) this.c.a()).a;
    }

    @Override // defpackage.igq
    protected final void b(ifr ifrVar) {
        ibt b = ifrVar.t().b();
        j();
        this.a.setBounds(0, 0, ffln.b(Float.intBitsToFloat((int) (ifrVar.b() >> 32))), ffln.b(Float.intBitsToFloat((int) (ifrVar.b() & 4294967295L))));
        try {
            b.l();
            this.a.draw(iav.a(b));
        } finally {
            b.j();
        }
    }

    @Override // defpackage.igq
    protected final void c(float f) {
        this.a.setAlpha(ffmk.i(ffln.b(f * 255.0f), 0, PrivateKeyType.INVALID));
    }

    @Override // defpackage.igq
    protected final void d(ibx ibxVar) {
        this.a.setColorFilter(ibxVar != null ? ibxVar.b : null);
    }

    @Override // defpackage.igq
    protected final void f(kah kahVar) {
        int i;
        kahVar.getClass();
        int ordinal = kahVar.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                throw new ffcd();
            }
        } else {
            i = 0;
        }
        this.a.setLayoutDirection(i);
    }

    @Override // defpackage.hjk
    public final void g() {
        h();
    }

    @Override // defpackage.hjk
    public final void h() {
        Object obj = this.a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.a.setVisible(false, false);
        this.a.setCallback(null);
    }

    @Override // defpackage.hjk
    public final void i() {
        this.a.setCallback((Drawable.Callback) this.d.a());
        this.a.setVisible(true, true);
        Object obj = this.a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    public final int j() {
        return ((Number) this.b.a()).intValue();
    }
}
