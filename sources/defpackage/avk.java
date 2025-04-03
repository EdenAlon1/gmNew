package defpackage;

import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avk extends axv {
    public static final /* synthetic */ int i = 0;
    public final int a;
    public final AtomicReference b;
    public final int c;
    public int d;
    public Rational e;
    public ble f;
    bgc g;
    public bam h;
    private azl s;
    private bgd t;
    private final avb u;

    static {
        beo beoVar = avd.a;
    }

    public avk(beo beoVar) {
        super(beoVar);
        this.b = new AtomicReference(null);
        this.d = -1;
        this.e = null;
        this.u = new avb(this);
        beo beoVar2 = (beo) this.k;
        if (bfy.g(beoVar2, beo.a)) {
            this.a = beoVar2.C();
        } else {
            this.a = 1;
        }
        this.c = ((Integer) bfy.c(beoVar2, beo.h, 0)).intValue();
        this.f = new ble((avi) bfy.c(beoVar2, beo.j, null));
    }

    private final void X() {
        ble bleVar = this.f;
        bleVar.d();
        bleVar.c();
        bam bamVar = this.h;
        if (bamVar != null) {
            bamVar.a();
        }
    }

    private final void Y() {
        Z(this.f);
    }

    private final void Z(avi aviVar) {
        E().E(aviVar);
    }

    private static boolean aa(List list, int i2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i2))) {
                return true;
            }
        }
        return false;
    }

    private final boolean ab() {
        return (F() == null || F().d().b() == null) ? false : true;
    }

    private static final boolean ac(Map map, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        return map.containsKey(valueOf) && !((List) map.get(valueOf)).isEmpty();
    }

    public static boolean u(bfh bfhVar) {
        return Objects.equals(bfhVar.m(beo.e, null), 2);
    }

    public static boolean v(bfh bfhVar) {
        return Objects.equals(bfhVar.m(beo.e, null), 3);
    }

    public static boolean w(bfh bfhVar) {
        return Objects.equals(bfhVar.m(beo.e, null), 1);
    }

    public final int a() {
        bct F = F();
        if (F != null) {
            return F.c().a();
        }
        return -1;
    }

    @Override // defpackage.axv
    public final Set af() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // defpackage.axv
    public final void ag() {
        ksw.i(F(), "Attached camera cannot be null");
        if (b() == 3 && a() != 0) {
            throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // defpackage.axv
    public final void ah() {
        avw.a("ImageCapture", "onCameraControlReady");
        t();
        Y();
    }

    public final int b() {
        int i2;
        synchronized (this.b) {
            i2 = this.d;
            if (i2 == -1) {
                i2 = ((Integer) bfy.c((beo) this.k, beo.b, 2)).intValue();
            }
        }
        return i2;
    }

    public final int c() {
        Integer num = (Integer) this.k.m(beo.e, 0);
        ksw.h(num);
        return num.intValue();
    }

    @Override // defpackage.axv
    public final bgr d(bdp bdpVar) {
        this.g.h(bdpVar);
        Q(aux.a(new Object[]{this.g.b()}));
        bgq f = this.l.f();
        ((bbp) f).b = bdpVar;
        return f.a();
    }

    @Override // defpackage.axv
    public final bhg e(bdp bdpVar) {
        return avc.a(bdpVar);
    }

    @Override // defpackage.axv
    public final bhh f(boolean z, bhl bhlVar) {
        bdp a = bhlVar.a(bhe.f(avd.a), this.a);
        if (z) {
            a = bdm.a(a, avd.a);
        }
        if (a == null) {
            return null;
        }
        return avc.a(a).c();
    }

    @Override // defpackage.axv
    protected final bhh g(bcq bcqVar, bhg bhgVar) {
        boolean z;
        boolean z2 = true;
        if (bcqVar.g().d(SoftwareJpegEncodingPreferredQuirk.class)) {
            if (Boolean.FALSE.equals(bhgVar.f().m(beo.g, true))) {
                avw.f("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                avw.e("ImageCapture", "Requesting software JPEG due to device quirk.");
                bhgVar.f().c(beo.g, true);
            }
        }
        bfh f = bhgVar.f();
        if (Boolean.TRUE.equals(f.m(beo.g, false))) {
            if (ab()) {
                avw.f("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z = false;
            } else {
                z = true;
            }
            Integer num = (Integer) f.m(beo.d, null);
            if (num != null && num.intValue() != 256) {
                avw.f("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
                z = false;
            }
            if (!z) {
                avw.f("ImageCapture", "Unable to support software JPEG. Disabling.");
                f.c(beo.g, false);
            }
        } else {
            z = false;
        }
        Integer num2 = (Integer) bhgVar.f().m(beo.d, null);
        if (num2 != null) {
            if (ab() && num2.intValue() != 256) {
                z2 = false;
            }
            ksw.b(z2, "Cannot set non-JPEG buffer format with Extensions enabled.");
            bhgVar.f().c(beq.C, Integer.valueOf(z ? 35 : num2.intValue()));
        } else if (u(bhgVar.f())) {
            bhgVar.f().c(beq.C, 32);
        } else if (v(bhgVar.f())) {
            bhgVar.f().c(beq.C, 32);
            bhgVar.f().c(beq.D, 256);
        } else if (w(bhgVar.f())) {
            bhgVar.f().c(beq.C, 4101);
            bhgVar.f().c(beq.o, aua.a);
        } else if (z) {
            bhgVar.f().c(beq.C, 35);
        } else {
            List list = (List) bhgVar.f().m(beo.L, null);
            if (list == null) {
                bhgVar.f().c(beq.C, 256);
            } else if (aa(list, 256)) {
                bhgVar.f().c(beq.C, 256);
            } else if (aa(list, 35)) {
                bhgVar.f().c(beq.C, 35);
            }
        }
        return bhgVar.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v20, types: [auf, bam] */
    /* JADX WARN: Type inference failed for: r0v6, types: [ati, bcq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bgc h(java.lang.String r14, defpackage.beo r15, defpackage.bgr r16) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avk.h(java.lang.String, beo, bgr):bgc");
    }

    @Override // defpackage.axv
    public final void j() {
        X();
        m(false);
        Z(null);
    }

    public final void m(boolean z) {
        bam bamVar;
        Log.d("ImageCapture", "clearPipeline");
        biw.b();
        bgd bgdVar = this.t;
        if (bgdVar != null) {
            bgdVar.b();
            this.t = null;
        }
        azl azlVar = this.s;
        if (azlVar != null) {
            azlVar.a();
            this.s = null;
        }
        if (!z && (bamVar = this.h) != null) {
            bamVar.a();
            this.h = null;
        }
        E().t();
    }

    @Override // defpackage.axv
    protected final void p(bgr bgrVar, bgr bgrVar2) {
        bgc h = h(H(), (beo) this.k, bgrVar);
        this.g = h;
        Q(aux.a(new Object[]{h.b()}));
        K();
    }

    @Override // defpackage.axv
    public final void q() {
        X();
    }

    public final void r(avi aviVar) {
        this.f = new ble(aviVar);
        Y();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(final defpackage.avg r15, final java.util.concurrent.Executor r16, final defpackage.avf r17) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avk.s(avg, java.util.concurrent.Executor, avf):void");
    }

    public final void t() {
        synchronized (this.b) {
            if (this.b.get() != null) {
                return;
            }
            E().B(b());
        }
    }

    public final String toString() {
        return "ImageCapture:".concat(I());
    }
}
