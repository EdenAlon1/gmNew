package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eckl {
    public final ecld a;
    public final emyl b;
    public final emyl c;
    public final Executor d;
    public final ecjc e;
    public final ffbr f;
    public final AtomicBoolean g = new AtomicBoolean(true);

    public eckl(ecld ecldVar, emyl emylVar, emyl emylVar2, Executor executor, fazb fazbVar, ecjd ecjdVar, ffbr ffbrVar) {
        this.a = ecldVar;
        this.b = emylVar;
        this.c = emylVar2;
        this.d = executor;
        this.e = ecjdVar.a(executor, fazbVar, null);
        this.f = ffbrVar;
    }
}
