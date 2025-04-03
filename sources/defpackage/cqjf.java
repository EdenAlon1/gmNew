package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqjf {
    public static final eyee a(UUID uuid) {
        return eyee.x(c(uuid));
    }

    public static final UUID b(eyee eyeeVar) {
        eyeeVar.getClass();
        if (!((Boolean) cqje.a.e()).booleanValue() || eyeeVar.d() == 16) {
            ByteBuffer wrap = ByteBuffer.wrap(eyeeVar.I());
            return new UUID(wrap.getLong(), wrap.getLong());
        }
        throw new IllegalArgumentException("The input to UUID must have 16 bytes. It had bytes.size()=" + eyeeVar.d());
    }

    public static final byte[] c(UUID uuid) {
        byte[] array = ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array();
        array.getClass();
        return array;
    }
}
