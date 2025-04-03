package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igk extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view instanceof igl) {
            int i = igl.h;
            Outline outline2 = ((igl) view).b;
            if (outline2 != null) {
                outline.set(outline2);
            }
        }
    }
}
