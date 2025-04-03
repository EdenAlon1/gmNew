package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsut extends dtvh {
    public bsut() {
        super("desktop", "$primary");
    }

    @Override // defpackage.dtvh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsus b() {
        return new bsus(this.a.a(), this.b);
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bsve.a;
        apply = function.apply(new bsvd());
        this.b = new bsvc((bsvd) apply);
    }
}
