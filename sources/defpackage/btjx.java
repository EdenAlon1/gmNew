package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btjx extends dtvh {
    public btjx() {
        super("generic_worker_queue", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = btki.a;
        apply = function.apply(new btkh());
        this.b = new btkg((btkh) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new btjw(this.a.a(), this.b);
    }
}
