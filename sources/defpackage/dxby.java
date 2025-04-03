package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxby extends dxcb {
    private final ListenableFuture a;

    public dxby(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    @Override // defpackage.dxcc
    public final int b() {
        return 2;
    }

    @Override // defpackage.dxcb, defpackage.dxcc
    public final ListenableFuture c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dxcc) {
            dxcc dxccVar = (dxcc) obj;
            if (dxccVar.b() == 2 && this.a.equals(dxccVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
