package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwgl extends dtvh {
    public bwgl() {
        super("pending_incoming_message_rcs_table", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = bwgw.a;
        apply = function.apply(new bwgv());
        this.b = new bwgs((bwgv) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new bwgk(this.a.a(), this.b);
    }
}
