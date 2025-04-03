package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejhi implements eave {
    private final emxc a;

    public ejhi(emxc emxcVar) {
        this.a = emxcVar;
    }

    public static final String i(eixn eixnVar) {
        return String.valueOf(((eisz) eixnVar.a()).a);
    }

    @Override // defpackage.eave
    public final /* synthetic */ eavi a(Object obj) {
        eyfw checkIsLite;
        eixn eixnVar = (eixn) obj;
        if (!g(eixnVar)) {
            return null;
        }
        eixz b = eixnVar.b();
        checkIsLite = eyfy.checkIsLite(ejbv.a);
        b.b(checkIsLite);
        Object l = b.r.l(checkIsLite.d);
        ejbo ejboVar = (ejbo) (l == null ? checkIsLite.b : checkIsLite.c(l));
        boolean z = ejboVar.c;
        int a = ejbn.a(ejboVar.e);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        int i2 = i != 0 ? i != 1 ? 3 : 2 : 1;
        eavf eavfVar = new eavf();
        eavfVar.a(false);
        eavfVar.c = 1;
        eavfVar.a(z);
        eavfVar.c = i2;
        if (eavfVar.b == 1) {
            return new eavg(eavfVar.a, i2);
        }
        StringBuilder sb = new StringBuilder();
        if (eavfVar.b == 0) {
            sb.append(" isG1User");
        }
        if (eavfVar.c == 0) {
            sb.append(" isUnicornUser");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eave
    public final /* bridge */ /* synthetic */ String b(Object obj) {
        return i((eixn) obj);
    }

    @Override // defpackage.eave
    public final /* bridge */ /* synthetic */ String c(Object obj) {
        return ((eixn) obj).b().g;
    }

    @Override // defpackage.eave
    public final /* bridge */ /* synthetic */ String d(Object obj) {
        return ((eixn) obj).b().h;
    }

    @Override // defpackage.eave
    public final /* bridge */ /* synthetic */ String e(Object obj) {
        return ((eixn) obj).b().d;
    }

    @Override // defpackage.eave
    public final /* bridge */ /* synthetic */ String f(Object obj) {
        eixn eixnVar = (eixn) obj;
        if ((eixnVar.b().b & 4) != 0) {
            return eixnVar.b().e;
        }
        return null;
    }

    @Override // defpackage.eave
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean g(eixn eixnVar) {
        return ((String) ((emxn) this.a).a).equals(eixnVar.b().k);
    }
}
