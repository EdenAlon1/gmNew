package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class beb implements bjt {
    final /* synthetic */ kfb a;

    public beb(kfb kfbVar) {
        this.a = kfbVar;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        if (th instanceof TimeoutException) {
            this.a.c(th);
        } else {
            this.a.b(Collections.EMPTY_LIST);
        }
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        ksw.h(list);
        this.a.b(new ArrayList(list));
    }
}
