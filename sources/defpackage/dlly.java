package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlly {
    final effy a;
    final Executor b;

    public dlly(Context context) {
        efgc a = dlnc.a(context);
        dgxv dgxvVar = dgxw.a;
        ExecutorService d = dgxv.d(4);
        Pattern pattern = efbs.a;
        efbr efbrVar = new efbr(context);
        efbrVar.f("app_doctor");
        efbrVar.g("AppDoctor.pb");
        Uri a2 = efbrVar.a();
        effz h = efga.h();
        h.f(a2);
        h.e(dlnb.a);
        this.a = a.a(h.a());
        this.b = d;
    }
}
