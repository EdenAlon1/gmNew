package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etsi {
    public static final eujt a = eujt.b(new byte[0]);

    public static final eujt a(int i) {
        return eujt.b(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final eujt b(int i) {
        return eujt.b(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
