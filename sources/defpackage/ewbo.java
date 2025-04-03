package defpackage;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ewbo implements dgts {
    final /* synthetic */ SettableFuture a;

    public ewbo(SettableFuture settableFuture) {
        this.a = settableFuture;
    }

    @Override // defpackage.dgts
    public final void a(int i, String str) {
        this.a.setException(new ewbq(i, str));
    }

    @Override // defpackage.dgts
    public final void b(byte[] bArr, byte[] bArr2) {
        this.a.set(emxc.i(bArr));
    }
}
