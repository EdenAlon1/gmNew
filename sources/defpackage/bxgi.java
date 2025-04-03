package defpackage;

import j$.time.Instant;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxgi extends duak {
    public bxgi() {
        super("remote_registrations_table");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bxgh b() {
        ah();
        return new bxgh(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(Instant instant) {
        if (instant == null) {
            this.a.putNull("guaranteed_fresh_as_of_timestamp");
        } else {
            this.a.put("guaranteed_fresh_as_of_timestamp", Long.valueOf(bdgw.a(instant)));
        }
    }

    public final void d(boolean z) {
        this.a.put("etouffee", Boolean.valueOf(z));
    }

    public final void e(boolean z) {
        int intValue = bxgl.c().intValue();
        int intValue2 = bxgl.c().intValue();
        if (intValue2 < 46000) {
            dtub.w("better_etouffee", intValue2);
        }
        if (intValue >= 46000) {
            this.a.put("better_etouffee", Boolean.valueOf(z));
        }
    }

    public final void f(Instant instant) {
        if (instant == null) {
            this.a.putNull("last_modified_timestamp");
        } else {
            this.a.put("last_modified_timestamp", Long.valueOf(bdgw.a(instant)));
        }
    }

    public final void g(bxgk bxgkVar) {
        af(new bxgj(bxgkVar));
    }

    public final void h(Function function) {
        Object apply;
        String[] strArr = bxgl.a;
        apply = function.apply(new bxgk());
        af(new bxgj((bxgk) apply));
    }
}
