package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aezg extends aezy {
    private final SuperSortLabel a;
    private final float b;
    private final String c;

    public aezg(SuperSortLabel superSortLabel, float f, String str) {
        if (superSortLabel == null) {
            throw new NullPointerException("Null label");
        }
        this.a = superSortLabel;
        this.b = f;
        this.c = str;
    }

    @Override // defpackage.aezy
    public final float a() {
        return this.b;
    }

    @Override // defpackage.aezy
    public final SuperSortLabel b() {
        return this.a;
    }

    @Override // defpackage.aezy
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aezy) {
            aezy aezyVar = (aezy) obj;
            if (this.a.equals(aezyVar.b()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(aezyVar.a()) && this.c.equals(aezyVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "MappingResult{label=" + this.a.toString() + ", score=" + this.b + ", intent=" + this.c + "}";
    }
}
