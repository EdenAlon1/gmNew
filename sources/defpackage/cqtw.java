package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqtw {
    public static final ejui a = new ejtz("file_transfer_data_service");
    private static final cfup f = cfvl.e(cfvl.b, "file_transfer_progress_timeout_sec", 300);
    public final Map b = new HashMap();
    public final Executor c;
    public final ejvp d;
    public final ctbl e;
    private final errm g;

    public cqtw(errm errmVar, ejvp ejvpVar, ctbk ctbkVar) {
        this.c = new ersb(errmVar);
        this.d = ejvpVar;
        this.g = errmVar;
        this.e = ctbkVar.a(new cqtt());
    }

    public final elfl a(final MessageIdType messageIdType, final cqpu cqpuVar) {
        elfl f2 = elfo.f(new Runnable() { // from class: cqtq
            @Override // java.lang.Runnable
            public final void run() {
                cqtw.this.b.put(messageIdType, cqpuVar);
            }
        }, this.c);
        this.d.a(f2, a);
        this.e.c(new Supplier() { // from class: cqtr
            @Override // java.util.function.Supplier
            public final Object get() {
                ejui ejuiVar = cqtw.a;
                return MessageIdType.this;
            }
        }, "FileTransferDataService::Notify");
        elfl.g(this.g.schedule(eldl.l(new Runnable() { // from class: cqts
            @Override // java.lang.Runnable
            public final void run() {
                final cqtw cqtwVar = cqtw.this;
                final MessageIdType messageIdType2 = messageIdType;
                final cqpu cqpuVar2 = cqpuVar;
                cqtwVar.d.a(elfo.f(new Runnable() { // from class: cqtn
                    @Override // java.lang.Runnable
                    public final void run() {
                        cqtw cqtwVar2 = cqtw.this;
                        Map map = cqtwVar2.b;
                        MessageIdType messageIdType3 = messageIdType2;
                        if (cqpuVar2.equals((cqpu) map.get(messageIdType3))) {
                            cqtwVar2.b.remove(messageIdType3);
                        }
                    }
                }, cqtwVar.c), cqtw.a);
                cqtwVar.e.c(new Supplier() { // from class: cqtp
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        ejui ejuiVar = cqtw.a;
                        return MessageIdType.this;
                    }
                }, "FileTransferDataService::Notify");
            }
        }), Duration.ofSeconds(((Integer) f.e()).intValue()).getSeconds(), TimeUnit.SECONDS)).k(axnw.b(), erpp.a);
        return f2;
    }
}
