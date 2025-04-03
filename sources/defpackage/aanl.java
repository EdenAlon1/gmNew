package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aanl extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ axrc[] c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aanl(ffgu ffguVar, axrc[] axrcVarArr) {
        super(3, ffguVar);
        this.c = axrcVarArr;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aanl aanlVar = new aanl((ffgu) obj3, this.c);
        aanlVar.d = (ffxy) obj;
        aanlVar.b = (Object[]) obj2;
        return aanlVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        int i;
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        int i2 = this.a;
        ffci.b(obj);
        if (i2 == 0) {
            ?? r2 = this.d;
            Object obj3 = this.b;
            axrc[] axrcVarArr = this.c;
            ArrayList arrayList = new ArrayList(3);
            int i3 = 0;
            int i4 = 0;
            while (i3 < 3) {
                if (axrcVarArr[i3] != null) {
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
            Object obj4 = array[0];
            doms domsVar = (doms) array[1];
            doml domlVar = (doml) obj4;
            doml l = ((Boolean) array[2]).booleanValue() ? doml.l(domlVar, null, null, domsVar, null, null, false, false, 4194299) : doml.l(domlVar, null, null, domsVar, null, null, false, false, 4192251);
            this.a = 1;
            if (r2.fQ(l, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
