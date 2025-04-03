package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cugt {
    public static final eyee a(String str) {
        str.getClass();
        UUID fromString = UUID.fromString(str);
        return eyee.x(ByteBuffer.allocate(16).putLong(fromString.getMostSignificantBits()).putLong(fromString.getLeastSignificantBits()).array());
    }
}
