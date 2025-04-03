package defpackage;

import java.nio.ByteBuffer;
import org.tensorflow.lite.task.processor.NearestNeighbor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fivv extends NearestNeighbor {
    private final ByteBuffer a;
    private final float b;

    public fivv(ByteBuffer byteBuffer, float f) {
        if (byteBuffer == null) {
            throw new NullPointerException("Null metadata");
        }
        this.a = byteBuffer;
        this.b = f;
    }

    @Override // org.tensorflow.lite.task.processor.NearestNeighbor
    public final float a() {
        return this.b;
    }

    @Override // org.tensorflow.lite.task.processor.NearestNeighbor
    public final ByteBuffer b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NearestNeighbor) {
            NearestNeighbor nearestNeighbor = (NearestNeighbor) obj;
            if (this.a.equals(nearestNeighbor.b()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(nearestNeighbor.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "NearestNeighbor{metadata=" + this.a.toString() + ", distance=" + this.b + "}";
    }
}
