package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxbn implements emyl {
    final /* synthetic */ Executor a;
    final /* synthetic */ dwqy b;
    final /* synthetic */ Context c;
    final /* synthetic */ emxc d;
    final /* synthetic */ efbm e;

    public dxbn(Executor executor, dwqy dwqyVar, Context context, emxc emxcVar, efbm efbmVar) {
        this.a = executor;
        this.b = dwqyVar;
        this.c = context;
        this.d = emxcVar;
        this.e = efbmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [eaew, java.lang.Object] */
    @Override // defpackage.emyl
    public final /* bridge */ /* synthetic */ Object get() {
        fhgr fhgrVar = new fhgr();
        fhgrVar.a(dxbo.a, TimeUnit.MILLISECONDS);
        fhgrVar.b(dxbo.b, TimeUnit.MILLISECONDS);
        long j = dxbo.c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        fhgrVar.w = fhhl.A(j, timeUnit);
        fhgrVar.e = true;
        dxbm dxbmVar = new dxbm(this.a, this.b.g());
        eafb eafbVar = new eafb(new fhgs(fhgrVar));
        eaez eaezVar = new eaez(eafbVar, this.c, dxbmVar);
        eaezVar.h(((emxn) this.d).a);
        return new dxbk(this.c, eaezVar, eafbVar, this.e, dxbmVar);
    }
}
