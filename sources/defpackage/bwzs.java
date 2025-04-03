package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwzs extends dtvh {
    public bwzs() {
        super("recent_gifs", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = bxad.a;
        apply = function.apply(new bxac());
        this.b = new bxab((bxac) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new bwzr(this.a.a(), this.b);
    }
}
