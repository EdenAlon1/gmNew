package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btkf extends duak {
    public btkf() {
        super("generic_worker_queue");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btke b() {
        ah();
        return new btke(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(boolean z) {
        this.a.put("in_flight", Boolean.valueOf(z));
    }

    public final void d(Function function) {
        Object apply;
        String[] strArr = btki.a;
        apply = function.apply(new btkh());
        af(new btkg((btkh) apply));
    }
}
