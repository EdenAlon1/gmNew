package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajvn {
    public final UUID a;

    public ajvn(UUID uuid) {
        this.a = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajvn) && ffkj.e(this.a, ((ajvn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "D2DRestoreCompleteEvent(sessionId=" + this.a + ")";
    }
}
