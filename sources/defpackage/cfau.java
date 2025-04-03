package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfau extends dtvh {
    public cfau() {
        super("work_queue", "$primary");
    }

    @Override // defpackage.dtvh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cfat b() {
        return new cfat(this.a.a(), this.b);
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = cfbf.a;
        apply = function.apply(new cfbe());
        this.b = new cfbd((cfbe) apply);
    }
}
