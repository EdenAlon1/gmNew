package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kcf extends ffkk implements ffjm {
    public static final kcf a = new kcf();

    public kcf() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        int i;
        kcp a2 = kcg.a((iui) obj);
        int ordinal = ((kah) obj2).ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                throw new ffcd();
            }
        } else {
            i = 0;
        }
        a2.setLayoutDirection(i);
        return ffcu.a;
    }
}
