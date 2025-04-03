package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqzl extends dtvh {
    public bqzl() {
        super("contacts", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = bqzv.a;
        apply = function.apply(new bqzu());
        this.b = new bqzt((bqzu) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new bqzk(this.a.a(), this.b);
    }
}
