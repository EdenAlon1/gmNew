package defpackage;

import com.google.android.gms.inappreach.internal.IOnAccountMessagesListener;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgry extends IOnAccountMessagesListener.Stub {
    final /* synthetic */ dftp a;

    public dgry(dftp dftpVar) {
        this.a = dftpVar;
    }

    @Override // com.google.android.gms.inappreach.internal.IOnAccountMessagesListener
    public final void onAccountMessages(byte[] bArr) {
        this.a.b(new dgrx(bArr));
    }
}
