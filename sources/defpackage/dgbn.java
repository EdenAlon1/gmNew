package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgbn {
    public final Context a;
    public final dgcl b;

    public dgbn(Context context, dgcl dgclVar) {
        this.a = context;
        this.b = dgclVar;
    }

    public static dgcn a(final DroidGuardResultsRequest droidGuardResultsRequest) {
        Duration duration = dgcn.e;
        dgcj dgcjVar = new dgcj();
        dgcjVar.a(dgcn.e);
        dgcjVar.c(dgcn.e);
        dgcjVar.b(true);
        dgcjVar.d = new Bundle();
        dgcjVar.b(false);
        if (droidGuardResultsRequest != null) {
            dgcjVar.a(Duration.ofMillis(droidGuardResultsRequest.a()));
            dgcjVar.c(Duration.ofMillis(droidGuardResultsRequest.a()));
            new Consumer() { // from class: dgbl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((Bundle) obj).putAll(DroidGuardResultsRequest.this.a);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }.o(dgcjVar.f);
            dgcjVar.d = dgcjVar.f;
        }
        if (dgcjVar.e == 1 && dgcjVar.a != null && dgcjVar.b != null && dgcjVar.d != null) {
            return new dgck(dgcjVar.a, dgcjVar.b, dgcjVar.c, dgcjVar.d);
        }
        StringBuilder sb = new StringBuilder();
        if (dgcjVar.a == null) {
            sb.append(" initTimeout");
        }
        if (dgcjVar.b == null) {
            sb.append(" snapshotTimeout");
        }
        if (dgcjVar.e == 0) {
            sb.append(" reinitializeHandleOnGetSnapshot");
        }
        if (dgcjVar.d == null) {
            sb.append(" extras");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static String b(Context context, Throwable th) {
        boolean z = th instanceof dfqu;
        String th2 = th.toString();
        if (z) {
            Status status = ((dfqu) th).a;
            String name = th.getClass().getName();
            String a = dfqw.a(status.f);
            String str = status.g;
            ConnectionResult connectionResult = status.i;
            th2 = String.format("%s: %s: %s%s", name, a, str, connectionResult == null ? "" : ", ".concat(connectionResult.toString()));
        }
        return dgcg.a(dgce.b(dgce.a(context, dgcg.c(th2, th), emch.a)));
    }
}
