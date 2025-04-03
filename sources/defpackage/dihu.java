package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import java.io.File;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dihu extends dihw {
    public final int a;
    private final BusinessInfoDatabase e;
    private final djqt f;

    public dihu(String str, Context context, int i, BusinessInfoDatabase businessInfoDatabase, djqt djqtVar) {
        super(str, context, !TextUtils.isEmpty(businessInfoDatabase.getLocalMediaPath(str, i)) ? dihz.INFO_LOCALLY_AVAILABLE : dihz.AVAILABILITY_UNKNOWN);
        this.e = businessInfoDatabase;
        this.a = i;
        this.f = djqtVar;
    }

    private static final void g(File file) {
        dkty.k("Deleting business media temp file %s", dkty.a(file));
        if (file.delete()) {
            return;
        }
        dkty.g("Unable to delete temporary business media file %s", dkty.a(file));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x009a, code lost:
    
        if (r11 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009c, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        if (r11 != null) goto L15;
     */
    @Override // defpackage.dihw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.dihz a(javax.net.ssl.HttpsURLConnection r11) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dihu.a(javax.net.ssl.HttpsURLConnection):dihz");
    }

    @Override // defpackage.dihw
    public final String b() {
        return String.format(kqt.a(this.c.getResources().getConfiguration()).f(0), "%s_%d", this.b, Integer.valueOf(this.a));
    }

    @Override // defpackage.dihw
    public final String c() {
        return this.e.getRemoteMediaPath(this.b, this.a);
    }

    @Override // defpackage.dihw
    protected final boolean e() {
        return false;
    }

    @Override // defpackage.dihw
    protected final void d(HttpsURLConnection httpsURLConnection) {
    }
}
