package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvgz extends dtvh {
    public bvgz() {
        super("p2p_suggestions", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = bvhn.a;
        apply = function.apply(new bvhm());
        this.b = new bvhg((bvhm) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new bvgy(this.a.a(), this.b);
    }
}
