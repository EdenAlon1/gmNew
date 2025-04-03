package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehpj extends ViewOutlineProvider {
    final /* synthetic */ ehpk a;

    public ehpj(ehpk ehpkVar) {
        this.a = ehpkVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ehpk ehpkVar = this.a;
        if (ehpkVar.b == null || ehpkVar.c.isEmpty()) {
            return;
        }
        outline.setRoundRect((int) this.a.c.left, (int) this.a.c.top, (int) this.a.c.right, (int) this.a.c.bottom, this.a.e);
    }
}
