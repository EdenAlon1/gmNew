package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtql implements dfmh {
    private final dtpx a;
    private final dtqc b;

    protected dtql(Context context, dtqc dtqcVar) {
        Context context2;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        dtqm dtqmVar = new dtqm();
        dtpt dtptVar = new dtpt();
        dtptVar.a();
        if (applicationContext == null) {
            throw new NullPointerException("Null context");
        }
        dtptVar.a = applicationContext;
        dtptVar.c = emxc.j(dtqmVar);
        dtptVar.a();
        if (dtptVar.e == 1 && (context2 = dtptVar.a) != null) {
            this.a = new dtpu(context2, dtptVar.b, dtptVar.c, dtptVar.d);
            this.b = dtqcVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (dtptVar.a == null) {
            sb.append(" context");
        }
        if (dtptVar.e == 0) {
            sb.append(" googlerOverridesCheckbox");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static dfmh b(Context context, dtpv dtpvVar) {
        return new dtql(context, new dtqc(dtpvVar));
    }

    @Override // defpackage.dfmh
    public final void a(eyee eyeeVar) {
        eyeeVar.I();
        dtqk dtqkVar = dtqa.a;
        if (Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new NetworkOnMainThreadException();
        }
        dtpx dtpxVar = this.a;
        dtqk dtqkVar2 = dtqa.a;
        boolean z = dtqj.a;
        Context context = ((dtpu) dtpxVar).a;
        if (!z) {
            synchronized (dtqj.b) {
                if (!dtqj.a) {
                    dtqj.a = true;
                    ecvo.f(context);
                    ecwj.f(context);
                    if (!dtpz.a(context)) {
                        if (fdly.a.get().b()) {
                            dfqa a = dfqg.c(context).a(context.getPackageName());
                            a.b();
                            if (!a.b) {
                                Log.w("CBVerifier", "Phenotype flags were not sycned because package was not Google Signed.");
                            }
                        }
                        dtqj.a(dtpxVar, dtqkVar2);
                    }
                }
            }
        }
        if (fdly.a.get().a()) {
            if (dtqb.a == null) {
                synchronized (dtqb.class) {
                    if (dtqb.a == null) {
                        dtqb.a = new dtqb();
                    }
                }
            }
            dtqc dtqcVar = this.b;
            dtqb dtqbVar = dtqb.a;
            dtqcVar.a.a();
        }
        fdmb.a.get();
        fdly.a.get().c();
    }

    public final String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.a + ", basis=" + this.b + "}";
    }
}
