package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class kxa extends kwz {
    private kpt d;
    private kpt e;
    private kpt h;

    public kxa(kxh kxhVar, WindowInsets windowInsets) {
        super(kxhVar, windowInsets);
        this.d = null;
        this.e = null;
        this.h = null;
    }

    @Override // defpackage.kwx, defpackage.kxd
    public kxh e(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.a.inset(i, i2, i3, i4);
        return kxh.o(inset);
    }

    @Override // defpackage.kxd
    public kpt v() {
        Insets mandatorySystemGestureInsets;
        if (this.e == null) {
            mandatorySystemGestureInsets = this.a.getMandatorySystemGestureInsets();
            this.e = kpt.e(mandatorySystemGestureInsets);
        }
        return this.e;
    }

    @Override // defpackage.kxd
    public kpt w() {
        Insets systemGestureInsets;
        if (this.d == null) {
            systemGestureInsets = this.a.getSystemGestureInsets();
            this.d = kpt.e(systemGestureInsets);
        }
        return this.d;
    }

    @Override // defpackage.kxd
    public kpt x() {
        Insets tappableElementInsets;
        if (this.h == null) {
            tappableElementInsets = this.a.getTappableElementInsets();
            this.h = kpt.e(tappableElementInsets);
        }
        return this.h;
    }

    @Override // defpackage.kwy, defpackage.kxd
    public void r(kpt kptVar) {
    }
}
