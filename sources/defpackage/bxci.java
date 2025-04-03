package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxci extends dtvh {
    public bxci() {
        super("reminders", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = bxct.a;
        apply = function.apply(new bxcs());
        this.b = new bxcr((bxcs) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new bxch(this.a.a(), this.b);
    }
}
