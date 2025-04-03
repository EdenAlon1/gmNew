package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eald {
    public static final eald a = new eald();

    private eald() {
    }

    public final ealc a(eafl eaflVar) {
        eaflVar.getClass();
        if (eaflVar.g()) {
            return ealc.b;
        }
        if (eaflVar.h()) {
            entd entdVar = ealc.a;
            Throwable d = eaflVar.d();
            if (d != null) {
                return new ealc(2, d);
            }
            throw new IllegalStateException("Required value was null.");
        }
        entd entdVar2 = ealc.a;
        Throwable d2 = eaflVar.d();
        if (d2 != null) {
            return new ealc(3, d2);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
