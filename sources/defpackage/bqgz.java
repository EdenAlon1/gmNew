package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqgz extends dtvh {
    public bqgz() {
        super("cms_backup_dependency_cache_table", "$primary");
    }

    @Override // defpackage.dtvh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqgy b() {
        return new bqgy(this.a.a(), this.b);
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bqhg.a;
        apply = function.apply(new bqhf());
        this.b = new bqhe((bqhf) apply);
    }
}
