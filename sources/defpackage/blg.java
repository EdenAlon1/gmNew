package defpackage;

import android.util.Rational;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
final class blg {
    public final Rational a;
    public final boolean b;
    private final int c;
    private final int d;

    public blg(bcq bcqVar, Rational rational) {
        this.c = bcqVar.b();
        this.d = bcqVar.a();
        this.a = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.b = z;
    }

    public final Size a(bet betVar) {
        int B = betVar.B(0);
        Size N = betVar.N();
        if (N != null) {
            int a = bhp.a(bhp.b(B), this.c, this.d == 1);
            if (a == 90 || a == 270) {
                return new Size(N.getHeight(), N.getWidth());
            }
        }
        return N;
    }
}
