package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbru extends dtyx {
    public bbru(String[] strArr) {
        super("message_captions_backup", strArr, null, null, null, "backup");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bbrt b() {
        l();
        return new bbrt(this.a.a());
    }

    public final void c(bbrj... bbrjVarArr) {
        int a = bbrx.b().a();
        Integer.valueOf(a).getClass();
        for (bbrj bbrjVar : bbrjVarArr) {
            if (((Integer) bbrx.b.getOrDefault(bbrjVar.toString(), -1)).intValue() > a) {
                dtub.w("columnReference.toString()", a);
            }
        }
        m(bbrjVarArr);
    }
}
