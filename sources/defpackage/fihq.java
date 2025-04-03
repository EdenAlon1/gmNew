package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.net.IDN;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.ApiVersion;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.impl.ImplVersion;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fihq extends ICronetEngineBuilder {
    static final int a;
    private static final Pattern q = Pattern.compile("^[0-9\\.]*$");
    protected final fiic b;
    public final Context c;
    public final fihz f;
    public boolean g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;
    public boolean l;
    public fihn m;
    public long n;
    public String o;
    public boolean p;
    public final List d = new LinkedList();
    public final List e = new LinkedList();
    private int r = 20;

    static {
        a = Integer.parseInt(ApiVersion.getCronetVersion().split("\\.")[0]) < 59 ? 3 : 34;
    }

    public fihq(Context context, fihz fihzVar) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        this.f = fihzVar;
        this.b = fiid.a(applicationContext, fihzVar);
        try {
            this.j = true;
            this.k = true;
            this.l = false;
            h(0, 0L);
            this.p = false;
            this.g = true;
            l(uptimeMillis, true);
        } catch (Throwable th) {
            l(uptimeMillis, false);
            throw th;
        }
    }

    private final void l(long j, boolean z) {
        if (a >= 30) {
            return;
        }
        fihx fihxVar = new fihx();
        fihxVar.d = false;
        try {
            fihxVar.h = 2;
            fihxVar.g = Process.myUid();
            fihxVar.f = new fiib(ImplVersion.getCronetVersion());
            fihxVar.c = this.f;
            fihxVar.e = new fiib(ApiVersion.getCronetVersion());
            fihxVar.a = getLogCronetInitializationRef();
            fihxVar.d = Boolean.valueOf(z);
        } finally {
            fihxVar.b = (int) (SystemClock.uptimeMillis() - j);
            this.b.b(fihxVar);
        }
    }

    public final int a() {
        return this.m.e;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        f(str, set, z, date);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        g(str, i, i2);
        return this;
    }

    public final int b(int i) {
        int i2 = this.r;
        return i2 == 20 ? i : i2;
    }

    public final String c() {
        if (!this.j) {
            return "";
        }
        Context context = this.c;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        filn.b(sb);
        return sb.toString();
    }

    public final fihw d() {
        int i;
        int i2;
        boolean z = this.g;
        boolean z2 = this.j;
        boolean z3 = this.k;
        boolean z4 = this.l;
        int ordinal = this.m.ordinal();
        if (ordinal != 0) {
            i = 3;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i2 = 2;
                } else {
                    if (ordinal != 3) {
                        throw new IllegalArgumentException("Unknown internal builder cache mode");
                    }
                    i2 = 1;
                }
                return new fihw(z, z2, z3, z4, i2, this.o, this.p, b(10), getLogCronetInitializationRef());
            }
        } else {
            i = 0;
        }
        i2 = i;
        return new fihw(z, z2, z3, z4, i2, this.o, this.p, b(10), getLogCronetInitializationRef());
    }

    public filp e() {
        return null;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        this.l = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        this.k = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        h(i, j);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.p = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.g = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        this.j = z;
        return this;
    }

    public final void f(String str, Set set, boolean z, Date date) {
        str.getClass();
        set.getClass();
        date.getClass();
        if (q.matcher(str).matches()) {
            throw new IllegalArgumentException(a.a(str, "Hostname ", " is illegal. A hostname should not consist of digits and/or dots only."));
        }
        if (str.length() > 255) {
            throw new IllegalArgumentException(a.a(str, "Hostname ", " is too long. The name of the host does not comply with RFC 1122 and RFC 1123."));
        }
        try {
            String ascii = IDN.toASCII(str, 2);
            HashMap hashMap = new HashMap();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bArr = (byte[]) it.next();
                if (bArr == null || bArr.length != 32) {
                    throw new IllegalArgumentException("Public key pin is invalid");
                }
                hashMap.put(Base64.encodeToString(bArr, 0), bArr);
            }
            this.e.add(new fiho(ascii, (byte[][]) hashMap.values().toArray(new byte[hashMap.size()][]), z, date));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException(a.a(str, "Hostname ", " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123."));
        }
    }

    public final void g(String str, int i, int i2) {
        if (str.contains("/")) {
            throw new IllegalArgumentException("Illegal QUIC Hint Host: ".concat(String.valueOf(str)));
        }
        this.d.add(new fihp(str, i, i2));
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return filn.a(this.c);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    protected long getLogCronetInitializationRef() {
        return 0L;
    }

    public final void h(int i, long j) {
        fihn fihnVar;
        fihn fihnVar2 = fihn.DISABLED;
        if (i == 0) {
            fihnVar = fihn.DISABLED;
        } else if (i == 1) {
            fihnVar = fihn.MEMORY;
        } else if (i == 2) {
            fihnVar = fihn.DISK_NO_HTTP;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("Unknown public builder cache mode");
            }
            fihnVar = fihn.DISK;
        }
        if (fihnVar.e == 1 && this.i == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.m = fihnVar;
        this.n = j;
    }

    public final void j(String str) {
        if (!new File(str).isDirectory()) {
            throw new IllegalArgumentException("Storage path must be set to existing directory");
        }
        this.i = str;
    }

    public final void k(int i) {
        if (i > 19 || i < -20) {
            throw new IllegalArgumentException("Thread priority invalid");
        }
        this.r = i;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        this.o = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        i(libraryLoader);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        j(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        k(i);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.h = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    public void i(CronetEngine.Builder.LibraryLoader libraryLoader) {
    }
}
