package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbos extends dtyx {
    public bbos(String[] strArr) {
        super("conversations_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bbor b() {
        l();
        return new bbor(this.a.a());
    }

    public final void c(bbno... bbnoVarArr) {
        int intValue = bbov.c().intValue();
        for (bbno bbnoVar : bbnoVarArr) {
            if (((Integer) bbov.b.getOrDefault(bbnoVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(bbnoVarArr);
    }
}
