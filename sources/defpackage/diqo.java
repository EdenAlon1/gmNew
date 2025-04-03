package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.android.ims.filetransfer.http.PendingTransferInfo;
import com.google.android.ims.filetransfer.http.message.FileInfo;
import com.google.android.ims.filetransfer.http.message.HttpFileTransferPushMessage;
import com.google.android.ims.jibe.service.filetransfer.FileTransferEngine;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.FileDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;
import com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.PauseDownloadResult;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadRequest;
import com.google.android.ims.rcsservice.filetransfer.ResumeDownloadResult;
import com.google.android.rcs.client.messaging.data.FileInformation;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diqo implements diqp, djtm {
    static final diyy a = dizd.a(170131477);
    public final Context b;
    public final diil c;
    public final dips d;
    public final ditk e;
    public final HashMap f;
    public final dkst g;
    final ditw h;
    public final dkez i;
    private final dkhx j;
    private final FileTransferEngine k;
    private final djqt l;
    private final diru m;
    private final ThreadPoolExecutor n;
    private final ThreadPoolExecutor o;
    private final dkrw p;
    private InstantMessageConfiguration q;

    public diqo(Context context, InstantMessageConfiguration instantMessageConfiguration, diil diilVar, ditx ditxVar, FileTransferEngine fileTransferEngine, dkhx dkhxVar, dips dipsVar, djqt djqtVar, diru diruVar, ditk ditkVar, dkez dkezVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 1L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
        this.n = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(3, 3, 1L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
        this.o = threadPoolExecutor2;
        this.f = new HashMap();
        this.g = new dkst();
        diqm diqmVar = new diqm(this);
        this.h = diqmVar;
        this.b = context;
        this.c = diilVar;
        this.q = instantMessageConfiguration;
        this.k = fileTransferEngine;
        this.j = dkhxVar;
        this.d = dipsVar;
        this.l = djqtVar;
        this.m = diruVar;
        this.e = ditkVar;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        this.p = new dkrw(context, "httpft_pending");
        this.i = dkezVar;
        ditxVar.w("application/vnd.gsma.rcs-ft-http+xml", diqmVar);
    }

    private final void A(long j, PendingTransferInfo pendingTransferInfo) {
        this.p.i(Long.toString(j), pendingTransferInfo);
    }

    private final FileDownloadResult w(String str, FileInformation fileInformation, PendingIntent pendingIntent) {
        Runnable a2;
        diqt diqtVar = new diqt(this.b, this, this.e, fileInformation, pendingIntent, str);
        Optional g = fileInformation.g();
        if (g.isEmpty() || eifj.FILE.equals(g.get())) {
            dkty.c("Downloading file. Size: %d", Integer.valueOf(fileInformation.a()));
            a2 = this.m.a(-1L, str, this.q, diqtVar, fileInformation.i(), fileInformation.h(), fileInformation.a());
        } else {
            dkty.c("Downloading thumbnail. Size: %d", Integer.valueOf(fileInformation.a()));
            a2 = this.m.d(-1L, str, this.q, diqtVar, fileInformation.i(), fileInformation.a());
        }
        this.n.execute(a2);
        this.f.put(str, a2);
        dknd dkndVar = new dknd();
        dkndVar.b(str);
        return dkndVar.a();
    }

    private final FileTransferServiceResult x(long j, PendingTransferInfo pendingTransferInfo, dira diraVar) {
        if (pendingTransferInfo.mType != PendingTransferInfo.Type.UPLOAD) {
            throw new IllegalArgumentException("Attempting to resume upload with a pending download: ".concat(pendingTransferInfo.toString()));
        }
        String l = Long.toString(j);
        if (((diud) this.f.get(l)) != null) {
            dkty.c("Upload already in progress for session ID %d, ignoring", Long.valueOf(j));
            return new FileTransferServiceResult(j, null, 0, "HTTP FT already uploading");
        }
        if (!this.c.i()) {
            return new FileTransferServiceResult(j, pendingTransferInfo.mRemoteParty, 4, "Not registered to RCS");
        }
        String str = pendingTransferInfo.mTransactionId;
        String str2 = pendingTransferInfo.mFileId;
        String str3 = pendingTransferInfo.mRemoteParty;
        FileTransferInfo fileTransferInfo = pendingTransferInfo.mFileTransferInfo;
        diru diruVar = this.m;
        InstantMessageConfiguration instantMessageConfiguration = this.q;
        dijy d = diruVar.c.d(true, str2);
        diry a2 = diruVar.b.a(j, str2, str, fileTransferInfo, instantMessageConfiguration, diraVar, true, d, diruVar.c().a(instantMessageConfiguration, d), diruVar.d.b());
        this.f.put(l, a2);
        this.n.execute(a2);
        return new FileTransferServiceResult(j, str3, 0, "HTTP FT resume pending", str2);
    }

    private final FileTransferServiceResult y(String str, String str2, long j, FileTransferInfo fileTransferInfo, ffbr ffbrVar, long j2) {
        if (!this.c.i()) {
            return new FileTransferServiceResult(j, null, 4, "Not registered to RCS");
        }
        diuc diucVar = (diuc) ffbrVar.b();
        if (fileTransferInfo.f == -1) {
            fileTransferInfo.f = ditn.a(fileTransferInfo.a(), this.b.getContentResolver());
        }
        String uuid = UUID.randomUUID().toString();
        z(j, str, -1L, uuid, str2, fileTransferInfo);
        dkty.c("sending file [%s], session ID = %d, file ID = %s, TID = %s", fileTransferInfo, Long.valueOf(j), str2, uuid);
        diry b = this.m.b(j, str2, uuid, fileTransferInfo, this.q, diucVar);
        this.n.execute(b);
        this.f.put(Long.toString(j), b);
        return new FileTransferServiceResult(j, j2, null, 0, "HTTP FT Pending", str2);
    }

    private final void z(long j, String str, long j2, String str2, String str3, FileTransferInfo fileTransferInfo) {
        A(j, new PendingTransferInfo(str, j2, str2, str3, fileTransferInfo));
    }

    @Override // defpackage.diqp
    public final PendingTransferInfo a(String str) {
        Serializable serializable;
        dkrw dkrwVar = this.p;
        synchronized (dkrwVar) {
            dkrwVar.d();
            serializable = (Serializable) dkrwVar.d.get(str);
            if (serializable == null) {
                serializable = null;
            }
        }
        return (PendingTransferInfo) serializable;
    }

    public final PendingTransferInfo b(String str) {
        dkrw dkrwVar = this.p;
        PendingTransferInfo a2 = a(str);
        dkrwVar.f(str);
        return a2;
    }

    @Override // defpackage.diua
    public final FileDownloadResult c(FileDownloadRequest fileDownloadRequest) {
        return w(UUID.randomUUID().toString(), fileDownloadRequest.b(), fileDownloadRequest.a());
    }

    @Override // defpackage.diua
    public final FileTransferServiceResult d(long j) {
        Long valueOf = Long.valueOf(j);
        dkty.c("Accept file for session ID %d", valueOf);
        HashMap hashMap = this.f;
        String l = Long.toString(j);
        diud diudVar = (diud) hashMap.get(l);
        if (diudVar != null) {
            if (diudVar instanceof diry) {
                return new FileTransferServiceResult(j, null, 9, "Session is a FT upload, not a download!");
            }
            dkty.c("Download already in progress for session ID %s, ignoring", valueOf);
            return new FileTransferServiceResult(j, null, 0, "HTTP FT already downloading");
        }
        PendingTransferInfo a2 = a(l);
        if (a2 == null) {
            return new FileTransferServiceResult(j, null, 9, "Session not found");
        }
        if (a2.mType == PendingTransferInfo.Type.UPLOAD) {
            return new FileTransferServiceResult(j, null, 9, "Session is a FT upload, not a download!");
        }
        HttpFileTransferPushMessage httpFileTransferPushMessage = a2.mPushMessage;
        FileInfo fileInfo = httpFileTransferPushMessage.mFileInfo;
        if (q((int) fileInfo.mSize)) {
            dkty.c("Not enough space available. Rejecting", new Object[0]);
            h(j);
            return new FileTransferServiceResult(j, httpFileTransferPushMessage.mSender, 4, "Not enough space on the device.");
        }
        if (fileInfo.c()) {
            dkty.c("File transfer has expired.", new Object[0]);
            h(j);
            return new FileTransferServiceResult(j, httpFileTransferPushMessage.mSender, 3, "HTTP file transfer has expired.");
        }
        dirl a3 = this.m.a(j, httpFileTransferPushMessage.mFileId, this.q, new diqu(this, this.b, this.e, httpFileTransferPushMessage, j), fileInfo.mUrl, Optional.ofNullable(fileInfo.mFileName), (int) fileInfo.mSize);
        this.n.execute(a3);
        this.f.put(l, a3);
        return new FileTransferServiceResult(j, httpFileTransferPushMessage.mSender, 0, "HTTP FT downloading");
    }

    @Override // defpackage.diua
    public final FileTransferServiceResult e(long j) {
        if (!this.f.containsKey(Long.toString(j))) {
            String l = Long.toString(j);
            this.g.a(l);
            PendingTransferInfo b = b(l);
            return b == null ? new FileTransferServiceResult(j, null, 9, "Session not found") : new FileTransferServiceResult(j, b.mRemoteParty, 0, "File transfer deleted");
        }
        Long valueOf = Long.valueOf(j);
        dkty.c("Terminating ongoing file transfer due to deletion request, file transfer session ID = %d", valueOf);
        dkty.c("Cancelling file transfer, session ID: %d", valueOf);
        String l2 = Long.toString(j);
        diud diudVar = (diud) this.f.remove(l2);
        if (diudVar == null) {
            return h(j);
        }
        b(l2);
        diudVar.a();
        return new FileTransferServiceResult(j, null, 0, "HTTP FT terminating");
    }

    @Override // defpackage.diua
    public final FileTransferServiceResult f(long j) {
        dkty.c("Pausing file transfer for session ID %d", Long.valueOf(j));
        diud diudVar = (diud) this.f.remove(Long.toString(j));
        if (diudVar == null) {
            return new FileTransferServiceResult(j, null, 9, "Session not found");
        }
        diudVar.a();
        return new FileTransferServiceResult(j, null, 0, "Pausing HTTP FT");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0143 A[Catch: IllegalStateException -> 0x01ec, IOException -> 0x01ee, TryCatch #6 {IOException -> 0x01ee, IllegalStateException -> 0x01ec, blocks: (B:3:0x0014, B:5:0x0051, B:6:0x0057, B:8:0x005d, B:9:0x0064, B:11:0x006a, B:12:0x006d, B:16:0x00bf, B:19:0x010f, B:21:0x0118, B:22:0x0131, B:24:0x0143, B:25:0x014b, B:27:0x0155, B:29:0x015b, B:30:0x0160, B:32:0x0164, B:33:0x016d, B:35:0x017c, B:37:0x0197, B:38:0x01a8, B:40:0x01ae, B:41:0x01b6, B:54:0x0121, B:56:0x0127, B:58:0x00ff, B:60:0x0105), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0164 A[Catch: IllegalStateException -> 0x01ec, IOException -> 0x01ee, TryCatch #6 {IOException -> 0x01ee, IllegalStateException -> 0x01ec, blocks: (B:3:0x0014, B:5:0x0051, B:6:0x0057, B:8:0x005d, B:9:0x0064, B:11:0x006a, B:12:0x006d, B:16:0x00bf, B:19:0x010f, B:21:0x0118, B:22:0x0131, B:24:0x0143, B:25:0x014b, B:27:0x0155, B:29:0x015b, B:30:0x0160, B:32:0x0164, B:33:0x016d, B:35:0x017c, B:37:0x0197, B:38:0x01a8, B:40:0x01ae, B:41:0x01b6, B:54:0x0121, B:56:0x0127, B:58:0x00ff, B:60:0x0105), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017c A[Catch: IllegalStateException -> 0x01ec, IOException -> 0x01ee, TryCatch #6 {IOException -> 0x01ee, IllegalStateException -> 0x01ec, blocks: (B:3:0x0014, B:5:0x0051, B:6:0x0057, B:8:0x005d, B:9:0x0064, B:11:0x006a, B:12:0x006d, B:16:0x00bf, B:19:0x010f, B:21:0x0118, B:22:0x0131, B:24:0x0143, B:25:0x014b, B:27:0x0155, B:29:0x015b, B:30:0x0160, B:32:0x0164, B:33:0x016d, B:35:0x017c, B:37:0x0197, B:38:0x01a8, B:40:0x01ae, B:41:0x01b6, B:54:0x0121, B:56:0x0127, B:58:0x00ff, B:60:0x0105), top: B:2:0x0014 }] */
    @Override // defpackage.diua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult g(java.lang.String r20, java.lang.String r21, java.lang.String r22, long r23, boolean r25, byte[] r26) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.diqo.g(java.lang.String, java.lang.String, java.lang.String, long, boolean, byte[]):com.google.android.ims.rcsservice.filetransfer.FileTransferServiceResult");
    }

    public final FileTransferServiceResult h(long j) {
        dkty.c("Reject file for session ID %d", Long.valueOf(j));
        PendingTransferInfo a2 = a(Long.toString(j));
        if (a2 == null) {
            return new FileTransferServiceResult(j, null, 9, "Session not found");
        }
        if (a2.mType == PendingTransferInfo.Type.UPLOAD) {
            return new FileTransferServiceResult(j, null, 9, "Session is a FT upload, not a download!");
        }
        HttpFileTransferPushMessage httpFileTransferPushMessage = a2.mPushMessage;
        this.d.c(new FileTransferEvent(20013, j, 4L, httpFileTransferPushMessage.mFileId), dkuj.HTTP_FILE_TRANSFER_PROVIDER);
        return new FileTransferServiceResult(j, httpFileTransferPushMessage.mSender, 0, "HTTP FT rejected");
    }

    @Override // defpackage.diua
    public final FileTransferServiceResult i(long j) {
        diqy e;
        Long valueOf = Long.valueOf(j);
        dkty.c("Resuming file for session ID %d", valueOf);
        if (!this.c.i()) {
            dkty.k("Resuming file for session ID %d failed since devices is not registered to RCS", valueOf);
            return new FileTransferServiceResult(j, null, 4, "Not registered to RCS");
        }
        String l = Long.toString(j);
        this.g.a(l);
        PendingTransferInfo a2 = a(l);
        if (a2 == null) {
            dkty.k("File transfer for session ID %d not found", valueOf);
            return new FileTransferServiceResult(j, null, 9, "Session not found");
        }
        if (a2.mType == PendingTransferInfo.Type.DOWNLOAD) {
            return d(j);
        }
        if (a2.uploadPushMessageData == null) {
            String str = a2.mTransactionId;
            String str2 = a2.mFileId;
            String str3 = a2.mRemoteParty;
            if (a2.a()) {
                dkty.c("Resuming file upload to group, group session ID = %d, file transfer session ID = %s, file ID = %s, TID = %s", Long.valueOf(a2.mGroupSessionId), valueOf, str2, str);
                e = diqy.d(this, this.b, this.c, j, a2.mGroupSessionId, this.e, this.d, str2);
            } else {
                dkty.c("Resuming file upload, session ID = %d file ID = %s, TID = %s", valueOf, str2, str);
                e = diqy.e(this, this.b, this.c, j, this.c.a(str3), str3, this.e, this.d, str2, s(str3));
            }
            return x(j, a2, e);
        }
        HttpFileTransferPushMessage httpFileTransferPushMessage = a2.mPushMessage;
        if (httpFileTransferPushMessage == null || httpFileTransferPushMessage.mFileInfo.c()) {
            String l2 = Long.toString(j);
            this.f.remove(l2);
            b(l2);
            return new FileTransferServiceResult(j, null, 9, "File transfer XML has expired");
        }
        String str4 = a2.mRemoteParty;
        long j2 = a2.mGroupSessionId;
        String str5 = a2.mFileId;
        byte[] bArr = a2.uploadPushMessageData;
        boolean a3 = a2.a();
        diqn diqnVar = new diqn(this, j, str5);
        int subscribe = this.d.a.subscribe(5, diqnVar);
        diqnVar.a = subscribe;
        ChatSessionServiceResult d = a3 ? this.c.d(j2, str5, "application/vnd.gsma.rcs-ft-http+xml", bArr) : this.c.e(str4, bArr, "application/vnd.gsma.rcs-ft-http+xml", str5);
        if (d.getCode() != 0) {
            this.d.d(subscribe);
        }
        ChatSessionServiceResult chatSessionServiceResult = d;
        return new FileTransferServiceResult(j, str4, chatSessionServiceResult.getCode(), chatSessionServiceResult.getDescription());
    }

    @Override // defpackage.diua
    public final FileTransferServiceResult j(long j) {
        diqo diqoVar;
        dira diraVar;
        Long valueOf = Long.valueOf(j);
        dkty.c("Resuming upload for session ID %d", valueOf);
        dkst dkstVar = this.g;
        String l = Long.toString(j);
        dkstVar.a(l);
        PendingTransferInfo a2 = a(l);
        if (a2 == null) {
            return new FileTransferServiceResult(j, null, 9, "Session not found");
        }
        if (a2.mType == PendingTransferInfo.Type.DOWNLOAD) {
            return new FileTransferServiceResult(j, null, 12, "Attempted to resume upload of an incoming file");
        }
        String str = a2.mTransactionId;
        String str2 = a2.mFileId;
        if (a2.a()) {
            dkty.c("Resuming file upload to group, group session ID = %d, file transfer session ID = %d, file ID = %s, TID = %s", Long.valueOf(a2.mGroupSessionId), valueOf, str2, str);
            Context context = this.b;
            ditk ditkVar = this.e;
            diyy diyyVar = diqw.c;
            diqq diqqVar = new diqq();
            diqqVar.b(true);
            diqqVar.c(false);
            diqoVar = this;
            diraVar = new dira(context, ditkVar, diqqVar.d(), diqoVar, j, str2);
        } else {
            diqoVar = this;
            dkty.c("Resuming file upload, session ID = %d, file ID = %s, TID = %s", valueOf, str2, str);
            Context context2 = diqoVar.b;
            ditk ditkVar2 = diqoVar.e;
            diyy diyyVar2 = diqw.c;
            diqq diqqVar2 = new diqq();
            diqqVar2.b(true);
            diqqVar2.c(s(a2.mRemoteParty));
            diraVar = new dira(context2, ditkVar2, diqqVar2.d(), diqoVar, j, str2);
        }
        return x(j, a2, diraVar);
    }

    @Override // defpackage.diua
    public final FileTransferServiceResult k(final String str, final String str2, final long j, FileTransferInfo fileTransferInfo) {
        final long a2 = this.c.a(str);
        return y(str, str2, j, fileTransferInfo, new ffbr() { // from class: diql
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                diqo diqoVar = diqo.this;
                diil diilVar = diqoVar.c;
                long j2 = j;
                long j3 = a2;
                dips dipsVar = diqoVar.d;
                String str3 = str2;
                Context context = diqoVar.b;
                String str4 = str;
                return diqy.e(diqoVar, context, diilVar, j2, j3, str4, diqoVar.e, dipsVar, str3, diqoVar.s(str4));
            }
        }, a2);
    }

    @Override // defpackage.diua
    public final FileTransferServiceResult l(final String str, final String str2, final long j, FileTransferInfo fileTransferInfo) {
        return y("", str2, j, fileTransferInfo, new ffbr() { // from class: diqj
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                diyy diyyVar = diqw.c;
                diqq diqqVar = new diqq();
                diqqVar.b(true);
                diqo diqoVar = diqo.this;
                diqqVar.c(diqoVar.s(str));
                diqw d = diqqVar.d();
                long j2 = j;
                return new dira(diqoVar.b, diqoVar.e, d, diqoVar, j2, str2);
            }
        }, -1L);
    }

    @Override // defpackage.diua
    public final PauseDownloadResult m(PauseDownloadRequest pauseDownloadRequest) {
        HashMap hashMap = this.f;
        String a2 = pauseDownloadRequest.a();
        diud diudVar = (diud) hashMap.remove(a2);
        if (diudVar == null) {
            dkty.q("Unable to pause download. No active download runnable. Download ID: %s", a2);
            dknj dknjVar = new dknj();
            dknjVar.b(FileTransferResult.b);
            return dknjVar.a();
        }
        dkty.c("Pausing file download for download ID: %s", a2);
        diudVar.a();
        dknj dknjVar2 = new dknj();
        dknjVar2.b(FileTransferResult.a);
        return dknjVar2.a();
    }

    @Override // defpackage.diua
    public final ResumeDownloadResult n(ResumeDownloadRequest resumeDownloadRequest) {
        HashMap hashMap = this.f;
        String c = resumeDownloadRequest.c();
        diud diudVar = (diud) hashMap.get(c);
        if (diudVar == null) {
            dkty.c("Resuming file download for download ID: %s", c);
            w(c, resumeDownloadRequest.b(), resumeDownloadRequest.a());
            dknn dknnVar = new dknn();
            dknnVar.b(FileTransferResult.a);
            return dknnVar.a();
        }
        if (diudVar.j) {
            dkty.q("Attempting to resume a file download but there is still an ongoing download runnable that will be cancelled in the near future.", new Object[0]);
        }
        dkty.c("File download is already in progress. No need to resume. Download ID: %s", c);
        dknn dknnVar2 = new dknn();
        dknnVar2.b(FileTransferResult.a);
        return dknnVar2.a();
    }

    @Override // defpackage.diqp
    public final void o(String str) {
        this.f.remove(str);
        b(str);
    }

    public final void p(dkjt dkjtVar, String str, long j, boolean z) {
        dkty.c("Received incoming HTTP file transfer push message!", new Object[0]);
        byte[] bArr = dkjtVar.f;
        try {
            dkty.c("%s", HttpFileTransferPushMessage.a(bArr).toString());
            String str2 = dkjtVar.e;
            String str3 = !Objects.isNull(dkjtVar) ? dkjtVar.k : null;
            if (Objects.isNull(str3)) {
                str3 = dktj.b();
                dkty.q("message.getId() was not available, generating new file id=%s", str3);
            }
            g(str3, str, str2, j, z, bArr);
        } catch (IOException e) {
            dkty.i(e, "Unable to parse HTTP FT push message", new Object[0]);
        }
    }

    @Override // defpackage.diua
    public final boolean q(int i) {
        djqt djqtVar = this.l;
        long j = i;
        StatFs statFs = new StatFs(djqtVar.b.s() ? Environment.getExternalStorageDirectory().getPath() : djqtVar.e());
        return j > statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    @Override // defpackage.diua
    public final boolean r(dkny dknyVar) {
        return !TextUtils.isEmpty(this.q.mFtHttpContentServerUri) && dknyVar == dkny.FILE_TRANSFER;
    }

    public final boolean s(String str) {
        ImsCapabilities c = this.j.c(str);
        return c != null && c.B();
    }

    @Override // defpackage.diua
    public final long[] t() {
        return dkta.b((Collection) Collection.EL.stream(this.f.keySet()).map(new Function() { // from class: diqk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(Long.parseLong((String) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList()));
    }

    @Override // defpackage.djtm
    public final void u(djtp djtpVar) {
        this.q = djtpVar.o();
    }

    @Override // defpackage.diua
    public final FileTransferServiceResult[] v(long j, String str, FileTransferInfo fileTransferInfo) {
        if (!this.c.i()) {
            return ditn.i(4, "Not registered to RCS");
        }
        if (((Boolean) a.a()).booleanValue() && j <= 0) {
            dkty.c("Failed to send a file since the group id (%d) is invalid", Long.valueOf(j));
            return ditn.i(9, "Invalid groupChatSessionId");
        }
        if (fileTransferInfo.f == -1) {
            fileTransferInfo.f = ditn.a(fileTransferInfo.a(), this.b.getContentResolver());
        }
        String uuid = UUID.randomUUID().toString();
        long registerSession = this.k.registerSession((diua) this);
        z(registerSession, " ", j, uuid, str, fileTransferInfo);
        dkty.c("Sending file to group, group session ID = %d, file transfer session ID = %d, file ID = %s, TID = %s", Long.valueOf(j), Long.valueOf(registerSession), str, uuid);
        diry b = this.m.b(registerSession, str, uuid, fileTransferInfo, this.q, diqy.d(this, this.b, this.c, registerSession, j, this.e, this.d, str));
        this.n.execute(b);
        this.f.put(Long.toString(registerSession), b);
        return new FileTransferServiceResult[]{new FileTransferServiceResult(registerSession, " ", 0, "HTTP FT Pending", str)};
    }
}
