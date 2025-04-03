package defpackage;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awtm {
    public static final cfva a = cfvl.m(cfvl.b, "rcs_message_id_regex", "^Mx(.){22,26}");

    public final bdhg a() {
        ekzz f = eleg.f("RcsMessageIdGenerator::generate");
        try {
            UUID randomUUID = UUID.randomUUID();
            ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
            wrap.putLong(randomUUID.getMostSignificantBits());
            wrap.putLong(randomUUID.getLeastSignificantBits());
            bdhg a2 = bdhg.a("Mx" + Base64.encodeToString(wrap.array(), 11).replace('_', '='));
            f.close();
            return a2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
