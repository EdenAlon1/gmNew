package defpackage;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fiku extends fijq {
    public final HttpURLConnection h;
    final /* synthetic */ fikx i;
    private final AtomicBoolean j;
    private WritableByteChannel k;
    private OutputStream l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fiku(fikx fikxVar, Executor executor, Executor executor2, HttpURLConnection httpURLConnection, filt filtVar) {
        super(executor, executor2, filtVar);
        this.i = fikxVar;
        this.j = new AtomicBoolean(false);
        this.h = httpURLConnection;
    }

    @Override // defpackage.fijq
    protected final int a(ByteBuffer byteBuffer) {
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            i += this.k.write(byteBuffer);
        }
        this.l.flush();
        return i;
    }

    @Override // defpackage.fijq
    protected final Runnable b(fiky fikyVar) {
        return new fiju(this.i, fikyVar);
    }

    @Override // defpackage.fijq
    protected final Runnable c(fiky fikyVar) {
        return new fijy(this.i, fikyVar);
    }

    @Override // defpackage.fijq
    protected final void e() {
        j();
        this.i.g();
    }

    @Override // defpackage.fijq
    protected final void f() {
        if (this.k == null) {
            this.i.l = 10;
            this.h.setDoOutput(true);
            this.h.connect();
            this.i.l = 12;
            OutputStream outputStream = this.h.getOutputStream();
            this.l = outputStream;
            this.k = Channels.newChannel(outputStream);
        }
    }

    @Override // defpackage.fijq
    protected final void g(Throwable th) {
        this.i.c(th);
    }

    final void j() {
        if (this.k == null || !this.j.compareAndSet(false, true)) {
            return;
        }
        this.k.close();
    }
}
