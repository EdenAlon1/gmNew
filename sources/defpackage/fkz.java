package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkz {
    private final Map a;

    public fkz(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fkz) {
            return ffkj.e(this.a, ((fkz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.a + ')';
    }
}
