package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsnt extends dtvh {
    public bsnt() {
        super("conversations", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = bsom.a;
        apply = function.apply(new bsol());
        this.b = new bsof((bsol) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new bsns(this.a.a(), this.b);
    }
}
