package defpackage;

import android.content.Context;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgat {
    public final dgbd a;
    public final emyl b;

    public dgat(final Context context) {
        dgbd dgbdVar = new dgbd(context);
        emyl a = emys.a(new emyl() { // from class: dgas
            @Override // defpackage.emyl
            public final Object get() {
                Context context2 = context;
                ecwj.f(context2);
                return new dgbn(context2, dgcz.a(context2));
            }
        });
        ecwj.f(context);
        this.a = dgbdVar;
        this.b = a;
    }

    public static String a(Context context, String str, Map map) {
        return new dgat(context).b(str, map, null);
    }

    public final String b(String str, Map map, DroidGuardResultsRequest droidGuardResultsRequest) {
        Object a;
        if (fdmg.b()) {
            dgbn dgbnVar = (dgbn) this.b.get();
            try {
                return ((dgcp) dhrt.f(dgbnVar.b.a(str, map, dgbn.a(droidGuardResultsRequest)))).a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return dgbn.b(dgbnVar.a, e);
            } catch (ExecutionException e2) {
                Context context = dgbnVar.a;
                Throwable cause = e2.getCause();
                Throwable th = e2;
                if (cause != null) {
                    th = e2.getCause();
                }
                return dgbn.b(context, th);
            }
        }
        dgbd dgbdVar = this.a;
        dgay dgayVar = new dgay(dgbdVar, str, droidGuardResultsRequest, map);
        dfwv.h("This method must not be called on the main thread.");
        dgbdVar.b.b(dgayVar);
        try {
            a = dgayVar.a.a(dgayVar.e.a());
            if (a == null) {
                a = dgayVar.a("timeout: " + dgayVar.e.a() + " ms", null);
            }
        } catch (InterruptedException e3) {
            a = dgayVar.a("takeWithTimeout(" + dgayVar.e.a() + ") got interrupted", e3);
        }
        return (String) a;
    }
}
