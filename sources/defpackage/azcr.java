package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azcr extends crmf {
    public static final azcr a = new azcr(new UUID(42, 42));

    public azcr(UUID uuid) {
        super(uuid);
    }

    public final String a() {
        String uuid = ((UUID) this.b).toString();
        uuid.getClass();
        return uuid;
    }
}
