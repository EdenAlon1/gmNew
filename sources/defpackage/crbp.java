package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.ProcessFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.CancellationException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crbp implements crbq {
    public static final entd a = entd.c("BugleFileTransfer");
    public final dtuu b;
    public final ffbr c;
    public final bbhf d;
    public final crga e;
    public final baoy f;
    public final cqoh g;
    private final errl h;
    private final bbfm i;

    public crbp(dtuu dtuuVar, errl errlVar, ffbr ffbrVar, bbhf bbhfVar, bbfm bbfmVar, crga crgaVar, baoy baoyVar, cqoh cqohVar) {
        this.h = errlVar;
        this.b = dtuuVar;
        this.c = ffbrVar;
        this.d = bbhfVar;
        this.i = bbfmVar;
        this.e = crgaVar;
        this.f = baoyVar;
        this.g = cqohVar;
    }

    @Override // defpackage.crbq
    public final elfl a(final crek crekVar, Optional optional) {
        final Optional map = optional.map(new Function() { // from class: crbl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = crbp.a;
                epye epyeVar = (epye) epyh.a.createBuilder();
                epyeVar.copyOnWrite();
                epyh epyhVar = (epyh) epyeVar.instance;
                epyhVar.c = 1;
                epyhVar.b |= 1;
                return ((avvd) obj).j(1, (epyh) epyeVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ensz enszVar = (ensz) a.h();
        enszVar.Y(csux.e, ((crbj) crekVar).a.toString());
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadCallbackHandler", "onUploadSucceeded", 97, "FileUploadCallbackHandler.java")).q("Upload succeeded callback is called.");
        return elfo.h(new erog() { // from class: crbm
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final crbp crbpVar = crbp.this;
                final crek crekVar2 = crekVar;
                Optional optional2 = (Optional) crbpVar.b.c("FileUploadCallbackHandler#onUploadSucceeded", new emyl() { // from class: crbn
                    @Override // defpackage.emyl
                    public final Object get() {
                        crbp crbpVar2 = crbp.this;
                        bdmq bdmqVar = (bdmq) crbpVar2.c.b();
                        crbj crbjVar = (crbj) crekVar2;
                        bdhg bdhgVar = crbjVar.a;
                        final Optional ofNullable = Optional.ofNullable(bdmqVar.w(bdhgVar));
                        if (ofNullable.isEmpty()) {
                            ensz enszVar2 = (ensz) crbp.a.j();
                            enszVar2.Y(csux.f, bdhgVar);
                            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadCallbackHandler", "verifyMessageWithAttachment", 230, "FileUploadCallbackHandler.java")).q("Upload callback is called, however message was already deleted from the DB. Ignoring.");
                        } else {
                            cqtj.a(((MessageCoreData) ofNullable.get()).B()).getClass();
                        }
                        if (ofNullable.isEmpty()) {
                            return Optional.empty();
                        }
                        String[] strArr = cqtj.a;
                        cqtg cqtgVar = new cqtg();
                        cqtgVar.ap("updateFileTransferTable");
                        cqtgVar.f(new Function() { // from class: crbo
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                cqti cqtiVar = (cqti) obj;
                                entd entdVar = crbp.a;
                                cqtiVar.b(((MessageCoreData) Optional.this.get()).B());
                                return cqtiVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        cqtgVar.c(crbjVar.d);
                        cqtgVar.b().e();
                        if (((MessageCoreData) ofNullable.get()).k() == 12) {
                            return ofNullable;
                        }
                        ((MessageCoreData) ofNullable.get()).bV(4);
                        ((bdmq) crbpVar2.c.b()).T((MessageCoreData) ofNullable.get());
                        return ofNullable;
                    }
                });
                if (optional2.isEmpty()) {
                    ((ensz) ((ensz) crbp.a.j()).h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadCallbackHandler", "onUploadSucceeded", 106, "FileUploadCallbackHandler.java")).q("Message not found, not starting sendMessageAction.");
                    return elfo.e(null);
                }
                MessageCoreData messageCoreData = (MessageCoreData) optional2.get();
                crbj crbjVar = (crbj) crekVar2;
                awvb awvbVar = crbjVar.d.c;
                if (awvbVar == null) {
                    awvbVar = awvb.a;
                }
                String str = awvbVar.c;
                eifc d = ContentType.d();
                awup awupVar = awvbVar.e;
                if (awupVar == null) {
                    awupVar = awup.a;
                }
                d.f(awupVar.c);
                awup awupVar2 = awvbVar.e;
                if (awupVar2 == null) {
                    awupVar2 = awup.a;
                }
                d.e(awupVar2.d);
                String contentType = d.g().toString();
                if (!messageCoreData.cB() && !bzpp.a(str, contentType)) {
                    MessageCoreData a2 = crbpVar.f.a(crbjVar.a, (String) crbjVar.b.orElse(null), crbjVar.c.isPresent() ? ((Instant) crbjVar.c.get()).toEpochMilli() : crbpVar.g.f().toEpochMilli() + ((Long) cnko.b.e()).longValue());
                    if (a2 != null) {
                        messageCoreData = a2;
                    }
                }
                crga crgaVar = crbpVar.e;
                MessageCoreData messageCoreData2 = (MessageCoreData) optional2.get();
                awvb awvbVar2 = crbjVar.d.c;
                if (awvbVar2 == null) {
                    awvbVar2 = awvb.a;
                }
                crgaVar.d(messageCoreData2, map, awvbVar2);
                if (messageCoreData.k() == 12) {
                    return elfo.e(null);
                }
                Action e = crbpVar.d.e(messageCoreData, 2);
                if (e == null) {
                    ensz enszVar2 = (ensz) crbp.a.j();
                    enszVar2.Y(csux.b, messageCoreData.B());
                    enszVar2.Y(csux.e, messageCoreData.E().toString());
                    ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadCallbackHandler", "startSendMessageAction", 258, "FileUploadCallbackHandler.java")).q("Failed to create action.");
                    return elfo.e(null);
                }
                ensz enszVar3 = (ensz) crbp.a.h();
                enszVar3.Y(csux.b, messageCoreData.B());
                enszVar3.Y(csux.e, messageCoreData.E().toString());
                ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadCallbackHandler", "startSendMessageAction", 266, "FileUploadCallbackHandler.java")).q("Invoking SendMessageAction to send file transfer message.");
                return e.q();
            }
        }, this.h);
    }

    @Override // defpackage.crbq
    public final elfl b(String str, avvd avvdVar, int i) {
        avuq avuqVar = (avuq) avvdVar;
        int i2 = 11;
        if (avuqVar.e.isPresent() && (avuqVar.e.get() instanceof CancellationException)) {
            i2 = 5;
        }
        entd entdVar = a;
        ensz enszVar = (ensz) entdVar.h();
        enszVar.Y(csux.e, str);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadCallbackHandler", "onUploadFailed", 161, "FileUploadCallbackHandler.java")).q("Upload failed callback is called.");
        FileTransferEvent fileTransferEvent = new FileTransferEvent(20013, 0L, i2, str);
        ProcessFileTransferAction b = ((banf) this.i).b(fileTransferEvent);
        bbcg bbcgVar = b.t;
        epye epyeVar = (epye) epyh.a.createBuilder();
        epyeVar.copyOnWrite();
        epyh epyhVar = (epyh) epyeVar.instance;
        epyhVar.c = 1;
        epyhVar.b = 1 | epyhVar.b;
        bbcgVar.t("key_failed_file_transfer_diagnostics", new ProtoParsers.InternalDontUse(null, avvdVar.j(i, (epyh) epyeVar.build())));
        bbcg bbcgVar2 = b.t;
        epxt epxtVar = (epxt) epxv.a.createBuilder();
        String str2 = avuqVar.d;
        epxtVar.copyOnWrite();
        epxv epxvVar = (epxv) epxtVar.instance;
        str2.getClass();
        epxvVar.b |= 8;
        epxvVar.f = str2;
        bbcgVar2.t("key_failed_file_transfer_details", new ProtoParsers.InternalDontUse(null, (epxv) epxtVar.build()));
        ensz enszVar2 = (ensz) entdVar.h();
        enszVar2.Y(csux.e, str);
        enszVar2.Y(cqpo.g, fileTransferEvent);
        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadCallbackHandler", "onUploadFailed", 192, "FileUploadCallbackHandler.java")).q("Invoking ProcessFileTransferAction.");
        return b.q();
    }
}
