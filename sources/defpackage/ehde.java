package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehde extends ViewOutlineProvider {
    final /* synthetic */ Chip a;

    public ehde(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ehdh ehdhVar = this.a.e;
        if (ehdhVar != null) {
            ehdhVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
