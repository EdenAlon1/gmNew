package defpackage;

import com.google.android.gms.inappreach.internal.IOnAccountHealthAlertsListener;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgri extends IOnAccountHealthAlertsListener.Stub {
    final /* synthetic */ dftp a;

    public dgri(dftp dftpVar) {
        this.a = dftpVar;
    }

    @Override // com.google.android.gms.inappreach.internal.IOnAccountHealthAlertsListener
    public final void onAccountHealthAlerts(byte[] bArr) {
        this.a.b(new dgrh(bArr));
    }
}
