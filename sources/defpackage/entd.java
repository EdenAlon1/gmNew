package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class entd extends entb {
    public entd(ento entoVar) {
        super(entoVar);
    }

    public static entd c(String str) {
        return new entd(Cenum.d(str));
    }

    public static entd p() {
        return new entd(Cenum.d(Cenum.g().b(entd.class)));
    }

    @Override // defpackage.enrg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ensz a(Level level) {
        boolean m = m(level);
        Cenum.n(k(), level, m);
        return !m ? c : new entc(this, level);
    }
}
