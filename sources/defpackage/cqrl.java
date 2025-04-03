package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqrl {
    public static final entd a = entd.c("BugleFileTransfer");
    public static final cfup b = cfvl.f(cfvl.b, "min_file_upload_validity", 86400000);
    public final ffbr c;
    public final dtuu d;
    public final cqoh e;
    private final errl f;

    public cqrl(errl errlVar, dtuu dtuuVar, ffbr ffbrVar, cqoh cqohVar) {
        this.f = errlVar;
        this.d = dtuuVar;
        this.c = ffbrVar;
        this.e = cqohVar;
    }

    public static engw d(final Instant instant, final int i, int i2, final Duration duration) {
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("updateMessagesForAutoResume");
        buxrVar.Y(new Function() { // from class: cqqy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                entd entdVar = cqrl.a;
                buxzVar.af(i);
                buxzVar.aq(new dtwe("messages.raw_status", 1, 10007));
                buxzVar.S(instant.minus(duration).toEpochMilli());
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxrVar.U(i2);
        buxrVar.O(instant.toEpochMilli());
        buxrVar.B(0);
        Stream map = Collection.EL.stream(buxrVar.b().b()).map(new Function() { // from class: cqqz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MessagesTable.BindData) obj).D();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i3 = engw.d;
        return (engw) map.collect(endq.a);
    }

    public static Optional e(final MessageIdType messageIdType) {
        return (Optional) cqtj.e(messageIdType, new Function() { // from class: cqri
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Optional.of((cqrs) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Supplier() { // from class: cqrj
            @Override // java.util.function.Supplier
            public final Object get() {
                ensz enszVar = (ensz) cqrl.a.h();
                enszVar.Y(csux.b, MessageIdType.this);
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getFileTransferBindData", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "FileTransferDatabaseOperations.java")).q("No file transfer bind data found.");
                return Optional.empty();
            }
        });
    }

    public final cqrn a(MessageIdType messageIdType) {
        cqqr cqqrVar = new cqqr();
        MessageCoreData z = ((bdmq) this.c.b()).z(messageIdType);
        if (z != null) {
            cqqrVar.c(z);
            Optional e = e(messageIdType);
            if (!e.isEmpty()) {
                cqqrVar.b((cqrs) e.get());
                return cqqrVar.a();
            }
        }
        return cqqrVar.a();
    }

    public final cqrn b(String str, Optional optional) {
        cqqr cqqrVar = new cqqr();
        Optional f = f(str, optional);
        if (f.isEmpty()) {
            ensz enszVar = (ensz) a.h();
            enszVar.Y(cqpo.a, str);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getFileTransferMessageCoreData", 174, "FileTransferDatabaseOperations.java")).t("No FileTransferData entry found. %s", optional);
            return cqqrVar.a();
        }
        cqqrVar.b((cqrs) f.get());
        cqrs cqrsVar = (cqrs) f.get();
        MessageCoreData v = ((bdmq) this.c.b()).v(cqrsVar.n());
        if (v == null) {
            ensz enszVar2 = (ensz) a.h();
            enszVar2.Y(csux.a, cqrsVar.n().b());
            enszVar2.Y(cqpo.a, cqrsVar.r());
            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getMessageCoreData", 218, "FileTransferDatabaseOperations.java")).q("No MessageCoreData entry found.");
            v = null;
        } else {
            ensz enszVar3 = (ensz) a.h();
            enszVar3.Y(csux.a, v.B().b());
            enszVar3.Y(cqpo.a, cqrsVar.r());
            ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getMessageCoreData", 226, "FileTransferDatabaseOperations.java")).q("MessageCoreData entry found.");
        }
        if (v != null) {
            cqqrVar.c(v);
            return cqqrVar.a();
        }
        ensz enszVar4 = (ensz) a.h();
        enszVar4.Y(cqpo.a, str);
        ((ensz) enszVar4.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getFileTransferMessageCoreData", 184, "FileTransferDatabaseOperations.java")).q("MessageCoreData null.");
        return cqqrVar.a();
    }

    public final elfl c(final String str, final Optional optional) {
        return elfo.g(new Callable() { // from class: cqqx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cqrl.this.b(str, optional);
            }
        }, this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Optional f(String str, Optional optional) {
        String[] strArr = cqtj.a;
        final cqti cqtiVar = new cqti();
        cqtiVar.c(str);
        optional.ifPresent(new Consumer() { // from class: cqrc
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cqti.this.d((cqtk) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        cqte b2 = cqtj.b();
        b2.z("+getFileTransferBindData-file_transfer1");
        b2.d(cqtiVar);
        engw cW = ((cqsp) b2.b().o()).cW();
        if (((enou) cW).c == 1) {
            return Optional.of((cqrs) cW.get(0));
        }
        if (cW.isEmpty()) {
            ensz enszVar = (ensz) a.h();
            enszVar.Y(cqpo.a, str);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getFileTransferBindData", 133, "FileTransferDatabaseOperations.java")).q("No FileTransferData entry found.");
        } else {
            cqta cqtaVar = new cqta();
            cqtaVar.f("getFileTransferBindData");
            cqtaVar.a(cqtiVar);
            boolean z = cqtaVar.d() > 0;
            ensz enszVar2 = (ensz) a.j();
            enszVar2.Y(cqpo.a, str);
            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "getFileTransferBindData", 148, "FileTransferDatabaseOperations.java")).t("Duplicate transfer id found. FileTransferData entries deleted: %b", Boolean.valueOf(z));
        }
        return Optional.empty();
    }

    public final Optional g(MessageIdType messageIdType) {
        return e(messageIdType).map(new Function() { // from class: cqrd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cqrs) obj).m();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final List h(String str, cqtk cqtkVar) {
        ekzz f = eleg.f("FileTransferDatabaseOperations#getFileTransferEntries");
        try {
            cqte b2 = cqtj.b();
            b2.z("getFileTransferEntries");
            cqti cqtiVar = new cqti();
            cqtiVar.c(str);
            cqtiVar.d(cqtkVar);
            b2.k(new cqth(cqtiVar));
            engw y = b2.b().y();
            f.close();
            return y;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean i(MessageIdType messageIdType, String str) {
        String[] strArr = cqtj.a;
        cqti cqtiVar = new cqti();
        cqtiVar.c(str);
        cqtiVar.d(cqtk.UPLOAD);
        cqtiVar.aq(new dtrt("file_transfer.message_id", 2, Long.valueOf(bdhb.a(messageIdType))));
        cqta cqtaVar = new cqta();
        cqtaVar.f("deleteFileUploadDuplicateTransferId");
        cqtaVar.a(cqtiVar);
        return cqtaVar.d() > 0;
    }

    public final boolean j(MessageIdType messageIdType) {
        String[] strArr = cqtj.a;
        cqti cqtiVar = new cqti();
        cqtiVar.b(messageIdType);
        cqta cqtaVar = new cqta();
        cqtaVar.f("deleteFileUploadResponse");
        cqtaVar.a(cqtiVar);
        return cqtaVar.d() > 0;
    }

    public final boolean k(MessageIdType messageIdType) {
        return g(messageIdType).filter(new Predicate() { // from class: cqra
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                awvd awvdVar = (awvd) obj;
                if (awvdVar == null || awvd.a.equals(awvdVar)) {
                    ((ensz) ((ensz) cqrl.a.j()).h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "isFileUploadResponseValid", 281, "FileTransferDatabaseOperations.java")).q("FileUploadResponse is not valid because it is null");
                    return false;
                }
                cqrl cqrlVar = cqrl.this;
                Instant f = cqrlVar.e.f();
                awvb awvbVar = awvdVar.c;
                if (awvbVar == null) {
                    awvbVar = awvb.a;
                }
                eyja eyjaVar = awvbVar.g;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                boolean z = Duration.ofMillis(((Long) cqrl.b.e()).longValue()).compareTo(Duration.between(f, eykj.d(eyjaVar))) <= 0;
                if (!z) {
                    ensz enszVar = (ensz) ((ensz) cqrl.a.j()).h("com/google/android/apps/messaging/shared/transfer/database/FileTransferDatabaseOperations", "isFileUploadResponseValid", 292, "FileTransferDatabaseOperations.java");
                    Instant f2 = cqrlVar.e.f();
                    awvb awvbVar2 = awvdVar.c;
                    if (awvbVar2 == null) {
                        awvbVar2 = awvb.a;
                    }
                    eyja eyjaVar2 = awvbVar2.g;
                    if (eyjaVar2 == null) {
                        eyjaVar2 = eyja.a;
                    }
                    enszVar.D("FileUploadResponse timestamp is not valid. Current time: %s. File was valid until %s.", f2, eykj.d(eyjaVar2));
                }
                return z;
            }
        }).isPresent();
    }

    public final boolean l(final String str, final cqtk cqtkVar, String str2) {
        ekzz f = eleg.f("FileTransferDatabaseOperations#updateFileTransferEntryWithTransferHandle");
        try {
            String[] strArr = cqtj.a;
            cqtg cqtgVar = new cqtg();
            cqtgVar.ap("updateFileTransferEntryWithTransferHandle");
            cqtgVar.f(new Function() { // from class: cqrb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cqti cqtiVar = (cqti) obj;
                    entd entdVar = cqrl.a;
                    cqtiVar.c(str);
                    cqtiVar.d(cqtkVar);
                    return cqtiVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            cqtgVar.e(str2);
            boolean z = cqtgVar.b().e() == 1;
            f.close();
            return z;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean m(MessageIdType messageIdType, String str, cqtk cqtkVar, awvb awvbVar) {
        ekzz f = eleg.f("FileTransferDatabaseOperations#upsertFileTransferEntry");
        try {
            String[] strArr = cqtj.a;
            cqrv cqrvVar = new cqrv();
            cqrvVar.c(messageIdType);
            cqrvVar.e(str);
            cqrvVar.f(cqtkVar);
            cqrvVar.b(awvbVar);
            cqrs a2 = cqrvVar.a();
            cqti cqtiVar = new cqti();
            cqtiVar.b(messageIdType);
            boolean s = a2.s(new cqth(cqtiVar));
            f.close();
            return s;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean n(MessageIdType messageIdType, String str, cqtk cqtkVar, awvb awvbVar, byte[] bArr) {
        ekzz f = eleg.f("FileTransferDatabaseOperations#upsertFileTransferEntryWithOpaqueData");
        try {
            String[] strArr = cqtj.a;
            cqrv cqrvVar = new cqrv();
            cqrvVar.c(messageIdType);
            cqrvVar.e(str);
            cqrvVar.f(cqtkVar);
            cqrvVar.b(awvbVar);
            cqrvVar.d(bArr);
            cqrs a2 = cqrvVar.a();
            cqti cqtiVar = new cqti();
            cqtiVar.b(messageIdType);
            boolean s = a2.s(new cqth(cqtiVar));
            f.close();
            return s;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
