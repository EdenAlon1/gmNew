package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzdq {
    public static UUID a(eyee eyeeVar) {
        ByteBuffer wrap = ByteBuffer.wrap(eyeeVar.I());
        return new UUID(wrap.getLong(), wrap.getLong());
    }
}
