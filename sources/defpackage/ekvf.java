package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekvf extends ekvl {
    private final ekvm a;
    private final ListenableFuture b;

    public ekvf(ekvm ekvmVar, ListenableFuture listenableFuture) {
        this.a = ekvmVar;
        this.b = listenableFuture;
    }

    @Override // defpackage.ekvl
    public final ekvm a() {
        return this.a;
    }

    @Override // defpackage.ekvl
    public final ListenableFuture b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekvl) {
            ekvl ekvlVar = (ekvl) obj;
            if (this.a.equals(ekvlVar.a()) && this.b.equals(ekvlVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ListenableFuture listenableFuture = this.b;
        return "MonitorReport{monitor=" + this.a.toString() + ", startReport=" + listenableFuture.toString() + "}";
    }
}
