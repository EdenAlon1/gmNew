package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btff extends dtvh {
    public btff() {
        super("flagged_messages", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = btfo.a;
        apply = function.apply(new btfn());
        this.b = new btfm((btfn) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new btfe(this.a.a(), this.b);
    }
}
