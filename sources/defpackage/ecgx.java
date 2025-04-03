package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecgx {
    public final ecgz a;

    public ecgx(Context context, ecgz ecgzVar) {
        this.a = ecgzVar;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(ecgzVar.a);
        application.registerComponentCallbacks(ecgzVar.a);
    }

    public final void a(ecgw ecgwVar) {
        ecgwVar.getClass();
        ecgy ecgyVar = this.a.a;
        int i = ecgy.c;
        ecgyVar.a.add(ecgwVar);
    }

    public final void b(ecgw ecgwVar) {
        ecgy ecgyVar = this.a.a;
        int i = ecgy.c;
        ecgyVar.a.remove(ecgwVar);
    }
}
