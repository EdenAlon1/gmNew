package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axkl {
    public final /* synthetic */ axkm a;

    public axkl(axkm axkmVar) {
        this.a = axkmVar;
    }

    public static final fglt d(axeu axeuVar) {
        int ordinal = axeuVar.ordinal();
        return ordinal != 1 ? ordinal != 2 ? fglt.NOT_ENABLED : fglt.IN_INITIAL_SYNC : fglt.ENABLED;
    }

    @Deprecated
    public static final boolean e(axez axezVar) {
        return axezVar.e || axezVar.q;
    }

    public static final boolean f(axeu axeuVar) {
        return (axeuVar.equals(axeu.UNSPECIFIED_STATUS) || axeuVar.equals(axeu.DISABLED)) ? false : true;
    }

    public static final boolean g(axez axezVar) {
        axeu b = axeu.b(axezVar.l);
        if (b == null) {
            b = axeu.UNSPECIFIED_STATUS;
        }
        if (f(b)) {
            return true;
        }
        axeu b2 = axeu.b(axezVar.r);
        if (b2 == null) {
            b2 = axeu.UNSPECIFIED_STATUS;
        }
        return f(b2);
    }

    public final elfl a() {
        return this.a.k().h(new emwl() { // from class: axkj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(axkl.g((axez) obj));
            }
        }, erpp.a);
    }

    @Deprecated
    public final elfl b() {
        return this.a.k().h(new emwl() { // from class: axki
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(axkl.e((axez) obj));
            }
        }, erpp.a);
    }

    @Deprecated
    public final void c(axeu axeuVar) {
        this.a.l.set(d(axeuVar));
    }
}
