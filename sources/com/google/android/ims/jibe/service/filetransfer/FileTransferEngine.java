package com.google.android.ims.jibe.service.filetransfer;

import android.content.Context;
import android.os.Binder;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferState;
import com.google.android.ims.rcsservice.filetransfer.IFileTransfer;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult;
import defpackage.csuc;
import defpackage.dikt;
import defpackage.ditn;
import defpackage.diua;
import defpackage.diub;
import defpackage.dkmv;
import defpackage.dkqd;
import defpackage.dkrx;
import defpackage.dkty;
import defpackage.eohg;
import defpackage.eyrl;
import defpackage.eyrm;
import defpackage.eyrn;
import defpackage.eyrp;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class FileTransferEngine extends IFileTransfer.Stub {
    private static final long[] a = new long[0];
    private final Context b;
    private final dkrx c;
    private final dkmv d;
    private final dikt e;
    private diua f;

    public FileTransferEngine(Context context, dkrx dkrxVar, dkmv dkmvVar, dikt diktVar) {
        this.b = context;
        this.c = dkrxVar;
        this.d = dkmvVar;
        this.e = diktVar;
    }

    private final long a() {
        return this.d.a();
    }

    private final void b(Optional optional, String str, FileTransferInfo fileTransferInfo) {
        eyrl eyrlVar = (eyrl) eyrm.a.createBuilder();
        int a2 = csuc.a(fileTransferInfo.f);
        eyrlVar.copyOnWrite();
        eyrm eyrmVar = (eyrm) eyrlVar.instance;
        eyrmVar.c = eohg.a(a2);
        eyrmVar.b |= 1;
        eyrm eyrmVar2 = (eyrm) eyrlVar.build();
        eyrn eyrnVar = (eyrn) eyrp.a.createBuilder();
        eyrnVar.copyOnWrite();
        eyrp eyrpVar = (eyrp) eyrnVar.instance;
        eyrpVar.e = 2;
        eyrpVar.b |= 1;
        eyrnVar.copyOnWrite();
        eyrp eyrpVar2 = (eyrp) eyrnVar.instance;
        str.getClass();
        eyrpVar2.b |= 4;
        eyrpVar2.g = str;
        eyrnVar.copyOnWrite();
        eyrp eyrpVar3 = (eyrp) eyrnVar.instance;
        eyrmVar2.getClass();
        eyrpVar3.d = eyrmVar2;
        eyrpVar3.c = 102;
        if (optional.isPresent()) {
            String obj = optional.get().toString();
            eyrnVar.copyOnWrite();
            eyrp eyrpVar4 = (eyrp) eyrnVar.instance;
            eyrpVar4.b |= 2;
            eyrpVar4.f = obj;
        }
        this.e.e(this.b, (eyrp) eyrnVar.build());
    }

    private static boolean c(diua diuaVar) {
        if (!Objects.isNull(diuaVar)) {
            return false;
        }
        dkty.q("FileTransferEngine#fileTransferProvider is null", new Object[0]);
        return true;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult acceptFileTransferRequest(long j) {
        dkqd.d(this.b, Binder.getCallingUid());
        dkty.k("File Transfer [%d] state change [%s]", Long.valueOf(j), "REQUEST ACCEPTED");
        diua diuaVar = this.f;
        return c(diuaVar) ? new FileTransferServiceResult(j, null, 2, "fileTransferProvider is null") : diuaVar.d(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public FileTransferServiceResult cancelFileTransfer(long j) {
        return new FileTransferServiceResult(-1L, null, 12, null);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult deleteFileTransfer(long j) {
        dkqd.d(this.b, Binder.getCallingUid());
        dkty.k("File Transfer [%d] state change [%s]", Long.valueOf(j), "DELETED");
        diua diuaVar = this.f;
        return c(diuaVar) ? new FileTransferServiceResult(j, null, 2, "fileTransferProvider is null") : diuaVar.e(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileDownloadResult downloadFile(FileDownloadRequest fileDownloadRequest) {
        if (c(this.f)) {
            throw new diub("File transfer provider is not initialized.");
        }
        if (this.f.q(fileDownloadRequest.b().a())) {
            throw new diub("Not enough space available.");
        }
        return this.f.c(fileDownloadRequest);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public long[] getActiveFileTransferSessions() {
        dkqd.d(this.b, Binder.getCallingUid());
        return getActiveSessions();
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public long[] getActiveImageSharingSessions() {
        return a;
    }

    public long[] getActiveSessions() {
        diua diuaVar = this.f;
        return c(diuaVar) ? a : diuaVar.t();
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public String getFileTransferOption() {
        return "";
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public FileTransferState getFileTransferState(long j) {
        return null;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public long[] getResumeableSessions() {
        return a;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public boolean isResumeable(long j) {
        return false;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public PauseDownloadResult pauseDownload(PauseDownloadRequest pauseDownloadRequest) {
        if (c(this.f)) {
            throw new diub("File transfer provider is not initialized.");
        }
        return this.f.m(pauseDownloadRequest);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult pauseFileTransfer(long j) {
        dkqd.d(this.b, Binder.getCallingUid());
        dkty.k("File Transfer [%d] state change [%s]", Long.valueOf(j), "PAUSED");
        diua diuaVar = this.f;
        return c(diuaVar) ? new FileTransferServiceResult(j, null, 2, "fileTransferProvider is null") : diuaVar.f(j);
    }

    public void registerProvider(diua diuaVar) {
        if (diuaVar == null) {
            dkty.q("FileTransferEngineProvider initialized with null value", new Object[0]);
        }
        this.f = diuaVar;
    }

    public long registerSession(diua diuaVar) {
        return a();
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public FileTransferServiceResult rejectFileTransferRequest(long j) {
        return new FileTransferServiceResult(-1L, null, 12, null);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public ResumeDownloadResult resumeDownload(ResumeDownloadRequest resumeDownloadRequest) {
        if (c(this.f)) {
            throw new diub("File transfer provider is not initialized.");
        }
        if (this.f.q(resumeDownloadRequest.b().a())) {
            throw new diub("Not enough space available.");
        }
        return this.f.n(resumeDownloadRequest);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult resumeFileTransfer(long j) {
        dkqd.d(this.b, Binder.getCallingUid());
        dkty.k("File Transfer [%d] state change [%s]", Long.valueOf(j), "RESUMED");
        diua diuaVar = this.f;
        return c(diuaVar) ? new FileTransferServiceResult(j, null, 2, "fileTransferProvider is null") : diuaVar.i(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult resumeUploadToContentServer(long j) {
        dkqd.d(this.b, Binder.getCallingUid());
        dkty.k("File Transfer [%d] state change [%s]", Long.valueOf(j), "UPLOAD RESUMED");
        diua diuaVar = this.f;
        return c(diuaVar) ? new FileTransferServiceResult(j, null, 2, "fileTransferProvider is null") : diuaVar.j(j);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult sendFileTransferRequest(String str, String str2, FileTransferInfo fileTransferInfo) {
        b(Optional.empty(), str2, fileTransferInfo);
        dkqd.d(this.b, Binder.getCallingUid());
        diua diuaVar = this.f;
        if (c(diuaVar) || this.c.s()) {
            return new FileTransferServiceResult(0L, str, 2, "fileTransferProvider is null");
        }
        if (!diuaVar.r(fileTransferInfo.a)) {
            return new FileTransferServiceResult(-1L, str, 12, "Upload to content server not supported");
        }
        long a2 = a();
        Long valueOf = Long.valueOf(a2);
        dkty.k("File Transfer [%d] state change [%s]", valueOf, "CREATED");
        FileTransferServiceResult k = diuaVar.k(str, str2, a2, fileTransferInfo);
        if (k.succeeded()) {
            dkty.k("File Transfer [%d] state change [%s]", valueOf, "SENT");
        }
        return k;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult[] sendGroupFileTransferRequest(long j, String str, FileTransferInfo fileTransferInfo) {
        b(Optional.of(Long.valueOf(j)), str, fileTransferInfo);
        dkqd.d(this.b, Binder.getCallingUid());
        diua diuaVar = this.f;
        if (c(diuaVar)) {
            return ditn.i(2, "fileTransferProvider is null");
        }
        if (!diuaVar.r(fileTransferInfo.a)) {
            return new FileTransferServiceResult[]{new FileTransferServiceResult(-1L, " ", 12, "Upload to content server not supported")};
        }
        FileTransferServiceResult[] v = diuaVar.v(j, str, fileTransferInfo);
        for (int i = 0; i <= 0; i++) {
            FileTransferServiceResult fileTransferServiceResult = v[i];
            if (fileTransferServiceResult.succeeded()) {
                dkty.k("File Transfer [%d] state change [%s]", Long.valueOf(fileTransferServiceResult.a), "GROUP REQUEST SENT");
            }
        }
        return v;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    @Deprecated
    public FileTransferServiceResult sendImageSharingRequest(String str, FileTransferInfo fileTransferInfo) {
        return new FileTransferServiceResult(-1L, null, 12, null);
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult startNewIncomingFileTransfer(String str, String str2, String str3, long j, boolean z, byte[] bArr) {
        diua diuaVar = this.f;
        return c(diuaVar) ? new FileTransferServiceResult(0L, str, 2, "fileTransferProvider is null") : diuaVar.g(str3, str, str2, j, z, bArr);
    }

    public void unregisterProvider(diua diuaVar) {
        dkty.c("FileTransferEngineProvider reset to null in unregisterProvider", new Object[0]);
        this.f = null;
    }

    @Override // com.google.android.ims.rcsservice.filetransfer.IFileTransfer
    public FileTransferServiceResult uploadToContentServer(String str, String str2, FileTransferInfo fileTransferInfo) {
        b(Optional.empty(), str2, fileTransferInfo);
        dkqd.d(this.b, Binder.getCallingUid());
        diua diuaVar = this.f;
        if (c(diuaVar)) {
            return new FileTransferServiceResult(-1L, null, 2, "fileTransferProvider is null");
        }
        if (!diuaVar.r(fileTransferInfo.a)) {
            return new FileTransferServiceResult(-1L, null, 12, "Upload to content server not supported");
        }
        long a2 = a();
        Long valueOf = Long.valueOf(a2);
        dkty.k("File Transfer [%d] state change [%s]", valueOf, "CREATED FOR UPLOAD");
        FileTransferServiceResult l = diuaVar.l(str, str2, a2, fileTransferInfo);
        if (l.succeeded()) {
            dkty.k("File Transfer [%d] state change [%s]", valueOf, "SENT FOR UPLOAD");
        }
        return l;
    }

    public void unregisterSession(long j) {
    }
}
