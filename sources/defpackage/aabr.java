package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabr extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ axrc[] c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aabr(ffgu ffguVar, axrc[] axrcVarArr) {
        super(3, ffguVar);
        this.c = axrcVarArr;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aabr aabrVar = new aabr((ffgu) obj3, this.c);
        aabrVar.d = (ffxy) obj;
        aabrVar.b = (Object[]) obj2;
        return aabrVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r12 = this.d;
            Object obj2 = this.b;
            axrc[] axrcVarArr = this.c;
            ArrayList arrayList = new ArrayList(2);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                Object obj3 = null;
                if (i2 >= 2) {
                    break;
                }
                if (axrcVarArr[i2] != null) {
                    obj3 = ((Object[]) obj2)[i3];
                    i3++;
                }
                arrayList.add(obj3);
                i2++;
            }
            Object[] array = arrayList.toArray(new Object[0]);
            dmxv dmxvVar = (dmxv) array[0];
            if (!((Boolean) array[1]).booleanValue()) {
                dmxvVar = dmxv.l(dmxvVar, null, false, false, 524286);
            }
            this.a = 1;
            if (r12.fQ(dmxvVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
