package defpackage;

import io.grpc.Status;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fejn extends fekk {
    final /* synthetic */ fevq a;
    final /* synthetic */ fejq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fejn(fejq fejqVar, fevq fevqVar) {
        super(fejqVar.c.e);
        this.a = fevqVar;
        this.b = fejqVar;
    }

    @Override // defpackage.fekk
    public final void a() {
        int i = ffbo.a;
        if (this.b.b != null) {
            fend.g(this.a);
            return;
        }
        while (true) {
            try {
                InputStream g = this.a.g();
                if (g == null) {
                    return;
                }
                try {
                    fejq fejqVar = this.b;
                    fejqVar.a.c(fejqVar.c.b.e.b(g));
                    g.close();
                } catch (Throwable th) {
                    fend.h(g);
                    throw th;
                }
            } catch (Throwable th2) {
                fend.g(this.a);
                this.b.b(Status.c.d(th2).withDescription("Failed to read message."));
                return;
            }
        }
    }
}
