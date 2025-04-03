package defpackage;

import android.util.Log;
import com.google.research.xeno.effect.AssetDownloader;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fadx implements AssetDownloader {
    private final ExecutorService a;

    public fadx() {
        int max = Math.max(10, 1);
        ersf ersfVar = new ersf();
        ersfVar.d("xeno-http-asset-downloader-thread-%d");
        this.a = Executors.newFixedThreadPool(max, ersf.b(ersfVar));
    }

    @Override // com.google.research.xeno.effect.AssetDownloader
    public final void downloadAsset(final String str, final AssetDownloader.DownloadCallback downloadCallback) {
        try {
            this.a.execute(new Runnable() { // from class: fadw
                @Override // java.lang.Runnable
                public final void run() {
                    Throwable th;
                    FileOutputStream fileOutputStream;
                    File file;
                    BufferedInputStream bufferedInputStream;
                    String str2 = str;
                    AssetDownloader.DownloadCallback downloadCallback2 = downloadCallback;
                    try {
                        Log.d("xno.HttpAssetDownloader", a.t(str2, "Starting download of asset at URL: "));
                        try {
                            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
                            httpURLConnection.connect();
                            int responseCode = httpURLConnection.getResponseCode();
                            if (httpURLConnection.getResponseCode() != 200) {
                                throw new IOException(String.format("Bad Http status code: %d", Integer.valueOf(responseCode)));
                            }
                            file = File.createTempFile("XenoHttpAssetDownloaderTmpFile", null);
                            try {
                                bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream(), 8192);
                                try {
                                    fileOutputStream = new FileOutputStream(file.getPath());
                                    try {
                                        byte[] bArr = new byte[8192];
                                        while (true) {
                                            int read = bufferedInputStream.read(bArr);
                                            if (read == -1) {
                                                try {
                                                    fileOutputStream.close();
                                                    bufferedInputStream.close();
                                                    Log.d("xno.HttpAssetDownloader", "Finished download of asset at URL: " + str2 + " to location: " + String.valueOf(file));
                                                    downloadCallback2.onCompletion(file.getPath(), null);
                                                    return;
                                                } finally {
                                                    if (file != null) {
                                                        Log.d("xno.HttpAssetDownloader", "Deleting temp file following unsuccessful download of asset at URL: ".concat(String.valueOf(str2)));
                                                        file.delete();
                                                    }
                                                }
                                            }
                                            fileOutputStream.write(bArr, 0, read);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Throwable th3) {
                                                if (file != null) {
                                                    Log.d("xno.HttpAssetDownloader", "Deleting temp file following unsuccessful download of asset at URL: ".concat(String.valueOf(str2)));
                                                    file.delete();
                                                }
                                                throw th3;
                                            }
                                        }
                                        if (bufferedInputStream != null) {
                                            bufferedInputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    fileOutputStream = null;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                fileOutputStream = null;
                                bufferedInputStream = null;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            fileOutputStream = null;
                            file = null;
                            bufferedInputStream = null;
                        }
                    } catch (Exception e) {
                        Log.d("xno.HttpAssetDownloader", "Failure while downloading asset at URL: ".concat(String.valueOf(str2)));
                        downloadCallback2.onCompletion(null, e.getMessage());
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            downloadCallback.onCompletion(null, "Asset downloader has been released");
        }
    }
}
