package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euur implements euuv {
    private final euuw a;
    private final dhri b;

    public euur(euuw euuwVar, dhri dhriVar) {
        this.a = euuwVar;
        this.b = dhriVar;
    }

    @Override // defpackage.euuv
    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    @Override // defpackage.euuv
    public final boolean b(euvd euvdVar) {
        if (!euvdVar.l() || this.a.c(euvdVar)) {
            return false;
        }
        dhri dhriVar = this.b;
        euuz euuzVar = (euuz) euvdVar;
        String str = euuzVar.b;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        dhriVar.b(new euuh(str, euuzVar.d, euuzVar.e));
        return true;
    }
}
