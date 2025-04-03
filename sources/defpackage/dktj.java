package defpackage;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dktj {
    public static bdhg a() {
        return bdhg.a(b());
    }

    public static String b() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        return "Ms".concat(String.valueOf(Base64.encodeToString(wrap.array(), 11).replace('_', '=')));
    }
}
