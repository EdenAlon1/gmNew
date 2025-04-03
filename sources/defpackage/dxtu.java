package defpackage;

import android.content.Context;
import android.os.StatFs;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxtu implements dxsy {
    public final dwqy a;
    public emxc b = emux.a;
    private final Context c;
    private final String d;
    private final dxtf e;
    private final dxwx f;

    public dxtu(Context context, dxwx dxwxVar, dxtf dxtfVar, dwqy dwqyVar) {
        this.c = context;
        this.f = dxwxVar;
        this.d = context.getPackageName();
        this.e = dxtfVar;
        this.a = dwqyVar;
    }

    private final ListenableFuture t(final int i, final erog erogVar, final int i2) {
        return elfr.k(this.e.a(i2, this.b), new eroh() { // from class: dxtp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final emxc emxcVar = (emxc) obj;
                if (!emxcVar.g()) {
                    return erre.a;
                }
                final int i3 = i2;
                final int i4 = i;
                erog erogVar2 = erogVar;
                final dxtu dxtuVar = dxtu.this;
                return dycd.e(erogVar2.a()).f(new emwl() { // from class: dxtj
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        List list = (List) obj2;
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            emxc emxcVar2 = emxcVar;
                            dxtu.this.r(i4, (erih) ((erii) it.next()).toBuilder(), i3, (erjw) emxcVar2.c());
                        }
                        return null;
                    }
                }, erpp.a);
            }
        }, erpp.a);
    }

    private final void u(int i, erih erihVar, long j) {
        erjv erjvVar = (erjv) erjw.a.createBuilder();
        erjvVar.copyOnWrite();
        erjw erjwVar = (erjw) erjvVar.instance;
        erjwVar.b |= 1;
        erjwVar.c = false;
        r(i, erihVar, j, (erjw) erjvVar.build());
    }

    @Override // defpackage.dxsy
    public final ListenableFuture a(final erog erogVar) {
        return t(1046, new erog() { // from class: dxtq
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return elfr.j(erog.this.a(), new emwl() { // from class: dxtl
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ArrayList arrayList = new ArrayList();
                        for (dxsx dxsxVar : (List) obj) {
                            erih erihVar = (erih) erii.a.createBuilder();
                            eriu b = dxsxVar.b();
                            erihVar.copyOnWrite();
                            erii eriiVar = (erii) erihVar.instance;
                            eriiVar.h = b;
                            eriiVar.b |= Integer.MIN_VALUE;
                            erie a = dxsxVar.a();
                            erihVar.copyOnWrite();
                            erii eriiVar2 = (erii) erihVar.instance;
                            eriiVar2.e = a;
                            eriiVar2.b |= 256;
                            arrayList.add((erii) erihVar.build());
                        }
                        return arrayList;
                    }
                }, erpp.a);
            }
        }, this.a.i());
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [dxti, java.lang.Object] */
    @Override // defpackage.dxsy
    public final ListenableFuture b(final String str, final emxc emxcVar, final emxc emxcVar2) {
        ListenableFuture i = erqt.i(emux.a);
        if (this.b.g()) {
            i = this.b.c().d(str);
        }
        return elfr.j(dycd.e(i).f(new emwl() { // from class: dxtn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                int b;
                emxc emxcVar3 = (emxc) obj;
                eril erilVar = (eril) erim.a.createBuilder();
                erilVar.copyOnWrite();
                erim erimVar = (erim) erilVar.instance;
                erimVar.b |= 1;
                erimVar.c = str;
                emxc emxcVar4 = emxcVar2;
                if (emxcVar4.g()) {
                    erjs erjsVar = (erjs) emxcVar4.c();
                    erilVar.copyOnWrite();
                    erim erimVar2 = (erim) erilVar.instance;
                    erimVar2.g = erjsVar;
                    erimVar2.b |= 32;
                }
                if (emxcVar3.g()) {
                    long longValue = ((Long) emxcVar3.c()).longValue();
                    erilVar.copyOnWrite();
                    erim erimVar3 = (erim) erilVar.instance;
                    erimVar3.b |= 2;
                    erimVar3.d = longValue;
                }
                emxc emxcVar5 = emxcVar;
                if (emxcVar5.g()) {
                    String simpleName = emxcVar5.c().getClass().getSimpleName();
                    erilVar.copyOnWrite();
                    erim erimVar4 = (erim) erilVar.instance;
                    simpleName.getClass();
                    erimVar4.b |= 4;
                    erimVar4.e = simpleName;
                    if (((Throwable) emxcVar5.c()).getCause() != null) {
                        String simpleName2 = ((Throwable) emxcVar5.c()).getCause().getClass().getSimpleName();
                        erilVar.copyOnWrite();
                        erim erimVar5 = (erim) erilVar.instance;
                        simpleName2.getClass();
                        erimVar5.b |= 8;
                        erimVar5.f = simpleName2;
                    }
                    if ((emxcVar5.c() instanceof dwqn) && (b = erkd.b(((dwqn) emxcVar5.c()).a.aF)) != 0) {
                        erilVar.copyOnWrite();
                        erim erimVar6 = (erim) erilVar.instance;
                        erimVar6.h = erkd.a(b);
                        erimVar6.b |= 64;
                    }
                }
                return (erim) erilVar.build();
            }
        }, erpp.a), new emwl() { // from class: dxto
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                erim erimVar = (erim) obj;
                erih erihVar = (erih) erii.a.createBuilder();
                erihVar.copyOnWrite();
                erii eriiVar = (erii) erihVar.instance;
                erimVar.getClass();
                eriiVar.y = erimVar;
                eriiVar.d |= 32768;
                dxtu.this.s(1120, erihVar, r5.a.k());
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.dxsy
    public final ListenableFuture c(final erog erogVar) {
        return t(1058, new erog() { // from class: dxtr
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return elfr.j(erog.this.a(), new emwl() { // from class: dxtm
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        erjg erjgVar = (erjg) obj;
                        erih erihVar = (erih) erii.a.createBuilder();
                        erihVar.copyOnWrite();
                        erii eriiVar = (erii) erihVar.instance;
                        erjgVar.getClass();
                        eriiVar.l = erjgVar;
                        eriiVar.c |= 65536;
                        return Arrays.asList((erii) erihVar.build());
                    }
                }, erpp.a);
            }
        }, this.a.m());
    }

    @Override // defpackage.dxsy
    public final ListenableFuture d(final erog erogVar) {
        return t(1057, new erog() { // from class: dxts
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return elfr.j(erog.this.a(), new emwl() { // from class: dxtk
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        erjm erjmVar = (erjm) obj;
                        erih erihVar = (erih) erii.a.createBuilder();
                        erihVar.copyOnWrite();
                        erii eriiVar = (erii) erihVar.instance;
                        erjmVar.getClass();
                        eriiVar.j = erjmVar;
                        eriiVar.c |= 8192;
                        return Arrays.asList((erii) erihVar.build());
                    }
                }, erpp.a);
            }
        }, this.a.o());
    }

    @Override // defpackage.dxsy
    public final void e(erik erikVar) {
        long j = this.a.j();
        if (dxth.a(j)) {
            erih erihVar = (erih) erii.a.createBuilder();
            erihVar.copyOnWrite();
            erii eriiVar = (erii) erihVar.instance;
            erikVar.getClass();
            eriiVar.r = erikVar;
            eriiVar.d |= 4;
            u(1075, erihVar, j);
        }
    }

    @Override // defpackage.dxsy
    public final void f(erie erieVar, erio erioVar) {
        erih erihVar = (erih) erii.a.createBuilder();
        erihVar.copyOnWrite();
        erii eriiVar = (erii) erihVar.instance;
        erioVar.getClass();
        eriiVar.s = erioVar;
        eriiVar.d |= 8;
        erihVar.copyOnWrite();
        erii eriiVar2 = (erii) erihVar.instance;
        erieVar.getClass();
        eriiVar2.e = erieVar;
        eriiVar2.b |= 256;
        s(1082, erihVar, this.a.k());
    }

    @Override // defpackage.dxsy
    public final void g(eriy eriyVar) {
        erih erihVar = (erih) erii.a.createBuilder();
        erihVar.copyOnWrite();
        erii eriiVar = (erii) erihVar.instance;
        eriyVar.getClass();
        eriiVar.u = eriyVar;
        eriiVar.d |= 256;
        s(1110, erihVar, this.a.e());
    }

    @Override // defpackage.dxsy
    public final void h(erie erieVar) {
        erih erihVar = (erih) erii.a.createBuilder();
        erjh erjhVar = (erjh) erji.a.createBuilder();
        erjhVar.copyOnWrite();
        erji erjiVar = (erji) erjhVar.instance;
        erieVar.getClass();
        erjiVar.c = erieVar;
        erjiVar.b |= 1;
        erihVar.copyOnWrite();
        erii eriiVar = (erii) erihVar.instance;
        erji erjiVar2 = (erji) erjhVar.build();
        erjiVar2.getClass();
        eriiVar.p = erjiVar2;
        eriiVar.d |= 1;
        s(1071, erihVar, this.a.k());
    }

    @Override // defpackage.dxsy
    public final void i(erie erieVar, int i) {
        erjj erjjVar = (erjj) erjk.a.createBuilder();
        erjjVar.copyOnWrite();
        erjk erjkVar = (erjk) erjjVar.instance;
        erjkVar.b |= 1;
        erjkVar.c = i;
        erjk erjkVar2 = (erjk) erjjVar.build();
        erih erihVar = (erih) erii.a.createBuilder();
        erihVar.copyOnWrite();
        erii eriiVar = (erii) erihVar.instance;
        erjkVar2.getClass();
        eriiVar.w = erjkVar2;
        eriiVar.d |= 2048;
        erihVar.copyOnWrite();
        erii eriiVar2 = (erii) erihVar.instance;
        erieVar.getClass();
        eriiVar2.e = erieVar;
        eriiVar2.b |= 256;
        s(1117, erihVar, this.a.k());
    }

    @Override // defpackage.dxsy
    public final void j(erie erieVar, erju erjuVar) {
        erih erihVar = (erih) erii.a.createBuilder();
        erihVar.copyOnWrite();
        erii eriiVar = (erii) erihVar.instance;
        erjuVar.getClass();
        eriiVar.v = erjuVar;
        eriiVar.d |= 512;
        erihVar.copyOnWrite();
        erii eriiVar2 = (erii) erihVar.instance;
        erieVar.getClass();
        eriiVar2.e = erieVar;
        eriiVar2.b |= 256;
        s(1018, erihVar, this.a.k());
    }

    @Override // defpackage.dxsy
    public final void k(int i, int i2) {
        u(i, (erih) erii.a.createBuilder(), i2);
    }

    @Override // defpackage.dxsy
    public final void l(int i) {
        s(i, (erih) erii.a.createBuilder(), this.a.k());
    }

    @Override // defpackage.dxsy
    public final void m(int i, String str, int i2, long j, String str2) {
        erid eridVar = (erid) erie.a.createBuilder();
        eridVar.copyOnWrite();
        erie erieVar = (erie) eridVar.instance;
        str.getClass();
        erieVar.b |= 1;
        erieVar.c = str;
        eridVar.copyOnWrite();
        erie erieVar2 = (erie) eridVar.instance;
        erieVar2.b |= 2;
        erieVar2.d = i2;
        eridVar.copyOnWrite();
        erie erieVar3 = (erie) eridVar.instance;
        erieVar3.b |= 64;
        erieVar3.i = j;
        eridVar.copyOnWrite();
        erie erieVar4 = (erie) eridVar.instance;
        str2.getClass();
        erieVar4.b |= 128;
        erieVar4.j = str2;
        erie erieVar5 = (erie) eridVar.build();
        erih erihVar = (erih) erii.a.createBuilder();
        erihVar.copyOnWrite();
        erii eriiVar = (erii) erihVar.instance;
        erieVar5.getClass();
        eriiVar.e = erieVar5;
        eriiVar.b |= 256;
        s(i, erihVar, this.a.k());
    }

    @Override // defpackage.dxsy
    public final void n(int i, int i2) {
        erih erihVar = (erih) erii.a.createBuilder();
        erir erirVar = (erir) eris.a.createBuilder();
        erirVar.copyOnWrite();
        eris erisVar = (eris) erirVar.instance;
        erisVar.b |= 2;
        erisVar.d = i2;
        erirVar.copyOnWrite();
        eris erisVar2 = (eris) erirVar.instance;
        erisVar2.c = i - 2;
        erisVar2.b |= 1;
        erihVar.copyOnWrite();
        erii eriiVar = (erii) erihVar.instance;
        eris erisVar3 = (eris) erirVar.build();
        erisVar3.getClass();
        eriiVar.k = erisVar3;
        eriiVar.c |= 32768;
        s(1053, erihVar, this.a.k());
    }

    @Override // defpackage.dxsy
    public final void o(erie erieVar, int i, long j, long j2, String str, int i2) {
        erih erihVar = (erih) erii.a.createBuilder();
        erjb erjbVar = (erjb) erjc.a.createBuilder();
        erjbVar.copyOnWrite();
        erjc erjcVar = (erjc) erjbVar.instance;
        erieVar.getClass();
        erjcVar.c = erieVar;
        erjcVar.b |= 1;
        erjbVar.copyOnWrite();
        erjc erjcVar2 = (erjc) erjbVar.instance;
        erjcVar2.d = i - 2;
        erjcVar2.b |= 2;
        erjbVar.copyOnWrite();
        erjc erjcVar3 = (erjc) erjbVar.instance;
        erjcVar3.b |= 4;
        erjcVar3.e = j;
        erjbVar.copyOnWrite();
        erjc erjcVar4 = (erjc) erjbVar.instance;
        erjcVar4.b |= 8;
        erjcVar4.f = j2;
        erjbVar.copyOnWrite();
        erjc erjcVar5 = (erjc) erjbVar.instance;
        str.getClass();
        erjcVar5.b |= 16;
        erjcVar5.g = str;
        erjbVar.copyOnWrite();
        erjc erjcVar6 = (erjc) erjbVar.instance;
        erjcVar6.b |= 32;
        erjcVar6.h = i2;
        erihVar.copyOnWrite();
        erii eriiVar = (erii) erihVar.instance;
        erjc erjcVar7 = (erjc) erjbVar.build();
        erjcVar7.getClass();
        eriiVar.n = erjcVar7;
        eriiVar.c |= 4194304;
        s(1068, erihVar, this.a.k());
    }

    @Override // defpackage.dxsy
    public final void p(erie erieVar, int i) {
        erih erihVar = (erih) erii.a.createBuilder();
        erjn erjnVar = (erjn) erjo.a.createBuilder();
        erjnVar.copyOnWrite();
        erjo erjoVar = (erjo) erjnVar.instance;
        erjoVar.c = i - 2;
        erjoVar.b |= 1;
        erjo erjoVar2 = (erjo) erjnVar.build();
        erihVar.copyOnWrite();
        erii eriiVar = (erii) erihVar.instance;
        erjoVar2.getClass();
        eriiVar.x = erjoVar2;
        eriiVar.d |= 16384;
        erihVar.copyOnWrite();
        erii eriiVar2 = (erii) erihVar.instance;
        erieVar.getClass();
        eriiVar2.e = erieVar;
        eriiVar2.b |= 256;
        s(1119, erihVar, this.a.k());
    }

    @Override // defpackage.dxsy
    public final void q(int i, erie erieVar, int i2) {
        erih erihVar = (erih) erii.a.createBuilder();
        erip eripVar = (erip) eriq.a.createBuilder();
        eripVar.copyOnWrite();
        eriq eriqVar = (eriq) eripVar.instance;
        eriqVar.c = erkd.a(i);
        eriqVar.b |= 1;
        eripVar.copyOnWrite();
        eriq eriqVar2 = (eriq) eripVar.instance;
        erieVar.getClass();
        eriqVar2.d = erieVar;
        eriqVar2.b |= 2;
        eripVar.copyOnWrite();
        eriq eriqVar3 = (eriq) eripVar.instance;
        if (i2 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        eriqVar3.e = i2 - 2;
        eriqVar3.b |= 4;
        eripVar.copyOnWrite();
        eriq eriqVar4 = (eriq) eripVar.instance;
        eriqVar4.b |= 8;
        eriqVar4.f = 0;
        erihVar.copyOnWrite();
        erii eriiVar = (erii) erihVar.instance;
        eriq eriqVar5 = (eriq) eripVar.build();
        eriqVar5.getClass();
        eriiVar.o = eriqVar5;
        eriiVar.c |= Integer.MIN_VALUE;
        s(1070, erihVar, this.a.k());
    }

    public final void r(int i, erih erihVar, long j, erjw erjwVar) {
        erib eribVar = (erib) eric.a.createBuilder();
        eribVar.copyOnWrite();
        eric ericVar = (eric) eribVar.instance;
        String str = this.d;
        str.getClass();
        ericVar.b |= 2;
        ericVar.d = str;
        eribVar.copyOnWrite();
        eric ericVar2 = (eric) eribVar.instance;
        ericVar2.b |= 1;
        ericVar2.c = 722788935;
        erihVar.copyOnWrite();
        erii eriiVar = (erii) erihVar.instance;
        erii eriiVar2 = erii.a;
        eriiVar.b |= 524288;
        eriiVar.f = j;
        erif erifVar = (erif) erig.a.createBuilder();
        StatFs statFs = new StatFs(this.c.getFilesDir().getAbsolutePath());
        long blockCount = statFs.getBlockCount();
        long blockSize = statFs.getBlockSize();
        long availableBlocks = statFs.getAvailableBlocks();
        long blockSize2 = statFs.getBlockSize();
        double min = Math.min(5.24288E8d, blockCount * blockSize * 0.05d);
        erifVar.copyOnWrite();
        erig erigVar = (erig) erifVar.instance;
        erigVar.b |= 1;
        erigVar.c = ((double) (availableBlocks * blockSize2)) < min;
        erihVar.copyOnWrite();
        erii eriiVar3 = (erii) erihVar.instance;
        erig erigVar2 = (erig) erifVar.build();
        erigVar2.getClass();
        eriiVar3.i = erigVar2;
        eriiVar3.c |= 128;
        erihVar.copyOnWrite();
        erii eriiVar4 = (erii) erihVar.instance;
        eric ericVar3 = (eric) eribVar.build();
        ericVar3.getClass();
        eriiVar4.m = ericVar3;
        eriiVar4.c |= 524288;
        erihVar.copyOnWrite();
        erii eriiVar5 = (erii) erihVar.instance;
        erjwVar.getClass();
        eriiVar5.g = erjwVar;
        eriiVar5.b |= 1048576;
        this.f.a(erihVar.build(), erjx.a(i));
    }

    public final void s(int i, erih erihVar, long j) {
        elfr.l(this.e.a(j, this.b), new dxtt(this, i, erihVar, j), erpp.a);
    }
}
