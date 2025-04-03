package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aknj implements cpdd {
    private final ffbr a;

    public aknj(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    private static Uri k(long j) {
        return Uri.withAppendedPath(coxk.c, Long.toString(j));
    }

    private final void l(int i, Uri uri) {
        Intent intent = new Intent();
        intent.setAction("com.google.android.apps.messaging.samsung.mde.telephonylistener.MESSAGE_STATUS_CHANGED");
        intent.putExtra("EXTRA_OPERATION", 1);
        intent.putExtra("EXTRA_URI", uri.toString());
        intent.putExtra("EXTRA_THREAD_TYPE", i);
        ((akne) this.a.b()).a(intent);
    }

    private final void m(Uri uri, String str, String[] strArr, int i, int i2) {
        if (i <= 0) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.google.android.apps.messaging.samsung.mde.telephonylistener.MESSAGE_STATUS_CHANGED");
        intent.putExtra("EXTRA_URI", uri.toString());
        intent.putExtra("EXTRA_OPERATION", i2);
        if (str != null) {
            intent.putExtra("EXTRA_WHERE", str);
        }
        if (strArr != null) {
            intent.putExtra("EXTRA_WHERE_ARGS", strArr);
        }
        intent.putExtra("EXTRA_AFFECTED_ROW_COUNT", i);
        ((akne) this.a.b()).a(intent);
    }

    private final void n(int i, Uri uri, int i2) {
        Intent intent = new Intent();
        intent.setAction("com.google.android.apps.messaging.samsung.mde.telephonylistener.MESSAGE_STATUS_CHANGED");
        intent.putExtra("EXTRA_OPERATION", 1);
        intent.putExtra("EXTRA_URI", uri.toString());
        intent.putExtra("EXTRA_MESSAGE_PROTOCOL", i);
        intent.putExtra("EXTRA_MESSAGE_CONTENT_TYPE", 1);
        if (i2 != 1) {
            intent.putExtra("EXTRA_FILE_TRANSFER_AUTO_DOWNLOAD", i2 == 3);
        }
        ((akne) this.a.b()).a(intent);
    }

    @Override // defpackage.cpdd
    public final void a(Uri uri, String str, String[] strArr, int i) {
        m(uri, str, strArr, i, 3);
    }

    @Override // defpackage.cpdd
    public final void b(cpxu cpxuVar) {
        l(2, k(cpxv.a(cpxuVar)));
    }

    @Override // defpackage.cpdd
    public final void c(Uri uri, UUID uuid) {
        if (uuid != null) {
            return;
        }
        n(1, uri, 1);
    }

    @Override // defpackage.cpdd
    public final void d(cpxu cpxuVar) {
        l(1, k(cpxv.a(cpxuVar)));
    }

    @Override // defpackage.cpdd
    public final void e(cpxu cpxuVar) {
        if (cpxuVar.d()) {
            return;
        }
        l(3, k(cpxuVar.a()));
    }

    @Override // defpackage.cpdd
    public final void f(Uri uri, UUID uuid) {
        if (uuid != null) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.google.android.apps.messaging.samsung.mde.telephonylistener.MESSAGE_STATUS_CHANGED");
        intent.putExtra("EXTRA_OPERATION", 1);
        intent.putExtra("EXTRA_URI", uri.toString());
        intent.putExtra("EXTRA_MESSAGE_PROTOCOL", 3);
        intent.putExtra("EXTRA_MESSAGE_CONTENT_TYPE", 2);
        ((akne) this.a.b()).a(intent);
    }

    @Override // defpackage.cpdd
    public final void g(Uri uri, UUID uuid) {
        if (uuid != null) {
            return;
        }
        n(0, uri, 1);
    }

    @Override // defpackage.cpdd
    public final void h(Uri uri, String str, String[] strArr, int i) {
        m(uri, str, strArr, i, 2);
    }

    @Override // defpackage.cpdd
    public final void i(Uri uri, int i, UUID uuid) {
        if (uuid != null) {
            return;
        }
        n(3, uri, i);
    }

    @Override // defpackage.cpdd
    public final void j(Uri uri, int i, UUID uuid) {
        if (uuid == null) {
            Intent intent = new Intent();
            intent.setAction("com.google.android.apps.messaging.samsung.mde.telephonylistener.MESSAGE_STATUS_CHANGED");
            intent.putExtra("EXTRA_OPERATION", 1);
            intent.putExtra("EXTRA_URI", uri.toString());
            intent.putExtra("EXTRA_MESSAGE_PROTOCOL", 3);
            intent.putExtra("EXTRA_MESSAGE_CONTENT_TYPE", 3);
            intent.putExtra("EXTRA_FILE_TRANSFER_AUTO_DOWNLOAD", i == 3);
            ((akne) this.a.b()).a(intent);
        }
    }
}
