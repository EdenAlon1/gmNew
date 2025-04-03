package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CancellationException;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crda {
    public static final entd a = entd.c("BugleFileTransfer");
    public final ffbr b;
    public final errl c;
    public final ffbr d;
    private final errl e;

    public crda(ffbr ffbrVar, errl errlVar, errl errlVar2, ffbr ffbrVar2) {
        this.b = ffbrVar;
        this.c = errlVar;
        this.e = errlVar2;
        this.d = ffbrVar2;
    }

    public static crca a(bdhg bdhgVar, awui awuiVar, crbv crbvVar, String str) {
        final emwd m = new avty().m();
        final crca crcaVar = (crca) crcb.a.createBuilder();
        String e = bdhg.e(bdhgVar);
        crcaVar.copyOnWrite();
        crcb crcbVar = (crcb) crcaVar.instance;
        crcbVar.b |= 1;
        crcbVar.c = e;
        crcaVar.copyOnWrite();
        crcb crcbVar2 = (crcb) crcaVar.instance;
        awuiVar.getClass();
        crcbVar2.l = awuiVar;
        crcbVar2.b |= 512;
        crbg crbgVar = (crbg) crbvVar;
        String uri = crbgVar.c.toString();
        crcaVar.copyOnWrite();
        crcb crcbVar3 = (crcb) crcaVar.instance;
        uri.getClass();
        crcbVar3.b |= 2;
        crcbVar3.d = uri;
        crcaVar.copyOnWrite();
        crcb crcbVar4 = (crcb) crcaVar.instance;
        str.getClass();
        crcbVar4.b |= 16;
        crcbVar4.g = str;
        crbgVar.d.ifPresent(new Consumer() { // from class: crcr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                crca crcaVar2 = crca.this;
                String str2 = (String) obj;
                crcaVar2.copyOnWrite();
                crcb crcbVar5 = (crcb) crcaVar2.instance;
                crcb crcbVar6 = crcb.a;
                str2.getClass();
                crcbVar5.b |= 4;
                crcbVar5.e = str2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        crbgVar.b.ifPresent(new Consumer() { // from class: crcs
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                entd entdVar = crda.a;
                awup awupVar = (awup) m.fP((ContentType) obj);
                crca crcaVar2 = crca.this;
                crcaVar2.copyOnWrite();
                crcb crcbVar5 = (crcb) crcaVar2.instance;
                crcb crcbVar6 = crcb.a;
                awupVar.getClass();
                crcbVar5.i = awupVar;
                crcbVar5.b |= 64;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return crcaVar;
    }

    public final elfl b(final String str, crcb crcbVar) {
        cetp cetpVar = new cetp();
        cetpVar.d = str;
        cetpVar.b = str;
        return ((cevh) ((crdm) this.b.b()).a.b()).a(ceyr.h("messaging_file_upload", crcbVar, cetpVar.a())).b().h(new emwl() { // from class: crcy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = crda.a;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str2 = str;
                if (booleanValue) {
                    ensz enszVar = (ensz) crda.a.h();
                    enszVar.Y(cqpo.a, str2);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkScheduler", "queueFileUpload", 155, "FileUploadWorkScheduler.java")).q("File upload is queued.");
                    return ckbx.i;
                }
                ensz enszVar2 = (ensz) crda.a.j();
                enszVar2.Y(cqpo.a, str2);
                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkScheduler", "queueFileUpload", 158, "FileUploadWorkScheduler.java")).q("Failed to queue file upload.");
                return ckbx.j(3, 0).a();
            }
        }, this.e).e(CancellationException.class, new emwl() { // from class: crcz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensz enszVar = (ensz) crda.a.h();
                enszVar.Y(cqpo.a, str);
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkScheduler", "queueFileUpload", 170, "FileUploadWorkScheduler.java")).q("Not queuing file upload as it is already scheduled.");
                return ckbx.i;
            }
        }, this.e);
    }

    public final elfl c(final String str, final MessageCoreData messageCoreData, final crbv crbvVar) {
        return elfo.h(new erog() { // from class: crcx
            @Override // defpackage.erog
            public final ListenableFuture a() {
                MessageCoreData messageCoreData2 = messageCoreData;
                bdhg E = messageCoreData2.E();
                awui w = messageCoreData2.w();
                crbv crbvVar2 = crbvVar;
                String str2 = str;
                final crca a2 = crda.a(E, w, crbvVar2, str2);
                crbg crbgVar = (crbg) crbvVar2;
                crbgVar.g.ifPresent(new Consumer() { // from class: crct
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        crca crcaVar = crca.this;
                        eyee eyeeVar = (eyee) obj;
                        crcaVar.copyOnWrite();
                        crcb crcbVar = (crcb) crcaVar.instance;
                        crcb crcbVar2 = crcb.a;
                        eyeeVar.getClass();
                        crcbVar.b |= 8;
                        crcbVar.f = eyeeVar;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                crbgVar.f.ifPresent(new Consumer() { // from class: crcu
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        entd entdVar = crda.a;
                        awup awupVar = (awup) new avty().m().fP((ContentType) obj);
                        crca crcaVar = crca.this;
                        crcaVar.copyOnWrite();
                        crcb crcbVar = (crcb) crcaVar.instance;
                        crcb crcbVar2 = crcb.a;
                        awupVar.getClass();
                        crcbVar.j = awupVar;
                        crcbVar.b |= 128;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return crda.this.b(str2, (crcb) a2.build());
            }
        }, this.c);
    }
}
