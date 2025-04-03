package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyc implements oxn {
    public final Context a;
    public final String b;
    public final oxj c;
    public final boolean d;
    public final boolean e;
    public final ffbz f = ffca.a(new ffix() { // from class: oxw
        @Override // defpackage.ffix
        public final Object invoke() {
            oyb oybVar;
            oyc oycVar = oyc.this;
            String str = oycVar.b;
            if (str == null || !oycVar.d) {
                oybVar = new oyb(oycVar.a, str, new oxx(), oycVar.c, oycVar.e);
            } else {
                File noBackupFilesDir = oycVar.a.getNoBackupFilesDir();
                noBackupFilesDir.getClass();
                oybVar = new oyb(oycVar.a, new File(noBackupFilesDir, oycVar.b).getAbsolutePath(), new oxx(), oycVar.c, oycVar.e);
            }
            oybVar.setWriteAheadLoggingEnabled(oycVar.g);
            return oybVar;
        }
    });
    public boolean g;

    public oyc(Context context, String str, oxj oxjVar, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = oxjVar;
        this.d = z;
        this.e = z2;
    }

    public final oyb a() {
        return (oyb) this.f.a();
    }

    @Override // defpackage.oxn
    public final oxi b() {
        return a().b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f.b()) {
            a().close();
        }
    }
}
