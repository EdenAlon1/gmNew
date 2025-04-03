package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ealu implements ealr {
    private static final entd a = entd.c("GnpSdk");
    private final Context b;
    private final eagn c;
    private final eako d;

    public ealu(Context context, eagn eagnVar, eako eakoVar) {
        context.getClass();
        eakoVar.getClass();
        this.b = context;
        this.c = eagnVar;
        this.d = eakoVar;
    }

    private final SharedPreferences d() {
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    private final FirebaseInstanceId e() {
        Context context = this.b;
        eako eakoVar = this.d;
        FirebaseInstanceId b = eakoVar.b(eakp.a(context, eakoVar, this.c));
        b.getClass();
        return b;
    }

    private final synchronized void f(String str) {
        d().edit().putString("reg_id", str).apply();
    }

    @Override // defpackage.ealr
    public final synchronized eafl a() {
        efbd.b();
        String str = ((eagl) this.c).b;
        if (str == null) {
            throw new IllegalArgumentException("Project ID must not be null when trying to reset registration token");
        }
        try {
            FirebaseInstanceId e = e();
            FirebaseInstanceId.k(e.d);
            if (Looper.getMainLooper() == Looper.myLooper()) {
                throw new IOException("MAIN_THREAD");
            }
            String j = FirebaseInstanceId.j("");
            String f = e.f();
            eutr eutrVar = e.f;
            Bundle bundle = new Bundle();
            bundle.putString("delete", "1");
            e.e(eutr.b(eutrVar.a(f, str, j, bundle)));
            FirebaseInstanceId.a.c(e.g(), str, j);
            f(null);
            try {
                c();
            } catch (eals e2) {
                ((ensz) ((ensz) a.j()).g(e2)).q("Exception thrown when trying to get token after deletion.");
                return new ealt(e2, true);
            }
        } catch (Throwable th) {
            ((ensz) ((ensz) a.j()).g(th)).q("Exception thrown when trying to delete token.");
            return new ealt(th, false);
        }
        return new eafo(ffcu.a);
    }

    @Override // defpackage.ealr
    public final synchronized String b() {
        return d().getString("reg_id", null);
    }

    @Override // defpackage.ealr
    public final synchronized String c() {
        String i;
        efbd.b();
        String str = ((eagl) this.c).b;
        if (str == null) {
            throw new IllegalArgumentException("Project ID must not be null when trying to get registration token");
        }
        try {
            i = e().i(str, "");
            if (i == null || i.length() == 0) {
                throw new eals();
            }
            if (!ffkj.e(i, b())) {
                a.o().q("New registration ID doesn't match the previously stored one.");
                f(i);
            }
        } catch (Throwable th) {
            if (!(th instanceof IOException) && !(th instanceof AssertionError) && !(th instanceof NullPointerException)) {
                throw th;
            }
            ((ensz) ((ensz) a.j()).g(th)).q("Exception during register with IID.");
            throw new eals(th);
        }
        return i;
    }
}
