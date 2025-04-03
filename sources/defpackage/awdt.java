package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awdt implements awcz {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl");
    private final ffsk b;
    private final ffhd c;
    private final cqrl d;
    private final awfu e;
    private final atwx f;

    public awdt(ffsk ffskVar, ffhd ffhdVar, ffsk ffskVar2, cqrl cqrlVar, awfu awfuVar, atwx atwxVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        ffskVar2.getClass();
        cqrlVar.getClass();
        atwxVar.getClass();
        this.b = ffskVar;
        this.c = ffhdVar;
        this.d = cqrlVar;
        this.e = awfuVar;
        this.f = atwxVar;
    }

    @Override // defpackage.awcz
    public final awcx a(awbs awbsVar) {
        awbsVar.getClass();
        String str = awbsVar.a;
        if (str != null) {
            Optional f = this.d.f(str, Optional.of(cqtk.UPLOAD));
            if (!f.isPresent()) {
                avvc g = avvd.g();
                g.f(cqpn.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_THUMBNAIL_INFO_IN_DB);
                return new awcu(g.a());
            }
            awvb l = ((cqrs) f.get()).l();
            if (l != null && !l.equals(awvb.a)) {
                return new awct(l);
            }
            avvc g2 = avvd.g();
            g2.f(cqpn.FILE_TRANSFER_FAILURE_REASON_MISSING_THUMBNAIL);
            return new awcu(g2.a());
        }
        awap awapVar = awbsVar.b;
        if (awapVar == null) {
            throw new IllegalStateException("Processing id and upload id are null in getThumbnailInformation.");
        }
        awea b = awdh.b(awdh.a(awapVar), awfr.b);
        if (b == null) {
            avvc g3 = avvd.g();
            g3.f(cqpn.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_THUMBNAIL_INFO_IN_DB);
            return new awcu(g3.a());
        }
        if (b.l() == null) {
            avvc g4 = avvd.g();
            g4.f(cqpn.FILE_TRANSFER_FAILURE_REASON_MISSING_THUMBNAIL);
            return new awcu(g4.a());
        }
        awvb l2 = b.l();
        l2.getClass();
        return new awct(l2);
    }

    @Override // defpackage.awcz
    public final awvd b(awap awapVar) {
        List a2 = awdh.a(awapVar);
        if (a2.isEmpty()) {
            return null;
        }
        awea b = awdh.b(a2, awfr.a);
        awvb l = b != null ? b.l() : null;
        if (l == null) {
            ensk j = a.j();
            j.Y(ente.a, "BugleFileTransfer");
            enrr enrrVar = (enrr) j;
            enrrVar.Y(cqpo.j, awapVar);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl", "getHttpRequestResult", 111, "FileProcessingDatabaseOperationsImpl.kt")).q("No file information found in database.");
            return null;
        }
        awvc awvcVar = (awvc) awvd.a.createBuilder();
        awvcVar.getClass();
        awvcVar.copyOnWrite();
        awvd awvdVar = (awvd) awvcVar.instance;
        awvdVar.c = l;
        awvdVar.b |= 1;
        eyfy build = awvcVar.build();
        build.getClass();
        awvd awvdVar2 = (awvd) build;
        awea b2 = awdh.b(a2, awfr.b);
        awvb l2 = b2 != null ? b2.l() : null;
        if (l2 != null) {
            awvc awvcVar2 = (awvc) awvdVar2.toBuilder();
            awvcVar2.copyOnWrite();
            awvd awvdVar3 = (awvd) awvcVar2.instance;
            awvdVar3.d = l2;
            awvdVar3.b |= 2;
            awvdVar2 = (awvd) awvcVar2.build();
        }
        if (this.e.a(awvdVar2)) {
            return awvdVar2;
        }
        ensk j2 = a.j();
        j2.Y(ente.a, "BugleFileTransfer");
        enrr enrrVar2 = (enrr) j2;
        enrrVar2.Y(cqpo.j, awapVar);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl", "getHttpRequestResult", 128, "FileProcessingDatabaseOperationsImpl.kt")).q("File upload response in database is invalid.");
        return null;
    }

    @Override // defpackage.awcz
    public final awvd c(MessageIdType messageIdType) {
        messageIdType.getClass();
        Optional g = this.d.g(messageIdType);
        g.getClass();
        return (awvd) fflm.b(g);
    }

    @Override // defpackage.awcz
    public final fayi d(awap awapVar) {
        return awdh.c(awapVar, awfr.a);
    }

    @Override // defpackage.awcz
    public final fayi e(awap awapVar) {
        return awdh.c(awapVar, awfr.b);
    }

    @Override // defpackage.awcz
    public final Object f(awap awapVar, boolean z, ffgu ffguVar) {
        Object a2 = ffra.a(this.c, new awdk(awapVar, z, null), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.awcz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.awap r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.awdm
            if (r0 == 0) goto L13
            r0 = r8
            awdm r0 = (defpackage.awdm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            awdm r0 = new awdm
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            awap r7 = r0.d
            defpackage.ffci.b(r8)
            goto L4e
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.ffci.b(r8)
            ffsk r8 = r6.b
            ffhd r8 = r8.hT()
            ffhd r8 = defpackage.ekxi.a(r8)
            awdl r2 = new awdl
            r4 = 0
            r2.<init>(r4, r7)
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = defpackage.ffra.a(r8, r2, r0)
            if (r8 == r1) goto La6
        L4e:
            engw r8 = (defpackage.engw) r8
            int r0 = r8.size()
            java.lang.String r1 = "deleteProcessingPipelineArtifacts"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl"
            java.lang.String r3 = "FileProcessingDatabaseOperationsImpl.kt"
            java.lang.String r4 = "BugleFileTransfer"
            if (r0 != 0) goto L80
            enru r8 = defpackage.awdt.a
            ensk r8 = r8.e()
            ensn r0 = defpackage.ente.a
            r8.Y(r0, r4)
            enrr r8 = (defpackage.enrr) r8
            ensn r0 = defpackage.cqpo.j
            r8.Y(r0, r7)
            r7 = 378(0x17a, float:5.3E-43)
            ensk r7 = r8.h(r2, r1, r7, r3)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r8 = "No file processing table entries to delete or failure encoutered."
            r7.q(r8)
            ffcu r7 = defpackage.ffcu.a
            return r7
        L80:
            enru r0 = defpackage.awdt.a
            ensk r0 = r0.e()
            ensn r5 = defpackage.ente.a
            r0.Y(r5, r4)
            enrr r0 = (defpackage.enrr) r0
            ensn r4 = defpackage.cqpo.j
            r0.Y(r4, r7)
            r7 = 384(0x180, float:5.38E-43)
            ensk r7 = r0.h(r2, r1, r7, r3)
            enrr r7 = (defpackage.enrr) r7
            int r8 = r8.size()
            java.lang.String r0 = "Deleted %d file processing table entries."
            r7.r(r0, r8)
            ffcu r7 = defpackage.ffcu.a
            return r7
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awdt.g(awap, ffgu):java.lang.Object");
    }

    @Override // defpackage.awcz
    public final Object h(awap awapVar, ffgu ffguVar) {
        String n;
        awea b = awdh.b(awdh.a(awapVar), awfr.a);
        if (b == null || (n = b.n()) == null) {
            return null;
        }
        return new awcy(new awbt(n), b.d(), b.k());
    }

    @Override // defpackage.awcz
    public final Object i(awap awapVar, fayi fayiVar, ffgu ffguVar) {
        Object a2 = ffra.a(this.c, new awdo(this, awapVar, fayiVar, null), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    @Override // defpackage.awcz
    public final Object j(awap awapVar, awvd awvdVar, ffgu ffguVar) {
        Object a2 = ffra.a(this.c, new awdp(awvdVar, this, awapVar, null), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    @Override // defpackage.awcz
    public final Object k(awap awapVar, Uri uri, awup awupVar, ffgu ffguVar) {
        Object a2 = ffra.a(this.c, new awdr(uri, awupVar, awapVar, null), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    @Override // defpackage.awcz
    public final Object l(awap awapVar, fayi fayiVar, ffgu ffguVar) {
        Object a2 = ffra.a(this.c, new awds(this, awapVar, fayiVar, null), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }

    @Override // defpackage.awcz
    public final boolean m(MessageIdType messageIdType) {
        messageIdType.getClass();
        return this.d.k(messageIdType);
    }

    @Override // defpackage.awcz
    public final boolean n(awap awapVar) {
        awea b = awdh.b(awdh.a(awapVar), awfr.a);
        return b != null && b.l() == null;
    }

    @Override // defpackage.awcz
    public final boolean o(awbs awbsVar, awvb awvbVar) {
        awbsVar.getClass();
        awvbVar.getClass();
        final String str = awbsVar.a;
        if (str == null) {
            ekzz f = eleg.f("FileProcessingDatabaseOperations#updateFileTransferEntryWithThumbnailInformation");
            try {
                awap awapVar = awbsVar.b;
                if (awapVar == null) {
                    throw new IllegalStateException("Processing id and upload id are null in updateFileTransferEntryWithThumbnailInformation.");
                }
                boolean r = r(awapVar, awvbVar, awfr.b);
                ffig.a(f, null);
                return r;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ffig.a(f, th);
                    throw th2;
                }
            }
        }
        ekzz f2 = eleg.f("FileTransferDatabaseOperations#updateFileTransferEntryWithThumbnailInformation");
        try {
            String[] strArr = cqtj.a;
            cqtg cqtgVar = new cqtg();
            cqtgVar.ap("updateFileTransferEntryWithThumbnailInformation");
            cqtgVar.f(new Function() { // from class: cqqt
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
                    return cqtiVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            cqtgVar.d(awvbVar);
            boolean z = cqtgVar.b().e() == 1;
            f2.close();
            return z;
        } catch (Throwable th3) {
            try {
                f2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r1.a().o(new defpackage.awdb(r9)) != false) goto L15;
     */
    @Override // defpackage.awcz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(final defpackage.awbs r9, defpackage.awbt r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.a
            if (r0 == 0) goto L11
            cqrl r9 = r8.d
            java.lang.Object r10 = r10.b
            cqtk r1 = defpackage.cqtk.UPLOAD
            java.lang.String r10 = (java.lang.String) r10
            boolean r9 = r9.l(r0, r1, r10)
            return r9
        L11:
            java.lang.String r0 = "FileProcessingDatabaseOperations#updateFileTransferEntryWithTransferHandle"
            ekzz r0 = defpackage.eleg.f(r0)
            atwx r1 = r8.f     // Catch: java.lang.Throwable -> Lad
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> Lad
            r2 = 0
            java.lang.String r3 = "FileProcessingDatabaseOperationsImpl.kt"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl"
            java.lang.String r5 = "BugleFileTransfer"
            java.lang.String r6 = "updateFileTransferEntryWithTransferHandle"
            if (r1 == 0) goto L4c
            java.lang.String[] r1 = defpackage.awfq.a     // Catch: java.lang.Throwable -> Lad
            awfn r1 = new awfn     // Catch: java.lang.Throwable -> Lad
            r1.<init>()     // Catch: java.lang.Throwable -> Lad
            r1.ap(r6)     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r10 = r10.b     // Catch: java.lang.Throwable -> Lad
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> Lad
            r1.f(r10)     // Catch: java.lang.Throwable -> Lad
            awda r10 = new awda     // Catch: java.lang.Throwable -> Lad
            r10.<init>()     // Catch: java.lang.Throwable -> Lad
            r1.h(r10)     // Catch: java.lang.Throwable -> Lad
            awfm r9 = r1.b()     // Catch: java.lang.Throwable -> Lad
            int r9 = r9.e()     // Catch: java.lang.Throwable -> Lad
            if (r9 <= 0) goto L90
            goto L73
        L4c:
            java.lang.String[] r1 = defpackage.awfq.a     // Catch: java.lang.Throwable -> Lad
            awed r1 = new awed     // Catch: java.lang.Throwable -> Lad
            r1.<init>()     // Catch: java.lang.Throwable -> Lad
            awap r7 = r9.b     // Catch: java.lang.Throwable -> Lad
            r1.d(r7)     // Catch: java.lang.Throwable -> Lad
            awfr r7 = defpackage.awfr.a     // Catch: java.lang.Throwable -> Lad
            r1.c(r7)     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r10 = r10.b     // Catch: java.lang.Throwable -> Lad
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> Lad
            r1.e(r10)     // Catch: java.lang.Throwable -> Lad
            awea r10 = r1.a()     // Catch: java.lang.Throwable -> Lad
            awdb r1 = new awdb     // Catch: java.lang.Throwable -> Lad
            r1.<init>()     // Catch: java.lang.Throwable -> Lad
            boolean r9 = r10.o(r1)     // Catch: java.lang.Throwable -> Lad
            if (r9 == 0) goto L90
        L73:
            enru r9 = defpackage.awdt.a     // Catch: java.lang.Throwable -> Lad
            ensk r9 = r9.h()     // Catch: java.lang.Throwable -> Lad
            ensn r10 = defpackage.ente.a     // Catch: java.lang.Throwable -> Lad
            r9.Y(r10, r5)     // Catch: java.lang.Throwable -> Lad
            r10 = 273(0x111, float:3.83E-43)
            ensk r9 = r9.h(r4, r6, r10, r3)     // Catch: java.lang.Throwable -> Lad
            enrr r9 = (defpackage.enrr) r9     // Catch: java.lang.Throwable -> Lad
            java.lang.String r10 = "Updated file processing table entry with transfer handle."
            r9.q(r10)     // Catch: java.lang.Throwable -> Lad
            defpackage.ffig.a(r0, r2)
            r9 = 1
            return r9
        L90:
            enru r9 = defpackage.awdt.a     // Catch: java.lang.Throwable -> Lad
            ensk r9 = r9.j()     // Catch: java.lang.Throwable -> Lad
            ensn r10 = defpackage.ente.a     // Catch: java.lang.Throwable -> Lad
            r9.Y(r10, r5)     // Catch: java.lang.Throwable -> Lad
            r10 = 276(0x114, float:3.87E-43)
            ensk r9 = r9.h(r4, r6, r10, r3)     // Catch: java.lang.Throwable -> Lad
            enrr r9 = (defpackage.enrr) r9     // Catch: java.lang.Throwable -> Lad
            java.lang.String r10 = "Failed to update file processing table entry with transfer handle."
            r9.q(r10)     // Catch: java.lang.Throwable -> Lad
            defpackage.ffig.a(r0, r2)
            r9 = 0
            return r9
        Lad:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> Laf
        Laf:
            r10 = move-exception
            defpackage.ffig.a(r0, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awdt.p(awbs, awbt):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if (r0.a().o(new defpackage.awdf(r7, r9)) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r0.a().e() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0075, code lost:
    
        r8 = defpackage.awdt.a.e();
        r8.Y(defpackage.ente.a, "BugleFileTransfer");
        r8 = (defpackage.enrr) r8;
        r8.Y(defpackage.cqpo.j, r7);
        ((defpackage.enrr) r8.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl", "updateFileTransferEntryWithEncryptionMetadataForFileTypeOld", 463, "FileProcessingDatabaseOperationsImpl.kt")).t("Failed to update file processing table entry with encryption metadata for file type %s.", r9.name());
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0098, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0051, code lost:
    
        r8 = defpackage.awdt.a.e();
        r8.Y(defpackage.ente.a, "BugleFileTransfer");
        r8 = (defpackage.enrr) r8;
        r8.Y(defpackage.cqpo.j, r7);
        ((defpackage.enrr) r8.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl", "updateFileTransferEntryWithEncryptionMetadataForFileTypeOld", 454, "FileProcessingDatabaseOperationsImpl.kt")).t("Updated file processing table entry with encryption metadata for file type %s.", r9.name());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0074, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(final defpackage.awap r7, defpackage.fayi r8, final defpackage.awfr r9) {
        /*
            r6 = this;
            atwx r0 = r6.f
            boolean r0 = r0.a()
            java.lang.String r1 = "updateFileTransferEntryWithEncryptionMetadataForFileTypeOld"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl"
            java.lang.String r3 = "FileProcessingDatabaseOperationsImpl.kt"
            java.lang.String r4 = "BugleFileTransfer"
            if (r0 == 0) goto L32
            java.lang.String[] r0 = defpackage.awfq.a
            awfn r0 = new awfn
            r0.<init>()
            java.lang.String r5 = "updateFileTransferEntryWithEncryptionMetadata"
            r0.ap(r5)
            r0.d(r8)
            awde r8 = new awde
            r8.<init>()
            r0.h(r8)
            awfm r8 = r0.b()
            int r8 = r8.e()
            if (r8 <= 0) goto L75
            goto L51
        L32:
            java.lang.String[] r0 = defpackage.awfq.a
            awed r0 = new awed
            r0.<init>()
            r0.d(r7)
            r0.c(r9)
            r0.b(r8)
            awea r8 = r0.a()
            awdf r0 = new awdf
            r0.<init>()
            boolean r8 = r8.o(r0)
            if (r8 == 0) goto L75
        L51:
            enru r8 = defpackage.awdt.a
            ensk r8 = r8.e()
            ensn r0 = defpackage.ente.a
            r8.Y(r0, r4)
            enrr r8 = (defpackage.enrr) r8
            ensn r0 = defpackage.cqpo.j
            r8.Y(r0, r7)
            r7 = 454(0x1c6, float:6.36E-43)
            ensk r7 = r8.h(r2, r1, r7, r3)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r8 = r9.name()
            java.lang.String r9 = "Updated file processing table entry with encryption metadata for file type %s."
            r7.t(r9, r8)
            return
        L75:
            enru r8 = defpackage.awdt.a
            ensk r8 = r8.e()
            ensn r0 = defpackage.ente.a
            r8.Y(r0, r4)
            enrr r8 = (defpackage.enrr) r8
            ensn r0 = defpackage.cqpo.j
            r8.Y(r0, r7)
            r7 = 463(0x1cf, float:6.49E-43)
            ensk r7 = r8.h(r2, r1, r7, r3)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r8 = r9.name()
            java.lang.String r9 = "Failed to update file processing table entry with encryption metadata for file type %s."
            r7.t(r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awdt.q(awap, fayi, awfr):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if (r0.a().o(new defpackage.awdd(r7, r9)) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r0.a().e() > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0076, code lost:
    
        r8 = defpackage.awdt.a.j();
        r8.Y(defpackage.ente.a, "BugleFileTransfer");
        r8 = (defpackage.enrr) r8;
        r8.Y(defpackage.cqpo.j, r7);
        ((defpackage.enrr) r8.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl", "updateFileTransferEntryWithHttpRequestResultForFileType", 424, "FileProcessingDatabaseOperationsImpl.kt")).t("Failed to update file transfer entry with HTTP request result for %s.", r9.name());
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x009a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0051, code lost:
    
        r8 = defpackage.awdt.a.h();
        r8.Y(defpackage.ente.a, "BugleFileTransfer");
        r8 = (defpackage.enrr) r8;
        r8.Y(defpackage.cqpo.j, r7);
        ((defpackage.enrr) r8.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl", "updateFileTransferEntryWithHttpRequestResultForFileType", 418, "FileProcessingDatabaseOperationsImpl.kt")).t("Updated file transfer entry with HTTP request result for %s.", r9.name());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0075, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(final defpackage.awap r7, defpackage.awvb r8, final defpackage.awfr r9) {
        /*
            r6 = this;
            atwx r0 = r6.f
            boolean r0 = r0.a()
            java.lang.String r1 = "updateFileTransferEntryWithHttpRequestResultForFileType"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl"
            java.lang.String r3 = "FileProcessingDatabaseOperationsImpl.kt"
            java.lang.String r4 = "BugleFileTransfer"
            if (r0 == 0) goto L32
            java.lang.String[] r0 = defpackage.awfq.a
            awfn r0 = new awfn
            r0.<init>()
            java.lang.String r5 = "updateFileTransferEntryWithHttpRequestResult"
            r0.ap(r5)
            r0.g(r8)
            awdc r8 = new awdc
            r8.<init>()
            r0.h(r8)
            awfm r8 = r0.b()
            int r8 = r8.e()
            if (r8 <= 0) goto L76
            goto L51
        L32:
            java.lang.String[] r0 = defpackage.awfq.a
            awed r0 = new awed
            r0.<init>()
            r0.d(r7)
            r0.c(r9)
            r0.f(r8)
            awea r8 = r0.a()
            awdd r0 = new awdd
            r0.<init>()
            boolean r8 = r8.o(r0)
            if (r8 == 0) goto L76
        L51:
            enru r8 = defpackage.awdt.a
            ensk r8 = r8.h()
            ensn r0 = defpackage.ente.a
            r8.Y(r0, r4)
            enrr r8 = (defpackage.enrr) r8
            ensn r0 = defpackage.cqpo.j
            r8.Y(r0, r7)
            r7 = 418(0x1a2, float:5.86E-43)
            ensk r7 = r8.h(r2, r1, r7, r3)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r8 = r9.name()
            java.lang.String r9 = "Updated file transfer entry with HTTP request result for %s."
            r7.t(r9, r8)
            r7 = 1
            return r7
        L76:
            enru r8 = defpackage.awdt.a
            ensk r8 = r8.j()
            ensn r0 = defpackage.ente.a
            r8.Y(r0, r4)
            enrr r8 = (defpackage.enrr) r8
            ensn r0 = defpackage.cqpo.j
            r8.Y(r0, r7)
            r7 = 424(0x1a8, float:5.94E-43)
            ensk r7 = r8.h(r2, r1, r7, r3)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r8 = r9.name()
            java.lang.String r9 = "Failed to update file transfer entry with HTTP request result for %s."
            r7.t(r9, r8)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awdt.r(awap, awvb, awfr):boolean");
    }
}
