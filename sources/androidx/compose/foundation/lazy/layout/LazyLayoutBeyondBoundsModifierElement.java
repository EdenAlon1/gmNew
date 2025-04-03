package androidx.compose.foundation.lazy.layout;

import defpackage.dqs;
import defpackage.eia;
import defpackage.eif;
import defpackage.eig;
import defpackage.ffkj;
import defpackage.hvh;
import defpackage.ivp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierElement extends ivp<eif> {
    private final eig a;
    private final eia b;
    private final boolean c;
    private final dqs d;

    public LazyLayoutBeyondBoundsModifierElement(eig eigVar, eia eiaVar, boolean z, dqs dqsVar) {
        this.a = eigVar;
        this.b = eiaVar;
        this.c = z;
        this.d = dqsVar;
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ hvh d() {
        return new eif(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.ivp
    public final /* bridge */ /* synthetic */ void e(hvh hvhVar) {
        eif eifVar = (eif) hvhVar;
        eifVar.a = this.a;
        eifVar.b = this.b;
        eifVar.c = this.c;
        eifVar.d = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return ffkj.e(this.a, lazyLayoutBeyondBoundsModifierElement.a) && ffkj.e(this.b, lazyLayoutBeyondBoundsModifierElement.b) && this.c == lazyLayoutBeyondBoundsModifierElement.c && this.d == lazyLayoutBeyondBoundsModifierElement.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode();
    }
}
