package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekcu {
    public static final ListenableFuture a(final List list) {
        return elfr.a(list).b(new erog() { // from class: ekct
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return erqt.e(list);
            }
        }, erpp.a);
    }
}
