package defpackage;

import android.util.Log;
import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feia extends feik {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0);

    @Deprecated
    static final fdxi b = new fdxi("cronet-annotation", null);
    public static final fdxi c = new fdxi("cronet-annotations", null);
    public final String d;
    public final String e;
    public final fevo f;
    public final Executor g;
    public final febo h;
    public final feid i;
    public final Runnable j;
    public BidirectionalStream k;
    public final boolean l;
    public final Object m;
    public final Collection n;
    public final fehz o;
    public feht p;
    private final fehy u;

    public feia(String str, String str2, Executor executor, febo feboVar, feid feidVar, Runnable runnable, Object obj, int i, febs febsVar, fevo fevoVar, fdxj fdxjVar, fevw fevwVar) {
        super(new feif(), fevoVar, fevwVar, feboVar, fdxjVar);
        this.u = new fehy(this);
        this.d = str;
        this.e = str2;
        this.f = fevoVar;
        this.g = executor;
        this.h = feboVar;
        this.i = feidVar;
        this.j = runnable;
        this.l = febsVar.a == febr.UNARY;
        this.m = fdxjVar.h(b);
        this.n = (Collection) fdxjVar.h(c);
        this.o = new fehz(this, i, fevoVar, obj, fevwVar);
        f();
    }

    @Override // defpackage.fejs
    public final fdxd a() {
        return fdxd.a;
    }

    @Override // defpackage.feik
    protected final /* synthetic */ feih p() {
        return this.u;
    }

    @Override // defpackage.feik
    protected final /* synthetic */ feij q() {
        return this.o;
    }

    @Override // defpackage.feik, defpackage.feio
    protected final /* synthetic */ fein r() {
        return this.o;
    }

    public final void s(Status status) {
        this.i.a(this, status);
    }

    public final void t(ByteBuffer byteBuffer, boolean z, boolean z2) {
        if (this.k == null) {
            return;
        }
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "BidirectionalStream.write");
        }
        this.k.write(byteBuffer, z);
        if (z2) {
            if (Log.isLoggable("grpc-java-cronet", 2)) {
                Log.v("grpc-java-cronet", "BidirectionalStream.flush");
            }
            this.k.flush();
        }
    }
}
