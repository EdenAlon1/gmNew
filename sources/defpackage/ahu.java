package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahu implements bct {
    public volatile int A = 3;
    private final bff B;
    private final akh C;
    private int D;
    private final boolean E;
    private final boolean F;
    private boolean G;
    private final Set H;
    private bcf I;
    private bgl J;
    private final ala K;
    private final apd L;
    private final amp M;
    public final bhd a;
    public final apu b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public final agj e;
    public final ahs f;
    final ahv g;
    CameraDevice h;
    int i;
    aku j;
    final AtomicInteger k;
    ListenableFuture l;
    kfb m;
    final Map n;
    final ahi o;
    final ayb p;
    final bdd q;
    public boolean r;
    public boolean s;
    public ame t;
    public final aky u;
    public final amr v;
    final Object w;
    boolean x;
    public final aqf y;
    public final ahn z;

    public ahu(Context context, apu apuVar, String str, ahv ahvVar, ayb aybVar, bdd bddVar, Executor executor, Handler handler, ala alaVar, long j) {
        bff bffVar = new bff();
        this.B = bffVar;
        this.i = 0;
        this.k = new AtomicInteger(0);
        this.n = new LinkedHashMap();
        this.D = 0;
        this.r = false;
        this.s = false;
        this.G = true;
        this.H = new HashSet();
        this.I = bci.a;
        this.w = new Object();
        this.x = false;
        this.z = new ahn(this);
        this.b = apuVar;
        this.p = aybVar;
        this.q = bddVar;
        bjh bjhVar = new bjh(handler);
        this.d = bjhVar;
        bjp bjpVar = new bjp(executor);
        this.c = bjpVar;
        this.f = new ahs(this, bjpVar, bjhVar, j);
        this.a = new bhd(str);
        bffVar.a(bcs.CLOSED);
        this.C = new akh(bddVar);
        this.u = new aky(bjpVar);
        this.K = alaVar;
        try {
            apd a = apuVar.a(str);
            this.L = a;
            agj agjVar = new agj(a, bjhVar, bjpVar, new ahj(this), ahvVar.j);
            this.e = agjVar;
            this.g = ahvVar;
            synchronized (ahvVar.d) {
                try {
                    ahvVar.e = agjVar;
                    bit bitVar = ahvVar.g;
                    if (bitVar != null) {
                        bitVar.b(ahvVar.e.e.d);
                    }
                    bit bitVar2 = ahvVar.f;
                    if (bitVar2 != null) {
                        bitVar2.b(ahvVar.e.f.b);
                    }
                    List<Pair> list = ahvVar.i;
                    if (list != null) {
                        for (Pair pair : list) {
                            ahvVar.e.q((Executor) pair.second, (bbt) pair.first);
                        }
                        ahvVar.i = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            try {
                                throw th;
                            } catch (aog e) {
                                e = e;
                                throw new ato(e);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }
            int d = ahvVar.d();
            avw.e("Camera2CameraInfo", "Device Level: ".concat(d != 0 ? d != 1 ? d != 2 ? d != 3 ? d != 4 ? a.h(d, "Unknown value: ") : "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL" : "INFO_SUPPORTED_HARDWARE_LEVEL_3" : "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY" : "INFO_SUPPORTED_HARDWARE_LEVEL_FULL" : "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED"));
            this.g.h.b(this.C.b);
            this.y = aqf.b(this.L);
            this.j = a();
            this.v = new amr(this.c, this.d, handler, this.u, ahvVar.j, ara.a);
            bfx bfxVar = ahvVar.j;
            this.E = bfxVar.d(LegacyCameraOutputConfigNullPointerQuirk.class) || bfxVar.d(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class);
            this.F = ahvVar.j.d(LegacyCameraSurfaceCleanupQuirk.class);
            ahi ahiVar = new ahi(this, str);
            this.o = ahiVar;
            bdd bddVar2 = this.q;
            Executor executor2 = this.c;
            synchronized (bddVar2.a) {
                ksw.d(!bddVar2.c.containsKey(this), a.n(this, "Camera is already registered: "));
                bddVar2.c.put(this, new bdc(executor2, ahiVar));
            }
            this.b.a.d(this.c, ahiVar);
            this.M = new amp(context, str, apuVar, new ahd());
        } catch (aog e2) {
            e = e2;
        }
    }

    private final Collection Q(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            axv axvVar = (axv) it.next();
            arrayList.add(new afo(l(axvVar), axvVar.getClass(), this.G ? axvVar.p : axvVar.q, axvVar.k, axvVar.D(), axvVar.l, m(axvVar)));
        }
        return arrayList;
    }

    private final void R(boolean z) {
        if (!z) {
            this.f.a();
        }
        this.f.c();
        this.z.a();
        q("Opening camera.");
        K(9);
        try {
            apu apuVar = this.b;
            String str = this.g.a;
            Executor executor = this.c;
            ArrayList arrayList = new ArrayList(this.a.b().a().c);
            arrayList.add(this.u.f);
            arrayList.add(this.f);
            apuVar.b(str, executor, akf.a(arrayList));
        } catch (aog e) {
            q("Unable to open camera due to ".concat(String.valueOf(e.getMessage())));
            if (e.b == 10001) {
                L(3, new asu(7, e));
                return;
            }
            ahn ahnVar = this.z;
            if (ahnVar.b.A != 9) {
                ahnVar.b.q("Don't need the onError timeout handler.");
                return;
            }
            ahnVar.b.q("Camera waiting for onError.");
            ahnVar.a();
            ahnVar.a = new ahm(ahnVar);
        } catch (SecurityException e2) {
            q("Unable to open camera due to ".concat(String.valueOf(e2.getMessage())));
            K(8);
            this.f.b();
        } catch (RuntimeException e3) {
            r("Unexpected error occurred when opening camera.", e3);
            L(5, new asu(6, null));
        }
    }

    private final void S() {
        if (this.t != null) {
            bhd bhdVar = this.a;
            String str = "MeteringRepeating" + this.t.hashCode();
            if (bhdVar.a.containsKey(str)) {
                bhc bhcVar = (bhc) bhdVar.a.get(str);
                bhcVar.e = false;
                if (!bhcVar.f) {
                    bhdVar.a.remove(str);
                }
            }
            this.a.h("MeteringRepeating" + this.t.hashCode());
            ame ameVar = this.t;
            avw.a("MeteringRepeating", "MeteringRepeating clear!");
            bdy bdyVar = ameVar.a;
            if (bdyVar != null) {
                bdyVar.d();
            }
            ameVar.a = null;
            this.t = null;
        }
    }

    private final boolean T() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.w) {
            int i = ((asb) this.p).e;
        }
        bhd bhdVar = this.a;
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : bhdVar.a.entrySet()) {
            if (((bhc) entry.getValue()).e) {
                arrayList2.add((bhc) entry.getValue());
            }
        }
        for (bhc bhcVar : DesugarCollections.unmodifiableCollection(arrayList2)) {
            List list = bhcVar.d;
            if (list == null || list.get(0) != bhj.METERING_REPEATING) {
                if (bhcVar.c == null || bhcVar.d == null) {
                    Objects.toString(bhcVar);
                    avw.f("Camera2CameraImpl", "Invalid stream spec or capture types in ".concat(String.valueOf(bhcVar)));
                    return false;
                }
                bgk bgkVar = bhcVar.a;
                bhh bhhVar = bhcVar.b;
                for (bdy bdyVar : bgkVar.f()) {
                    arrayList.add(new bbd(this.M.e(bhhVar.a(), bdyVar.l), bhhVar.a(), bdyVar.l, bhcVar.c.d(), bhcVar.d, bhcVar.c.e(), bhhVar.e(null)));
                }
            }
        }
        ksw.h(this.t);
        HashMap hashMap = new HashMap();
        ame ameVar = this.t;
        hashMap.put(ameVar.c, Collections.singletonList(ameVar.d));
        try {
            this.M.d(arrayList, hashMap, false, false);
            q("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException e) {
            r("Surface combination with metering repeating  not supported!", e);
            return false;
        }
    }

    static String j(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    static String k(ame ameVar) {
        return "MeteringRepeating" + ameVar.hashCode();
    }

    static String l(axv axvVar) {
        return axvVar.I() + axvVar.hashCode();
    }

    static List m(axv axvVar) {
        if (axvVar.F() == null) {
            return null;
        }
        return bpg.b(axvVar);
    }

    @Override // defpackage.bct
    public final void A(final boolean z) {
        this.c.execute(new Runnable() { // from class: agr
            @Override // java.lang.Runnable
            public final void run() {
                ahu ahuVar = ahu.this;
                boolean z2 = z;
                ahuVar.x = z2;
                if (z2) {
                    if (ahuVar.A == 4 || ahuVar.A == 5) {
                        ahuVar.C(false);
                    }
                }
            }
        });
    }

    @Override // defpackage.bct
    public final void B(bcf bcfVar) {
        if (bcfVar == null) {
            bcfVar = bci.a;
        }
        bgl b = bcfVar.b();
        this.I = bcfVar;
        synchronized (this.w) {
            this.J = b;
        }
    }

    final void C(boolean z) {
        q("Attempting to force open the camera.");
        if (this.q.e(this)) {
            R(z);
        } else {
            q("No cameras available. Waiting for available camera before opening camera.");
            K(4);
        }
    }

    public final void D(boolean z) {
        q("Attempting to open the camera.");
        if (this.o.a && this.q.e(this)) {
            R(z);
        } else {
            q("No cameras available. Waiting for available camera before opening camera.");
            K(4);
        }
    }

    final void E() {
        bgj a = this.a.a();
        if (!a.c()) {
            this.e.F(1);
            this.j.j(this.e.h());
            return;
        }
        this.e.F(a.a().b());
        a.b(this.e.h());
        this.j.j(a.a());
    }

    public final void F() {
        Long b;
        if (alz.a(this.g.b)) {
            bgj a = this.a.a();
            if (a.c()) {
                bgk a2 = a.a();
                if (((Integer) a2.g.d().getUpper()).intValue() > 30) {
                    this.e.C(true);
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    for (bgh bghVar : a2.a) {
                        DynamicRangeProfiles a3 = this.y.a();
                        if (a3 != null && (b = aqd.b(bghVar.b(), a3)) != null && b.longValue() != 1) {
                            this.e.C(true);
                            return;
                        }
                    }
                    this.e.C(false);
                }
            }
        }
    }

    public final void G() {
        Iterator it = this.a.d().iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= ((bhh) it.next()).z();
        }
        this.e.G(z);
    }

    @Override // defpackage.bct
    public final /* synthetic */ boolean H() {
        return true;
    }

    @Override // defpackage.bct
    public final /* synthetic */ boolean I() {
        return bcr.b(this);
    }

    final boolean J() {
        return this.n.isEmpty();
    }

    final void K(int i) {
        L(i, null);
    }

    final void L(int i, atm atmVar) {
        M(i, atmVar, true);
    }

    final void M(int i, atm atmVar, boolean z) {
        bcs bcsVar;
        bcs bcsVar2;
        HashMap hashMap;
        ast astVar;
        q("Transitioning camera internal state: " + ((Object) aho.a(this.A)) + " --> " + ((Object) aho.a(i)));
        int i2 = i + (-1);
        if (ozg.c()) {
            ozg.b(a.i(this, "CX:C2State[", "]"), i2);
            if (atmVar != null) {
                this.D++;
            }
            if (this.D > 0) {
                ozg.b(a.i(this, "CX:C2StateErrorCode[", "]"), atmVar != null ? ((asu) atmVar).a : 0);
            }
        }
        this.A = i;
        switch (i2) {
            case 0:
                bcsVar = bcs.RELEASED;
                break;
            case 1:
                bcsVar = bcs.RELEASING;
                break;
            case 2:
                bcsVar = bcs.CLOSED;
                break;
            case 3:
                bcsVar = bcs.PENDING_OPEN;
                break;
            case 4:
            case 5:
            case 6:
                bcsVar = bcs.CLOSING;
                break;
            case 7:
            case 8:
                bcsVar = bcs.OPENING;
                break;
            default:
                bcsVar = bcs.OPEN;
                break;
        }
        bdd bddVar = this.q;
        synchronized (bddVar.a) {
            int i3 = bddVar.d;
            if (bcsVar == bcs.RELEASED) {
                bdc bdcVar = (bdc) bddVar.c.remove(this);
                if (bdcVar != null) {
                    bddVar.b();
                    bcsVar2 = bdcVar.a;
                } else {
                    bcsVar2 = null;
                }
            } else {
                bdc bdcVar2 = (bdc) bddVar.c.get(this);
                ksw.i(bdcVar2, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                bcs a = bdcVar2.a(bcsVar);
                bcs bcsVar3 = bcs.OPENING;
                if (bcsVar == bcsVar3) {
                    ksw.d(bdd.d(bcsVar) || a == bcsVar3, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
                }
                if (a != bcsVar) {
                    bdd.c(this, bcsVar);
                    bddVar.b();
                }
                bcsVar2 = a;
            }
            if (bcsVar2 != bcsVar) {
                ayb aybVar = bddVar.b;
                if (i3 <= 0 && bddVar.d > 0) {
                    hashMap = new HashMap();
                    for (Map.Entry entry : bddVar.c.entrySet()) {
                        if (((bdc) entry.getValue()).a == bcs.PENDING_OPEN) {
                            hashMap.put((ata) entry.getKey(), (bdc) entry.getValue());
                        }
                    }
                } else if (bcsVar != bcs.PENDING_OPEN || bddVar.d <= 0) {
                    hashMap = null;
                } else {
                    hashMap = new HashMap();
                    hashMap.put(this, (bdc) bddVar.c.get(this));
                }
                if (hashMap != null && !z) {
                    hashMap.remove(this);
                }
                if (hashMap != null) {
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        ((bdc) it.next()).b();
                    }
                }
            }
        }
        this.B.a(bcsVar);
        akh akhVar = this.C;
        switch (bcsVar.ordinal()) {
            case 0:
            case 2:
                astVar = new ast(5, atmVar);
                break;
            case 1:
            case 4:
                astVar = new ast(4, atmVar);
                break;
            case 3:
                bdd bddVar2 = akhVar.a;
                synchronized (bddVar2.a) {
                    Iterator it2 = bddVar2.c.entrySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            astVar = new ast(1, null);
                        } else if (((bdc) ((Map.Entry) it2.next()).getValue()).a == bcs.CLOSING) {
                            astVar = new ast(2, null);
                        }
                    }
                }
                break;
            case 5:
                astVar = new ast(2, atmVar);
                break;
            case 6:
            case 7:
                astVar = new ast(3, atmVar);
                break;
            default:
                Objects.toString(bcsVar);
                throw new IllegalStateException("Unknown internal camera state: ".concat(String.valueOf(bcsVar)));
        }
        avw.a("CameraStateMachine", "New public camera state " + astVar + " from " + bcsVar + " and " + atmVar);
        if (j$.util.Objects.equals((atn) akhVar.b.a(), astVar)) {
            return;
        }
        astVar.toString();
        avw.a("CameraStateMachine", "Publishing new public camera state ".concat(astVar.toString()));
        akhVar.b.j(astVar);
    }

    final void N() {
        boolean z = true;
        if (this.A != 6 && this.A != 2 && (this.A != 8 || this.i == 0)) {
            z = false;
        }
        ksw.d(z, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + ((Object) aho.a(this.A)) + " (error: " + j(this.i) + ")");
        O();
        this.j.e();
    }

    final void O() {
        ksw.c(this.j != null);
        q("Resetting Capture Session");
        aku akuVar = this.j;
        bgk a = akuVar.a();
        List d = akuVar.d();
        aku a2 = a();
        this.j = a2;
        a2.j(a);
        this.j.h(d);
        int i = this.A;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 9) {
            q("Skipping Capture Session state check due to current camera state: " + ((Object) aho.a(this.A)) + " and previous session status: " + akuVar.l());
        } else if (this.E && akuVar.l()) {
            q("Close camera before creating new session");
            K(7);
        }
        if (this.F && akuVar.l()) {
            q("ConfigAndClose is required when close the camera.");
            this.r = true;
        }
        akuVar.f();
        ListenableFuture p = akuVar.p();
        int i3 = this.A;
        String a3 = aho.a(i3);
        if (i3 == 0) {
            throw null;
        }
        q("Releasing session in state ".concat(a3));
        this.n.put(akuVar, p);
        bkj.i(p, new ahg(this, akuVar), bjb.a());
    }

    @Override // defpackage.bct
    public final void P() {
        this.G = true;
    }

    public final aku a() {
        synchronized (this.w) {
            if (this.J == null) {
                return new akt(this.y, this.g.j, false);
            }
            return new amm(this.J, this.y, this.c, this.d);
        }
    }

    @Override // defpackage.ata
    public final /* synthetic */ atc b() {
        throw null;
    }

    @Override // defpackage.bct, defpackage.ata
    public final /* synthetic */ ati c() {
        return bcr.a(this);
    }

    @Override // defpackage.bct
    public final bcf d() {
        return this.I;
    }

    @Override // defpackage.bct
    public final bcm e() {
        return this.e;
    }

    @Override // defpackage.bct
    public final bcq f() {
        return this.g;
    }

    @Override // defpackage.bct
    public final bfl g() {
        return this.B;
    }

    @Override // defpackage.bct
    public final ListenableFuture h() {
        return kfg.a(new kfd() { // from class: agl
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                final ahu ahuVar = ahu.this;
                ahuVar.c.execute(new Runnable() { // from class: ags
                    @Override // java.lang.Runnable
                    public final void run() {
                        final ahu ahuVar2 = ahu.this;
                        if (ahuVar2.l == null) {
                            if (ahuVar2.A != 1) {
                                ahuVar2.l = kfg.a(new kfd() { // from class: ago
                                    @Override // defpackage.kfd
                                    public final Object a(kfb kfbVar2) {
                                        ahu ahuVar3 = ahu.this;
                                        ksw.d(ahuVar3.m == null, "Camera can only be released once, so release completer should be null on creation.");
                                        ahuVar3.m = kfbVar2;
                                        return "Release[camera=" + ahuVar3 + "]";
                                    }
                                });
                            } else {
                                ahuVar2.l = bkj.b(null);
                            }
                        }
                        ListenableFuture listenableFuture = ahuVar2.l;
                        int i = ahuVar2.A;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        switch (i2) {
                            case 1:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                if (!ahuVar2.f.c() && !ahuVar2.z.b()) {
                                    r3 = false;
                                }
                                ahuVar2.z.a();
                                ahuVar2.K(2);
                                if (r3) {
                                    ksw.c(ahuVar2.J());
                                    ahuVar2.p();
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                            case 4:
                                ksw.c(ahuVar2.h == null);
                                ahuVar2.K(2);
                                ksw.c(ahuVar2.J());
                                ahuVar2.p();
                                break;
                            case 9:
                                ahuVar2.K(2);
                                ahuVar2.N();
                                break;
                            default:
                                int i3 = ahuVar2.A;
                                Objects.toString(aho.a(i3));
                                ahuVar2.q("release() ignored due to being in state: ".concat(aho.a(i3)));
                                break;
                        }
                        bkj.j(listenableFuture, kfbVar);
                    }
                });
                return "Release[request=" + ahuVar.k.getAndIncrement() + "]";
            }
        });
    }

    final /* synthetic */ Object i(final kfb kfbVar) {
        try {
            this.c.execute(new Runnable() { // from class: agv
                @Override // java.lang.Runnable
                public final void run() {
                    kfb kfbVar2 = kfbVar;
                    ahu ahuVar = ahu.this;
                    ame ameVar = ahuVar.t;
                    if (ameVar == null) {
                        kfbVar2.b(false);
                    } else {
                        kfbVar2.b(Boolean.valueOf(ahuVar.a.j(ahu.k(ameVar))));
                    }
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            kfbVar.c(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    public final void n() {
        bgk a = this.a.b().a();
        bdk bdkVar = a.g;
        int size = bdkVar.e().size();
        int size2 = a.f().size();
        if (a.f().isEmpty()) {
            return;
        }
        if (!bdkVar.e().isEmpty()) {
            if (size2 == 1) {
                if (size == 1) {
                    S();
                    return;
                }
                size2 = 1;
            }
            if (size >= 2) {
                S();
                return;
            } else if (this.t == null || T()) {
                avw.a("Camera2CameraImpl", a.r(size, size2, "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: ", ", CaptureConfig Surfaces: "));
                return;
            } else {
                S();
                return;
            }
        }
        if (this.t == null) {
            this.t = new ame(this.g.b, this.K, new agn(this));
        }
        if (!T()) {
            avw.c("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
            return;
        }
        ame ameVar = this.t;
        if (ameVar != null) {
            bhd bhdVar = this.a;
            String k = k(ameVar);
            ame ameVar2 = this.t;
            bhdVar.g(k, ameVar2.b, ameVar2.c, null, Collections.singletonList(bhj.METERING_REPEATING));
            bhd bhdVar2 = this.a;
            ame ameVar3 = this.t;
            bhdVar2.f(k, ameVar3.b, ameVar3.c, null, Collections.singletonList(bhj.METERING_REPEATING));
        }
    }

    @Override // defpackage.bct
    public final void o(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.e.x();
        for (axv axvVar : new ArrayList(arrayList)) {
            String l = l(axvVar);
            if (!this.H.contains(l)) {
                this.H.add(l);
                axvVar.N();
                axvVar.ah();
            }
        }
        final ArrayList arrayList2 = new ArrayList(Q(arrayList));
        try {
            this.c.execute(new Runnable() { // from class: agy
                @Override // java.lang.Runnable
                public final void run() {
                    Size a;
                    ahu ahuVar = ahu.this;
                    List<aht> list = arrayList2;
                    try {
                        boolean isEmpty = ahuVar.a.c().isEmpty();
                        ArrayList arrayList3 = new ArrayList();
                        Rational rational = null;
                        for (aht ahtVar : list) {
                            if (!ahuVar.a.j(ahtVar.f())) {
                                ahuVar.a.g(ahtVar.f(), ahtVar.b(), ahtVar.d(), ahtVar.c(), ahtVar.g());
                                arrayList3.add(ahtVar.f());
                                if (ahtVar.e() == awl.class && (a = ahtVar.a()) != null) {
                                    rational = new Rational(a.getWidth(), a.getHeight());
                                }
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            ahuVar.q("Use cases [" + TextUtils.join(", ", arrayList3) + "] now ATTACHED");
                            boolean z = true;
                            if (isEmpty) {
                                ahuVar.e.A(true);
                                ahuVar.e.x();
                            }
                            ahuVar.n();
                            ahuVar.G();
                            ahuVar.F();
                            ahuVar.E();
                            ahuVar.O();
                            if (ahuVar.A == 10) {
                                ahuVar.y();
                            } else {
                                int i = ahuVar.A;
                                int i2 = i - 1;
                                if (i == 0) {
                                    throw null;
                                }
                                if (i2 == 2 || i2 == 3 || i2 == 4) {
                                    ahuVar.C(false);
                                } else if (i2 != 5) {
                                    int i3 = ahuVar.A;
                                    Objects.toString(aho.a(i3));
                                    ahuVar.q("open() ignored due to being in state: ".concat(aho.a(i3)));
                                } else {
                                    ahuVar.K(8);
                                    if (!ahuVar.J() && !ahuVar.s && ahuVar.i == 0) {
                                        if (ahuVar.h == null) {
                                            z = false;
                                        }
                                        ksw.d(z, "Camera Device should be open if session close is not complete");
                                        ahuVar.K(10);
                                        ahuVar.y();
                                    }
                                }
                            }
                            if (rational != null) {
                                ahuVar.e.D(rational);
                            }
                        }
                    } finally {
                        ahuVar.e.u();
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            r("Unable to attach use cases.", e);
            this.e.u();
        }
    }

    public final void p() {
        ksw.c(this.A == 2 || this.A == 6);
        ksw.c(this.n.isEmpty());
        if (!this.r) {
            t();
            return;
        }
        if (this.s) {
            q("Ignored since configAndClose is processing");
            return;
        }
        if (!this.o.a) {
            this.r = false;
            t();
            q("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            q("Open camera to configAndClose");
            ListenableFuture a = kfg.a(new kfd() { // from class: agw
                @Override // defpackage.kfd
                public final Object a(kfb kfbVar) {
                    ahu ahuVar = ahu.this;
                    try {
                        ArrayList arrayList = new ArrayList(ahuVar.a.b().a().c);
                        arrayList.add(ahuVar.u.f);
                        arrayList.add(new ahf(ahuVar, kfbVar));
                        ahuVar.b.b(ahuVar.g.a, ahuVar.c, akf.a(arrayList));
                        return "configAndCloseTask";
                    } catch (aog | RuntimeException e) {
                        ahuVar.r("Unable to open camera for configAndClose: ".concat(String.valueOf(e.getMessage())), e);
                        kfbVar.c(e);
                        return "configAndCloseTask";
                    }
                }
            });
            this.s = true;
            a.b(new Runnable() { // from class: agx
                @Override // java.lang.Runnable
                public final void run() {
                    ahu ahuVar = ahu.this;
                    ahuVar.s = false;
                    ahuVar.r = false;
                    int i = ahuVar.A;
                    Objects.toString(aho.a(i));
                    ahuVar.q("OpenCameraConfigAndClose is done, state: ".concat(aho.a(i)));
                    int i2 = ahuVar.A;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i3 == 1 || i3 == 5) {
                        ksw.c(ahuVar.J());
                        ahuVar.t();
                        return;
                    }
                    if (i3 != 7) {
                        int i4 = ahuVar.A;
                        Objects.toString(aho.a(i4));
                        ahuVar.q("OpenCameraConfigAndClose finished while in state: ".concat(aho.a(i4)));
                    } else {
                        int i5 = ahuVar.i;
                        if (i5 == 0) {
                            ahuVar.D(false);
                        } else {
                            ahuVar.q("OpenCameraConfigAndClose in error: ".concat(ahu.j(i5)));
                            ahuVar.f.b();
                        }
                    }
                }
            }, this.c);
        }
    }

    final void q(String str) {
        r(str, null);
    }

    public final void r(String str, Throwable th) {
        avw.b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th);
    }

    @Override // defpackage.bct
    public final void s(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(Q(arrayList));
        for (axv axvVar : new ArrayList(arrayList)) {
            String l = l(axvVar);
            if (this.H.contains(l)) {
                axvVar.q();
                this.H.remove(l);
            }
        }
        this.c.execute(new Runnable() { // from class: agp
            @Override // java.lang.Runnable
            public final void run() {
                ahu ahuVar;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                boolean z = false;
                while (true) {
                    ahuVar = ahu.this;
                    if (!it.hasNext()) {
                        break;
                    }
                    aht ahtVar = (aht) it.next();
                    if (ahuVar.a.j(ahtVar.f())) {
                        ahuVar.a.a.remove(ahtVar.f());
                        arrayList3.add(ahtVar.f());
                        if (ahtVar.e() == awl.class) {
                            z = true;
                        }
                    }
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                ahuVar.q("Use cases [" + TextUtils.join(", ", arrayList3) + "] now DETACHED for camera");
                if (z) {
                    ahuVar.e.D(null);
                }
                ahuVar.n();
                if (ahuVar.a.d().isEmpty()) {
                    ahuVar.e.G(false);
                    ahuVar.e.C(false);
                } else {
                    ahuVar.G();
                    ahuVar.F();
                }
                if (!ahuVar.a.c().isEmpty()) {
                    ahuVar.E();
                    ahuVar.O();
                    if (ahuVar.A == 10) {
                        ahuVar.y();
                        return;
                    }
                    return;
                }
                ahuVar.e.u();
                ahuVar.O();
                ahuVar.e.A(false);
                ahuVar.j = ahuVar.a();
                ahuVar.q("Closing camera.");
                int i = ahuVar.A;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                switch (i2) {
                    case 3:
                    case 4:
                        ksw.c(ahuVar.h == null);
                        ahuVar.K(3);
                        return;
                    case 5:
                    default:
                        int i3 = ahuVar.A;
                        Objects.toString(aho.a(i3));
                        ahuVar.q("close() ignored due to being in state: ".concat(aho.a(i3)));
                        return;
                    case 6:
                    case 7:
                    case 8:
                        boolean z2 = ahuVar.f.c() || ahuVar.z.b();
                        ahuVar.z.a();
                        ahuVar.K(6);
                        if (z2) {
                            ksw.c(ahuVar.J());
                            ahuVar.p();
                            return;
                        }
                        return;
                    case 9:
                        ahuVar.K(6);
                        ahuVar.N();
                        return;
                }
            }
        });
    }

    final void t() {
        ksw.c(this.A == 2 || this.A == 6);
        ksw.c(this.n.isEmpty());
        this.h = null;
        if (this.A == 6) {
            K(3);
            return;
        }
        this.b.a.e(this.o);
        K(1);
        kfb kfbVar = this.m;
        if (kfbVar != null) {
            kfbVar.b(null);
            this.m = null;
        }
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.g.a);
    }

    @Override // defpackage.axu
    public final void u(axv axvVar) {
        final String l = l(axvVar);
        final bgk bgkVar = this.G ? axvVar.p : axvVar.q;
        final bhh bhhVar = axvVar.k;
        final bgr bgrVar = axvVar.l;
        final List m = m(axvVar);
        this.c.execute(new Runnable() { // from class: ahc
            @Override // java.lang.Runnable
            public final void run() {
                ahu ahuVar = ahu.this;
                String str = l;
                ahuVar.q(a.a(str, "Use case ", " ACTIVE"));
                bgk bgkVar2 = bgkVar;
                bhh bhhVar2 = bhhVar;
                bgr bgrVar2 = bgrVar;
                List list = m;
                ahuVar.a.f(str, bgkVar2, bhhVar2, bgrVar2, list);
                ahuVar.a.i(str, bgkVar2, bhhVar2, bgrVar2, list);
                ahuVar.E();
            }
        });
    }

    @Override // defpackage.axu
    public final void v(axv axvVar) {
        final String l = l(axvVar);
        this.c.execute(new Runnable() { // from class: ahb
            @Override // java.lang.Runnable
            public final void run() {
                ahu ahuVar = ahu.this;
                String str = l;
                ahuVar.q(a.a(str, "Use case ", " INACTIVE"));
                ahuVar.a.h(str);
                ahuVar.E();
            }
        });
    }

    @Override // defpackage.axu
    public final void w(axv axvVar) {
        bgk bgkVar = this.G ? axvVar.p : axvVar.q;
        z(l(axvVar), bgkVar, axvVar.k, axvVar.l, m(axvVar));
    }

    @Override // defpackage.axu
    public final void x(axv axvVar) {
        ksw.h(axvVar);
        final String l = l(axvVar);
        final bgk bgkVar = this.G ? axvVar.p : axvVar.q;
        final bhh bhhVar = axvVar.k;
        final bgr bgrVar = axvVar.l;
        final List m = m(axvVar);
        this.c.execute(new Runnable() { // from class: aha
            @Override // java.lang.Runnable
            public final void run() {
                ahu ahuVar = ahu.this;
                String str = l;
                ahuVar.q(a.a(str, "Use case ", " UPDATED"));
                ahuVar.a.i(str, bgkVar, bhhVar, bgrVar, m);
                ahuVar.E();
            }
        });
    }

    final void y() {
        ksw.c(this.A == 10);
        bgj b = this.a.b();
        if (!b.c()) {
            q("Unable to create capture session due to conflicting configurations");
            return;
        }
        bdd bddVar = this.q;
        this.h.getId();
        this.p.a(this.h.getId());
        bddVar.f();
        HashMap hashMap = new HashMap();
        bhd bhdVar = this.a;
        Collection<bgk> c = bhdVar.c();
        Collection d = bhdVar.d();
        bdn bdnVar = amn.a;
        ArrayList arrayList = new ArrayList(d);
        Iterator it = c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            bgk bgkVar = (bgk) it.next();
            if (bgkVar.c().s(amn.a) && bgkVar.f().size() != 1) {
                avw.c("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(bgkVar.f().size())));
                break;
            }
            if (bgkVar.c().s(amn.a)) {
                int i = 0;
                for (bgk bgkVar2 : c) {
                    if (((bhh) arrayList.get(i)).k() == bhj.METERING_REPEATING) {
                        ksw.d(!bgkVar2.f().isEmpty(), "MeteringRepeating should contain a surface");
                        hashMap.put((bdy) bgkVar2.f().get(0), 1L);
                    } else if (bgkVar2.c().s(amn.a) && !bgkVar2.f().isEmpty()) {
                        hashMap.put((bdy) bgkVar2.f().get(0), (Long) bgkVar2.c().l(amn.a));
                    }
                    i++;
                }
            }
        }
        this.j.k(hashMap);
        aku akuVar = this.j;
        bgk a = b.a();
        CameraDevice cameraDevice = this.h;
        ksw.h(cameraDevice);
        bkj.i(akuVar.b(a, cameraDevice, this.v.a()), new ahh(this, akuVar), this.c);
    }

    public final void z(final String str, final bgk bgkVar, final bhh bhhVar, final bgr bgrVar, final List list) {
        this.c.execute(new Runnable() { // from class: agq
            @Override // java.lang.Runnable
            public final void run() {
                ahu ahuVar = ahu.this;
                String str2 = str;
                ahuVar.q(a.a(str2, "Use case ", " RESET"));
                ahuVar.a.i(str2, bgkVar, bhhVar, bgrVar, list);
                ahuVar.n();
                ahuVar.O();
                ahuVar.E();
                if (ahuVar.A == 10) {
                    ahuVar.y();
                }
            }
        });
    }
}
