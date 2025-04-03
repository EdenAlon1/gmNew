package defpackage;

import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.UserManager;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejbs implements eizg {
    private final ejbu a;
    private final Activity b;

    public ejbs(ejbu ejbuVar, Activity activity) {
        this.a = ejbuVar;
        this.b = activity;
    }

    @Override // defpackage.eizg
    public final ListenableFuture a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("allowSkip", false);
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
        Activity activity = this.b;
        final ejbu ejbuVar = this.a;
        try {
            final ejab ejabVar = ejbuVar.b.a;
            final ejac ejacVar = new ejac(bundle, activity);
            ListenableFuture n = erqt.n(eldl.c(new erog() { // from class: eizy
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    final SettableFuture create = SettableFuture.create();
                    AccountManagerCallback<Bundle> accountManagerCallback = new AccountManagerCallback() { // from class: eizz
                        @Override // android.accounts.AccountManagerCallback
                        public final void run(AccountManagerFuture accountManagerFuture) {
                            ejab.a(SettableFuture.this, accountManagerFuture);
                        }
                    };
                    ejab ejabVar2 = ejab.this;
                    AccountManager accountManager = ejabVar2.a;
                    ejac ejacVar2 = ejacVar;
                    final AccountManagerFuture<Bundle> addAccount = accountManager.addAccount(ejacVar2.a, ejacVar2.b, null, ejacVar2.c, ejacVar2.d, accountManagerCallback, ejabVar2.b);
                    create.b(new Runnable() { // from class: ejaa
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (SettableFuture.this.isCancelled()) {
                                addAccount.cancel(true);
                            }
                        }
                    }, erpp.a);
                    return create;
                }
            }), ejabVar.c);
            final boolean z = activity != null;
            ListenableFuture f = erny.f(n, eldl.a(new emwl() { // from class: ejad
                public final /* synthetic */ String b = "com.google";

                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    Bundle bundle2 = (Bundle) obj;
                    if (z) {
                        emxf.l(this.b.equals(bundle2.getString("accountType")));
                    }
                    return bundle2;
                }
            }), erpp.a);
            StrictMode.setThreadPolicy(threadPolicy);
            return erny.g(f, eldl.d(new eroh() { // from class: ejbt
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return erny.f(ejbu.this.c.g(), new emwn(((Bundle) obj).getString("authAccount")), erpp.a);
                }
            }), erpp.a);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    @Override // defpackage.eizg
    public final boolean b() {
        boolean isDemoUser;
        isDemoUser = ((UserManager) this.a.a.getSystemService(UserManager.class)).isDemoUser();
        return !isDemoUser;
    }
}
