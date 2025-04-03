package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekfr implements fbba {
    public static ekhx a(final ekav ekavVar, final edyp edypVar, emxc emxcVar) {
        ekavVar.getClass();
        return new ekhx() { // from class: ekfn
            @Override // defpackage.ekhx
            public final ListenableFuture a() {
                if (!ekfq.a(edyp.this)) {
                    return erre.a;
                }
                ListenableFuture e = ekavVar.e();
                ejjz.c(e, "Failed to obtain initial snapshot", new Object[0]);
                return e;
            }
        };
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
