package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axtc extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fgdj[] c;
    final /* synthetic */ ffjq d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axtc(ffgu ffguVar, fgdj[] fgdjVarArr, ffjq ffjqVar) {
        super(3, ffguVar);
        this.c = fgdjVarArr;
        this.d = ffjqVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        axtc axtcVar = new axtc((ffgu) obj3, this.c, this.d);
        axtcVar.e = (ffxy) obj;
        axtcVar.b = (Object[]) obj2;
        return axtcVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        int i;
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        int i2 = this.a;
        ffci.b(obj);
        if (i2 == 0) {
            ?? r15 = this.e;
            Object obj3 = this.b;
            fgdj[] fgdjVarArr = this.c;
            ArrayList arrayList = new ArrayList(6);
            int i3 = 0;
            int i4 = 0;
            while (i3 < 6) {
                if (fgdjVarArr[i3] != null) {
                    i = i4 + 1;
                    obj2 = ((Object[]) obj3)[i4];
                } else {
                    i = i4;
                    obj2 = null;
                }
                arrayList.add(obj2);
                i3++;
                i4 = i;
            }
            Object[] array = arrayList.toArray(new Object[0]);
            Object a = this.d.a(array[0], array[1], array[2], array[3], array[4], array[5]);
            this.a = 1;
            if (r15.fQ(a, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
