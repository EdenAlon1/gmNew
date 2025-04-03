package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxml extends dtvh {
    public bxml() {
        super("restore_workflow_files", "$primary");
    }

    public final void a(Function function) {
        Object apply;
        String[] strArr = bxmu.a;
        apply = function.apply(new bxmt());
        this.b = new bxms((bxmt) apply);
    }

    @Override // defpackage.dtvh
    public final /* bridge */ /* synthetic */ dtvg b() {
        return new bxmk(this.a.a(), this.b);
    }
}
