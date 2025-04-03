package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alsa {
    private final cpn a = new cpn();
    private final cpn b = new cpn();
    private final ffbr c;
    private final ffbr d;

    public alsa(ffbr ffbrVar, ffbr ffbrVar2) {
        new cpn();
        this.c = ffbrVar;
        this.d = ffbrVar2;
    }

    private static int e(long j) {
        int i = (int) j;
        return i >= 0 ? i : Alert.DURATION_SHOW_INDEFINITELY;
    }

    private final cpn f(int i) {
        return i != 0 ? this.b : this.a;
    }

    public final void a(int i, Uri uri, int i2) {
        if (uri != null) {
            ffbr ffbrVar = this.d;
            String uri2 = uri.toString();
            if (!((alsc) ffbrVar.b()).b() || TextUtils.isEmpty(uri2)) {
                return;
            }
            cpn f = f(i);
            synchronized (f) {
                if (f.containsKey(uri2)) {
                    ecou ecouVar = (ecou) f.get(uri2);
                    if (ecouVar == null) {
                        return;
                    }
                    if (i2 >= 0) {
                        ecouVar.j = i2;
                    }
                    ((alrv) this.c.b()).d(ecouVar);
                    f.remove(uri2);
                }
            }
        }
    }

    public final void b(int i, Uri uri, long j, long j2, String str) {
        if (uri != null) {
            ffbr ffbrVar = this.d;
            String uri2 = uri.toString();
            if (!((alsc) ffbrVar.b()).b() || TextUtils.isEmpty(uri2)) {
                return;
            }
            cpn f = f(i);
            synchronized (f) {
                if (f.containsKey(uri2)) {
                    ecou ecouVar = (ecou) f.get(uri2);
                    if (ecouVar == null) {
                        return;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        ecouVar.c(str);
                    }
                    ecouVar.b(e(j), e(j2));
                    ((alrv) this.c.b()).d(ecouVar);
                    f.remove(uri2);
                }
            }
        }
    }

    public final void c(int i, Uri uri) {
        if (((alsc) this.d.b()).a()) {
            cpn f = f(i);
            synchronized (f) {
                String uri2 = uri.toString();
                f.put(uri2, new ecou(uri2));
            }
        }
    }

    public final void d(Uri uri) {
        if (uri != null) {
            String uri2 = uri.toString();
            cpn f = f(1);
            synchronized (f) {
                if (f.containsKey(uri2)) {
                    f.remove(uri2);
                }
            }
        }
    }
}
