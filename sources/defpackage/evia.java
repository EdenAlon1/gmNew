package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evia implements erqj {
    final /* synthetic */ evix a;
    final /* synthetic */ evib b;

    public evia(evib evibVar, evix evixVar) {
        this.a = evixVar;
        this.b = evibVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dfld c;
        String str = (String) obj;
        evix evixVar = this.a;
        erhq erhqVar = evixVar.g;
        if (erhqVar == null) {
            erhqVar = erhq.a;
        }
        evib evibVar = this.b;
        String str2 = erhqVar.j;
        Charset charset = evht.a;
        int i = eodh.a;
        int a = eodt.a.c(str2, evht.a).a();
        evic evicVar = evibVar.c;
        dfmp dfmpVar = evicVar.b;
        boolean g = ((emxc) dfmpVar.a.b()).g();
        Context context = evicVar.a;
        if (g) {
            List list = dfld.m;
            dfla dflaVar = new dfla(context, "CLIENT_LOGGING_PROD");
            dfle dfleVar = (dfle) ((emxc) dfmpVar.a.b()).f();
            if (dfleVar != null) {
                dflaVar.c = dfleVar;
            }
            if (str != null) {
                dflaVar.g = str;
            }
            c = dflaVar.c();
        } else {
            c = new dfld(context, "CLIENT_LOGGING_PROD", str);
        }
        dflc j = c.j(evixVar, dtql.b(evicVar.a, new fbcr()));
        j.i(a);
        final ListenableFuture f = erny.f(duin.a(j.c()), new emwn(null), erpp.a);
        f.b(new Runnable() { // from class: evhx
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = evic.c;
                if (ListenableFuture.this.isCancelled()) {
                    Log.d("ClientLoggingBackend", "Log cancelled. The app has crashed.");
                }
            }
        }, erpp.a);
        ernq.f(f, Exception.class, eldl.a(new emwl() { // from class: evhy
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                int i2 = evic.c;
                Log.e("ClientLoggingBackend", "Logging to Clearcut failed.", (Exception) obj2);
                return null;
            }
        }), erpp.a);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        Log.e("ClientLoggingBackend", "Error while logging.", th);
    }
}
