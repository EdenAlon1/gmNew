package defpackage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csjw extends csjx {
    public Logger a;
    public FileHandler c;
    private final int d;
    private final int e;
    private final String f;
    private final Context g;
    public final ExecutorService b = Executors.newFixedThreadPool(1, new cskh("DiskLogSaver"));
    private final SimpleDateFormat h = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);

    public csjw(Context context, int i, int i2, String str, String str2) {
        this.g = context;
        emxf.l(i > 0);
        emxf.l(i2 > 0);
        emxf.l(str != null);
        emxf.l(str.length() > 0);
        this.d = i;
        this.e = i2;
        this.f = str;
        Logger logger = Logger.getLogger(str2);
        this.a = logger;
        logger.getClass();
        for (Handler handler : logger.getHandlers()) {
            logger.removeHandler(handler);
        }
        this.a.setUseParentHandlers(false);
        try {
            this.c = new FileHandler(String.valueOf(this.g.getDir("logs", 0)) + "/" + this.f + "%g.log", this.e, this.d, true);
            this.c.setFormatter(new csjv());
            this.c.setLevel(Level.ALL);
            this.a.addHandler(this.c);
        } catch (Exception e) {
            Log.e("Bugle", "LogSaver: fail to init disk logger", e);
        }
    }

    private final void d(PrintWriter printWriter, String str) {
        int i = this.d;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            String str2 = String.valueOf(this.g.getDir("logs", 0)) + "/" + str + i + ".log";
            File file = new File(str2);
            try {
                FileReader fileReader = new FileReader(file);
                try {
                    if (file.exists()) {
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        while (true) {
                            try {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                } else {
                                    printWriter.println(readLine.trim());
                                }
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                        bufferedReader.close();
                    }
                    fileReader.close();
                } catch (Throwable th3) {
                    try {
                        fileReader.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (FileNotFoundException unused) {
                Log.w("Bugle", "LogSaver: can not find log file ".concat(str2));
            } catch (IOException e) {
                Log.w("Bugle", "LogSaver: can not read log file", e);
            }
        }
    }

    @Override // defpackage.csjx
    public final void a(PrintWriter printWriter, csjz csjzVar) {
        if (csjzVar == csjz.DIAGNOSTICS) {
            d(printWriter, this.f);
        } else {
            d(printWriter, csjzVar.d);
        }
    }

    @Override // defpackage.csjx
    public final void b(int i, String str, String str2) {
        final String format = String.format(Locale.US, "%s %5d %5d %s %s: %s\n", this.h.format(Long.valueOf(System.currentTimeMillis())), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()), i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? "?" : "E" : "W" : "I" : "D" : "V", str, str2);
        this.b.execute(new Runnable() { // from class: csju
            @Override // java.lang.Runnable
            public final void run() {
                csjw.this.a.logp(Level.INFO, "com.google.android.apps.messaging.shared.util.common.LogSaver$DiskLogSaver", "log", format);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.execute(new Runnable() { // from class: csjt
            @Override // java.lang.Runnable
            public final void run() {
                FileHandler fileHandler = csjw.this.c;
                if (fileHandler != null) {
                    fileHandler.close();
                }
            }
        });
        this.b.shutdown();
    }
}
