package defpackage;

import android.graphics.RectF;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehpk extends ehpi {
    private boolean f = false;
    public float e = 0.0f;

    public ehpk(View view) {
        e(view);
    }

    private void e(View view) {
        view.setOutlineProvider(new ehpj(this));
    }

    @Override // defpackage.ehpi
    public final void a(View view) {
        boolean z;
        ehow ehowVar;
        RectF rectF;
        ehow ehowVar2 = this.b;
        float f = 0.0f;
        if (ehowVar2 != null && (rectF = this.c) != null) {
            f = ehowVar2.g.a(rectF);
        }
        this.e = f;
        if (this.c.isEmpty() || (ehowVar = this.b) == null || !ehowVar.g(this.c)) {
            this.c.isEmpty();
            z = false;
        } else {
            z = true;
        }
        this.f = z;
        view.setClipToOutline(!d());
        if (d()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // defpackage.ehpi
    public final boolean d() {
        return !this.f || this.a;
    }
}
