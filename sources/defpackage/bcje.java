package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcje extends dtyx {
    public bcje(String[] strArr) {
        super("participants_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bcjd b() {
        l();
        return new bcjd(this.a.a());
    }

    public final void c(bcic... bcicVarArr) {
        int intValue = bcjh.c().intValue();
        for (bcic bcicVar : bcicVarArr) {
            if (((Integer) bcjh.b.getOrDefault(bcicVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(bcicVarArr);
    }
}
