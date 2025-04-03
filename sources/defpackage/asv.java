package defpackage;

import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asv extends avu {
    private final bgw a;
    private final long b;
    private final Matrix c;

    public asv(bgw bgwVar, long j, Matrix matrix) {
        if (bgwVar == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.a = bgwVar;
        this.b = j;
        this.c = matrix;
    }

    @Override // defpackage.avu, defpackage.avm
    public final long a() {
        return this.b;
    }

    @Override // defpackage.avu
    public final Matrix b() {
        return this.c;
    }

    @Override // defpackage.avu, defpackage.avm
    public final bgw c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avu) {
            avu avuVar = (avu) obj;
            if (this.a.equals(avuVar.c()) && this.b == avuVar.a()) {
                avuVar.e();
                if (this.c.equals(avuVar.b())) {
                    avuVar.d();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return ((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * (-721379959)) ^ this.c.hashCode()) * 1000003;
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.a + ", timestamp=" + this.b + ", rotationDegrees=0, sensorToBufferTransformMatrix=" + this.c + ", flashState=0}";
    }

    @Override // defpackage.avu
    public final void d() {
    }

    @Override // defpackage.avu
    public final void e() {
    }
}
