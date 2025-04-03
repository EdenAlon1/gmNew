package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eefx implements eefv {
    private final Context a;
    private final dikt b;

    public eefx(Context context, dikt diktVar) {
        this.a = context;
        this.b = diktVar;
    }

    private static eyse a(eegk eegkVar) {
        eyse eyseVar = (eyse) eysj.a.createBuilder();
        eyseVar.copyOnWrite();
        eysj eysjVar = (eysj) eyseVar.instance;
        eego eegoVar = (eego) eegkVar;
        String str = eegoVar.a;
        str.getClass();
        eysjVar.b |= 32;
        eysjVar.h = str;
        eyss eyssVar = eegoVar.e;
        if (eyssVar != null) {
            eyseVar.copyOnWrite();
            eysj eysjVar2 = (eysj) eyseVar.instance;
            eysjVar2.g = eyssVar;
            eysjVar2.b |= 16;
        }
        return eyseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(defpackage.eyse r7, defpackage.eegc r8) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eefx.b(eyse, eegc):void");
    }

    private static void c(eyse eyseVar, eegg eeggVar) {
        eyseVar.copyOnWrite();
        eysj eysjVar = (eysj) eyseVar.instance;
        eysj eysjVar2 = eysj.a;
        eysjVar.d = 2;
        eysjVar.b = 2 | eysjVar.b;
        eyseVar.copyOnWrite();
        eysj eysjVar3 = (eysj) eyseVar.instance;
        eysjVar3.b |= 8;
        eysjVar3.f = eeggVar.a;
    }

    private static eysj d(eegk eegkVar, eegc eegcVar, int i) {
        return e(eegkVar, eegcVar, i, 0);
    }

    private static eysj e(eegk eegkVar, eegc eegcVar, int i, int i2) {
        eyse a = a(eegkVar);
        b(a, eegcVar);
        int i3 = eegcVar.s;
        a.copyOnWrite();
        eysj eysjVar = (eysj) a.instance;
        eysj eysjVar2 = eysj.a;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        eysjVar.c = i4;
        eysjVar.b |= 1;
        a.copyOnWrite();
        eysj eysjVar3 = (eysj) a.instance;
        eysjVar3.d = 1;
        eysjVar3.b |= 2;
        a.copyOnWrite();
        eysj eysjVar4 = (eysj) a.instance;
        eysjVar4.n = i - 1;
        eysjVar4.b |= 1024;
        a.copyOnWrite();
        eysj eysjVar5 = (eysj) a.instance;
        String str = ((eego) eegkVar).c;
        str.getClass();
        eysjVar5.b |= 2048;
        eysjVar5.o = str;
        if (eegcVar.r == 3) {
            int i5 = eegcVar.p;
            a.copyOnWrite();
            eysj eysjVar6 = (eysj) a.instance;
            eysjVar6.b |= 8;
            eysjVar6.f = i5;
        }
        if (i2 != 0) {
            a.copyOnWrite();
            eysj eysjVar7 = (eysj) a.instance;
            eysjVar7.p = i2 - 1;
            eysjVar7.b |= 4096;
        }
        return (eysj) a.build();
    }

    private static int f(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 3;
        }
        if (i2 != 2) {
            return i2 != 3 ? 1 : 4;
        }
        return 2;
    }

    @Override // defpackage.eefv
    public final void aM(eegk eegkVar, eegc eegcVar) {
        this.b.f(this.a, d(eegkVar, eegcVar, 2));
    }

    @Override // defpackage.eefv
    public final void aN(eegk eegkVar, eegc eegcVar) {
        this.b.f(this.a, d(eegkVar, eegcVar, 2));
    }

    @Override // defpackage.eefv
    public final void aO(eegk eegkVar, eegc eegcVar) {
        this.b.f(this.a, d(eegkVar, eegcVar, 3));
    }

    @Override // defpackage.eefv
    public final /* synthetic */ void aP(eegk eegkVar, eegc eegcVar, eegg eeggVar) {
        bi(eegkVar, eegcVar, 3);
    }

    @Override // defpackage.eefv
    public final void aQ(eegk eegkVar, eegg eeggVar, eegc eegcVar) {
        eyse a = a(eegkVar);
        b(a, eegcVar);
        c(a, eeggVar);
        a.copyOnWrite();
        eysj eysjVar = (eysj) a.instance;
        eysj eysjVar2 = eysj.a;
        eysjVar.c = 1;
        eysjVar.b |= 1;
        a.copyOnWrite();
        eysj eysjVar3 = (eysj) a.instance;
        eysjVar3.n = 1;
        eysjVar3.b |= 1024;
        if (eegcVar != null) {
            long longValue = dkvj.a().longValue() - eegcVar.q;
            a.copyOnWrite();
            eysj eysjVar4 = (eysj) a.instance;
            eysjVar4.b |= 512;
            eysjVar4.l = (int) longValue;
        }
        this.b.f(this.a, (eysj) a.build());
    }

    @Override // defpackage.eefv
    public final void aR(eegk eegkVar, eegg eeggVar, eegf eegfVar) {
        eyse a = a(eegkVar);
        c(a, eeggVar);
        a.copyOnWrite();
        eysj eysjVar = (eysj) a.instance;
        eysj eysjVar2 = eysj.a;
        eysjVar.c = 0;
        eysjVar.b |= 1;
        a.copyOnWrite();
        eysj eysjVar3 = (eysj) a.instance;
        eysjVar3.e = eegfVar.b - 1;
        eysjVar3.b |= 4;
        a.copyOnWrite();
        eysj eysjVar4 = (eysj) a.instance;
        eysjVar4.n = 1;
        eysjVar4.b |= 1024;
        String e = eegfVar.e(fhpi.a);
        a.copyOnWrite();
        eysj eysjVar5 = (eysj) a.instance;
        String str = eegfVar.d;
        str.getClass();
        eysjVar5.b |= 64;
        eysjVar5.i = str;
        if (e != null) {
            a.copyOnWrite();
            eysj eysjVar6 = (eysj) a.instance;
            eysjVar6.b |= 128;
            eysjVar6.j = e;
        }
        this.b.f(this.a, (eysj) a.build());
    }

    @Override // defpackage.eefv
    public final void bi(eegk eegkVar, eegc eegcVar, int i) {
        if (eegcVar != null) {
            this.b.f(this.a, e(eegkVar, eegcVar, 4, f(i)));
            return;
        }
        eyse a = a(eegkVar);
        dikt diktVar = this.b;
        Context context = this.a;
        a.copyOnWrite();
        eysj eysjVar = (eysj) a.instance;
        eysj eysjVar2 = eysj.a;
        eysjVar.n = 3;
        eysjVar.b |= 1024;
        int f = f(i);
        a.copyOnWrite();
        eysj eysjVar3 = (eysj) a.instance;
        eysjVar3.p = f - 1;
        eysjVar3.b |= 4096;
        diktVar.f(context, (eysj) a.build());
    }

    @Override // defpackage.eefv
    public final /* synthetic */ void aS() {
    }

    @Override // defpackage.eefv
    public final /* synthetic */ void aL(eegc eegcVar) {
    }

    @Override // defpackage.eefv
    public final /* synthetic */ void bk(eegf eegfVar) {
    }
}
