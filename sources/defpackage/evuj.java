package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evuj implements Serializable, eyge, evug, evui {
    public static final evuj sm = new evuj(-1);
    private final int sn;

    public evuj(int i) {
        this.sn = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != sm) {
            return this.sn;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(a());
    }
}
