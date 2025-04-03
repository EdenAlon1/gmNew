package defpackage;

import android.accounts.Account;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acnj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ acnk b;
    final /* synthetic */ eisx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acnj(acnk acnkVar, eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = acnkVar;
        this.c = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acnj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dfao dfaoVar;
        dfib dfibVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        boolean z = true;
        int i2 = 1;
        ffci.b(obj);
        if (i == 0) {
            ListenableFuture a = this.b.c.a(this.c);
            this.a = 1;
            obj = fgfz.c(a, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        acnk acnkVar = this.b;
        Account account = (Account) obj;
        account.getClass();
        String uri = acrz.a().build().toString();
        try {
            csjb c = acnk.a.c();
            c.I("Setting GAIA cookies");
            c.A("url", uri);
            c.r();
            dfaoVar = acnkVar.e;
            dfwv.b(true, "Must have at least one URL.");
            try {
                dfibVar = (dfib) eyfy.parseFrom(dfib.a, Base64.decode(dfac.d(dfaoVar.a, account, dfao.a(uri)), 9), eyfc.a());
            } catch (eygu e) {
                throw new dezu("Couldn't read data from server.", e);
            }
        } catch (UserRecoverableAuthException e2) {
            csjb e3 = acnk.a.e();
            e3.I("UserRecoverableAuthException: Unable to set GAIA Cookies for WebView");
            e3.s(e2);
            ((akzt) acnkVar.b.b()).e("Bugle.Satellite.Gaia.Cookies.Refresh.Result", 2);
            axnw.h(((cfyt) acnkVar.d.b()).b(e2));
            z = false;
            return Boolean.valueOf(z);
        } catch (Exception e4) {
            csjb e5 = acnk.a.e();
            e5.I("Error setting cookies in WebView");
            e5.s(e4);
            ((akzt) acnkVar.b.b()).e("Bugle.Satellite.Gaia.Cookies.Refresh.Result", 3);
            axnw.h(((cfyt) acnkVar.d.b()).b(e4));
            z = false;
            return Boolean.valueOf(z);
        }
        if (dfibVar == null || (dfibVar.b & 1) == 0) {
            throw new dezu("Invalid response.");
        }
        dfij dfijVar = dfibVar.c;
        if (dfijVar == null) {
            dfijVar = dfij.a;
        }
        int a2 = dfii.a(dfijVar.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i3 = a2 - 1;
        if (i3 == 1) {
            dfaoVar.b(dfijVar.c);
            ((akzt) acnkVar.b.b()).e("Bugle.Satellite.Gaia.Cookies.Refresh.Result", 1);
            return Boolean.valueOf(z);
        }
        if (i3 == 2) {
            throw new IOException("Request failed, but server said RETRY.");
        }
        if (i3 != 5) {
            Log.w("WebLoginHelper", "Unexpected response: ".concat(String.valueOf(String.valueOf(dfijVar))));
            int a3 = dfii.a(dfijVar.b);
            if (a3 != 0) {
                i2 = a3;
            }
            throw new dezu(a.h(i2 - 1, "Unknown response status: "));
        }
        dfaoVar.b(dfijVar.c);
        for (dfig dfigVar : dfijVar.d) {
            int i4 = dfigVar.b;
            int a4 = dfif.a(i4);
            if (a4 == 0) {
                a4 = 1;
            }
            int i5 = a4 - 1;
            if (i5 != 1) {
                if (i5 == 2) {
                    String str = dfigVar.c;
                    throw new dfam();
                }
                if (i5 != 3) {
                    int a5 = dfif.a(i4);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    Log.w("WebLoginHelper", a.h(a5 - 1, "Unrecognized failed account status: "));
                }
            }
        }
        throw new dezu("Authorization failed, but no recoverable accounts.");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new acnj(this.b, this.c, ffguVar);
    }
}
