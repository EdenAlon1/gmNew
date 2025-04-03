package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztz extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ axrc[] c;
    final /* synthetic */ alxr d;
    final /* synthetic */ List e;
    final /* synthetic */ List f;
    final /* synthetic */ dnsj g;
    final /* synthetic */ ffix h;
    final /* synthetic */ dnor i;
    final /* synthetic */ dnry j;
    final /* synthetic */ boolean k;
    final /* synthetic */ boolean l;
    final /* synthetic */ zst m;
    final /* synthetic */ dnto n;
    final /* synthetic */ dmcg o;
    final /* synthetic */ ffix p;
    final /* synthetic */ ffjm q;
    final /* synthetic */ ffix r;
    final /* synthetic */ ffix s;
    final /* synthetic */ dnsg t;
    final /* synthetic */ dnwi u;
    final /* synthetic */ zsl v;
    final /* synthetic */ zsm w;
    final /* synthetic */ int x;
    private /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztz(ffgu ffguVar, axrc[] axrcVarArr, alxr alxrVar, List list, List list2, dnsj dnsjVar, ffix ffixVar, dnor dnorVar, dnry dnryVar, boolean z, boolean z2, int i, zst zstVar, dnto dntoVar, dmcg dmcgVar, ffix ffixVar2, ffjm ffjmVar, ffix ffixVar3, ffix ffixVar4, dnsg dnsgVar, dnwi dnwiVar, zsl zslVar, zsm zsmVar) {
        super(3, ffguVar);
        this.c = axrcVarArr;
        this.d = alxrVar;
        this.e = list;
        this.f = list2;
        this.g = dnsjVar;
        this.h = ffixVar;
        this.i = dnorVar;
        this.j = dnryVar;
        this.k = z;
        this.l = z2;
        this.x = i;
        this.m = zstVar;
        this.n = dntoVar;
        this.o = dmcgVar;
        this.p = ffixVar2;
        this.q = ffjmVar;
        this.r = ffixVar3;
        this.s = ffixVar4;
        this.t = dnsgVar;
        this.u = dnwiVar;
        this.v = zslVar;
        this.w = zsmVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ztz ztzVar = new ztz((ffgu) obj3, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.x, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w);
        ztzVar.y = (ffxy) obj;
        ztzVar.b = (Object[]) obj2;
        return ztzVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        boolean z;
        dnto dntoVar;
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r2 = this.y;
            Object obj3 = this.b;
            axrc[] axrcVarArr = this.c;
            ArrayList arrayList = new ArrayList(10);
            int i2 = 0;
            for (int i3 = 0; i3 < 10; i3++) {
                if (axrcVarArr[i3] != null) {
                    obj2 = ((Object[]) obj3)[i2];
                    i2++;
                } else {
                    obj2 = null;
                }
                arrayList.add(obj2);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            Object obj4 = array[0];
            obj4.getClass();
            dnoq dnoqVar = (dnoq) obj4;
            Object obj5 = array[1];
            obj5.getClass();
            boolean booleanValue = ((Boolean) obj5).booleanValue();
            dnve dnveVar = (dnve) array[2];
            dnuo dnuoVar = (dnuo) array[3];
            dnto dntoVar2 = (dnto) array[4];
            dnvr dnvrVar = (dnvr) array[5];
            dofn dofnVar = (dofn) array[6];
            aail aailVar = (aail) array[7];
            eykv eykvVar = (eykv) array[8];
            eykv eykvVar2 = (eykv) array[9];
            alxr alxrVar = this.d;
            List list = this.e;
            List list2 = this.f;
            dnsj dnsjVar = this.g;
            ffix ffixVar = this.h;
            dnor dnorVar = this.i;
            dnry dnryVar = this.j;
            boolean z2 = this.k;
            boolean z3 = this.l;
            int i4 = this.x;
            zst zstVar = this.m;
            String d = zsr.d(alxrVar);
            boolean z4 = zstVar.p;
            if (z4) {
                z = z2;
                dntoVar = this.n;
            } else {
                z = z2;
                dntoVar = null;
            }
            dnto dntoVar3 = true != z4 ? null : dntoVar2;
            dmcg dmcgVar = this.o;
            boolean k = zsr.k(this.d);
            ffix b = dnoqVar.b();
            ffix ffixVar2 = this.p;
            ffjm ffjmVar = this.q;
            zst zstVar2 = this.m;
            zsn zsnVar = new zsn(new dnsh(d, list, list2, dnsjVar, ffixVar, dnorVar, dnryVar, z, z3, i4, dnveVar, dnuoVar, dntoVar, dntoVar3, dnvrVar, dmcgVar, dofnVar, k, b, ffixVar2, ffjmVar, (!zstVar2.q || aailVar == null) ? null : aailVar.a, aailVar != null ? aailVar.b : null, this.r, false, zstVar2.b, eykvVar == null ? eykvVar2 : eykvVar, this.s, booleanValue, this.t, this.u), dnoqVar, this.d, this.v, booleanValue, this.w);
            this.a = 1;
            if (r2.fQ(zsnVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
