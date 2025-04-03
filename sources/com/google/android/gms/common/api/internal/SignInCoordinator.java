package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.BaseSignInCallbacks;
import com.google.android.gms.signin.internal.SignInResponse;
import defpackage.dfqj;
import defpackage.dfrc;
import defpackage.dfrd;
import defpackage.dfug;
import defpackage.dfuh;
import defpackage.dfui;
import defpackage.dfvs;
import defpackage.dfwv;
import defpackage.dhpd;
import defpackage.dhpe;
import defpackage.dhpf;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SignInCoordinator extends BaseSignInCallbacks implements dfrc, dfrd {
    private static dfqj a = dhpd.c;
    private final Context b;
    private final Handler c;
    private final dfqj d;
    private Set e;
    private dfvs f;
    private dhpe g;
    private dfui h;

    /* renamed from: -$$Nest$msignInComplete, reason: not valid java name */
    public static /* bridge */ /* synthetic */ void m262$$Nest$msignInComplete(SignInCoordinator signInCoordinator, SignInResponse signInResponse) {
        ConnectionResult connectionResult = signInResponse.b;
        if (connectionResult.b()) {
            ResolveAccountResponse resolveAccountResponse = signInResponse.c;
            dfwv.n(resolveAccountResponse);
            ConnectionResult connectionResult2 = resolveAccountResponse.c;
            if (!connectionResult2.b()) {
                String valueOf = String.valueOf(String.valueOf(connectionResult2));
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                signInCoordinator.h.b(connectionResult2);
                signInCoordinator.g.m();
                return;
            }
            signInCoordinator.h.c(resolveAccountResponse.a(), signInCoordinator.e);
        } else {
            signInCoordinator.h.b(connectionResult);
        }
        signInCoordinator.g.m();
    }

    public SignInCoordinator(Context context, Handler handler, dfvs dfvsVar) {
        this(context, handler, dfvsVar, a);
    }

    public static void setBuilderForTest(dfqj<? extends dhpe, dhpf> dfqjVar) {
        a = dfqjVar;
    }

    public dhpe getSignInClient() {
        return this.g;
    }

    @Override // defpackage.dfsm
    public void onConnected(Bundle bundle) {
        this.g.f(this);
    }

    @Override // defpackage.dftw
    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.h.b(connectionResult);
    }

    @Override // defpackage.dfsm
    public void onConnectionSuspended(int i) {
        this.h.d(i);
    }

    @Override // com.google.android.gms.signin.internal.BaseSignInCallbacks, com.google.android.gms.signin.internal.ISignInCallbacks
    public void onSignInComplete(SignInResponse signInResponse) {
        this.c.post(new dfuh(this, signInResponse));
    }

    public void startSignIn(dfui dfuiVar) {
        dhpe dhpeVar = this.g;
        if (dhpeVar != null) {
            dhpeVar.m();
        }
        this.f.h = Integer.valueOf(System.identityHashCode(this));
        dfqj dfqjVar = this.d;
        Context context = this.b;
        Looper looper = this.c.getLooper();
        dfvs dfvsVar = this.f;
        this.g = (dhpe) dfqjVar.b(context, looper, dfvsVar, dfvsVar.g, this, this);
        this.h = dfuiVar;
        Set set = this.e;
        if (set == null || set.isEmpty()) {
            this.c.post(new dfug(this));
        } else {
            this.g.e();
        }
    }

    public void stopSignIn() {
        dhpe dhpeVar = this.g;
        if (dhpeVar != null) {
            dhpeVar.m();
        }
    }

    public SignInCoordinator(Context context, Handler handler, dfvs dfvsVar, dfqj<? extends dhpe, dhpf> dfqjVar) {
        this.b = context;
        this.c = handler;
        dfwv.o(dfvsVar, "ClientSettings must not be null");
        this.f = dfvsVar;
        this.e = dfvsVar.b;
        this.d = dfqjVar;
    }
}
