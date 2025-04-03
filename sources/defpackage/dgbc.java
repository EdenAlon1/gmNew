package defpackage;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgbc {
    public final Context a;
    public final dgau b;
    public final Handler c;
    public final Map d;
    public final DroidGuardResultsRequest e;
    public final dgbk f;
    public final dgci g;
    public final cuwk h;
    private boolean i = false;

    public dgbc(Context context, dgau dgauVar, Handler handler, Map map, DroidGuardResultsRequest droidGuardResultsRequest, dgci dgciVar, dgbk dgbkVar, cuwk cuwkVar) {
        this.a = context;
        this.b = dgauVar;
        this.c = handler;
        this.d = map;
        this.e = droidGuardResultsRequest;
        this.g = dgciVar;
        this.f = dgbkVar;
        this.h = cuwkVar;
    }

    final void a(final String str) {
        synchronized (this) {
            if (this.i) {
                return;
            }
            this.i = true;
            try {
                this.c.post(new Runnable() { // from class: dgba
                    @Override // java.lang.Runnable
                    public final void run() {
                        dgbc.this.h.a(str);
                    }
                });
            } catch (RuntimeException unused) {
            }
        }
    }
}
