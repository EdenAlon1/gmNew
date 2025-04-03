package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efg implements efh {
    private final int a = 3;

    @Override // defpackage.efh
    public final List a(jzn jznVar, int i, int i2) {
        return efo.a(i, 3, i2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof efg)) {
            return false;
        }
        int i = ((efg) obj).a;
        return true;
    }

    public final int hashCode() {
        return -3;
    }
}
