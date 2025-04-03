package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekua implements ekhx {
    private final ffbr a;
    private final boolean b;

    public ekua(ffbr ffbrVar, boolean z) {
        this.a = ffbrVar;
        this.b = z;
    }

    @Override // defpackage.ekhx
    public final ListenableFuture a() {
        return this.b ? ((eksc) this.a.b()).a() : erre.a;
    }
}
