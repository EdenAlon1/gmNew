package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecfs {
    private static final int[] h = new int[0];
    private static final String[] i = new String[0];
    public final long a;
    public final String b;
    public final String c;
    public final int d;
    public final int[] e;
    public final String[] f;
    public final ecfr g;

    public ecfs(String str, String str2, int i2, long j, int[] iArr, String[] strArr, ecfr ecfrVar) {
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.a = j;
        this.e = iArr;
        this.f = strArr;
        this.g = ecfrVar;
    }

    public static boolean a(Object obj) {
        return obj == null || (obj instanceof ecgj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecfs)) {
            return false;
        }
        ecfs ecfsVar = (ecfs) obj;
        return Objects.equals(this.b, ecfsVar.b) && Objects.equals(this.c, ecfsVar.c) && this.d == ecfsVar.d && this.a == ecfsVar.a && Arrays.equals(this.e, ecfsVar.e) && Arrays.equals(this.f, ecfsVar.f) && Objects.equals(this.g, ecfsVar.g);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, Integer.valueOf(this.d), Long.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), this.g);
    }

    public ecfs(String str, String str2, int i2, long j, ecfr ecfrVar) {
        this(str, str2, i2, j, h, i, ecfrVar);
    }
}
