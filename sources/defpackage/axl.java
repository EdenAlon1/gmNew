package defpackage;

import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axl extends bdy {
    final /* synthetic */ axt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axl(axt axtVar, Size size) {
        super(size, 34);
        this.a = axtVar;
    }

    @Override // defpackage.bdy
    protected final ListenableFuture a() {
        return this.a.h;
    }
}
