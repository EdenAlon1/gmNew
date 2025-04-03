package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Process;
import com.google.android.ims.filetransfer.http.runnable.GenericFileTransferException;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diui extends diud {
    private final String a;
    private final int b;
    private final String k;
    private final String l;
    private final disp m;

    public diui(Context context, disp dispVar, long j, String str, InstantMessageConfiguration instantMessageConfiguration, diuc diucVar, dips dipsVar, String str2, int i, dijy dijyVar, String str3, ffbr ffbrVar) {
        super(context, j, str, instantMessageConfiguration, diucVar, dipsVar, dijyVar, ffbrVar);
        this.a = str2;
        this.b = i;
        this.k = str3;
        this.m = dispVar;
        this.l = k(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final diso j() {
        if (Objects.isNull(this.m)) {
            throw null;
        }
        dkty.k("Using HttpDownloadStrategy to download the thumbnail.", new Object[0]);
        this.m.b(this.k, this.a);
        try {
            return (diso) this.m.a().get(djae.a(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new IllegalStateException("Download response future not present", e);
        }
    }

    private static String k(String str) {
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    private final void l() {
        if (Objects.isNull(this.m)) {
            Objects.isNull(null);
        } else {
            dkty.k("Closing the connection in HttpDownloadStrategy", new Object[0]);
            this.m.close();
        }
    }

    private final void m(Exception exc, eyyl eyylVar) {
        dkty.i(exc, "Unable to download thumbnail for HTTP download", new Object[0]);
        this.h.a(eyylVar);
        b(diqh.e);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.c(2);
        this.h.c(3);
        try {
            try {
                try {
                    TrafficStats.setThreadStatsTag(Process.myPid());
                    this.h.d(this.l, 2, enoz.a);
                    long longValue = dkvj.a().longValue();
                    diso j = j();
                    this.h.b(this.l, j.a(), dkvj.a().longValue() - longValue);
                    Optional c = j.c();
                    if (!Objects.isNull(this.m) && c.isEmpty()) {
                        throw new IllegalStateException("Input stream not present in the HTTP response obtained from the HttpDownloadStrategy.");
                    }
                    c(g((InputStream) c.get(), this.b), Uri.EMPTY);
                    this.h.c(6);
                } catch (GenericFileTransferException e) {
                    m(e, e.a());
                }
            } catch (IOException e2) {
                this.h.e(this.l);
                m(e2, eyyl.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED);
            } catch (IllegalStateException e3) {
                m(e3, eyyl.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED);
            }
        } finally {
            l();
            TrafficStats.clearThreadStatsTag();
        }
    }
}
