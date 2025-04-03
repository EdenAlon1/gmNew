package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enru extends enrg {
    private static final enrt a = new enrt();

    public enru(ento entoVar) {
        super(entoVar);
    }

    @Deprecated
    public static enru c(String str) {
        enxb.a(!str.isEmpty(), "injected class name is empty");
        return new enru(Cenum.d(str.replace('/', '.')));
    }

    @Override // defpackage.enrg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final enrr a(Level level) {
        boolean m = m(level);
        Cenum.n(k(), level, m);
        return !m ? a : new enrs(this, level);
    }
}
