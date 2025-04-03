package defpackage;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhm implements Comparator {
    private final Rational a;
    private final RectF b;
    private final Rational c;

    public bhm(Rational rational, Rational rational2) {
        this.a = rational;
        this.c = rational2 == null ? new Rational(4, 3) : rational2;
        this.b = a(rational);
    }

    private final RectF a(Rational rational) {
        if (rational.floatValue() == this.c.floatValue()) {
            return new RectF(0.0f, 0.0f, this.c.getNumerator(), this.c.getDenominator());
        }
        if (rational.floatValue() > this.c.floatValue()) {
            return new RectF(0.0f, 0.0f, this.c.getNumerator(), (rational.getDenominator() * this.c.getNumerator()) / rational.getNumerator());
        }
        return new RectF(0.0f, 0.0f, (rational.getNumerator() * this.c.getDenominator()) / rational.getDenominator(), this.c.getDenominator());
    }

    private static final float b(RectF rectF) {
        return rectF.width() * rectF.height();
    }

    private static final float c(RectF rectF, RectF rectF2) {
        float width = rectF.width() < rectF2.width() ? rectF.width() : rectF2.width();
        if (rectF.height() >= rectF2.height()) {
            rectF = rectF2;
        }
        return width * rectF.height();
    }

    private static final boolean d(RectF rectF, RectF rectF2) {
        return rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Rational rational = (Rational) obj;
        Rational rational2 = (Rational) obj2;
        if (rational.equals(rational2)) {
            return 0;
        }
        RectF a = a(rational);
        RectF a2 = a(rational2);
        boolean d = d(a, this.b);
        boolean d2 = d(a2, this.b);
        if (d && d2) {
            return (int) Math.signum(b(a) - b(a2));
        }
        if (d) {
            return -1;
        }
        if (d2) {
            return 1;
        }
        return -((int) Math.signum(c(a, this.b) - c(a2, this.b)));
    }
}
