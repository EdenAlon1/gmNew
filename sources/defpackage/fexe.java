package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fexe {
    public static final fecz a(final ffhd ffhdVar, final febs febsVar, final ffjm ffjmVar) {
        if (febsVar.a == febr.UNARY) {
            final ffji ffjiVar = new ffji() { // from class: fewu
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    ffxx ffxxVar = (ffxx) obj;
                    ffxxVar.getClass();
                    return new fexd(fewp.a(ffxxVar, febs.this), ffjmVar);
                }
            };
            return new fecz(febsVar, new fecv() { // from class: fewt
                @Override // defpackage.fecv
                public final fect a(final fecu fecuVar, febo feboVar) {
                    Object a = fewk.a.a();
                    a.getClass();
                    ffhd plus = ffhd.this.plus((ffhd) a);
                    fdyn k = fdyn.k();
                    k.getClass();
                    ffhd plus2 = plus.plus(new fewm(k));
                    fews fewsVar = new fews(new ffix() { // from class: fewv
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            return Boolean.valueOf(fecu.this.h());
                        }
                    });
                    ffwm a2 = ffwp.a(1, 0, 6);
                    return new feww(ffqy.d(ffsl.b(plus2), null, null, new fexa(ffjiVar, new fgcp(new fewx(new AtomicBoolean(false), fecuVar, a2, null)), fewsVar, fecuVar, null), 3), a2, fecuVar, fewsVar);
                }
            });
        }
        Objects.toString(febsVar);
        throw new IllegalArgumentException("Expected a unary method descriptor but got ".concat(febsVar.toString()));
    }
}
