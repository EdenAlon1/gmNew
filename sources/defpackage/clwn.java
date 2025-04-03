package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clwn implements clwo {
    public final ffbr a;
    public final ffbr b;
    private final ffbr c;
    private final ffsk d;

    public clwn(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar4.getClass();
        ffskVar.getClass();
        this.c = ffbrVar;
        this.a = ffbrVar2;
        this.b = ffbrVar3;
        this.d = ffskVar;
    }

    public static final String d(djrj djrjVar) {
        String str = djrjVar.a;
        if (str.length() <= 4) {
            return str;
        }
        String substring = str.substring(0, 4);
        substring.getClass();
        String substring2 = str.substring(4, str.length());
        substring2.getClass();
        return substring.concat(new ffpa("[0-9]").a(substring2, "X"));
    }

    private final void g(int i, djrm djrmVar) {
        axol.k(this.d, null, new clwm(this, i, djrmVar, null), 3);
    }

    @Override // defpackage.clwo
    public final void a(djrm djrmVar) {
        g(16, djrmVar);
    }

    @Override // defpackage.clwo
    public final void b(djrm djrmVar) {
        g(15, djrmVar);
    }

    public final void c(eqyh eqyhVar) {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eoluVar.getClass();
        eogy.g(eolt.RCS_PROVISIONING_MANAGER_EVENT, eoluVar);
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.cc = eqyhVar;
        eolvVar.h |= 16;
        eyfq builder = eogy.a(eoluVar).toBuilder();
        builder.getClass();
        ((akyb) this.c.b()).a().h((eolu) builder, alal.LOG_SPEC_RCS_PROVISIONING_MANAGER_EVENTS);
    }

    @Override // defpackage.clwo
    public final void e(int i, Integer num, djrj djrjVar, boolean z) {
        axol.k(this.d, null, new clwk(this, djrjVar, num, z, i, null), 3);
    }

    @Override // defpackage.clwo
    public final void f(int i, Integer num, djrj djrjVar, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        axol.k(this.d, null, new clwl(this, djrjVar, num, str, str2, z, i, null), 3);
    }
}
