package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zuk extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ axrc[] c;
    final /* synthetic */ zst d;
    final /* synthetic */ zum e;
    final /* synthetic */ zsn f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zuk(ffgu ffguVar, axrc[] axrcVarArr, zst zstVar, zum zumVar, zsn zsnVar) {
        super(3, ffguVar);
        this.c = axrcVarArr;
        this.d = zstVar;
        this.e = zumVar;
        this.f = zsnVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zuk zukVar = new zuk((ffgu) obj3, this.c, this.d, this.e, this.f);
        zukVar.g = (ffxy) obj;
        zukVar.b = (Object[]) obj2;
        return zukVar.b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ffxy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dnto dntoVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r2 = this.g;
            Object obj2 = this.b;
            axrc[] axrcVarArr = this.c;
            ArrayList arrayList = new ArrayList(10);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= 10) {
                    break;
                }
                if (axrcVarArr[i2] != null) {
                    dntoVar = ((Object[]) obj2)[i3];
                    i3++;
                }
                arrayList.add(dntoVar);
                i2++;
            }
            Object[] array = arrayList.toArray(new Object[0]);
            Object obj3 = array[0];
            obj3.getClass();
            dnoq dnoqVar = (dnoq) obj3;
            dnve dnveVar = (dnve) array[1];
            dnuo dnuoVar = (dnuo) array[2];
            dofn dofnVar = (dofn) array[3];
            dnvr dnvrVar = (dnvr) array[4];
            dntoVar = this.d.p ? (dnto) array[5] : null;
            eykv eykvVar = (eykv) array[6];
            aail aailVar = (aail) array[7];
            eykv eykvVar2 = (eykv) array[8];
            Object obj4 = array[9];
            obj4.getClass();
            zsn c = zum.c(this.f, dnoqVar, dnveVar, dnuoVar, dofnVar, dnvrVar, dntoVar, eykvVar, aailVar, eykvVar2, ((Boolean) obj4).booleanValue());
            this.a = 1;
            if (r2.fQ(c, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
