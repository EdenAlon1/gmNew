package defpackage;

import com.google.android.gms.phenotype.internal.IFlagUpdateListener;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhld extends IFlagUpdateListener.Stub {
    final /* synthetic */ dftp a;

    public dhld(dftp dftpVar) {
        this.a = dftpVar;
    }

    @Override // com.google.android.gms.phenotype.internal.IFlagUpdateListener
    public final void onFlagUpdate(byte[] bArr) {
        this.a.b(new dhlc(bArr));
    }
}
