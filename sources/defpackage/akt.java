package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akt implements aku {
    final Object a;
    public final List b;
    amq c;
    amt d;
    bgk e;
    List f;
    ListenableFuture g;
    kfb h;
    int i;
    int j;
    private final aks k;
    private final Map l;
    private Map m;
    private final arv n;
    private final ary o;
    private final ars p;
    private final aqf q;
    private final arx r;
    private final boolean s;

    public akt(aqf aqfVar, bfx bfxVar, boolean z) {
        this.a = new Object();
        this.b = new ArrayList();
        this.l = new HashMap();
        this.f = Collections.EMPTY_LIST;
        this.i = 1;
        this.j = 1;
        this.m = new HashMap();
        this.n = new arv();
        this.o = new ary();
        m(3);
        this.q = aqfVar;
        this.k = new aks(this);
        this.p = new ars(bfxVar.d(CaptureNoResponseQuirk.class));
        this.r = new arx(bfxVar);
        this.s = z;
    }

    @Override // defpackage.aku
    public final bgk a() {
        bgk bgkVar;
        synchronized (this.a) {
            bgkVar = this.e;
        }
        return bgkVar;
    }

    @Override // defpackage.aku
    public final ListenableFuture b(final bgk bgkVar, final CameraDevice cameraDevice, amq amqVar) {
        ListenableFuture d;
        synchronized (this.a) {
            int i = this.j;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 != 2) {
                avw.c("CaptureSession", agn.b(this, "Open not allowed in state: "));
                return new bkk(new IllegalStateException(agn.b(this, "open() should not allow the state: ")));
            }
            m(4);
            final ArrayList arrayList = new ArrayList(bgkVar.f());
            this.f = arrayList;
            this.c = amqVar;
            synchronized (((ane) amqVar).m) {
                ((ane) amqVar).n = arrayList;
                synchronized (((anb) amqVar).a) {
                    if (((anb) amqVar).l) {
                        d = new bkk(new CancellationException("Opener is disabled"));
                    } else {
                        final anb anbVar = (anb) amqVar;
                        ((anb) amqVar).j = bkj.g(bjv.a(bec.c(arrayList, ((anb) amqVar).d, ((anb) amqVar).e)), new bjq() { // from class: amy
                            @Override // defpackage.bjq
                            public final ListenableFuture a(Object obj) {
                                List list = (List) obj;
                                avw.a("SyncCaptureSessionBase", "[" + anb.this + "] getSurface done with results: " + list);
                                return list.isEmpty() ? new bkk(new IllegalArgumentException("Unable to open capture session without surfaces")) : list.contains(null) ? new bkk(new bdw("Surface closed", (bdy) arrayList.get(list.indexOf(null)))) : bkj.b(list);
                            }
                        }, ((anb) amqVar).d);
                        d = bkj.d(((anb) amqVar).j);
                    }
                }
            }
            ListenableFuture g = bkj.g(bjv.a(d), new bjq() { // from class: akn
                @Override // defpackage.bjq
                public final ListenableFuture a(Object obj) {
                    return akt.this.c((List) obj, bgkVar, cameraDevice);
                }
            }, ((anb) this.c).d);
            bkj.i(g, new akp(this), ((anb) this.c).d);
            return bkj.d(g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x020b A[Catch: all -> 0x03b5, TryCatch #1 {, blocks: (B:4:0x0009, B:13:0x001a, B:14:0x002a, B:17:0x002c, B:18:0x0033, B:20:0x0039, B:22:0x0051, B:24:0x006c, B:25:0x0085, B:27:0x00ae, B:29:0x00b2, B:30:0x00bd, B:32:0x00c3, B:34:0x00cd, B:35:0x00da, B:37:0x00e0, B:39:0x00f7, B:44:0x0103, B:45:0x0114, B:47:0x011a, B:49:0x0138, B:51:0x0161, B:52:0x0184, B:55:0x0191, B:56:0x01a0, B:58:0x01a6, B:60:0x01b0, B:62:0x01b4, B:64:0x01bf, B:66:0x01da, B:67:0x01e6, B:69:0x01ec, B:71:0x0201, B:73:0x020b, B:74:0x0218, B:76:0x021e, B:78:0x023a, B:80:0x0242, B:82:0x024a, B:84:0x0254, B:85:0x0267, B:86:0x026b, B:88:0x027e, B:92:0x01f4, B:94:0x01fc, B:95:0x01de, B:91:0x0294, B:99:0x02a1, B:100:0x02af, B:102:0x02b5, B:105:0x02c5, B:110:0x02d0, B:112:0x02ef, B:114:0x02f3, B:116:0x02fc, B:120:0x0337, B:122:0x033c, B:123:0x0345, B:132:0x0393, B:137:0x0397, B:138:0x0306, B:140:0x0399, B:141:0x039e, B:144:0x0072, B:146:0x0078, B:147:0x007f, B:148:0x03a0, B:149:0x03b0, B:152:0x03b4, B:125:0x0346, B:126:0x0358, B:128:0x035e, B:130:0x036c, B:131:0x0392), top: B:3:0x0009, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0254 A[Catch: all -> 0x03b5, TryCatch #1 {, blocks: (B:4:0x0009, B:13:0x001a, B:14:0x002a, B:17:0x002c, B:18:0x0033, B:20:0x0039, B:22:0x0051, B:24:0x006c, B:25:0x0085, B:27:0x00ae, B:29:0x00b2, B:30:0x00bd, B:32:0x00c3, B:34:0x00cd, B:35:0x00da, B:37:0x00e0, B:39:0x00f7, B:44:0x0103, B:45:0x0114, B:47:0x011a, B:49:0x0138, B:51:0x0161, B:52:0x0184, B:55:0x0191, B:56:0x01a0, B:58:0x01a6, B:60:0x01b0, B:62:0x01b4, B:64:0x01bf, B:66:0x01da, B:67:0x01e6, B:69:0x01ec, B:71:0x0201, B:73:0x020b, B:74:0x0218, B:76:0x021e, B:78:0x023a, B:80:0x0242, B:82:0x024a, B:84:0x0254, B:85:0x0267, B:86:0x026b, B:88:0x027e, B:92:0x01f4, B:94:0x01fc, B:95:0x01de, B:91:0x0294, B:99:0x02a1, B:100:0x02af, B:102:0x02b5, B:105:0x02c5, B:110:0x02d0, B:112:0x02ef, B:114:0x02f3, B:116:0x02fc, B:120:0x0337, B:122:0x033c, B:123:0x0345, B:132:0x0393, B:137:0x0397, B:138:0x0306, B:140:0x0399, B:141:0x039e, B:144:0x0072, B:146:0x0078, B:147:0x007f, B:148:0x03a0, B:149:0x03b0, B:152:0x03b4, B:125:0x0346, B:126:0x0358, B:128:0x035e, B:130:0x036c, B:131:0x0392), top: B:3:0x0009, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0267 A[Catch: all -> 0x03b5, TryCatch #1 {, blocks: (B:4:0x0009, B:13:0x001a, B:14:0x002a, B:17:0x002c, B:18:0x0033, B:20:0x0039, B:22:0x0051, B:24:0x006c, B:25:0x0085, B:27:0x00ae, B:29:0x00b2, B:30:0x00bd, B:32:0x00c3, B:34:0x00cd, B:35:0x00da, B:37:0x00e0, B:39:0x00f7, B:44:0x0103, B:45:0x0114, B:47:0x011a, B:49:0x0138, B:51:0x0161, B:52:0x0184, B:55:0x0191, B:56:0x01a0, B:58:0x01a6, B:60:0x01b0, B:62:0x01b4, B:64:0x01bf, B:66:0x01da, B:67:0x01e6, B:69:0x01ec, B:71:0x0201, B:73:0x020b, B:74:0x0218, B:76:0x021e, B:78:0x023a, B:80:0x0242, B:82:0x024a, B:84:0x0254, B:85:0x0267, B:86:0x026b, B:88:0x027e, B:92:0x01f4, B:94:0x01fc, B:95:0x01de, B:91:0x0294, B:99:0x02a1, B:100:0x02af, B:102:0x02b5, B:105:0x02c5, B:110:0x02d0, B:112:0x02ef, B:114:0x02f3, B:116:0x02fc, B:120:0x0337, B:122:0x033c, B:123:0x0345, B:132:0x0393, B:137:0x0397, B:138:0x0306, B:140:0x0399, B:141:0x039e, B:144:0x0072, B:146:0x0078, B:147:0x007f, B:148:0x03a0, B:149:0x03b0, B:152:0x03b4, B:125:0x0346, B:126:0x0358, B:128:0x035e, B:130:0x036c, B:131:0x0392), top: B:3:0x0009, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027e A[Catch: all -> 0x03b5, TryCatch #1 {, blocks: (B:4:0x0009, B:13:0x001a, B:14:0x002a, B:17:0x002c, B:18:0x0033, B:20:0x0039, B:22:0x0051, B:24:0x006c, B:25:0x0085, B:27:0x00ae, B:29:0x00b2, B:30:0x00bd, B:32:0x00c3, B:34:0x00cd, B:35:0x00da, B:37:0x00e0, B:39:0x00f7, B:44:0x0103, B:45:0x0114, B:47:0x011a, B:49:0x0138, B:51:0x0161, B:52:0x0184, B:55:0x0191, B:56:0x01a0, B:58:0x01a6, B:60:0x01b0, B:62:0x01b4, B:64:0x01bf, B:66:0x01da, B:67:0x01e6, B:69:0x01ec, B:71:0x0201, B:73:0x020b, B:74:0x0218, B:76:0x021e, B:78:0x023a, B:80:0x0242, B:82:0x024a, B:84:0x0254, B:85:0x0267, B:86:0x026b, B:88:0x027e, B:92:0x01f4, B:94:0x01fc, B:95:0x01de, B:91:0x0294, B:99:0x02a1, B:100:0x02af, B:102:0x02b5, B:105:0x02c5, B:110:0x02d0, B:112:0x02ef, B:114:0x02f3, B:116:0x02fc, B:120:0x0337, B:122:0x033c, B:123:0x0345, B:132:0x0393, B:137:0x0397, B:138:0x0306, B:140:0x0399, B:141:0x039e, B:144:0x0072, B:146:0x0078, B:147:0x007f, B:148:0x03a0, B:149:0x03b0, B:152:0x03b4, B:125:0x0346, B:126:0x0358, B:128:0x035e, B:130:0x036c, B:131:0x0392), top: B:3:0x0009, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture c(java.util.List r22, defpackage.bgk r23, final android.hardware.camera2.CameraDevice r24) {
        /*
            Method dump skipped, instructions count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akt.c(java.util.List, bgk, android.hardware.camera2.CameraDevice):com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // defpackage.aku
    public final List d() {
        List unmodifiableList;
        synchronized (this.a) {
            unmodifiableList = DesugarCollections.unmodifiableList(this.b);
        }
        return unmodifiableList;
    }

    @Override // defpackage.aku
    public final void e() {
        ArrayList arrayList;
        int i;
        synchronized (this.a) {
            if (this.b.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(this.b);
                this.b.clear();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                bdk bdkVar = (bdk) arrayList.get(i2);
                Iterator it = bdkVar.h.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        ((bbt) it.next()).a(bdkVar.a());
                    }
                }
                i2 = i;
            }
        }
    }

    @Override // defpackage.aku
    public final void f() {
        synchronized (this.a) {
            int i = this.j;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                throw new IllegalStateException(agn.b(this, "close() should not be possible in state: "));
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    ksw.i(this.c, agn.b(this, "The Opener shouldn't null in state:"));
                    this.c.e();
                } else if (i2 == 6 || i2 == 7) {
                    ksw.i(this.c, agn.b(this, "The Opener shouldn't null in state:"));
                    this.c.e();
                    m(6);
                    this.p.c();
                    this.e = null;
                }
            }
            m(2);
        }
    }

    final void g() {
        if (this.j == 2) {
            avw.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        m(2);
        this.d = null;
        kfb kfbVar = this.h;
        if (kfbVar != null) {
            kfbVar.b(null);
            this.h = null;
        }
    }

    @Override // defpackage.aku
    public final void h(List list) {
        synchronized (this.a) {
            int i = this.j;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            switch (i2) {
                case 0:
                    throw new IllegalStateException(agn.b(this, "issueCaptureRequests() should not be possible in state: "));
                case 1:
                case 4:
                case 5:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                case 2:
                case 3:
                case 6:
                    this.b.addAll(list);
                    break;
                case 7:
                    this.b.addAll(list);
                    i();
                    break;
            }
        }
    }

    final void i() {
        this.p.b().b(new Runnable() { // from class: ako
            @Override // java.lang.Runnable
            public final void run() {
                akt aktVar = akt.this;
                synchronized (aktVar.a) {
                    if (aktVar.b.isEmpty()) {
                        return;
                    }
                    try {
                        aktVar.n(aktVar.b);
                    } finally {
                        aktVar.b.clear();
                    }
                }
            }
        }, bjb.a());
    }

    @Override // defpackage.aku
    public final void j(bgk bgkVar) {
        synchronized (this.a) {
            int i = this.j;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            switch (i2) {
                case 0:
                    throw new IllegalStateException(agn.b(this, "setSessionConfig() should not be possible in state: "));
                case 1:
                case 4:
                case 5:
                    throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                case 2:
                case 3:
                case 6:
                    this.e = bgkVar;
                    break;
                case 7:
                    this.e = bgkVar;
                    if (bgkVar != null) {
                        if (!this.l.keySet().containsAll(bgkVar.f())) {
                            avw.c("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            avw.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            o(this.e);
                            break;
                        }
                    } else {
                        return;
                    }
            }
        }
    }

    @Override // defpackage.aku
    public final void k(Map map) {
        synchronized (this.a) {
            this.m = map;
        }
    }

    @Override // defpackage.aku
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            int i = this.j;
            z = true;
            if (i != 8 && i != 7) {
                z = false;
            }
        }
        return z;
    }

    public final void m(int i) {
        int i2 = this.i;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        int i4 = i - 1;
        if (i4 > i3) {
            this.i = i;
        }
        this.j = i;
        if (ozg.c()) {
            int i5 = this.i;
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 >= 3) {
                ozg.b("CX:C2State[" + String.format("CaptureSession@%x", Integer.valueOf(hashCode())) + "]", i4);
            }
        }
    }

    final void n(List list) {
        aka akaVar;
        ArrayList arrayList;
        boolean z;
        bcd bcdVar;
        synchronized (this.a) {
            if (this.j != 8) {
                avw.a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                return;
            }
            if (list.isEmpty()) {
                return;
            }
            try {
                akaVar = new aka();
                arrayList = new ArrayList();
                avw.a("CaptureSession", "Issuing capture request.");
                Iterator it = list.iterator();
                z = false;
                while (it.hasNext()) {
                    bdk bdkVar = (bdk) it.next();
                    if (bdkVar.e().isEmpty()) {
                        avw.a("CaptureSession", "Skipping issuing empty capture request.");
                    } else {
                        Iterator it2 = bdkVar.e().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                bdy bdyVar = (bdy) it2.next();
                                if (!this.l.containsKey(bdyVar)) {
                                    avw.a("CaptureSession", a.n(bdyVar, "Skipping capture request with invalid surface: "));
                                    break;
                                }
                            } else {
                                z |= !(bdkVar.f != 2);
                                bdi bdiVar = new bdi(bdkVar);
                                if (bdkVar.f == 5 && (bcdVar = bdkVar.k) != null) {
                                    bdiVar.f = bcdVar;
                                }
                                bgk bgkVar = this.e;
                                if (bgkVar != null) {
                                    bdiVar.f(bgkVar.g.e);
                                }
                                bdiVar.f(bdkVar.e);
                                CaptureRequest a = ajs.a(bdiVar.b(), this.d.j(), this.l, false, this.r);
                                if (a == null) {
                                    avw.a("CaptureSession", "Skipping issuing request without surface.");
                                    return;
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it3 = bdkVar.h.iterator();
                                while (it3.hasNext()) {
                                    akk.a((bbt) it3.next(), arrayList2);
                                }
                                akaVar.a(a, arrayList2);
                                arrayList.add(a);
                            }
                        }
                    }
                }
            } catch (CameraAccessException e) {
                avw.c("CaptureSession", "Unable to access camera: " + e.getMessage());
                Thread.dumpStack();
            }
            if (arrayList.isEmpty()) {
                avw.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                return;
            }
            if (this.n.a && z) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    int intValue = ((Integer) ((CaptureRequest) it4.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                    if (intValue == 2 || intValue == 3) {
                        this.d.q();
                        akaVar.b = new akl(this);
                        break;
                    }
                }
            }
            if (this.o.a && z) {
                Iterator it5 = arrayList.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Integer num = (Integer) ((CaptureRequest) it5.next()).get(CaptureRequest.FLASH_MODE);
                    if (num != null && num.intValue() == 2) {
                        akaVar.a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new akq(this)));
                        break;
                    }
                }
            }
            amt amtVar = this.d;
            CameraCaptureSession.CaptureCallback a2 = ((ane) amtVar).p.a(akaVar);
            ksw.i(((anb) amtVar).g, "Need to call openCaptureSession before using this API.");
            ((anb) amtVar).g.a.a(arrayList, ((anb) amtVar).d, a2);
        }
    }

    final void o(bgk bgkVar) {
        CameraCaptureSession.CaptureCallback ahwVar;
        synchronized (this.a) {
            if (bgkVar == null) {
                avw.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return;
            }
            if (this.j != 8) {
                avw.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return;
            }
            bdk bdkVar = bgkVar.g;
            if (bdkVar.e().isEmpty()) {
                avw.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.d.q();
                } catch (CameraAccessException e) {
                    avw.c("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
                return;
            }
            try {
                avw.a("CaptureSession", "Issuing request for session.");
                CaptureRequest a = ajs.a(bdkVar, this.d.j(), this.l, true, this.r);
                if (a == null) {
                    avw.a("CaptureSession", "Skipping issuing empty request for session.");
                    return;
                }
                ars arsVar = this.p;
                List<bbt> list = bdkVar.h;
                CameraCaptureSession.CaptureCallback[] captureCallbackArr = new CameraCaptureSession.CaptureCallback[0];
                ArrayList arrayList = new ArrayList(list.size());
                for (bbt bbtVar : list) {
                    if (bbtVar == null) {
                        ahwVar = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        akk.a(bbtVar, arrayList2);
                        ahwVar = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new ahw(arrayList2);
                    }
                    arrayList.add(ahwVar);
                }
                Collections.addAll(arrayList, captureCallbackArr);
                CameraCaptureSession.CaptureCallback a2 = arsVar.a(new ahw(arrayList));
                amt amtVar = this.d;
                CameraCaptureSession.CaptureCallback a3 = ((ane) amtVar).p.a(a2);
                ksw.i(((anb) amtVar).g, "Need to call openCaptureSession before using this API.");
                ((anb) amtVar).g.a.b(a, ((anb) amtVar).d, a3);
                return;
            } catch (CameraAccessException e2) {
                avw.c("CaptureSession", "Unable to access camera: " + e2.getMessage());
                Thread.dumpStack();
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033 A[Catch: all -> 0x0071, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000c, B:9:0x005e, B:13:0x0010, B:15:0x0014, B:16:0x0017, B:18:0x0033, B:19:0x0037, B:21:0x003b, B:22:0x0046, B:23:0x0048, B:25:0x004a, B:26:0x005a, B:27:0x0064, B:28:0x006f, B:29:0x0070), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[Catch: all -> 0x0071, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000c, B:9:0x005e, B:13:0x0010, B:15:0x0014, B:16:0x0017, B:18:0x0033, B:19:0x0037, B:21:0x003b, B:22:0x0046, B:23:0x0048, B:25:0x004a, B:26:0x005a, B:27:0x0064, B:28:0x006f, B:29:0x0070), top: B:3:0x0003 }] */
    @Override // defpackage.aku
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture p() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            int r1 = r4.j     // Catch: java.lang.Throwable -> L71
            int r2 = r1 + (-1)
            r3 = 0
            if (r1 == 0) goto L70
            if (r2 == 0) goto L64
            switch(r2) {
                case 2: goto L5a;
                case 3: goto L4a;
                case 4: goto L37;
                case 5: goto L10;
                case 6: goto L17;
                case 7: goto L10;
                default: goto Lf;
            }     // Catch: java.lang.Throwable -> L71
        Lf:
            goto L5e
        L10:
            amt r1 = r4.d     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L17
            r1.n()     // Catch: java.lang.Throwable -> L71
        L17:
            r1 = 5
            r4.m(r1)     // Catch: java.lang.Throwable -> L71
            ars r1 = r4.p     // Catch: java.lang.Throwable -> L71
            r1.c()     // Catch: java.lang.Throwable -> L71
            amq r1 = r4.c     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = "The Opener shouldn't null in state:"
            java.lang.String r2 = defpackage.agn.b(r4, r2)     // Catch: java.lang.Throwable -> L71
            defpackage.ksw.i(r1, r2)     // Catch: java.lang.Throwable -> L71
            amq r1 = r4.c     // Catch: java.lang.Throwable -> L71
            boolean r1 = r1.e()     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L37
            r4.g()     // Catch: java.lang.Throwable -> L71
            goto L5e
        L37:
            com.google.common.util.concurrent.ListenableFuture r1 = r4.g     // Catch: java.lang.Throwable -> L71
            if (r1 != 0) goto L46
            akm r1 = new akm     // Catch: java.lang.Throwable -> L71
            r1.<init>()     // Catch: java.lang.Throwable -> L71
            com.google.common.util.concurrent.ListenableFuture r1 = defpackage.kfg.a(r1)     // Catch: java.lang.Throwable -> L71
            r4.g = r1     // Catch: java.lang.Throwable -> L71
        L46:
            com.google.common.util.concurrent.ListenableFuture r1 = r4.g     // Catch: java.lang.Throwable -> L71
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            return r1
        L4a:
            amq r1 = r4.c     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = "The Opener shouldn't null in state:"
            java.lang.String r2 = defpackage.agn.b(r4, r2)     // Catch: java.lang.Throwable -> L71
            defpackage.ksw.i(r1, r2)     // Catch: java.lang.Throwable -> L71
            amq r1 = r4.c     // Catch: java.lang.Throwable -> L71
            r1.e()     // Catch: java.lang.Throwable -> L71
        L5a:
            r1 = 2
            r4.m(r1)     // Catch: java.lang.Throwable -> L71
        L5e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            com.google.common.util.concurrent.ListenableFuture r0 = defpackage.bkj.b(r3)
            return r0
        L64:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = "release() should not be possible in state: "
            java.lang.String r2 = defpackage.agn.b(r4, r2)     // Catch: java.lang.Throwable -> L71
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L71
            throw r1     // Catch: java.lang.Throwable -> L71
        L70:
            throw r3     // Catch: java.lang.Throwable -> L71
        L71:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akt.p():com.google.common.util.concurrent.ListenableFuture");
    }

    public akt(aqf aqfVar, boolean z) {
        this(aqfVar, new bfx(Collections.EMPTY_LIST), z);
    }
}
