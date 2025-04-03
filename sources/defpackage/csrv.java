package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csrv {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/debug/DebugFileUtils");
    public static final cfva b = cfvl.i(cfvl.b, "enable_debug_values_from_settings_store", false);
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final fazb f;
    public volatile boolean g;
    public volatile boolean h;
    public volatile boolean i;
    public volatile boolean j;
    public volatile boolean k;
    public volatile int l;
    public volatile int m;
    public volatile boolean n;
    public volatile boolean o;
    public volatile boolean p;
    public volatile boolean q;
    public volatile boolean r;
    public volatile boolean s;
    public volatile boolean t;
    private final ffsk u;

    public csrv(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, fazb fazbVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        fazbVar.getClass();
        ffskVar.getClass();
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = fazbVar;
        this.u = ffskVar;
        this.l = -1;
        this.m = -2;
        if (((Boolean) b.e()).booleanValue()) {
            axol.k(ffskVar, null, new csrk(this, null), 3);
        }
    }

    public final File a(String str, boolean z, Context context) {
        context.getClass();
        File file = new File(b(context), str);
        if (z && file.exists()) {
            file.delete();
        }
        return file;
    }

    public final File b(Context context) {
        context.getClass();
        File file = new File(context.getCacheDir() + File.separator + "Debug");
        if (!file.exists() && !file.isDirectory() && !file.mkdirs()) {
            ensk i = a.i();
            i.Y(ente.a, "Bugle");
            ((enrr) i.h("com/google/android/apps/messaging/shared/util/debug/DebugFileUtils", "getDebugFilesDir", 162, "DebugFileUtils.kt")).t("getDebugFilesDir: couldn't create dir: %s", file.getPath());
        }
        return file;
    }

    public final void c() {
        k(-1);
    }

    public final void d() {
        l(-2);
    }

    public final void e(boolean z) {
        if (this.g != z && ((Boolean) b.e()).booleanValue()) {
            axol.k(this.u, null, new csrm(null, this, z), 3);
        }
        this.g = z;
    }

    public final void f(boolean z) {
        if (this.o != z && ((Boolean) b.e()).booleanValue()) {
            axol.k(this.u, null, new csru(null, this, z), 3);
        }
        this.o = z;
    }

    public final void g(boolean z) {
        if (this.k != z && ((Boolean) b.e()).booleanValue()) {
            axol.k(this.u, null, new csrq(null, this, z), 3);
        }
        this.k = z;
    }

    public final void h(boolean z) {
        if (this.j != z && ((Boolean) b.e()).booleanValue()) {
            axol.k(this.u, null, new csrp(null, this, z), 3);
        }
        this.j = z;
    }

    public final void i(boolean z) {
        if (this.n != z && ((Boolean) b.e()).booleanValue()) {
            axol.k(this.u, null, new csrt(null, this, z), 3);
        }
        this.n = z;
    }

    public final void j(boolean z) {
        if (this.i != z && ((Boolean) b.e()).booleanValue()) {
            axol.k(this.u, null, new csro(null, this, z), 3);
        }
        this.i = z;
    }

    public final void k(int i) {
        if (this.l != i && ((Boolean) b.e()).booleanValue()) {
            axol.k(this.u, null, new csrr(null, this, i), 3);
        }
        this.l = i;
    }

    public final void l(int i) {
        if (this.m != i && ((Boolean) b.e()).booleanValue()) {
            axol.k(this.u, null, new csrs(null, this, i), 3);
        }
        this.m = i;
    }

    public final void m(boolean z) {
        if (this.h != z && ((Boolean) b.e()).booleanValue()) {
            axol.k(this.u, null, new csrn(null, this, z), 3);
        }
        this.h = z;
    }

    public final void n() {
        e(!this.g);
    }

    public final void o() {
        m(!this.h);
        if (this.h) {
            cnit.b.k(0L);
        } else {
            cnit.b.m();
        }
    }

    public final boolean p() {
        return this.l != -1;
    }

    public final boolean q() {
        return ((cssv) this.c.b()).a();
    }

    public final boolean r() {
        return ((cssv) this.c.b()).b();
    }

    public final byte[] s(String str, Context context) {
        str.getClass();
        context.getClass();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(a(str, false, context)));
            try {
                byte[] b2 = eoej.b(bufferedInputStream);
                b2.getClass();
                if (b2.length == 0) {
                    ensk i = a.i();
                    i.Y(ente.a, "Bugle");
                    ((enrr) i.h("com/google/android/apps/messaging/shared/util/debug/DebugFileUtils", "receiveFromDumpFile", 197, "DebugFileUtils.kt")).q("receiveFromDumpFile: empty data");
                }
                ffig.a(bufferedInputStream, null);
                return b2;
            } finally {
            }
        } catch (IOException e) {
            ensk i2 = a.i();
            i2.Y(ente.a, "Bugle");
            ((enrr) ((enrr) i2).g(e).h("com/google/android/apps/messaging/shared/util/debug/DebugFileUtils", "receiveFromDumpFile", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "DebugFileUtils.kt")).q("receiveFromDumpFile:");
            return null;
        }
    }
}
