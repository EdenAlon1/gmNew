package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum cgye {
    NONE(0),
    ETOUFFEE(1, "E2EE"),
    ETOUFFEE_GROUPS(2, "GROUP_E2EE"),
    MMS_GROUP_UPGRADE_METRICS_COLLECTION(3),
    MULTI_DEVICE(4, "MULTI_DEVICE"),
    TACHYGRAM(5, "TACHYGRAM");

    public static final engw g = engw.p(values());
    public final int h;
    private final String j;

    cgye(int i2) {
        this(i2, null);
    }

    public final long a() {
        return 1 << this.h;
    }

    public final Optional b() {
        return Optional.ofNullable(this.j);
    }

    cgye(int i2, String str) {
        emxf.b(true, "MessagesFeature value should be less than 64 because we are representing a user's features in the remote registrations table using a long as a hash.");
        this.h = i2;
        this.j = str;
    }
}
