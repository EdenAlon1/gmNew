package defpackage;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amm implements aku {
    public static final List a = new ArrayList();
    private static int l = 0;
    public final bgl b;
    final Executor c;
    public final akt d;
    public bgk f;
    public ajx g;
    public bgk h;
    public int j;
    public int k;
    private final ScheduledExecutorService m;
    public List e = new ArrayList();
    public volatile List i = null;
    private asm n = new asl().b();
    private asm o = new asl().b();

    public amm(bgl bglVar, aqf aqfVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.j = 0;
        this.d = new akt(aqfVar, ara.a(CaptureSessionShouldUseMrirQuirk.class) != null);
        this.b = bglVar;
        this.c = executor;
        this.m = scheduledExecutorService;
        this.k = 1;
        int i = l;
        l = i + 1;
        this.j = i;
        avw.a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.j + ")");
    }

    public static boolean c(bdy bdyVar) {
        return Objects.equals(bdyVar.n, awl.class);
    }

    public static boolean g(bdy bdyVar) {
        return Objects.equals(bdyVar.n, bpg.class);
    }

    private static void i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bdk bdkVar = (bdk) it.next();
            Iterator it2 = bdkVar.h.iterator();
            while (it2.hasNext()) {
                ((bbt) it2.next()).a(bdkVar.a());
            }
        }
    }

    private final void m(asm asmVar, asm asmVar2) {
        afl aflVar = new afl();
        aflVar.b(asmVar);
        aflVar.b(asmVar2);
        aflVar.a();
        this.b.j();
    }

    @Override // defpackage.aku
    public final bgk a() {
        return this.f;
    }

    @Override // defpackage.aku
    public final ListenableFuture b(final bgk bgkVar, final CameraDevice cameraDevice, final amq amqVar) {
        int i = this.k;
        int i2 = this.k;
        java.util.Objects.toString(aml.a(i2));
        ksw.b(i == 1, "Invalid state state:".concat(aml.a(i2)));
        ksw.b(!bgkVar.f().isEmpty(), "SessionConfig contains no surfaces");
        avw.a("ProcessingCaptureSession", agn.c(this, "open (id="));
        List f = bgkVar.f();
        this.e = f;
        return bkj.f(bkj.g(bjv.a(bec.c(f, this.c, this.m)), new bjq() { // from class: amg
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.bjq
            public final ListenableFuture a(Object obj) {
                bbk bbkVar;
                final amm ammVar = amm.this;
                List list = (List) obj;
                avw.a("ProcessingCaptureSession", agn.c(ammVar, "-- getSurfaces done, start init (id="));
                if (ammVar.k == 5) {
                    return new bkk(new IllegalStateException("SessionProcessorCaptureSession is closed."));
                }
                bgk bgkVar2 = bgkVar;
                final bdy bdyVar = null;
                if (list.contains(null)) {
                    return new bkk(new bdw("Surface closed", (bdy) bgkVar2.f().get(list.indexOf(null))));
                }
                bbk bbkVar2 = null;
                bbk bbkVar3 = null;
                bbk bbkVar4 = null;
                for (int i3 = 0; i3 < bgkVar2.f().size(); i3++) {
                    bdy bdyVar2 = (bdy) bgkVar2.f().get(i3);
                    if (amm.c(bdyVar2) || amm.g(bdyVar2)) {
                        bbkVar2 = new bbk((Surface) bdyVar2.b().get(), bdyVar2.l, bdyVar2.m);
                    } else if (Objects.equals(bdyVar2.n, avk.class)) {
                        bbkVar3 = new bbk((Surface) bdyVar2.b().get(), bdyVar2.l, bdyVar2.m);
                    } else if (Objects.equals(bdyVar2.n, auo.class)) {
                        bbkVar4 = new bbk((Surface) bdyVar2.b().get(), bdyVar2.l, bdyVar2.m);
                    }
                }
                bgh bghVar = bgkVar2.b;
                if (bghVar != null) {
                    bdyVar = ((bbn) bghVar).a;
                    bbkVar = new bbk((Surface) bdyVar.b().get(), bdyVar.l, bdyVar.m);
                } else {
                    bbkVar = null;
                }
                ammVar.k = 2;
                try {
                    ArrayList arrayList = new ArrayList(ammVar.e);
                    if (bdyVar != null) {
                        arrayList.add(bdyVar);
                    }
                    bec.b(arrayList);
                    avw.f("ProcessingCaptureSession", agn.c(ammVar, "== initSession (id="));
                    try {
                        bgl bglVar = ammVar.b;
                        new bbl(bbkVar2, bbkVar3, bbkVar4, bbkVar);
                        ammVar.h = bglVar.h();
                        ((bdy) ammVar.h.f().get(0)).c().b(new Runnable() { // from class: ami
                            @Override // java.lang.Runnable
                            public final void run() {
                                bec.a(amm.this.e);
                                bdy bdyVar3 = bdyVar;
                                if (bdyVar3 != null) {
                                    bdyVar3.e();
                                }
                            }
                        }, bjb.a());
                        for (final bdy bdyVar3 : ammVar.h.f()) {
                            amm.a.add(bdyVar3);
                            bdyVar3.c().b(new Runnable() { // from class: amj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    amm.a.remove(bdy.this);
                                }
                            }, ammVar.c);
                        }
                        amq amqVar2 = amqVar;
                        CameraDevice cameraDevice2 = cameraDevice;
                        bgj bgjVar = new bgj();
                        bgjVar.b(bgkVar2);
                        bgjVar.a.clear();
                        bgjVar.b.i();
                        bgjVar.b(ammVar.h);
                        ksw.b(bgjVar.c(), "Cannot transform the SessionConfig");
                        ListenableFuture b = ammVar.d.b(bgjVar.a(), cameraDevice2, amqVar2);
                        bkj.i(b, new amk(ammVar), ammVar.c);
                        return b;
                    } catch (Throwable th) {
                        avw.d("ProcessingCaptureSession", "initSession failed", th);
                        bec.a(ammVar.e);
                        if (bdyVar != null) {
                            bdyVar.e();
                        }
                        throw th;
                    }
                } catch (bdw e) {
                    return new bkk(e);
                }
            }
        }, this.c), new afd() { // from class: amh
            @Override // defpackage.afd
            public final Object a(Object obj) {
                amm ammVar = amm.this;
                if (ammVar.k == 2) {
                    List<bdy> f2 = ammVar.h.f();
                    ArrayList arrayList = new ArrayList();
                    for (bdy bdyVar : f2) {
                        ksw.b(bdyVar instanceof bgm, "Surface must be SessionProcessorSurface");
                        arrayList.add((bgm) bdyVar);
                    }
                    ammVar.g = new ajx(ammVar.d, arrayList);
                    avw.a("ProcessingCaptureSession", agn.c(ammVar, "== onCaptureSessinStarted (id = "));
                    ammVar.b.i();
                    ammVar.k = 3;
                    bgk bgkVar2 = ammVar.f;
                    if (bgkVar2 != null) {
                        ammVar.j(bgkVar2);
                    }
                    if (ammVar.i != null) {
                        ammVar.h(ammVar.i);
                        ammVar.i = null;
                    }
                }
                return null;
            }
        }, this.c);
    }

    @Override // defpackage.aku
    public final List d() {
        return this.i != null ? this.i : Collections.EMPTY_LIST;
    }

    @Override // defpackage.aku
    public final void e() {
        avw.a("ProcessingCaptureSession", agn.c(this, "cancelIssuedCaptureRequests (id="));
        if (this.i != null) {
            for (bdk bdkVar : this.i) {
                Iterator it = bdkVar.h.iterator();
                while (it.hasNext()) {
                    ((bbt) it.next()).a(bdkVar.a());
                }
            }
            this.i = null;
        }
    }

    @Override // defpackage.aku
    public final void f() {
        avw.a("ProcessingCaptureSession", "close (id=" + this.j + ") state=" + ((Object) aml.a(this.k)));
        if (this.k == 3) {
            avw.a("ProcessingCaptureSession", agn.c(this, "== onCaptureSessionEnd (id = "));
            this.b.d();
            ajx ajxVar = this.g;
            if (ajxVar != null) {
                synchronized (ajxVar.a) {
                    ajxVar.b = true;
                    ajxVar.c = null;
                }
            }
            this.k = 4;
        }
        this.d.f();
    }

    @Override // defpackage.aku
    public final void h(List list) {
        if (list.isEmpty()) {
            return;
        }
        avw.a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.j + ") + state =" + ((Object) aml.a(this.k)));
        int i = this.k;
        int i2 = i + (-1);
        if (i == 0) {
            throw null;
        }
        if (i2 == 0 || i2 == 1) {
            if (this.i == null) {
                this.i = list;
                return;
            } else {
                i(list);
                avw.a("ProcessingCaptureSession", "cancel the request because are pending un-submitted request");
                return;
            }
        }
        if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                int i3 = this.k;
                java.util.Objects.toString(aml.a(i3));
                avw.a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = ".concat(aml.a(i3)));
                i(list);
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bdk bdkVar = (bdk) it.next();
            int i4 = bdkVar.f;
            if (i4 == 2 || i4 == 4) {
                asl a2 = asl.a(bdkVar.e);
                if (bdkVar.e.s(bdk.a)) {
                    a2.c(CaptureRequest.JPEG_ORIENTATION, (Integer) bdkVar.e.l(bdk.a));
                }
                if (bdkVar.e.s(bdk.b)) {
                    a2.c(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) bdkVar.e.l(bdk.b)).byteValue()));
                }
                asm b = a2.b();
                this.o = b;
                m(this.n, b);
                bgl bglVar = this.b;
                boolean z = bdkVar.g;
                bgw bgwVar = bdkVar.j;
                bdkVar.a();
                List list2 = bdkVar.h;
                bglVar.k();
            } else {
                avw.a("ProcessingCaptureSession", "issueTriggerRequest");
                Iterator it2 = bfy.f(asl.a(bdkVar.e).b()).iterator();
                while (it2.hasNext()) {
                    CaptureRequest.Key key = (CaptureRequest.Key) ((bdn) it2.next()).b();
                    if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                        bgl bglVar2 = this.b;
                        bgw bgwVar2 = bdkVar.j;
                        bdkVar.a();
                        List list3 = bdkVar.h;
                        bglVar2.m();
                        break;
                    }
                }
                i(Arrays.asList(bdkVar));
            }
        }
    }

    @Override // defpackage.aku
    public final void j(bgk bgkVar) {
        avw.a("ProcessingCaptureSession", agn.c(this, "setSessionConfig (id="));
        this.f = bgkVar;
        if (bgkVar == null) {
            return;
        }
        ajx ajxVar = this.g;
        if (ajxVar != null) {
            synchronized (ajxVar.a) {
                ajxVar.c = bgkVar;
            }
        }
        if (this.k == 3) {
            asl a2 = asl.a(bgkVar.c());
            Integer b = ajs.b(bgkVar.g);
            if (b != null) {
                a2.c(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, b);
            }
            asm b2 = a2.b();
            this.n = b2;
            m(b2, this.o);
            for (bdy bdyVar : bgkVar.g.e()) {
                if (c(bdyVar) || g(bdyVar)) {
                    this.b.l();
                    return;
                }
            }
            this.b.e();
        }
    }

    @Override // defpackage.aku
    public final boolean l() {
        return this.d.l();
    }

    @Override // defpackage.aku
    public final ListenableFuture p() {
        avw.a("ProcessingCaptureSession", "release (id=" + this.j + ") mProcessorState=" + ((Object) aml.a(this.k)));
        ListenableFuture p = this.d.p();
        int i = this.k;
        int i2 = i + (-1);
        if (i == 0) {
            throw null;
        }
        if (i2 == 1 || i2 == 3) {
            p.b(new Runnable() { // from class: amf
                @Override // java.lang.Runnable
                public final void run() {
                    amm ammVar = amm.this;
                    avw.a("ProcessingCaptureSession", agn.c(ammVar, "== deInitSession (id="));
                    ammVar.b.c();
                }
            }, bjb.a());
        }
        this.k = 5;
        return p;
    }

    @Override // defpackage.aku
    public final void k(Map map) {
    }
}
