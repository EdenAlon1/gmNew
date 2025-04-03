package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alfj extends efet {
    private final akzt a;
    private final efil b = new efil(alfi.a);

    public alfj(akzt akztVar) {
        this.a = akztVar;
    }

    @Override // defpackage.efet
    public final ListenableFuture a(IOException iOException, efeu efeuVar) {
        this.a.c("Bugle.ProtoDataStore.Corruption.UsageData.Count");
        return this.b.a(iOException, efeuVar);
    }
}
