package defpackage;

import android.util.Log;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qze implements qud {
    private final File a;

    public qze(File file) {
        this.a = file;
    }

    @Override // defpackage.qud
    public final Class a() {
        return ByteBuffer.class;
    }

    @Override // defpackage.qud
    public final qsy eV() {
        return qsy.LOCAL;
    }

    @Override // defpackage.qud
    public final void g(qqe qqeVar, quc qucVar) {
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        try {
            File file = this.a;
            int i = rjr.a;
            FileChannel fileChannel = null;
            try {
                long length = file.length();
                if (length > 2147483647L) {
                    throw new IOException("File too large to map into memory");
                }
                if (length == 0) {
                    throw new IOException("File unsuitable for memory mapping");
                }
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                    try {
                        MappedByteBuffer load = convertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                        if (convertMaybeLegacyFileChannelFromLibrary != null) {
                            try {
                                convertMaybeLegacyFileChannelFromLibrary.close();
                            } catch (IOException unused) {
                            }
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused2) {
                        }
                        qucVar.c(load);
                    } catch (Throwable th2) {
                        th = th2;
                        fileChannel = convertMaybeLegacyFileChannelFromLibrary;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (randomAccessFile == null) {
                            throw th;
                        }
                        try {
                            randomAccessFile.close();
                            throw th;
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                randomAccessFile = null;
            }
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
            }
            qucVar.f(e);
        }
    }

    @Override // defpackage.qud
    public final void d() {
    }

    @Override // defpackage.qud
    public final void e() {
    }
}
