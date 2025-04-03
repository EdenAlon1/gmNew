package androidx.compose.ui.input.key;

import defpackage.ffji;
import defpackage.hvh;
import defpackage.ijc;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class KeyInputElement extends ivp<ijc> {
    private final ffji a;
    private final ffji b;

    public KeyInputElement(ffji ffjiVar, ffji ffjiVar2) {
        this.a = ffjiVar;
        this.b = ffjiVar2;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new ijc(this.a, this.b);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ijc ijcVar = (ijc) hvhVar;
        ijcVar.a = this.a;
        ijcVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.a == keyInputElement.a && this.b == keyInputElement.b;
    }

    public final int hashCode() {
        ffji ffjiVar = this.a;
        int hashCode = ffjiVar != null ? ffjiVar.hashCode() : 0;
        ffji ffjiVar2 = this.b;
        return (hashCode * 31) + (ffjiVar2 != null ? ffjiVar2.hashCode() : 0);
    }
}
