package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpbx {
    public final ByteBuffer a;
    public final MediaCodec.BufferInfo b;

    public dpbx(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.a = byteBuffer;
        this.b = bufferInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpbx)) {
            return false;
        }
        dpbx dpbxVar = (dpbx) obj;
        return ffkj.e(this.a, dpbxVar.a) && ffkj.e(this.b, dpbxVar.b);
    }

    public final int hashCode() {
        ByteBuffer byteBuffer = this.a;
        return ((byteBuffer == null ? 0 : byteBuffer.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "OutputBufferResult(buffer=" + this.a + ", bufferInfo=" + this.b + ")";
    }
}
