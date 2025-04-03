package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cffj extends dtvh {
    public cffj() {
        super("work_queue_work_manager_ids", "$primary");
    }

    @Override // defpackage.dtvh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cffi b() {
        return new cffi(this.a.a(), this.b);
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = cfft.a;
        apply = function.apply(new cffs());
        this.b = new cffr((cffs) apply);
    }
}
