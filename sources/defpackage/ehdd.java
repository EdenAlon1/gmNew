package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehdd extends ehmv {
    final /* synthetic */ Chip a;

    public ehdd(Chip chip) {
        this.a = chip;
    }

    @Override // defpackage.ehmv
    public final void b(Typeface typeface, boolean z) {
        Chip chip = this.a;
        ehdh ehdhVar = chip.e;
        chip.setText(ehdhVar.o ? ehdhVar.d : chip.getText());
        this.a.requestLayout();
        this.a.invalidate();
    }

    @Override // defpackage.ehmv
    public final void a(int i) {
    }
}
