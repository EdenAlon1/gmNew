package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekvw {
    public final Boolean a;
    public final eknr b;
    public final String c;

    public ekvw(Context context, Boolean bool, eknr eknrVar) {
        this.c = context.getPackageName();
        this.a = bool;
        this.b = eknrVar;
    }

    public final ListenableFuture a(ListenableFuture listenableFuture, ekrl ekrlVar, long j) {
        String b = ekrlVar.b();
        if (this.a.booleanValue()) {
            double d = j;
            try {
                erqt.q(listenableFuture);
                this.b.a(this.c, b, "success");
                this.b.b(d, this.c, b, "success");
            } catch (CancellationException unused) {
                this.b.a(this.c, b, "cancellation");
                this.b.b(d, this.c, b, "cancellation");
            } catch (Exception unused2) {
                this.b.a(this.c, b, "failure");
                this.b.b(d, this.c, b, "failure");
            }
        }
        return erre.a;
    }
}
