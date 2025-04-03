package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dktn {
    public final String a;

    public dktn(String str) {
        this.a = str;
    }

    public static dktn a(String str) {
        return new dktn(String.format("%s:[%s]", str, UUID.randomUUID().toString().substring(0, 13)));
    }

    public final dktn b(String str) {
        return new dktn(this.a + ">" + str);
    }

    public final String toString() {
        return this.a;
    }

    public dktn(String str, Object... objArr) {
        this(String.format(str, objArr));
    }
}
