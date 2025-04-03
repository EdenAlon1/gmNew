package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.google.android.material.checkbox.MaterialCheckBox;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehcx extends pbt {
    final /* synthetic */ MaterialCheckBox b;

    public ehcx(MaterialCheckBox materialCheckBox) {
        this.b = materialCheckBox;
    }

    @Override // defpackage.pbt
    public final void b(Drawable drawable) {
        ColorStateList colorStateList = this.b.b;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // defpackage.pbt
    public final void c(Drawable drawable) {
        MaterialCheckBox materialCheckBox = this.b;
        ColorStateList colorStateList = materialCheckBox.b;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(materialCheckBox.d, colorStateList.getDefaultColor()));
        }
    }
}
