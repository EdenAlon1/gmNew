package defpackage;

import android.content.Context;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fefh implements fejx {
    final Context a;
    final Executor b;
    final ferd c;
    final ferd d;
    final feey e;
    final feei f;
    final feeq g;
    ScheduledExecutorService h;
    Executor i;
    private boolean j;

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public fefh(fefg fefgVar) {
        Context context = fefgVar.a;
        context.getClass();
        this.a = context;
        fefgVar.c.getClass();
        Executor executor = fefgVar.d;
        this.b = executor == null ? koa.e(context) : executor;
        ferd ferdVar = fefgVar.e;
        ferdVar.getClass();
        this.c = ferdVar;
        ferd ferdVar2 = fefgVar.b;
        ferdVar2.getClass();
        this.d = ferdVar2;
        feey feeyVar = fefgVar.f;
        feeyVar.getClass();
        this.e = feeyVar;
        feei feeiVar = fefgVar.g;
        feeiVar.getClass();
        this.f = feeiVar;
        feeq feeqVar = fefgVar.h;
        feeqVar.getClass();
        this.g = feeqVar;
        fefgVar.i.getClass();
        this.h = (ScheduledExecutorService) ferdVar.a();
        this.i = ferdVar2.a();
    }

    @Override // defpackage.fejx
    public final /* bridge */ /* synthetic */ fekh a(SocketAddress socketAddress, fejw fejwVar, fdxm fdxmVar) {
        if (this.j) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        return new fefs(this, (feef) socketAddress, fejwVar);
    }

    @Override // defpackage.fejx
    public final Collection b() {
        return Collections.singleton(feef.class);
    }

    @Override // defpackage.fejx
    public final ScheduledExecutorService c() {
        return this.h;
    }

    @Override // defpackage.fejx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j = true;
        this.c.b(this.h);
        this.h = null;
        this.d.b(this.i);
        this.i = null;
    }
}
