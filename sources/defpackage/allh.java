package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class allh {
    final /* synthetic */ kfb a;
    final /* synthetic */ qmi b;

    public allh(kfb kfbVar, qmi qmiVar) {
        this.a = kfbVar;
        this.b = qmiVar;
    }

    public final void a(int i) {
        if (i != 0) {
            alli.a.r(a.h(i, "Bad response code: "));
            this.a.b(Optional.empty());
            return;
        }
        try {
            String string = this.b.a().a.getString("install_referrer");
            if (!TextUtils.isEmpty(string)) {
                this.a.b(Optional.of(string.substring(0, Math.min(string.length(), 100))));
            } else {
                alli.a.p("Empty referrer");
                this.a.b(Optional.empty());
            }
        } catch (RemoteException e) {
            alli.a.s("Error talking to Referrer API", e);
            this.a.b(Optional.empty());
        }
    }
}
