package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqwp extends duak {
    public bqwp() {
        super("cms");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqwo b() {
        ah();
        return new bqwo(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(String str) {
        int intValue = bqws.c().intValue();
        int intValue2 = bqws.c().intValue();
        if (intValue2 < 42060) {
            dtub.w("cms_correlation_id", intValue2);
        }
        if (intValue >= 42060) {
            dtub.u(this.a, "cms_correlation_id", str);
        }
    }

    public final void d(String str) {
        int intValue = bqws.c().intValue();
        int intValue2 = bqws.c().intValue();
        if (intValue2 < 35020) {
            dtub.w("cms_id", intValue2);
        }
        if (intValue >= 35020) {
            dtub.u(this.a, "cms_id", str);
        }
    }

    public final void e(Function function) {
        Object apply;
        String[] strArr = bqws.a;
        apply = function.apply(new bqwr());
        af(new bqwq((bqwr) apply));
    }
}
