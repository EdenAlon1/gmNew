package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btsv extends dtvh {
    public btsv() {
        super("messages_annotations", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = bttf.a;
        apply = function.apply(new btte());
        this.b = new bttd((btte) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new btsu(this.a.a(), this.b);
    }
}
