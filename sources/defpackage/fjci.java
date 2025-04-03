package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fjci implements fjbm {
    final /* synthetic */ ffrf a;

    public fjci(ffrf ffrfVar) {
        this.a = ffrfVar;
    }

    @Override // defpackage.fjbm
    public final void onFailure(fjbj fjbjVar, Throwable th) {
        this.a.w(ffci.a(th));
    }

    @Override // defpackage.fjbm
    public final void onResponse(fjbj fjbjVar, fjdu fjduVar) {
        if (!fjduVar.c()) {
            this.a.w(ffci.a(new fjcb(fjduVar)));
            return;
        }
        Object obj = fjduVar.b;
        if (obj != null) {
            this.a.w(obj);
            return;
        }
        Object cast = fjcg.class.cast(fjbjVar.a().e.get(fjcg.class));
        cast.getClass();
        Method method = ((fjcg) cast).a;
        this.a.w(ffci.a(new ffby("Response from " + method.getDeclaringClass().getName() + "." + method.getName() + " was null but response body type was declared as non-null")));
    }
}
