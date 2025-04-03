package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqmd extends dtvh {
    public bqmd() {
        super("cms_deleted_messages_buffer", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = bqmm.a;
        apply = function.apply(new bqml());
        this.b = new bqmk((bqml) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new bqmc(this.a.a(), this.b);
    }
}
