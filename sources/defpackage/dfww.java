package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfww extends Exception {
    public final ConnectionResult a;

    public dfww(ConnectionResult connectionResult) {
        dfwv.b(connectionResult.a(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.a = connectionResult;
    }
}
