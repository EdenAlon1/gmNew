package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.etouffee.impl.TachyonKeyWorker;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cadx {
    private final Context a;

    public cadx(Context context) {
        this.a = context;
    }

    public final void a(String str) {
        pon ponVar = new pon();
        ponVar.e("canonical_number", str);
        ppv ppvVar = new ppv(TachyonKeyWorker.class);
        ppvVar.d("bugle_tk_worker");
        ppvVar.j(ponVar.a());
        poh pohVar = new poh();
        pohVar.c(2);
        ppvVar.g(pohVar.a());
        pqr.a(this.a).g("PrekeysManager-".concat(String.valueOf(str)), ppa.KEEP, (ppw) ppvVar.b());
    }
}
