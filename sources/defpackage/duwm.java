package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duwm {
    public Executor a;
    public final engr b;
    private final lkj c = lkj.STARTED;
    private final engr d;
    private final engr e;

    public duwm() {
        if (!duzy.a) {
            boolean z = dvak.a;
        }
        int i = engw.d;
        this.b = new engr();
        this.d = new engr();
        this.e = new engr();
    }

    public final duwk a() {
        Executor executor = this.a;
        if (executor == null) {
            throw new IllegalStateException("callback executor was not provided");
        }
        return new duwk(executor, this.c, new duwl(this.b.g(), this.d.g(), this.e.g()));
    }
}
