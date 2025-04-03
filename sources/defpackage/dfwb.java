package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfwb {
    final /* synthetic */ dftw a;

    public dfwb(dftw dftwVar) {
        this.a = dftwVar;
    }

    public final void a(ConnectionResult connectionResult) {
        this.a.onConnectionFailed(connectionResult);
    }
}
