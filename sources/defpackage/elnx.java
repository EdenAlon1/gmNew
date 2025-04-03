package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class elnx {
    public String a;
    public Object b;
    public elnz c;
    public Boolean d;
    private final eluv e;

    protected elnx(eluv eluvVar) {
        this.e = eluvVar;
    }

    public elny a() {
        this.b.getClass();
        this.c.getClass();
        return new eltu(this.e, Optional.ofNullable(this.a), this.b, this.c, Optional.ofNullable(this.d), new Executor() { // from class: elnw
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        });
    }
}
