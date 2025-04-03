package defpackage;

import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdhj {
    public static final Optional a = Optional.empty();

    public static Optional a(String str) {
        return str == null ? a : Optional.of(UUID.fromString(str));
    }

    public static String b(Optional optional) {
        if (optional == null || optional.isEmpty()) {
            return null;
        }
        return ((UUID) optional.get()).toString();
    }
}
