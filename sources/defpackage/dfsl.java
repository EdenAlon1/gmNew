package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfsl {
    final /* synthetic */ BasePendingResult a;

    public dfsl(BasePendingResult basePendingResult) {
        this.a = basePendingResult;
    }

    protected final void finalize() {
        ThreadLocal threadLocal = BasePendingResult.b;
        BasePendingResult.k(this.a.e);
        super.finalize();
    }
}
