package defpackage;

import android.content.Intent;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejgm implements eivn, eivo {
    public ejgm() {
        Boolean bool = false;
        bool.getClass();
    }

    @Override // defpackage.eivn, defpackage.eivl
    public final ListenableFuture a(eivr eivrVar) {
        ListenableFuture i;
        ekzz f = eleg.f("Get Intent Account");
        try {
            Intent intent = ((eiwu) eivrVar).a;
            if (eiuy.d(intent)) {
                int intExtra = intent.getIntExtra("account_id", -1);
                if (intExtra != -1 && !intent.getBooleanExtra("$tiktok$account_id_owned", false)) {
                    ((enrr) ((enrr) eiuy.a.i()).h("com/google/apps/tiktok/account/api/controller/AccountIntents", "getAccount", 106, "AccountIntents.java")).q("AccountId was manually propagated. Use AccountIntents instead.");
                }
                i = erqt.i(intExtra != -1 ? eisx.b(intExtra) : null);
            } else {
                i = erqt.i(null);
            }
            f.close();
            return i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.eivn
    public final ListenableFuture b(eisx eisxVar) {
        return erqt.i(null);
    }

    @Override // defpackage.eivn
    public final /* synthetic */ ListenableFuture c(eisx eisxVar) {
        return eivm.a(this, eisxVar);
    }
}
