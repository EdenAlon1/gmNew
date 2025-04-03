package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqpp extends dtvh {
    public bqpp() {
        super("cms_media_notifications", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = bqpw.a;
        apply = function.apply(new bqpv());
        this.b = new bqpu((bqpv) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new bqpo(this.a.a(), this.b);
    }
}
