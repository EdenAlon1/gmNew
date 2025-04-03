package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azl {
    public static int a;
    public final beo b;
    public final bdk c;
    public final aze d;
    public final azd e;
    private final bac f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [bbt] */
    /* JADX WARN: Type inference failed for: r4v10, types: [awa] */
    /* JADX WARN: Type inference failed for: r6v14, types: [awa] */
    /* JADX WARN: Type inference failed for: r6v17, types: [bbt] */
    public azl(beo beoVar, Size size, CameraCharacteristics cameraCharacteristics, atd atdVar, boolean z, azr azrVar) {
        int i;
        ksp kspVar;
        awa awaVar;
        azq azqVar;
        azq azqVar2;
        biw.b();
        this.b = beoVar;
        bbt bbtVar = null;
        bdj bdjVar = (bdj) bfy.c(beoVar, bhh.s, null);
        if (bdjVar == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for ".concat(String.valueOf(blh.b(beoVar, beoVar.toString()))));
        }
        bdi bdiVar = new bdi();
        bdjVar.a(beoVar, bdiVar);
        this.c = bdiVar.b();
        final aze azeVar = new aze();
        this.d = azeVar;
        Executor executor = (Executor) bfy.c(beoVar, beo.O, bjl.a());
        executor.getClass();
        final bac bacVar = new bac(executor, cameraCharacteristics, atdVar != null ? new bnb(atdVar) : null);
        this.f = bacVar;
        ArrayList arrayList = new ArrayList();
        if (bep.b(beoVar) != 0) {
            arrayList.add(32);
            arrayList.add(256);
        } else {
            Integer num = (Integer) bfy.c(beoVar, beo.d, null);
            if (num != null) {
                i = num.intValue();
            } else {
                Integer num2 = (Integer) bfy.c(beoVar, beq.C, null);
                i = (num2 == null || num2.intValue() != 4101) ? (num2 == null || num2.intValue() != 32) ? 256 : 32 : 4101;
            }
            arrayList.add(Integer.valueOf(i));
        }
        ayd aydVar = new ayd(size, beoVar.a(), arrayList, z, (avs) bfy.c(beoVar, beo.f, null), azrVar, new bmx(), new bmx());
        this.e = aydVar;
        ksw.d(azeVar.f == null && azeVar.b == null, "CaptureNode does not support recreation yet.");
        azeVar.f = aydVar;
        Size size2 = aydVar.a;
        int i2 = aydVar.b;
        boolean z2 = aydVar.d;
        aza azaVar = new aza(azeVar);
        boolean z3 = aydVar.c.size() > 1;
        if (z2 || aydVar.e != null) {
            azeVar.g = new azq(aze.b(aydVar.e, size2.getWidth(), size2.getHeight(), i2));
            azq azqVar3 = azeVar.g;
            kspVar = new ksp() { // from class: ays
                @Override // defpackage.ksp
                public final void accept(Object obj) {
                    aze azeVar2 = aze.this;
                    bad badVar = (bad) obj;
                    azeVar2.c(badVar);
                    azq azqVar4 = azeVar2.g;
                    ksw.d(azqVar4.a == null, "Pending request should be null");
                    azqVar4.a = badVar;
                }
            };
            awaVar = null;
            azqVar = azqVar3;
        } else {
            if (z3) {
                ?? awaVar2 = new awa(size2.getWidth(), size2.getHeight(), 256, 4);
                ?? a2 = bbw.a(azaVar, awaVar2.b);
                awaVar = new awa(size2.getWidth(), size2.getHeight(), 32, 4);
                bbt[] bbtVarArr = {azaVar, awaVar.b};
                azaVar = a2;
                azqVar2 = awaVar2;
                bbtVar = bbw.a(bbtVarArr);
            } else {
                ?? awaVar3 = new awa(size2.getWidth(), size2.getHeight(), i2, 4);
                azaVar = bbw.a(azaVar, awaVar3.b);
                awaVar = null;
                azqVar2 = awaVar3;
            }
            kspVar = new ksp() { // from class: ayr
                @Override // defpackage.ksp
                public final void accept(Object obj) {
                    aze.this.c((bad) obj);
                }
            };
            azqVar = azqVar2;
        }
        aydVar.i = azaVar;
        if (z3 && bbtVar != null) {
            aydVar.j = bbtVar;
        }
        Surface e = azqVar.e();
        e.getClass();
        ksw.d(aydVar.k == null, "The surface is already set.");
        aydVar.k = new bew(e, aydVar.a, aydVar.b);
        azeVar.b = new awt(azqVar);
        azeVar.e(azqVar);
        azr azrVar2 = aydVar.f;
        if (azrVar2 != null) {
            ayh ayhVar = (ayh) azrVar2;
            bev b = aze.b(aydVar.e, ayhVar.a.getWidth(), ayhVar.a.getHeight(), ayhVar.b);
            b.j(new beu() { // from class: ayt
                @Override // defpackage.beu
                public final void a(bev bevVar) {
                    aze azeVar2 = aze.this;
                    try {
                        avr f = bevVar.f();
                        if (f != null) {
                            bad badVar = azeVar2.a;
                            if (badVar == null) {
                                avw.f("CaptureNode", "Postview image is closed due to request completed or aborted");
                                f.close();
                            } else {
                                baa baaVar = azeVar2.e;
                                baaVar.getClass();
                                ((ayi) baaVar).b.accept(new ayj(badVar, f));
                            }
                        }
                    } catch (IllegalStateException e2) {
                        avw.d("CaptureNode", "Failed to acquire latest image of postview", e2);
                    }
                }
            }, bjm.a());
            azeVar.d = new awt(b);
            aydVar.m = new bew(b.e(), ayhVar.a, ayhVar.b);
        }
        if (z3 && awaVar != null) {
            Surface e2 = awaVar.e();
            ksw.d(aydVar.l == null, "The secondary surface is already set.");
            aydVar.l = new bew(e2, aydVar.a, aydVar.b);
            azeVar.c = new awt(awaVar);
            azeVar.e(awaVar);
        }
        aydVar.g.a = kspVar;
        aydVar.h.a = new ksp() { // from class: ayu
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                aze.this.d((bak) obj);
            }
        };
        azeVar.e = new ayi(new bmx(), new bmx(), aydVar.b, aydVar.c);
        baa baaVar = azeVar.e;
        bacVar.d = baaVar;
        ayi ayiVar = (ayi) baaVar;
        ayiVar.a.a = new ksp() { // from class: azu
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                final bab babVar = (bab) obj;
                if (babVar.b().a()) {
                    babVar.a().close();
                    return;
                }
                final bac bacVar2 = bac.this;
                bacVar2.a.execute(new Runnable() { // from class: azz
                    @Override // java.lang.Runnable
                    public final void run() {
                        bac.this.a(babVar);
                    }
                });
            }
        };
        ayiVar.b.a = new ksp() { // from class: azv
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                final bab babVar = (bab) obj;
                if (babVar.b().a()) {
                    avw.f("ProcessingNode", "The postview image is closed due to request aborted");
                    babVar.a().close();
                } else {
                    final bac bacVar2 = bac.this;
                    bacVar2.a.execute(new Runnable() { // from class: azt
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z4;
                            bab babVar2 = babVar;
                            final bad b2 = babVar2.b();
                            try {
                                Object a3 = bac.this.e.a(babVar2);
                                int i3 = ((bmc) a3).c;
                                if (i3 != 35 && i3 != 256) {
                                    if (i3 != 4101) {
                                        z4 = false;
                                        ksw.b(z4, String.format("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: %s", Integer.valueOf(i3)));
                                        azi.b((bne) a3);
                                        bjm.a().execute(new Runnable() { // from class: azy
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                biw.b();
                                                bag bagVar = bad.this.l;
                                                if (bagVar.f) {
                                                    return;
                                                }
                                                bagVar.a.i().execute(new Runnable() { // from class: bas
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                    }
                                                });
                                            }
                                        });
                                    }
                                    i3 = 4101;
                                }
                                z4 = true;
                                ksw.b(z4, String.format("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: %s", Integer.valueOf(i3)));
                                azi.b((bne) a3);
                                bjm.a().execute(new Runnable() { // from class: azy
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        biw.b();
                                        bag bagVar = bad.this.l;
                                        if (bagVar.f) {
                                            return;
                                        }
                                        bagVar.a.i().execute(new Runnable() { // from class: bas
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                            }
                                        });
                                    }
                                });
                            } catch (Exception e3) {
                                babVar2.a().close();
                                avw.d("ProcessingNode", "process postview input packet failed.", e3);
                            }
                        }
                    });
                }
            }
        };
        bacVar.e = new azs();
        bacVar.f = new azk(bacVar.k);
        bacVar.i = new azm();
        bacVar.g = new ayn();
        bacVar.h = new azo();
        int i3 = ayiVar.c;
        bnb bnbVar = bacVar.b;
        if (bnbVar != null) {
            bacVar.j = new ayo(bnbVar);
        }
    }

    public final void a() {
        bdy bdyVar;
        biw.b();
        biw.b();
        aze azeVar = this.d;
        azd azdVar = azeVar.f;
        azdVar.getClass();
        final awt awtVar = azeVar.b;
        awtVar.getClass();
        final awt awtVar2 = azeVar.c;
        final awt awtVar3 = azeVar.d;
        azdVar.i().d();
        azdVar.i().c().b(new Runnable() { // from class: ayw
            @Override // java.lang.Runnable
            public final void run() {
                awt.this.k();
            }
        }, bjm.a());
        bdy bdyVar2 = azdVar.m;
        if (bdyVar2 != null) {
            bdyVar2.d();
            azdVar.m.c().b(new Runnable() { // from class: ayx
                @Override // java.lang.Runnable
                public final void run() {
                    awt awtVar4 = awt.this;
                    if (awtVar4 != null) {
                        awtVar4.k();
                    }
                }
            }, bjm.a());
        }
        if (((ayd) azdVar).c.size() <= 1 || (bdyVar = azdVar.l) == null) {
            return;
        }
        bdyVar.d();
        azdVar.l.c().b(new Runnable() { // from class: ayy
            @Override // java.lang.Runnable
            public final void run() {
                awt awtVar4 = awt.this;
                if (awtVar4 != null) {
                    awtVar4.k();
                }
            }
        }, bjm.a());
    }

    final void b(bak bakVar) {
        biw.b();
        ((ayd) this.e).h.accept(bakVar);
    }
}
