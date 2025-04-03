package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeob extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        int height = view.getHeight();
        float min = Math.min(1.0f, Math.abs(view.getTranslationX()) / (view.getWidth() / 3.0f)) * 10.0f * view.getContext().getResources().getDisplayMetrics().density;
        if (min < 1.0f) {
            min = 0.0f;
        }
        outline.setRoundRect(0, 0, width, height, min);
    }
}
