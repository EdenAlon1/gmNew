package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctvf {
    public final int a;

    public ctvf(int i) {
        this.a = i;
    }

    public final boolean a() {
        return this.a == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof ctvf ? this.a == ((ctvf) obj).a && Objects.equals(null, null) : (obj instanceof Integer) && this.a == ((Integer) obj).intValue();
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }
}
