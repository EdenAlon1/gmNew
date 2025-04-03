package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehpl extends ViewOutlineProvider {
    final /* synthetic */ ehpm a;

    public ehpl(ehpm ehpmVar) {
        this.a = ehpmVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (this.a.d.isEmpty()) {
            return;
        }
        outline.setPath(this.a.d);
    }
}
