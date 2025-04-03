package defpackage;

import android.util.Log;
import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fehz extends feng {
    public static final /* synthetic */ int i = 0;
    public final Object a;
    public final Collection b;
    public boolean c;
    public boolean d;
    public Status e;
    public boolean f;
    public boolean g;
    final /* synthetic */ feia h;
    private int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fehz(feia feiaVar, int i2, fevo fevoVar, Object obj, fevw fevwVar) {
        super(i2, fevoVar, fevwVar);
        this.h = feiaVar;
        this.b = new ArrayList();
        this.d = false;
        this.a = obj;
    }

    static /* bridge */ /* synthetic */ void f(fehz fehzVar, ByteBuffer byteBuffer) {
        fehzVar.u += byteBuffer.remaining();
        fesc fescVar = fesg.a;
        super.o(new fesf(byteBuffer), false);
    }

    @Override // defpackage.feqs
    public final void a(int i2) {
        this.h.k.getClass();
        int i3 = this.u - i2;
        this.u = i3;
        if (i3 != 0 || this.f) {
            return;
        }
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "BidirectionalStream.read");
        }
        this.h.k.read(ByteBuffer.allocateDirect(4096));
    }

    @Override // defpackage.feqs
    public final void b(Throwable th) {
        c(Status.c(th), true, new febo());
    }

    @Override // defpackage.feng
    protected final void c(Status status, boolean z, febo feboVar) {
        BidirectionalStream bidirectionalStream = this.h.k;
        bidirectionalStream.getClass();
        bidirectionalStream.cancel();
        j(status, z, feboVar);
    }

    @Override // defpackage.fein
    protected final void d() {
        super.d();
    }

    @Override // defpackage.feiq
    public final void e(Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }
}
