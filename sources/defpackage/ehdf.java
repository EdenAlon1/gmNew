package defpackage;

import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.Button;
import com.google.android.apps.messaging.R;
import com.google.android.material.chip.Chip;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehdf extends kzw {
    final /* synthetic */ Chip f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehdf(Chip chip, Chip chip2) {
        super(chip2);
        this.f = chip;
    }

    @Override // defpackage.kzw
    protected final void k(List list) {
        list.add(0);
        this.f.j();
    }

    @Override // defpackage.kzw
    protected final void m(kxu kxuVar) {
        kxuVar.p(this.f.g());
        kxuVar.s(this.f.isClickable());
        kxuVar.r(this.f.getAccessibilityClassName());
        kxuVar.R(this.f.getText());
    }

    @Override // defpackage.kzw
    protected final void n(int i, kxu kxuVar) {
        if (i != 1) {
            kxuVar.v("");
            kxuVar.n(Chip.d);
            return;
        }
        Chip chip = this.f;
        CharSequence text = chip.getText();
        kxuVar.v(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, true != TextUtils.isEmpty(text) ? text : "").trim());
        Chip chip2 = this.f;
        RectF c = chip2.c();
        chip2.j.set((int) c.left, (int) c.top, (int) c.right, (int) c.bottom);
        kxuVar.n(chip2.j);
        kxuVar.i(kxr.a);
        kxuVar.x(this.f.isEnabled());
        kxuVar.r(Button.class.getName());
    }

    @Override // defpackage.kzw
    protected final void o(int i, boolean z) {
        if (i == 1) {
            this.f.g = z;
        }
        Chip chip = this.f;
        ehdh ehdhVar = chip.e;
        boolean z2 = chip.g;
        if (ehdhVar.g != null) {
            if (ehdhVar.t(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : ehdh.a)) {
                this.f.refreshDrawableState();
            }
        }
    }

    @Override // defpackage.kzw
    public final boolean s(int i, int i2) {
        if (i2 == 16) {
            if (i == 0) {
                return this.f.performClick();
            }
            if (i == 1) {
                this.f.k();
            }
        }
        return false;
    }
}
