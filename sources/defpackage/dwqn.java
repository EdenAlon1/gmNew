package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwqn extends Exception {
    public final dwqm a;
    public final int b;

    public dwqn(dwql dwqlVar) {
        super(dwqlVar.b, dwqlVar.c);
        this.a = dwqlVar.a;
        this.b = dwqlVar.d;
    }

    public static dwql a() {
        dwql dwqlVar = new dwql();
        dwqlVar.d = 2;
        return dwqlVar;
    }

    public static ListenableFuture b(ListenableFuture listenableFuture, final dwqm dwqmVar, final String str) {
        return elfr.f(listenableFuture, Throwable.class, new eroh() { // from class: dwqk
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dwql a = dwqn.a();
                a.a = dwqm.this;
                a.b = str;
                a.c = (Throwable) obj;
                return erqt.h(a.a());
            }
        }, erpp.a);
    }
}
