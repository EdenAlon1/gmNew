package defpackage;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feze extends fezi {
    private final fezd d;
    private final fezd e;
    private final fezd f;
    private final fezd g;
    private final int h;

    public feze(fezd fezdVar, fezd fezdVar2, fezd fezdVar3, fezd fezdVar4, Provider provider, int i) {
        super(provider);
        this.d = fezdVar;
        this.e = fezdVar2;
        this.f = fezdVar3;
        this.g = fezdVar4;
        this.h = i;
    }

    @Override // defpackage.fezi
    public final String a(SSLSocket sSLSocket) {
        byte[] bArr;
        if (this.f.b(sSLSocket) && (bArr = (byte[]) this.f.a(sSLSocket, new Object[0])) != null) {
            return new String(bArr, fezl.b);
        }
        return null;
    }

    @Override // defpackage.fezi
    public final void b(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.d.c(sSLSocket, true);
            this.e.c(sSLSocket, str);
        }
        if (this.g.b(sSLSocket)) {
            this.g.a(sSLSocket, e(list));
        }
    }

    @Override // defpackage.fezi
    public final int c() {
        return this.h;
    }
}
