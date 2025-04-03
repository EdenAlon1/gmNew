package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmt extends ViewOutlineProvider {
    final /* synthetic */ dwna a;

    public dwmt(dwna dwnaVar) {
        this.a = dwnaVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        this.a.h.getOutlineProvider().getOutline(this.a.h, outline);
    }
}
