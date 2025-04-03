package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.attachment.video.inlineplayer.InlinePlayerCornersView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxpm implements fbba {
    public static InlinePlayerCornersView a(View view) {
        if (!(view instanceof InlinePlayerCornersView)) {
            throw new IllegalStateException(a.I(view, cxpj.class, "Attempt to inject a View wrapper of type "));
        }
        InlinePlayerCornersView inlinePlayerCornersView = (InlinePlayerCornersView) view;
        inlinePlayerCornersView.getClass();
        return inlinePlayerCornersView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
