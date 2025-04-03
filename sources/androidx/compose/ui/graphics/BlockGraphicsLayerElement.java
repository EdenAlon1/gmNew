package androidx.compose.ui.graphics;

import defpackage.ffji;
import defpackage.hvh;
import defpackage.ibn;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class BlockGraphicsLayerElement extends ivp<ibn> {
    private final ffji a;

    public BlockGraphicsLayerElement(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new ibn(this.a);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        ibn ibnVar = (ibn) hvhVar;
        ibnVar.a = this.a;
        ibnVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && this.a == ((BlockGraphicsLayerElement) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
