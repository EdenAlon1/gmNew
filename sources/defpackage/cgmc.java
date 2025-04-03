package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgmc implements dwqt {
    private final Supplier a;
    private final Supplier b;

    public cgmc(Supplier supplier, Supplier supplier2) {
        this.a = supplier;
        this.b = supplier2;
    }

    @Override // defpackage.dwqt
    public final ListenableFuture a(dwub dwubVar) {
        Object obj;
        Object obj2;
        obj = this.b.get();
        if (!((Boolean) ((cfva) obj).e()).booleanValue()) {
            return elfo.e(null);
        }
        obj2 = this.a.get();
        return ((dwqt) obj2).a(dwubVar);
    }
}
