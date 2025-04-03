package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bjf implements kfd {
    final /* synthetic */ Handler a;
    final /* synthetic */ Callable b;
    final /* synthetic */ bjg c;

    public bjf(bjg bjgVar, Handler handler, Callable callable) {
        this.c = bjgVar;
        this.a = handler;
        this.b = callable;
    }

    @Override // defpackage.kfd
    public final Object a(kfb kfbVar) {
        kfbVar.a(new bje(this), bjb.a());
        this.c.a.set(kfbVar);
        return "HandlerScheduledFuture-".concat(String.valueOf(this.b.toString()));
    }
}
