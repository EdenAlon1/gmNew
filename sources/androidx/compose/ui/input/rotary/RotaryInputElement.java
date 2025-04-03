package androidx.compose.ui.input.rotary;

import defpackage.ffji;
import defpackage.hvh;
import defpackage.iml;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RotaryInputElement extends ivp<iml> {
    private final ffji a;
    private final ffji b = null;

    public RotaryInputElement(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new iml(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ((iml) hvhVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        if (this.a != rotaryInputElement.a) {
            return false;
        }
        ffji ffjiVar = rotaryInputElement.b;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
