package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcax extends dtyx {
    public bcax(String[] strArr) {
        super("messages_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bcav b() {
        l();
        return new bcav(this.a.a());
    }

    public final void c(bbzh... bbzhVarArr) {
        int intValue = bcba.c().intValue();
        for (bbzh bbzhVar : bbzhVarArr) {
            if (((Integer) bcba.b.getOrDefault(bbzhVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(bbzhVarArr);
    }

    public final void d(bcaz bcazVar) {
        k(new bcay(bcazVar));
    }
}
