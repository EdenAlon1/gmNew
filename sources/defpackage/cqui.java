package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.FileOutputStream;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class cqui {
    public static final entd a = entd.c("BugleFileTransfer");
    public final ffbr b;
    public final errl c;
    public final Context d;
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    public cqui(ffbr ffbrVar, errl errlVar, Context context) {
        this.b = ffbrVar;
        this.c = errlVar;
        this.d = context;
    }

    public final void a(String str, FileOutputStream fileOutputStream) {
        fileOutputStream.close();
        this.e.remove(str);
    }
}
