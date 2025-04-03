package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsdi extends dtvh {
    public bsdi() {
        super("conversation_to_participants", "$primary");
    }

    @Override // defpackage.dtvh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsdh b() {
        return new bsdh(this.a.a(), this.b);
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = bsdr.a;
        apply = function.apply(new bsdq());
        this.b = new bsdp((bsdq) apply);
    }
}
