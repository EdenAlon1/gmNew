package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayjy extends dtvh {
    public ayjy() {
        super("conversation_matcher_cache", "$primary");
    }

    @Override // defpackage.dtvh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ayjx b() {
        return new ayjx(this.a.a(), this.b);
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = aykg.a;
        apply = function.apply(new aykf());
        this.b = new ayke((aykf) apply);
    }
}
