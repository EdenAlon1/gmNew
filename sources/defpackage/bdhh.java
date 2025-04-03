package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdhh {
    public static String a(UUID uuid) {
        if (uuid.toString().isEmpty()) {
            return null;
        }
        return uuid.toString();
    }

    public static UUID b() {
        return UUID.nameUUIDFromBytes(new byte[0]);
    }
}
