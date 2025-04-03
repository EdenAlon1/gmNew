package defpackage;

import android.os.Trace;
import com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface;
import io.grpc.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class espc extends WriteOnlySqlStatementInterface {
    private static final entd b = entd.c("SqlStatement");
    final espa a = new espa();
    private final String c;
    private final cagh d;

    public espc(cagh caghVar, String str) {
        this.d = caghVar;
        this.c = str;
    }

    @Override // com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface
    public final Status bindBlob(byte[] bArr) {
        espa espaVar = this.a;
        if (bArr == null) {
            ((ensz) ((ensz) espa.a.i()).h("com/google/communication/synapse/security/scytale/store/SqlStatementShared", "bindBlob", 58, "SqlStatementShared.java")).q("value can not be null.");
            return Status.e;
        }
        Trace.beginSection("SqlStatement.bindBlob");
        try {
            try {
                espaVar.d = true;
                espaVar.b.add(bArr);
                Status status = Status.b;
                Trace.endSection();
                return status;
            } catch (Exception e) {
                ((ensz) ((ensz) ((ensz) espa.a.j()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatementShared", "bindBlob", 'C', "SqlStatementShared.java")).q("Error binding string to SqlStatement.");
                Status a = esoy.a(e);
                Trace.endSection();
                return a;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface
    public final Status bindInt(long j) {
        return this.a.a(j);
    }

    @Override // com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface
    public final Status bindString(byte[] bArr) {
        return this.a.b(bArr);
    }

    @Override // com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface
    public final Status executeWrite() {
        Status a;
        Trace.beginSection("WriteOnlySqlStatement.executeWrite");
        try {
            try {
                ((ensz) b.n().h("com/google/communication/synapse/security/scytale/store/WriteOnlySqlStatement", "executeWrite", 52, "WriteOnlySqlStatement.java")).t("executing write sql stmt: %s", this.c);
                cagh caghVar = this.d;
                String str = this.c;
                List list = this.a.b;
                Object[] array = list.toArray(new Object[list.size()]);
                if (array == null) {
                    ((dtve) caghVar.a.b()).j().execSQL(str);
                } else {
                    ((dtve) caghVar.a.b()).j().execSQL(str, array);
                }
                a = Status.b;
            } catch (Exception e) {
                ((ensz) ((ensz) ((ensz) b.i()).g(e)).h("com/google/communication/synapse/security/scytale/store/WriteOnlySqlStatement", "executeWrite", 60, "WriteOnlySqlStatement.java")).t("Error executing sql statement %s.", this.c);
                a = esoy.a(e);
            }
            return a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface
    public final void reset() {
        Trace.beginSection("SqlStatement.reset");
        try {
            this.a.c();
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface
    public final void close() {
    }
}
