package defpackage;

import com.google.android.apps.messaging.shared.util.p2p.ClassificationResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class ctil extends ClassificationResult {
    public final float a;
    public final String b;
    public final int c;

    public ctil(int i, float f, String str) {
        this.c = i;
        this.a = f;
        if (str == null) {
            throw new NullPointerException("Null intent");
        }
        this.b = str;
    }

    @Override // com.google.android.apps.messaging.shared.util.p2p.ClassificationResult
    public final float a() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.shared.util.p2p.ClassificationResult
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.apps.messaging.shared.util.p2p.ClassificationResult
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClassificationResult) {
            ClassificationResult classificationResult = (ClassificationResult) obj;
            if (this.c == classificationResult.c() && Float.floatToIntBits(this.a) == Float.floatToIntBits(classificationResult.a()) && this.b.equals(classificationResult.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ClassificationResult{label=" + ctir.a(this.c) + ", score=" + this.a + ", intent=" + this.b + "}";
    }
}
