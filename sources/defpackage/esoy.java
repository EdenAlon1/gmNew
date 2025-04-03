package defpackage;

import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import io.grpc.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esoy {
    public static Status a(Exception exc) {
        if (!(exc instanceof SQLiteException)) {
            return Status.c(exc).withDescription(exc.getMessage());
        }
        List c = emyt.c(exc);
        String b = new emww("\nCaused by: ").b(enjk.f(c, new emwl() { // from class: esow
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((Throwable) obj).getMessage();
            }
        }));
        return enjk.q(c, new emxg() { // from class: esox
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return ((Throwable) obj) instanceof SQLiteDatabaseLockedException;
            }
        }) ? Status.p.withDescription(b) : (b.contains("no such table") || b.contains("no such column")) ? Status.q.withDescription(b) : Status.o.withDescription(b);
    }
}
