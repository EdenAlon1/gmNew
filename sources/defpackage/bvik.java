package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvik extends dtyx {
    public bvik(String[] strArr) {
        super("parent_disallowed_conversations", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bvij b() {
        l();
        return new bvij(this.a.a());
    }

    public final void c(bvib... bvibVarArr) {
        int a = bvin.b().a();
        Integer.valueOf(a).getClass();
        for (bvib bvibVar : bvibVarArr) {
            if (((Integer) bvin.b.getOrDefault(bvibVar.toString(), -1)).intValue() > a) {
                dtub.w("columnReference.toString()", a);
            }
        }
        m(bvibVarArr);
    }
}
