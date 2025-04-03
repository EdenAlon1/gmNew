package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqwr extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bqwq(this);
    }

    public final void b() {
        int intValue = bqws.c().intValue();
        if (intValue < 35020) {
            dtub.w("cms_id", intValue);
        }
        aq(new dtrx("cms.cms_id", 5));
    }

    public final void c(int i) {
        aq(new dtwe("cms.key_index", 1, Integer.valueOf(i)));
    }

    public final void d(int i) {
        aq(new dtwe("cms.key_index", 10, Integer.valueOf(i)));
    }

    public final void e(int i) {
        aq(new dtwe("cms.key_type", 1, Integer.valueOf(i)));
    }
}
