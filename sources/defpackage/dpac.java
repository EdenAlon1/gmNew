package defpackage;

import java.util.Arrays;

/* compiled from: PG */
@ffiv
/* loaded from: classes4.dex */
public final class dpac {
    public final String[] a;

    public final boolean equals(Object obj) {
        return (obj instanceof dpac) && ffkj.e(this.a, ((dpac) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "MetadataProjection(names=" + Arrays.toString(this.a) + ")";
    }
}
