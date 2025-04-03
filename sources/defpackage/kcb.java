package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kcb extends ffkk implements ffjm {
    public static final kcb a = new kcb();

    public kcb() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi hviVar = (hvi) obj2;
        kcp a2 = kcg.a((iui) obj);
        if (hviVar != a2.i) {
            a2.i = hviVar;
            ffji ffjiVar = a2.j;
            if (ffjiVar != null) {
                ffjiVar.invoke(hviVar);
            }
        }
        return ffcu.a;
    }
}
