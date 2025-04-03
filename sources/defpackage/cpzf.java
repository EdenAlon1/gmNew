package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpzf {
    public static eyee a(UUID uuid) {
        return eyee.x(ByteBuffer.allocate(16).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
    }

    public static UUID b(eyee eyeeVar) {
        ByteBuffer wrap = ByteBuffer.wrap(eyeeVar.I());
        return new UUID(wrap.getLong(), wrap.getLong());
    }
}
