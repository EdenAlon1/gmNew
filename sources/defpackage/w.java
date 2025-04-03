package defpackage;

import java.text.Format;

/* compiled from: PG */
/* loaded from: classes.dex */
final class w {
    final int a;
    final String b;
    final Number c;
    final double d;
    int e;
    Format f;
    String g;
    boolean h;

    public w(int i, String str, Number number, double d) {
        this.a = i;
        this.b = str;
        if (d == eobe.a) {
            this.c = number;
        } else {
            this.c = Double.valueOf(number.doubleValue() - d);
        }
        this.d = d;
    }

    public final String toString() {
        throw new AssertionError("PluralSelectorContext being formatted, rather than its number");
    }
}
