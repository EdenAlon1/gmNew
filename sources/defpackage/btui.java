package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btui extends dtyx {
    public btui(String[] strArr) {
        super("message_captions", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btuh b() {
        l();
        return new btuh(this.a.a());
    }

    public final void c(bttx... bttxVarArr) {
        int a = btul.b().a();
        Integer.valueOf(a).getClass();
        for (bttx bttxVar : bttxVarArr) {
            if (((Integer) btul.b.getOrDefault(bttxVar.toString(), -1)).intValue() > a) {
                dtub.w("columnReference.toString()", a);
            }
        }
        m(bttxVarArr);
    }
}
