package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owi {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public owi(String str, String str2, boolean z, int i, String str3, int i2) {
        boolean I;
        boolean I2;
        int i3;
        boolean I3;
        boolean I4;
        boolean I5;
        boolean I6;
        boolean I7;
        boolean I8;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        I = ffpc.I(upperCase, "INT", false);
        if (I) {
            i3 = 3;
        } else {
            I2 = ffpc.I(upperCase, "CHAR", false);
            int i4 = 2;
            if (!I2) {
                I3 = ffpc.I(upperCase, "CLOB", false);
                if (!I3) {
                    I4 = ffpc.I(upperCase, "TEXT", false);
                    if (!I4) {
                        I5 = ffpc.I(upperCase, "BLOB", false);
                        if (I5) {
                            i3 = 5;
                        } else {
                            I6 = ffpc.I(upperCase, "REAL", false);
                            i4 = 4;
                            if (!I6) {
                                I7 = ffpc.I(upperCase, "FLOA", false);
                                if (!I7) {
                                    I8 = ffpc.I(upperCase, "DOUB", false);
                                    if (!I8) {
                                        i3 = 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i3 = i4;
        }
        this.g = i3;
    }

    public final boolean a() {
        return this.d > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owi)) {
            return false;
        }
        owi owiVar = (owi) obj;
        if (a() != owiVar.a() || !ffkj.e(this.a, owiVar.a) || this.c != owiVar.c) {
            return false;
        }
        String str = this.e;
        String str2 = owiVar.e;
        if (this.f == 1 && owiVar.f == 2 && str != null && !owo.e(str, str2)) {
            return false;
        }
        if (this.f == 2 && owiVar.f == 1 && str2 != null && !owo.e(str2, str)) {
            return false;
        }
        if (this.f == owiVar.f) {
            if (str != null) {
                if (!owo.e(str, str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
        }
        return this.g == owiVar.g;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d;
    }

    public final String toString() {
        String c;
        String l;
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        c = ffpc.c(sb.toString(), "|");
        l = ffno.l(ffno.i(ffpc.H(c), new ffpg()), "\n", 62);
        return l;
    }
}
