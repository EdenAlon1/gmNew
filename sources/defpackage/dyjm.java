package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyjm {
    public static dyjv a;

    public static ListenableFuture a(final Callable callable) {
        return erqt.n(new erog() { // from class: dyjl
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return erqt.i(callable.call());
            }
        }, erpp.a);
    }
}
