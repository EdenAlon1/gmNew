package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dumm extends qmx {
    public final String a;
    public final long b;

    public dumm(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dumm)) {
            return false;
        }
        dumm dummVar = (dumm) obj;
        return this.b == dummVar.b && Objects.equals(this.a, dummVar.a);
    }

    public final int hashCode() {
        long j = this.b;
        return (((int) (j ^ (j >>> 32))) * 31) + Objects.hashCode(this.a);
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("OS", this.a);
        b.b("versionCode", this.b + (true != duzz.a ? "" : " (.apk's timestamp is used as versionCode for DEV flavor)"));
        return b.toString();
    }
}
