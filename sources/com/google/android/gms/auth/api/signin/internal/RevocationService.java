package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.IRevocationService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.dfdw;
import defpackage.dfeb;
import defpackage.dfef;
import defpackage.dfeh;
import defpackage.dfej;
import defpackage.dfel;
import defpackage.dfep;
import defpackage.dfre;
import defpackage.dfrh;
import defpackage.dfrl;
import defpackage.dfuk;
import defpackage.dfwu;
import defpackage.dfwv;
import defpackage.dfzb;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RevocationService extends IRevocationService.Stub {
    private final Context a;

    public RevocationService(Context context) {
        this.a = context;
    }

    private final void a() {
        if (dfzb.a(this.a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.IRevocationService
    public void cleanupClientState() {
        a();
        dfel.a(this.a).b();
    }

    @Override // com.google.android.gms.auth.api.signin.internal.IRevocationService
    public void revokeAccess() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        a();
        dfep c = dfep.c(this.a);
        GoogleSignInAccount a = c.a();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.e;
        if (a != null) {
            googleSignInOptions = c.b();
        }
        Context context = this.a;
        dfwv.n(googleSignInOptions);
        dfdw dfdwVar = new dfdw(context, googleSignInOptions);
        if (a == null) {
            dfre dfreVar = dfdwVar.k;
            Context context2 = dfdwVar.c;
            int a2 = dfdwVar.a();
            dfej.a.b("Signing out", new Object[0]);
            dfej.a(context2);
            if (a2 == 3) {
                dfrl dfrlVar = Status.a;
                BasePendingResult dfukVar = new dfuk(dfreVar);
                dfukVar.l(dfrlVar);
                basePendingResult = dfukVar;
            } else {
                dfef dfefVar = new dfef(dfreVar);
                dfreVar.c(dfefVar);
                basePendingResult = dfefVar;
            }
            dfwu.b(basePendingResult);
            return;
        }
        dfre dfreVar2 = dfdwVar.k;
        Context context3 = dfdwVar.c;
        int a3 = dfdwVar.a();
        dfej.a.b("Revoking access", new Object[0]);
        String d = dfep.c(context3).d("refreshToken");
        dfej.a(context3);
        if (a3 == 3) {
            int i = dfeb.b;
            if (d == null) {
                Status status = new Status(4);
                dfwv.b(!status.d(), "Status code must not be SUCCESS");
                basePendingResult2 = new dfrh(status);
                basePendingResult2.l(status);
            } else {
                dfeb dfebVar = new dfeb(d);
                new Thread(dfebVar).start();
                basePendingResult2 = dfebVar.a;
            }
        } else {
            dfeh dfehVar = new dfeh(dfreVar2);
            dfreVar2.c(dfehVar);
            basePendingResult2 = dfehVar;
        }
        dfwu.b(basePendingResult2);
    }
}
