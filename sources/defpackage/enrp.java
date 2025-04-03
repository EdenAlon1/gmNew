package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enrp extends enrg {
    static final enro a = new enro();

    public enrp(ento entoVar) {
        super(entoVar);
    }

    public static enrp c() {
        return new enrp(Cenum.d(Cenum.g().b(enrp.class)));
    }

    @Override // defpackage.enrg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final enrm a(Level level) {
        boolean m = m(level);
        Cenum.n(k(), level, m);
        return !m ? a : new enrn(this, level);
    }
}
