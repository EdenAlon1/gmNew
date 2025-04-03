package defpackage;

import j$.util.Objects;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfs {
    private final boolean a;
    private final Set b;
    private final Set c;

    public bfs(boolean z, Set set, Set set2) {
        this.a = z;
        this.b = set == null ? Collections.EMPTY_SET : new HashSet(set);
        this.c = set2 == null ? Collections.EMPTY_SET : new HashSet(set2);
    }

    public final boolean a(Class cls, boolean z) {
        if (this.b.contains(cls)) {
            return true;
        }
        return !this.c.contains(cls) && this.a && z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bfs)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        bfs bfsVar = (bfs) obj;
        return this.a == bfsVar.a && Objects.equals(this.b, bfsVar.b) && Objects.equals(this.c, bfsVar.c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.a + ", forceEnabledQuirks=" + this.b + ", forceDisabledQuirks=" + this.c + '}';
    }
}
