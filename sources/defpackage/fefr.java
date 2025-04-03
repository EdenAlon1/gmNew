package defpackage;

import android.os.IBinder;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fefr implements erqj {
    final /* synthetic */ IBinder a;
    final /* synthetic */ fefs b;

    public fefr(fefs fefsVar, IBinder iBinder) {
        this.a = iBinder;
        this.b = fefsVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.g(this.a, (Status) obj);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        this.b.f(th);
    }
}
