package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehof implements ehoh {
    private final ehoh a;
    private final float b;

    public ehof(float f, ehoh ehohVar) {
        while (ehohVar instanceof ehof) {
            ehohVar = ((ehof) ehohVar).a;
            f += ((ehof) ehohVar).b;
        }
        this.a = ehohVar;
        this.b = f;
    }

    @Override // defpackage.ehoh
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehof)) {
            return false;
        }
        ehof ehofVar = (ehof) obj;
        return this.a.equals(ehofVar.a) && this.b == ehofVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
