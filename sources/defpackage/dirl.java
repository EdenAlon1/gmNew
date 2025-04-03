package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.ims.filetransfer.http.runnable.GenericFileTransferException;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dirl extends diud {
    static final diyy a = dizd.a(177199430);
    private static final byte[] b = new byte[0];
    private final disp k;
    private final djqt l;
    private final String m;
    private final Optional n;
    private final int o;
    private final String p;
    private final String q;
    private final ffbr r;
    private long s;

    public dirl(Context context, dips dipsVar, djqt djqtVar, ffbr ffbrVar, disp dispVar, long j, String str, InstantMessageConfiguration instantMessageConfiguration, diuc diucVar, String str2, Optional optional, int i, dijy dijyVar, String str3) {
        super(context, j, str, instantMessageConfiguration, diucVar, dipsVar, dijyVar, ffbrVar);
        this.l = djqtVar;
        this.m = str2;
        this.n = optional;
        this.o = i;
        this.k = dispVar;
        this.p = str3;
        this.q = ditn.e(str2);
        this.r = ffbrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final diso j(Optional optional) {
        dkty.k("Using HttpDownloadStrategy to download the file.", new Object[0]);
        if (optional.isPresent()) {
            this.k.c(this.p, this.m, ((Long) optional.get()).longValue());
        } else {
            this.k.b(this.p, this.m);
        }
        try {
            return (diso) this.k.a().get(djae.a(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (e.getCause() instanceof GenericFileTransferException) {
                throw ((GenericFileTransferException) e.getCause());
            }
            throw new IllegalStateException("Download response future not present", e);
        }
    }

    private final void k(File file) {
        if (file.delete()) {
            return;
        }
        this.h.a(eyyl.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_DELETE_A_FILE);
        throw new IOException("Unable to delete file " + file.getName() + ". Aborting.");
    }

    private final void l() {
        if (Objects.isNull(this.k)) {
            Objects.isNull(null);
        } else {
            dkty.k("Closing the connection in HttpDownloadStrategy", new Object[0]);
            this.k.close();
        }
    }

    private final void m(Exception exc) {
        int i;
        b(diqh.e);
        if (this.j) {
            dkty.o("Download canceled", new Object[0]);
            this.h.a(eyyl.FILE_TRANSFER_FAILURE_REASON_FILE_TRANSFER_CANCELLED);
            i = 5;
        } else {
            dkty.s(exc, "Unable to download file", new Object[0]);
            this.h.a(eyyl.FILE_TRANSFER_FAILURE_REASON_SESSION_ERROR);
            i = 8;
        }
        d(20013, i);
    }

    @Override // java.lang.Runnable
    public final void run() {
        diqh diqhVar;
        String str;
        String d;
        Optional of;
        int i;
        dkty.c("FileDownloadRunnable starting: %s", toString());
        try {
            try {
                d(20001, this.o);
                d(20002, this.o);
                d(20010, this.o);
                this.h.c(2);
                this.h.c(3);
                TrafficStats.setThreadStatsTag(Process.myPid());
                try {
                    this.h.d(this.q, 2, enoz.a);
                    this.s = dkvj.a().longValue();
                    long j = this.o;
                    String str2 = this.e;
                    djqt djqtVar = this.l;
                    diyy diyyVar = ditn.a;
                    str = str2 + j;
                    d = djqtVar.d();
                } catch (Throwable th) {
                    l();
                    throw th;
                }
            } catch (GenericFileTransferException e) {
                dkty.k("GenericFileTransferException thrown %s", e);
                this.h.a(e.a());
                m(e);
            } catch (diue e2) {
                dkty.k("HttpResponseException thrown %s", e2);
                int i2 = e2.a;
                Duration duration = e2.b;
                if (i2 != 401) {
                    if (i2 != 410) {
                        if (i2 != 422) {
                            if (i2 == 403) {
                                diqhVar = djae.o() ? diqh.f : diqh.d;
                            } else if (i2 != 404) {
                                diqg c = diqh.c();
                                c.c(3);
                                c.b(duration);
                                diqhVar = c.a();
                            }
                            b(diqhVar);
                            i(h(diqhVar), ((diqd) diqhVar).b);
                        }
                    }
                    diqhVar = diqh.d;
                    b(diqhVar);
                    i(h(diqhVar), ((diqd) diqhVar).b);
                }
                diqhVar = diqh.f;
                b(diqhVar);
                i(h(diqhVar), ((diqd) diqhVar).b);
            } catch (IOException e3) {
                e = e3;
                m(e);
            } catch (IllegalStateException e4) {
                e = e4;
                m(e);
            }
            if (TextUtils.isEmpty(d)) {
                throw new IOException(String.format("Unable to obtain default target directory for: %s", d));
            }
            if (!ditn.h(d)) {
                throw new IOException(String.format("Unable to create default target directory: %s", d));
            }
            File file = new File(new File(d), str);
            if (file.exists()) {
                long length = file.length();
                if (length >= this.o) {
                    dkty.q("Size of the temporary file is bigger than the expected size. Re-downloading from start to avoid corruption.", new Object[0]);
                    k(file);
                    of = Optional.empty();
                } else {
                    of = Optional.of(Long.valueOf(length));
                }
            } else {
                of = Optional.empty();
            }
            if (Objects.isNull(this.k)) {
                if (!of.isPresent()) {
                    throw null;
                }
                throw null;
            }
            diso j2 = j(of);
            int a2 = j2.a();
            String str3 = (String) j2.b().get("Retry-After");
            boolean isPresent = of.isPresent();
            this.h.b(this.q, a2, dkvj.a().longValue() - this.s);
            if (a2 != 200) {
                if (isPresent) {
                    if (a2 != 206) {
                    }
                }
                try {
                    if (!TextUtils.isEmpty(str3)) {
                        try {
                            i = Integer.parseInt(str3);
                        } catch (NumberFormatException unused) {
                            this.h.a(eyyl.FILE_TRANSFER_FAILURE_REASON_INVALID_RETRY_AFTER_VALUE);
                            throw new IOException("Invalid retry after value: ".concat(String.valueOf(str3)));
                        }
                    } else {
                        if (a2 == 503) {
                            this.h.a(eyyl.FILE_TRANSFER_FAILURE_REASON_INVALID_RETRY_AFTER_VALUE);
                            throw new IOException("No retry after value in 503 response");
                        }
                        i = 0;
                    }
                    if (i > 0) {
                        try {
                            this.h.c(4);
                        } catch (IOException e5) {
                            e = e5;
                            dkty.i(e, "Exception while extracting retry-after", new Object[0]);
                            throw new diue(a2, Duration.ofSeconds(i));
                        }
                    }
                } catch (IOException e6) {
                    e = e6;
                    i = 0;
                }
                throw new diue(a2, Duration.ofSeconds(i));
            }
            if (of.isPresent() && "none".equals((String) j2.b().get("Accept-Ranges"))) {
                dkty.q("This web server does not support resuming downloads. Re-downloading from start.", new Object[0]);
                k(file);
            }
            Optional c2 = j2.c();
            if (!Objects.isNull(this.k) && c2.isEmpty()) {
                throw new IllegalStateException("Input stream not present in the HTTP response obtained from the HttpDownloadStrategy.");
            }
            Object obj = c2.get();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, true));
            byte[] bArr = new byte[20480];
            int length2 = (int) file.length();
            while (true) {
                try {
                    int i3 = this.o;
                    if (length2 < i3) {
                        e();
                        int read = ((InputStream) obj).read(bArr);
                        if (read < 0) {
                            this.h.a(eyyl.FILE_TRANSFER_FAILURE_REASON_WRITING_TO_FILE_FAILED);
                            throw new IOException("Socket closed prematurely");
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                        length2 += read;
                        long j3 = FileTransferEvent.j(length2, this.o);
                        this.f.b(((Boolean) a.a()).booleanValue() ? new FileTransferEvent(20012, this.c, j3, this.e) : new FileTransferEvent(20012, this.c, j3), dkuj.FILE_DOWNLOAD_RUNNABLE);
                    } else {
                        if (length2 > i3) {
                            this.h.a(eyyl.FILE_TRANSFER_FAILURE_REASON_WRITING_TO_FILE_FAILED);
                            throw new IOException("Got more bytes than expected! File is corrupt");
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        ((InputStream) obj).close();
                        Uri b2 = ditn.b(this.g, (String) this.n.orElse(null), file, this.l);
                        l();
                        c(b, b2);
                        this.h.c(6);
                        d(20011, 0L);
                    }
                } catch (Throwable th2) {
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    ((InputStream) obj).close();
                    throw th2;
                }
            }
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
