package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class esrq extends emwd {
    private final emwd a;

    public esrq(emwd emwdVar) {
        this.a = emwdVar;
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        esqx esqxVar;
        fchr fchrVar = (fchr) obj;
        esqk esqkVar = new esqk();
        esqkVar.a(esqx.b);
        if ((fchrVar.b & 1) != 0) {
            fcek fcekVar = fchrVar.c;
            if (fcekVar == null) {
                fcekVar = fcek.a;
            }
            if (fcekVar == null) {
                throw new NullPointerException("Null id");
            }
            esqkVar.a = fcekVar;
        }
        emwd m = this.a.m();
        int i = fchrVar.d;
        fgtf fgtfVar = i != 0 ? i != 1 ? i != 2 ? null : fgtf.REGULAR : fgtf.ADMIN : fgtf.DEFAULT_ROLE;
        if (fgtfVar == null) {
            fgtfVar = fgtf.UNRECOGNIZED;
        }
        esqkVar.a((esqx) m.fP(fgtfVar));
        fcek fcekVar2 = esqkVar.a;
        if (fcekVar2 != null && (esqxVar = esqkVar.b) != null) {
            return new esql(fcekVar2, esqxVar);
        }
        StringBuilder sb = new StringBuilder();
        if (esqkVar.a == null) {
            sb.append(" id");
        }
        if (esqkVar.b == null) {
            sb.append(" role");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        esqy esqyVar = (esqy) obj;
        fchq fchqVar = (fchq) fchr.a.createBuilder();
        fcek b = esqyVar.b();
        fchqVar.copyOnWrite();
        fchr fchrVar = (fchr) fchqVar.instance;
        fchrVar.c = b;
        fchrVar.b |= 1;
        fgtf fgtfVar = (fgtf) this.a.fP(esqyVar.a());
        fchqVar.copyOnWrite();
        ((fchr) fchqVar.instance).d = fgtfVar.a();
        return (fchr) fchqVar.build();
    }
}
