package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fexu implements fejx {
    final Executor a;
    final ScheduledExecutorService b;
    final fevv c;
    final SSLSocketFactory d;
    final feyy e;
    final int f;
    final int g;
    final int h;
    private final ferd i;
    private final ferd j;
    private final boolean k;
    private final feis l;
    private final long m;
    private boolean n;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public fexu(ferd ferdVar, ferd ferdVar2, SSLSocketFactory sSLSocketFactory, feyy feyyVar, int i, boolean z, long j, long j2, int i2, int i3, fevv fevvVar) {
        this.i = ferdVar;
        this.a = ferdVar.a();
        this.j = ferdVar2;
        this.b = (ScheduledExecutorService) ferdVar2.a();
        this.d = sSLSocketFactory;
        this.e = feyyVar;
        this.f = i;
        this.k = z;
        this.l = new feis(j);
        this.m = j2;
        this.g = i2;
        this.h = i3;
        fevvVar.getClass();
        this.c = fevvVar;
    }

    @Override // defpackage.fejx
    public final fekh a(SocketAddress socketAddress, fejw fejwVar, fdxm fdxmVar) {
        if (this.n) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        feis feisVar = this.l;
        feir feirVar = new feir(feisVar, feisVar.c.get());
        fext fextVar = new fext(feirVar);
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
        String str = fejwVar.a;
        String str2 = fejwVar.c;
        fdxd fdxdVar = fejwVar.b;
        fdzl fdzlVar = fejwVar.d;
        emyl emylVar = fend.q;
        Logger logger = fezw.a;
        feyg feygVar = new feyg(this, inetSocketAddress, str, str2, fdxdVar, emylVar, fdzlVar, fextVar);
        if (this.k) {
            long j = feirVar.a;
            long j2 = this.m;
            feygVar.y = true;
            feygVar.z = j;
            feygVar.A = j2;
        }
        return feygVar;
    }

    @Override // defpackage.fejx
    public final Collection b() {
        int i = fexv.o;
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.fejx
    public final ScheduledExecutorService c() {
        return this.b;
    }

    @Override // defpackage.fejx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.i.b(this.a);
        this.j.b(this.b);
    }
}
