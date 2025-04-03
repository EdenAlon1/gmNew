package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import j$.nio.channels.DesugarChannels;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdr implements efbi {
    public boolean a;
    private final boolean b;
    private final boolean c;

    public efdr(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    @Override // defpackage.efbi
    public final /* bridge */ /* synthetic */ Object a(efbh efbhVar) {
        efcs efcsVar;
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        emxc b;
        ?? r0;
        FileLock tryLock;
        Uri build = efbhVar.e.buildUpon().path(String.valueOf(efbhVar.f.getPath()).concat(".lock")).fragment("").build();
        Closeable closeable = null;
        if (this.a) {
            Semaphore c = efbhVar.b.c().c(build.toString());
            if (true != c.tryAcquire()) {
                c = null;
            }
            efct efctVar = new efct(c);
            try {
                if (efctVar.a != null) {
                    efcsVar = new efcs(efctVar.a());
                    efctVar.close();
                } else {
                    efctVar.close();
                    efcsVar = null;
                }
            } finally {
            }
        } else {
            Semaphore c2 = efbhVar.b.c().c(build.toString());
            try {
                c2.acquire();
                efct efctVar2 = new efct(c2);
                try {
                    efcsVar = new efcs(efctVar2.a());
                    efctVar2.close();
                } finally {
                }
            } catch (InterruptedException e) {
                throw new InterruptedIOException("semaphore not acquired: ".concat(e.toString()));
            }
        }
        efcw efcwVar = new efcw(efcsVar);
        try {
            if (efcwVar.a != null) {
                efcw efcwVar2 = new efcw(this.b ? this.c ? efbhVar.b.e(build) : (Closeable) efbhVar.a.c(build, new efdv()) : efbhVar.b.g(build));
                try {
                    Closeable closeable2 = efcwVar2.a;
                    if (closeable2 instanceof efcg) {
                        convertMaybeLegacyFileChannelFromLibrary = ((efcg) closeable2).a();
                    } else {
                        if (!(closeable2 instanceof RandomAccessFile)) {
                            throw new IOException("Lock stream not convertible to FileChannel");
                        }
                        convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((RandomAccessFile) closeable2).getChannel());
                    }
                    FileChannel fileChannel = convertMaybeLegacyFileChannelFromLibrary;
                    if (this.a) {
                        efbhVar.b.c();
                        try {
                            tryLock = fileChannel.tryLock(0L, Long.MAX_VALUE, this.b);
                        } catch (IOException unused) {
                        }
                        r0 = tryLock == null ? 0 : new efcr(tryLock);
                    } else {
                        efbhVar.b.c();
                        boolean z = this.b;
                        emxc b2 = efcu.b(fileChannel, z);
                        if (b2.g()) {
                            r0 = b2.c();
                        } else {
                            efcu.a.longValue();
                            efcu.b.longValue();
                            emxf.a(true);
                            emxf.a(true);
                            efdc efdcVar = new efdc();
                            do {
                                SystemClock.sleep(efdcVar.next().longValue());
                                b = efcu.b(fileChannel, z);
                            } while (!b.g());
                            r0 = b.c();
                        }
                    }
                    efcw efcwVar3 = new efcw(r0);
                    try {
                        if (efcwVar3.a == null) {
                            efcwVar3.close();
                            efcwVar2.close();
                        } else {
                            final Closeable a = efcwVar.a();
                            final Closeable a2 = efcwVar2.a();
                            final Closeable a3 = efcwVar3.a();
                            Closeable closeable3 = new Closeable() { // from class: efdq
                                @Override // java.io.Closeable, java.lang.AutoCloseable
                                public final void close() {
                                    Closeable closeable4 = a;
                                    Closeable closeable5 = a2;
                                    Closeable closeable6 = a3;
                                    if (closeable6 != null) {
                                        try {
                                            try {
                                                closeable6.close();
                                            } catch (Throwable th) {
                                                if (closeable5 != null) {
                                                    try {
                                                        closeable5.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            if (closeable4 != null) {
                                                try {
                                                    closeable4.close();
                                                } catch (Throwable th4) {
                                                    th3.addSuppressed(th4);
                                                }
                                            }
                                            throw th3;
                                        }
                                    }
                                    if (closeable5 != null) {
                                        closeable5.close();
                                    }
                                    if (closeable4 != null) {
                                        closeable4.close();
                                    }
                                }
                            };
                            efcwVar3.close();
                            efcwVar2.close();
                            closeable = closeable3;
                        }
                    } finally {
                    }
                } finally {
                }
            }
            efcwVar.close();
            return closeable;
        } finally {
        }
    }
}
