package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztx implements ffix {
    final /* synthetic */ axrc[] a;
    final /* synthetic */ alxr b;
    final /* synthetic */ List c;
    final /* synthetic */ List d;
    final /* synthetic */ dnsj e;
    final /* synthetic */ ffix f;
    final /* synthetic */ dnor g;
    final /* synthetic */ dnry h;
    final /* synthetic */ boolean i;
    final /* synthetic */ boolean j;
    final /* synthetic */ zst k;
    final /* synthetic */ dnto l;
    final /* synthetic */ dmcg m;
    final /* synthetic */ ffix n;
    final /* synthetic */ ffjm o;
    final /* synthetic */ ffix p;
    final /* synthetic */ ffix q;
    final /* synthetic */ dnsg r;
    final /* synthetic */ dnwi s;
    final /* synthetic */ zsl t;
    final /* synthetic */ zsm u;
    final /* synthetic */ int v;

    public ztx(axrc[] axrcVarArr, alxr alxrVar, List list, List list2, dnsj dnsjVar, ffix ffixVar, dnor dnorVar, dnry dnryVar, boolean z, boolean z2, int i, zst zstVar, dnto dntoVar, dmcg dmcgVar, ffix ffixVar2, ffjm ffjmVar, ffix ffixVar3, ffix ffixVar4, dnsg dnsgVar, dnwi dnwiVar, zsl zslVar, zsm zsmVar) {
        this.a = axrcVarArr;
        this.b = alxrVar;
        this.c = list;
        this.d = list2;
        this.e = dnsjVar;
        this.f = ffixVar;
        this.g = dnorVar;
        this.h = dnryVar;
        this.i = z;
        this.j = z2;
        this.v = i;
        this.k = zstVar;
        this.l = dntoVar;
        this.m = dmcgVar;
        this.n = ffixVar2;
        this.o = ffjmVar;
        this.p = ffixVar3;
        this.q = ffixVar4;
        this.r = dnsgVar;
        this.s = dnwiVar;
        this.t = zslVar;
        this.u = zsmVar;
    }

    @Override // defpackage.ffix
    public final zsn invoke() {
        int i;
        dnto dntoVar;
        ArrayList arrayList = new ArrayList(10);
        for (int i2 = 0; i2 < 10; i2++) {
            axrc axrcVar = this.a[i2];
            arrayList.add(axrcVar != null ? axrcVar.b() : null);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        Object obj = array[0];
        obj.getClass();
        dnoq dnoqVar = (dnoq) obj;
        Object obj2 = array[1];
        obj2.getClass();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        dnve dnveVar = (dnve) array[2];
        dnuo dnuoVar = (dnuo) array[3];
        dnto dntoVar2 = (dnto) array[4];
        dnvr dnvrVar = (dnvr) array[5];
        dofn dofnVar = (dofn) array[6];
        aail aailVar = (aail) array[7];
        eykv eykvVar = (eykv) array[8];
        eykv eykvVar2 = (eykv) array[9];
        alxr alxrVar = this.b;
        List list = this.c;
        List list2 = this.d;
        dnsj dnsjVar = this.e;
        ffix ffixVar = this.f;
        dnor dnorVar = this.g;
        dnry dnryVar = this.h;
        boolean z = this.i;
        boolean z2 = this.j;
        int i3 = this.v;
        zst zstVar = this.k;
        String d = zsr.d(alxrVar);
        boolean z3 = zstVar.p;
        if (z3) {
            i = i3;
            dntoVar = this.l;
        } else {
            i = i3;
            dntoVar = null;
        }
        if (true != z3) {
            dntoVar2 = null;
        }
        dmcg dmcgVar = this.m;
        boolean k = zsr.k(this.b);
        ffix b = dnoqVar.b();
        ffix ffixVar2 = this.n;
        ffjm ffjmVar = this.o;
        zst zstVar2 = this.k;
        return new zsn(new dnsh(d, list, list2, dnsjVar, ffixVar, dnorVar, dnryVar, z, z2, i, dnveVar, dnuoVar, dntoVar, dntoVar2, dnvrVar, dmcgVar, dofnVar, k, b, ffixVar2, ffjmVar, (!zstVar2.q || aailVar == null) ? null : aailVar.a, aailVar != null ? aailVar.b : null, this.p, false, zstVar2.b, eykvVar == null ? eykvVar2 : eykvVar, this.q, booleanValue, this.r, this.s), dnoqVar, this.b, this.t, booleanValue, this.u);
    }
}
