package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diln {
    public int a;
    public boolean b = true;
    public boolean c = false;

    public static String a(boolean z) {
        return z ? "yes" : "no";
    }

    public static boolean b(String str) {
        return str.equals("1") || str.equals("yes") || str.equals("true");
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof diln)) {
            return false;
        }
        diln dilnVar = (diln) obj;
        return this.b == dilnVar.b && this.c == dilnVar.c && this.a == dilnVar.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.a)});
    }

    public final String toString() {
        return "User count: " + this.a + ", locked: " + this.c + ", active: " + this.b;
    }
}
