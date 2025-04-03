package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kzv extends kxx {
    final /* synthetic */ kzw a;

    public kzv(kzw kzwVar) {
        this.a = kzwVar;
    }

    @Override // defpackage.kxx
    public final kxu a(int i) {
        return new kxu(AccessibilityNodeInfo.obtain(this.a.j(i).a));
    }

    @Override // defpackage.kxx
    public final kxu b(int i) {
        int i2 = i == 2 ? this.a.c : this.a.d;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    @Override // defpackage.kxx
    public final boolean d(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        kzw kzwVar = this.a;
        if (i == -1) {
            return kzwVar.b.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            if ((!kzwVar.b.isFocused() && !kzwVar.b.requestFocus()) || (i3 = kzwVar.d) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                kzwVar.r(i3);
            }
            if (i == Integer.MIN_VALUE) {
                return false;
            }
            kzwVar.d = i;
            kzwVar.o(i, true);
            kzwVar.t(i, 8);
            return true;
        }
        if (i2 == 2) {
            return kzwVar.r(i);
        }
        if (i2 != 64) {
            return i2 != 128 ? kzwVar.s(i, i2) : kzwVar.q(i);
        }
        if (!kzwVar.a.isEnabled() || !kzwVar.a.isTouchExplorationEnabled() || (i4 = kzwVar.c) == i) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            kzwVar.q(i4);
        }
        kzwVar.c = i;
        kzwVar.b.invalidate();
        kzwVar.t(i, 32768);
        return true;
    }
}
