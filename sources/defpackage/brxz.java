package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brxz extends dtvh {
    public brxz() {
        super("conversation_pin", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = bryh.a;
        apply = function.apply(new bryg());
        this.b = new bryf((bryg) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new brxy(this.a.a(), this.b);
    }
}
