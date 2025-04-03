package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.auth.IAuthManagerService;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfae implements dfad {
    private final Context a;

    public dfae(Context context) {
        this.a = context;
    }

    @Override // defpackage.dfad
    public final dhre a(String str) {
        try {
            Context context = this.a;
            int i = dezv.a;
            dfac.f(context, str);
            return dhrt.c(null);
        } catch (dezu | IOException e) {
            return dhrt.b(e);
        }
    }

    @Override // defpackage.dfad
    public final dhre b(String str) {
        try {
            Context context = this.a;
            int i = dezv.a;
            return dhrt.c(dfac.c(context, str));
        } catch (dezu | IOException e) {
            return dhrt.b(e);
        }
    }

    @Override // defpackage.dfad
    public final dhre c(Account account, String str, Bundle bundle) {
        try {
            Context context = this.a;
            int i = dezv.a;
            return dhrt.c(dfac.b(context, account, str, bundle));
        } catch (dezu | IOException e) {
            return dhrt.b(e);
        }
    }

    @Override // defpackage.dfad
    public final dhre d(final HasCapabilitiesRequest hasCapabilitiesRequest) {
        try {
            Context context = this.a;
            int i = dezv.a;
            dfwv.n(context);
            dfwv.n(hasCapabilitiesRequest.a);
            dfwv.l(hasCapabilitiesRequest.a.name);
            dfwv.h("This call can involve network request. It is unsafe to call from main thread.");
            ecwj.f(context);
            if (fdlu.a.get().a()) {
                Bundle bundle = new Bundle();
                dfac.h(context, bundle);
                hasCapabilitiesRequest.c = bundle;
            }
            Integer num = (Integer) dfac.j(context, dfac.d, new dfab() { // from class: dezx
                @Override // defpackage.dfab
                public final Object a(IBinder iBinder) {
                    String[] strArr = dfac.b;
                    return Integer.valueOf(IAuthManagerService.Stub.asInterface(iBinder).hasCapabilities(HasCapabilitiesRequest.this));
                }
            });
            num.intValue();
            return dhrt.c(num);
        } catch (dezu | IOException e) {
            return dhrt.b(e);
        }
    }

    @Override // defpackage.dfad
    public final dhre e() {
        try {
            Context context = this.a;
            int i = dezv.a;
            return dhrt.c(dfac.k(context));
        } catch (RemoteException | dfqc | dfqd e) {
            return dhrt.b(e);
        }
    }

    @Override // defpackage.dfad
    public final dhre f(String[] strArr) {
        try {
            return dhrt.c(dezv.a(this.a, strArr));
        } catch (dezu | IOException e) {
            return dhrt.b(e);
        }
    }

    @Override // defpackage.dfad
    public final dhre g(Account account) {
        try {
            Context context = this.a;
            int i = dezv.a;
            return dhrt.c(dfac.d(context, account, "oauth2:https://www.googleapis.com/auth/userinfo.email"));
        } catch (dezu | IOException e) {
            return dhrt.b(e);
        }
    }
}
