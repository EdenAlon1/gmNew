package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bunv extends dtvh {
    public bunv() {
        super("message_status", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = buoc.a;
        apply = function.apply(new buob());
        this.b = new buoa((buob) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new bunu(this.a.a(), this.b);
    }
}
