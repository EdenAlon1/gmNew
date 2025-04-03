package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chih {
    public final akzt a;
    private final albq b;
    private final errl c;

    public chih(albq albqVar, akzt akztVar, errl errlVar) {
        this.b = albqVar;
        this.a = akztVar;
        this.c = errlVar;
    }

    public final elfl a(chig chigVar, ListenableFuture listenableFuture) {
        String str = ((chgs) chigVar).a;
        elfr.l(listenableFuture, new chif(this, str == null ? new alaq() : this.b.b(str), chigVar), this.c);
        return elfl.g(listenableFuture);
    }
}
