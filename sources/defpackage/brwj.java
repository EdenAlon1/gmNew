package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brwj extends dtvh {
    public brwj() {
        super("conversation_participants", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = brww.a;
        apply = function.apply(new brwv());
        this.b = new brwu((brwv) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new brwi(this.a.a(), this.b);
    }
}
