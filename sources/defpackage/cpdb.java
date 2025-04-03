package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpdb extends efet {
    private final akzt a;
    private final efil b = new efil(cpcp.a);

    public cpdb(akzt akztVar) {
        this.a = akztVar;
    }

    @Override // defpackage.efet
    public final ListenableFuture a(IOException iOException, efeu efeuVar) {
        this.a.c("Bugle.ForwardSync.SyncManagerDataStore.CorruptData.Count");
        return this.b.a(iOException, efeuVar);
    }
}
