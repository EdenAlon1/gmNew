package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehpm extends ehpi {
    public ehpm(View view) {
        e(view);
    }

    private void e(View view) {
        view.setOutlineProvider(new ehpl(this));
    }

    @Override // defpackage.ehpi
    public final void a(View view) {
        view.setClipToOutline(!this.a);
        if (this.a) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // defpackage.ehpi
    public final boolean d() {
        return this.a;
    }
}
