package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqta extends dtvh {
    public bqta() {
        super("cms_restore_dependency_cache_table", "$primary");
    }

    @Override // defpackage.dtvh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqsz b() {
        return new bqsz(this.a.a(), this.b);
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bqth.a;
        apply = function.apply(new bqtg());
        this.b = new bqtf((bqtg) apply);
    }
}
