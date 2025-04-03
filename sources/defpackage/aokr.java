package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aokr {
    public final String a;

    public aokr(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aokr) {
            return Objects.equals(this.a, ((aokr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return emxe.b(this.a);
    }
}
