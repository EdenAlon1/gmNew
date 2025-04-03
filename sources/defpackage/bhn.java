package defpackage;

import android.util.Rational;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhn {
    public static final Rational a = new Rational(4, 3);
    public static final Rational b = new Rational(3, 4);
    public static final Rational c = new Rational(16, 9);
    public static final Rational d = new Rational(9, 16);

    public static boolean a(Size size, Rational rational) {
        return b(size, rational, blz.c);
    }

    public static boolean b(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (blz.a(size) < blz.a(size2)) {
            return false;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i = width % 16;
        if (i == 0) {
            if (height % 16 == 0) {
                return c(Math.max(0, height + (-16)), width, rational) || c(Math.max(0, width + (-16)), height, rational2);
            }
        } else if (i != 0) {
            if (height % 16 != 0) {
                return false;
            }
            return c(width, height, rational2);
        }
        return c(height, width, rational);
    }

    private static boolean c(int i, int i2, Rational rational) {
        ksw.a(i2 % 16 == 0);
        double numerator = (i * rational.getNumerator()) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }
}
