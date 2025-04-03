package defpackage;

import android.database.sqlite.SQLiteException;
import android.os.Trace;
import com.google.communication.synapse.security.scytale.SqlTransactionInterface;
import io.grpc.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class espb extends SqlTransactionInterface {
    private static final entd a = entd.c("SqlTransaction");
    private boolean b = false;
    private final cagh c;

    public espb(cagh caghVar) {
        this.c = caghVar;
        ((ensz) a.n().h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "<init>", 46, "SqlTransaction.java")).q("executing sql: BEGIN TRANSACTION;");
        ((dtve) caghVar.a.b()).j().beginTransaction();
    }

    @Override // com.google.communication.synapse.security.scytale.SqlTransactionInterface
    public final Status commit() {
        Status a2;
        Trace.beginSection("SqlTransaction.commit");
        try {
            try {
                ((ensz) a.n().h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "commit", 54, "SqlTransaction.java")).q("executing sql: COMMIT;");
                if (this.b || !this.c.b()) {
                    a2 = Status.d;
                } else {
                    try {
                        try {
                            ((dtve) this.c.a.b()).j().setTransactionSuccessful();
                            this.c.a();
                            this.b = true;
                            a2 = Status.b;
                        } catch (SQLiteException e) {
                            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "commit", ';', "SqlTransaction.java")).q("Error with setTransactionSuccessful.");
                            a2 = esoy.a(e);
                            this.c.a();
                        }
                    } catch (Throwable th) {
                        this.c.a();
                        throw th;
                    }
                }
            } finally {
                Trace.endSection();
            }
        } catch (Exception e2) {
            ((ensz) ((ensz) ((ensz) a.j()).g(e2)).h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "commit", 'E', "SqlTransaction.java")).q("Error committing transaction.");
            a2 = esoy.a(e2);
        }
        return a2;
    }

    protected final void finalize() {
        if (this.b) {
            return;
        }
        entd entdVar = a;
        ((ensz) ((ensz) entdVar.i()).h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "finalize", 99, "SqlTransaction.java")).q("Transaction was not rolled back or committed before dereferencing this object. Rolling it back now");
        Trace.beginSection("SqlTransaction.rollback");
        try {
            ((ensz) ((ensz) entdVar.h()).h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "rollback", 81, "SqlTransaction.java")).q("executing sql: ROLLBACK;");
            if (this.b || !this.c.b()) {
                List list = Status.a;
                return;
            }
            this.c.a();
            this.b = true;
            List list2 = Status.a;
        } catch (Exception e) {
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "rollback", 'Y', "SqlTransaction.java")).q("Error rolling back transaction.");
            esoy.a(e);
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.SqlTransactionInterface
    public final Status rollback() {
        Status a2;
        Trace.beginSection("SqlTransaction.rollback");
        try {
            try {
                ((ensz) ((ensz) a.h()).h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "rollback", 81, "SqlTransaction.java")).q("executing sql: ROLLBACK;");
                if (this.b || !this.c.b()) {
                    a2 = Status.d;
                } else {
                    this.c.a();
                    this.b = true;
                    a2 = Status.b;
                }
            } catch (Exception e) {
                ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlTransaction", "rollback", 'Y', "SqlTransaction.java")).q("Error rolling back transaction.");
                a2 = esoy.a(e);
            }
            return a2;
        } finally {
            Trace.endSection();
        }
    }
}
