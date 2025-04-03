package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqri extends dtvh {
    public bqri() {
        super("cms_notifications", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = bqrp.a;
        apply = function.apply(new bqro());
        this.b = new bqrn((bqro) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new bqrh(this.a.a(), this.b);
    }
}
