package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class ejoo {
    public static ListenableFuture a(ejop ejopVar, String str, ppa ppaVar, ppw ppwVar) {
        return ejopVar.g(str, ppaVar, Collections.singletonList(ppwVar));
    }

    public static ListenableFuture b(ListenableFuture listenableFuture) {
        return elfr.j(listenableFuture, new emwl() { // from class: ejon
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }
}
