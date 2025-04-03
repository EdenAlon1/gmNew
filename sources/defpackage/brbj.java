package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brbj extends dtvh {
    public brbj() {
        super("conversation_classifications_table", "$primary");
    }

    @Override // defpackage.dtvh
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final brbi b() {
        return new brbi(this.a.a(), this.b);
    }

    public final void c(Function function) {
        Object apply;
        String[] strArr = brbs.a;
        apply = function.apply(new brbr());
        this.b = new brbq((brbr) apply);
    }
}
