package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbkb extends dtyx {
    public bbkb(String[] strArr) {
        super("conversation_participants_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bbka b() {
        l();
        return new bbka(this.a.a());
    }

    public final void c(bbjl... bbjlVarArr) {
        int intValue = bbke.c().intValue();
        for (bbjl bbjlVar : bbjlVarArr) {
            if (((Integer) bbke.b.getOrDefault(bbjlVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        m(bbjlVarArr);
    }
}
