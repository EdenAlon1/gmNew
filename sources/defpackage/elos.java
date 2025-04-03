package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elos {
    public final elzb a;
    private elzc b;

    public elos(elzb elzbVar) {
        this.a = elzbVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof elos) {
            elos elosVar = (elos) obj;
            elzc elzcVar = elosVar.b;
            if (Objects.equals(null, null) && Objects.equals(this.a, elosVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(null, this.a);
    }
}
