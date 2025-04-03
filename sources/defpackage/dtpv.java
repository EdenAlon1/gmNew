package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dtpv {
    private final int a;

    public dtpv(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dtpv) && this.a == ((dtpv) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.a});
    }

    public final String toString() {
        return "java_hash=" + this.a;
    }

    public void a() {
    }
}
