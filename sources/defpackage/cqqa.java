package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqqa implements cqqb {
    public static final entd a = entd.c("BugleFileTransfer");
    public final dtuu b;
    public final cqtw c;
    private final errl d;
    private final errl e;
    private final ConcurrentMap f;

    public cqqa(dtuu dtuuVar, cqtw cqtwVar, errl errlVar, errl errlVar2, ConcurrentMap concurrentMap) {
        this.b = dtuuVar;
        this.c = cqtwVar;
        this.d = errlVar;
        this.e = errlVar2;
        this.f = concurrentMap;
    }

    @Override // defpackage.cqqb
    public final elfl a(awbs awbsVar, cqpu cqpuVar) {
        String str = awbsVar.a;
        if (str != null) {
            return b(str, cqpuVar);
        }
        awap awapVar = awbsVar.b;
        awapVar.getClass();
        awan awanVar = (awan) this.f.get(awapVar);
        if (awanVar == null) {
            ensz enszVar = (ensz) a.j();
            enszVar.Y(cqpo.j, awapVar);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/FileTransferProgressCallbackHandler", "onTransferProgress", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "FileTransferProgressCallbackHandler.java")).q("Upload progress update is called but the file transfer entry is not present in the inProgressFileTransferMap.");
            return elfo.e(null);
        }
        MessageCoreData a2 = awanVar.b.a();
        if (a2 == null) {
            ensz enszVar2 = (ensz) a.j();
            enszVar2.Y(cqpo.j, awapVar);
            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/FileTransferProgressCallbackHandler", "onTransferProgress", 111, "FileTransferProgressCallbackHandler.java")).q("Upload progress update is called but the pipeline context has no MessageCoreData.");
            return elfo.e(null);
        }
        MessageIdType B = a2.B();
        ensk o = a.o();
        o.Y(cqpo.j, awapVar);
        o.Y(csux.b, B);
        ((ensz) o.h("com/google/android/apps/messaging/shared/transfer/FileTransferProgressCallbackHandler", "onTransferProgress", 121, "FileTransferProgressCallbackHandler.java")).q("Transfer progress is being updated.");
        return this.c.a(B, cqpuVar);
    }

    @Override // defpackage.cqqb
    public final elfl b(final String str, final cqpu cqpuVar) {
        return elfo.g(new Callable() { // from class: cqpz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final String str2 = str;
                return (MessageIdType) cqqa.this.b.c("FileTransferProgressCallbackHandler#readMessageIdForFileTransferFromBugleDatabase", new emyl() { // from class: cqpw
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emyl
                    public final Object get() {
                        entd entdVar = cqqa.a;
                        cqte b = cqtj.b();
                        b.z("readMessageIdForFileTransferFromBugleDatabase");
                        final String str3 = str2;
                        b.e(new Function() { // from class: cqpx
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                cqti cqtiVar = (cqti) obj;
                                entd entdVar2 = cqqa.a;
                                cqtiVar.c(str3);
                                return cqtiVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        cqsp cqspVar = (cqsp) b.b().p(cqtj.c.a);
                        try {
                            engw c = cqspVar.c();
                            cqspVar.close();
                            if (c.isEmpty()) {
                                ensz enszVar = (ensz) cqqa.a.j();
                                enszVar.Y(cqpo.a, str3);
                                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/FileTransferProgressCallbackHandler", "readMessageIdForFileTransferFromBugleDatabase", 145, "FileTransferProgressCallbackHandler.java")).q("Transfer progress update is called but the file transfer entry is not present in database.");
                                return bdhb.a;
                            }
                            MessageIdType messageIdType = (MessageIdType) c.get(0);
                            if (((enou) c).c <= 1) {
                                return messageIdType;
                            }
                            ensz enszVar2 = (ensz) cqqa.a.j();
                            enszVar2.Y(cqpo.a, str3);
                            enszVar2.Y(csux.b, messageIdType);
                            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/FileTransferProgressCallbackHandler", "readMessageIdForFileTransferFromBugleDatabase", 157, "FileTransferProgressCallbackHandler.java")).q("There are multiple entries for a single file transferId of a message.");
                            return messageIdType;
                        } catch (Throwable th) {
                            try {
                                cqspVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                });
            }
        }, this.e).i(new eroh() { // from class: cqpy
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                MessageIdType messageIdType = (MessageIdType) obj;
                if (messageIdType.c()) {
                    return elfo.e(null);
                }
                cqpu cqpuVar2 = cqpuVar;
                String str2 = str;
                cqqa cqqaVar = cqqa.this;
                ensk o = cqqa.a.o();
                o.Y(cqpo.a, str2);
                o.Y(csux.b, messageIdType);
                ((ensz) o.h("com/google/android/apps/messaging/shared/transfer/FileTransferProgressCallbackHandler", "onTransferProgress", 78, "FileTransferProgressCallbackHandler.java")).q("Transfer progress is being updated.");
                return cqqaVar.c.a(messageIdType, cqpuVar2);
            }
        }, this.d);
    }
}
