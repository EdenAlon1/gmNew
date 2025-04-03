package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btvo extends dtvh {
    public btvo() {
        super("message_classifications_table", "$primary");
    }

    @Override // defpackage.dtvh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btvn b() {
        return new btvn(this.a.a(), this.b);
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = btvy.a;
        apply = function.apply(new btvx());
        this.b = new btvt((btvx) apply);
    }
}
