package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duvg extends duvk {
    public final duvj a;
    private final ListenableFuture c;
    private final duwk d;

    public duvg(duvj duvjVar, ListenableFuture listenableFuture, duwk duwkVar) {
        if (duvjVar == null) {
            throw new NullPointerException("Null drawParams");
        }
        this.a = duvjVar;
        this.c = listenableFuture;
        this.d = duwkVar;
    }

    @Override // defpackage.duvk
    public final duvj a() {
        return this.a;
    }

    @Override // defpackage.duvk
    public final ListenableFuture b() {
        return this.c;
    }

    @Override // defpackage.duvk
    public final duwk c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof duvk) {
            duvk duvkVar = (duvk) obj;
            if (this.a.b(duvkVar.a()) && this.c.equals(duvkVar.b()) && this.d.equals(duvkVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        duwk duwkVar = this.d;
        ListenableFuture listenableFuture = this.c;
        return "DrawRequest{drawParams=" + this.a.toString() + ", future=" + listenableFuture.toString() + ", callback=" + duwkVar.toString() + "}";
    }
}
