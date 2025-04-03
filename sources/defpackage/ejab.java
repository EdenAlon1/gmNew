package defpackage;

import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejab {
    public final AccountManager a;
    public final ejlk b;
    public final Executor c;

    public ejab(AccountManager accountManager, Executor executor, ejlk ejlkVar) {
        this.a = accountManager;
        this.b = ejlkVar;
        this.c = executor;
    }

    static /* synthetic */ void a(SettableFuture settableFuture, AccountManagerFuture accountManagerFuture) {
        try {
            emxf.l(accountManagerFuture.isDone());
            settableFuture.set(accountManagerFuture.getResult());
        } catch (AuthenticatorException e) {
            e = e;
            settableFuture.setException(e);
        } catch (OperationCanceledException e2) {
            e = e2;
            settableFuture.setException(e);
        } catch (IOException e3) {
            e = e3;
            settableFuture.setException(e);
        } catch (Throwable th) {
            settableFuture.setException(th);
        }
    }
}
