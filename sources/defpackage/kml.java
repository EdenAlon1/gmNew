package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kml {
    public String A;
    public Bundle B;
    public int C;
    public int D;
    Notification E;
    public String F;
    int G;
    public String H;
    koo I;
    public long J;
    int K;
    public boolean L;
    public kmi M;
    Notification N;
    public boolean O;
    Object P;

    @Deprecated
    public ArrayList Q;
    public Context a;
    public ArrayList b;
    public ArrayList c;
    ArrayList d;
    CharSequence e;
    CharSequence f;
    public PendingIntent g;
    PendingIntent h;
    IconCompat i;
    CharSequence j;
    public int k;
    public int l;
    public boolean m;
    boolean n;
    knb o;
    CharSequence p;
    CharSequence q;
    int r;
    int s;
    boolean t;
    public String u;
    public boolean v;
    String w;
    public boolean x;
    boolean y;
    boolean z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0564 A[LOOP:5: B:137:0x0562->B:138:0x0564, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0377  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kml(android.content.Context r32, android.app.Notification r33) {
        /*
            Method dump skipped, instructions count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kml.<init>(android.content.Context, android.app.Notification):void");
    }

    public static CharSequence c(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    private final void z(int i, boolean z) {
        if (z) {
            Notification notification = this.N;
            notification.flags = i | notification.flags;
        } else {
            Notification notification2 = this.N;
            notification2.flags = (~i) & notification2.flags;
        }
    }

    public final Notification a() {
        Bundle bundle;
        kni kniVar = new kni(this);
        knb knbVar = kniVar.c.o;
        if (knbVar != null) {
            knbVar.b(kniVar);
        }
        Notification build = kniVar.b.build();
        if (knbVar != null) {
            kniVar.c.o.k();
        }
        if (knbVar != null && (bundle = build.extras) != null) {
            knbVar.j(bundle);
        }
        return build;
    }

    public final Bundle b() {
        if (this.B == null) {
            this.B = new Bundle();
        }
        return this.B;
    }

    public final void d(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.b.add(new kma(IconCompat.i(null, "", i), charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false));
    }

    public final void e(kma kmaVar) {
        this.b.add(kmaVar);
    }

    public final void f(knr knrVar) {
        if (knrVar != null) {
            this.c.add(knrVar);
        }
    }

    public final void g(boolean z) {
        z(16, z);
    }

    public final void h(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void i(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void j(int i) {
        this.N.defaults = i;
        if ((i & 4) != 0) {
            this.N.flags |= 1;
        }
    }

    public final void k(PendingIntent pendingIntent) {
        this.N.deleteIntent = pendingIntent;
    }

    public final void l() {
        this.K = 2;
    }

    public final void m(Bitmap bitmap) {
        IconCompat g;
        if (bitmap == null) {
            g = null;
        } else {
            Context context = this.a;
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = context.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            g = IconCompat.g(bitmap);
        }
        this.i = g;
    }

    public final void n(int i, int i2, int i3) {
        this.N.ledARGB = i;
        this.N.ledOnMS = i2;
        this.N.ledOffMS = i3;
        int i4 = 0;
        if (this.N.ledOnMS != 0 && this.N.ledOffMS != 0) {
            i4 = 1;
        }
        Notification notification = this.N;
        notification.flags = i4 | (notification.flags & (-2));
    }

    public final void o(boolean z) {
        z(2, z);
    }

    public final void p(boolean z) {
        z(8, z);
    }

    public final void q(int i, int i2, boolean z) {
        this.r = i;
        this.s = i2;
        this.t = z;
    }

    public final void r(int i) {
        this.N.icon = i;
    }

    public final void s(IconCompat iconCompat) {
        this.P = kqk.c(iconCompat, this.a);
    }

    public final void t(Uri uri) {
        this.N.sound = uri;
        this.N.audioStreamType = -1;
        AudioAttributes.Builder d = kmj.d(kmj.b(kmj.a(), 4), 5);
        this.N.audioAttributes = kmj.e(d);
    }

    public final void u(knb knbVar) {
        if (this.o != knbVar) {
            this.o = knbVar;
            if (knbVar != null) {
                knbVar.i(this);
            }
        }
    }

    public final void v(CharSequence charSequence) {
        this.p = c(charSequence);
    }

    public final void w(CharSequence charSequence) {
        this.N.tickerText = c(charSequence);
    }

    public final void x(long[] jArr) {
        this.N.vibrate = jArr;
    }

    public final void y(long j) {
        this.N.when = j;
    }

    public kml(Context context, String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.m = true;
        this.x = false;
        this.C = 0;
        this.D = 0;
        this.G = 0;
        this.K = 0;
        Notification notification = new Notification();
        this.N = notification;
        this.a = context;
        this.F = str;
        notification.when = System.currentTimeMillis();
        this.N.audioStreamType = -1;
        this.l = 0;
        this.Q = new ArrayList();
        this.L = true;
    }
}
