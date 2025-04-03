package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsvb extends duak {
    public bsvb() {
        super("desktop");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsva b() {
        ah();
        return new bsva(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(boolean z) {
        int intValue = bsve.c().intValue();
        int intValue2 = bsve.c().intValue();
        if (intValue2 < 58010) {
            dtub.w("is_active", intValue2);
        }
        if (intValue >= 58010) {
            this.a.put("is_active", Boolean.valueOf(z));
        }
    }

    public final void d(long j) {
        this.a.put("last_wakeup_time", Long.valueOf(j));
    }

    public final void e(String str) {
        int intValue = bsve.c().intValue();
        int intValue2 = bsve.c().intValue();
        if (intValue2 < 58010) {
            dtub.w("request_id", intValue2);
        }
        if (intValue >= 58010) {
            dtub.u(this.a, "request_id", str);
        }
    }

    public final void f(Function function) {
        Object apply;
        String[] strArr = bsve.a;
        apply = function.apply(new bsvd());
        af(new bsvc((bsvd) apply));
    }
}
