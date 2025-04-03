package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum byyt {
    UNARCHIVED(0),
    ARCHIVED(1),
    KEEP_ARCHIVED(2),
    SPAM_FOLDER(3),
    BLOCKED_FOLDER(4),
    CROSS_COUNTRY_FOLDER(5);

    public static final Set g = enip.s(SPAM_FOLDER, BLOCKED_FOLDER, CROSS_COUNTRY_FOLDER);
    public final int h;

    byyt(int i2) {
        this.h = i2;
    }

    public static byyt a(int i2) {
        for (byyt byytVar : values()) {
            if (byytVar.h == i2) {
                return byytVar;
            }
        }
        throw new IllegalArgumentException(a.h(i2, "Invalid ArchiveStatus value: "));
    }

    public static byyt b(boolean z) {
        return z ? ARCHIVED : UNARCHIVED;
    }

    public static int i(byyt byytVar) {
        if (byytVar != null) {
            int ordinal = byytVar.ordinal();
            if (ordinal == 0) {
                return 3;
            }
            if (ordinal == 1) {
                return 4;
            }
            if (ordinal == 2) {
                return 5;
            }
            if (ordinal == 3) {
                return 6;
            }
            if (ordinal == 4) {
                return 7;
            }
            if (ordinal == 5) {
                return 8;
            }
        }
        return 2;
    }

    public final boolean d() {
        return this != UNARCHIVED;
    }

    public final boolean e() {
        return this == BLOCKED_FOLDER;
    }

    public final boolean f() {
        return g.contains(this);
    }

    public final boolean g() {
        return this == SPAM_FOLDER;
    }

    public final boolean h() {
        return this.h >= KEEP_ARCHIVED.h;
    }
}
