package defpackage;

import java.io.RandomAccessFile;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekib {
    public static final String a(String str) {
        return str == null ? "103243289" : "103243289_".concat(new ffpa("[^A-Za-z0-9\\-_:]").a(str, "_"));
    }

    public static final void b(RandomAccessFile randomAccessFile, int i) {
        randomAccessFile.writeInt(i);
        randomAccessFile.seek(0L);
    }
}
