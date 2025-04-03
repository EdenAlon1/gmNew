package androidx.compose.foundation;

import androidx.car.app.model.Alert;
import defpackage.dhn;
import defpackage.dhw;
import defpackage.dhx;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;
import defpackage.jzq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MarqueeModifierElement extends ivp<dhw> {
    private final int d;
    private final dhx g;
    private final int a = Alert.DURATION_SHOW_INDEFINITELY;
    private final int b = 0;
    private final int c = 1200;
    private final float f = 30.0f;

    public MarqueeModifierElement(int i, dhx dhxVar) {
        this.d = i;
        this.g = dhxVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new dhw(this.d, this.g);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        dhw dhwVar = (dhw) hvhVar;
        dhwVar.f.b(this.g);
        dhwVar.g.b(new dhn());
        int i = dhwVar.a;
        int i2 = this.d;
        if (i == Integer.MAX_VALUE && dhwVar.b == 1200 && dhwVar.c == i2 && jzq.b(dhwVar.d, 30.0f)) {
            return;
        }
        dhwVar.a = Alert.DURATION_SHOW_INDEFINITELY;
        dhwVar.b = 1200;
        dhwVar.c = i2;
        dhwVar.d = 30.0f;
        dhwVar.l();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarqueeModifierElement)) {
            return false;
        }
        MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
        int i = marqueeModifierElement.a;
        int i2 = marqueeModifierElement.b;
        if (!dhn.a(0)) {
            return false;
        }
        int i3 = marqueeModifierElement.c;
        if (this.d != marqueeModifierElement.d || !ffkj.e(this.g, marqueeModifierElement.g)) {
            return false;
        }
        float f = marqueeModifierElement.f;
        return jzq.b(30.0f, 30.0f);
    }

    public final int hashCode() {
        return ((((this.d - 2147476239) * 31) + hashCode()) * 31) + Float.floatToIntBits(30.0f);
    }

    public final String toString() {
        return "MarqueeModifierElement(iterations=2147483647, animationMode=" + ((Object) dhn.b()) + ", delayMillis=1200, initialDelayMillis=" + this.d + ", spacing=" + this.g + ", velocity=" + ((Object) jzq.a(30.0f)) + ')';
    }
}
