package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekjf implements erog {
    final /* synthetic */ Map.Entry a;

    public ekjf(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.erog
    public final ListenableFuture a() {
        return ((ekhx) ((ffbr) this.a.getValue()).b()).a();
    }
}
