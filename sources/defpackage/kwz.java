package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
class kwz extends kwy {
    public kwz(kxh kxhVar, WindowInsets windowInsets) {
        super(kxhVar, windowInsets);
    }

    @Override // defpackage.kwx, defpackage.kxd
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwz)) {
            return false;
        }
        kwz kwzVar = (kwz) obj;
        return Objects.equals(this.a, kwzVar.a) && Objects.equals(this.b, kwzVar.b) && n(this.c, kwzVar.c);
    }

    @Override // defpackage.kxd
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.kxd
    public ktp t() {
        DisplayCutout displayCutout;
        displayCutout = this.a.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new ktp(displayCutout);
    }

    @Override // defpackage.kxd
    public kxh u() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.a.consumeDisplayCutout();
        return kxh.o(consumeDisplayCutout);
    }
}
