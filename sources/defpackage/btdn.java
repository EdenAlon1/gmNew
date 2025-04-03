package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btdn extends dtvh {
    public btdn() {
        super("events", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = btdw.a;
        apply = function.apply(new btdv());
        this.b = new btdu((btdv) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new btdm(this.a.a(), this.b);
    }
}
