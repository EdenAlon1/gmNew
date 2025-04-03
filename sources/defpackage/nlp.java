package defpackage;

import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nlp {
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public nlp(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = f;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
    }

    public static int a(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return parseInt;
            default:
                luj.f("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                return -1;
        }
    }

    public static Integer b(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            lti.a(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(ermn.a(((parseLong >> 24) & 255) ^ 255), ermn.a(parseLong & 255), ermn.a((parseLong >> 8) & 255), ermn.a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            luj.g("SsaStyle", a.a(str, "Failed to parse color expression: '", "'"), e);
            return null;
        }
    }

    public static boolean c(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            luj.g("SsaStyle", a.a(str, "Failed to parse boolean value: '", "'"), e);
            return false;
        }
    }
}
