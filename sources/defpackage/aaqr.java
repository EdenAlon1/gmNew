package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqr extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ axrc[] c;
    final /* synthetic */ alxr d;
    final /* synthetic */ aaqt e;
    final /* synthetic */ aaqi f;
    final /* synthetic */ dnor g;
    final /* synthetic */ boolean h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaqr(ffgu ffguVar, axrc[] axrcVarArr, alxr alxrVar, aaqt aaqtVar, aaqi aaqiVar, dnor dnorVar, boolean z) {
        super(3, ffguVar);
        this.c = axrcVarArr;
        this.d = alxrVar;
        this.e = aaqtVar;
        this.f = aaqiVar;
        this.g = dnorVar;
        this.h = z;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aaqr aaqrVar = new aaqr((ffgu) obj3, this.c, this.d, this.e, this.f, this.g, this.h);
        aaqrVar.i = (ffxy) obj;
        aaqrVar.b = (Object[]) obj2;
        return aaqrVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dmcg dmcgVar;
        dmcg a;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r2 = this.i;
            Object obj2 = this.b;
            axrc[] axrcVarArr = this.c;
            int length = axrcVarArr.length;
            ArrayList arrayList = new ArrayList(length);
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                Object obj3 = null;
                if (i3 >= length) {
                    break;
                }
                if (axrcVarArr[i3] != null) {
                    obj3 = ((Object[]) obj2)[i4];
                    i4++;
                }
                arrayList.add(obj3);
                i3++;
            }
            dnoq[] dnoqVarArr = (dnoq[]) arrayList.toArray(new dnoq[0]);
            MessageId b = this.d.b();
            List J = ffdo.J(dnoqVarArr);
            ArrayList arrayList2 = new ArrayList(ffdx.n(J, 10));
            for (Object obj4 : J) {
                int i5 = i2 + 1;
                if (i2 < 0) {
                    ffdx.l();
                }
                dnoq dnoqVar = (dnoq) obj4;
                String a2 = b.a();
                a2.getClass();
                if (i2 == J.size() - 1) {
                    a = this.e.c.a(this.d, new dmci(null), null);
                    dmcgVar = a;
                } else {
                    dmcgVar = null;
                }
                dmzz dmzzVar = this.d.v() ? dmzz.bZ : dmzz.ca;
                aaqi aaqiVar = this.f;
                List b2 = ffdx.b(dmzzVar);
                dnry a3 = aaqj.a(aaqiVar.a, i2, J.size());
                Object b3 = this.e.d.b();
                b3.getClass();
                boolean booleanValue = ((Boolean) b3).booleanValue();
                aaqt aaqtVar = this.e;
                arrayList2.add(new zsn(new dnsh(a2, b2, this.g, a3, dmcgVar, new dnsg(booleanValue, aaqtVar.f.a(), aaqtVar.g.a(), aaqtVar.h.a(), 15), 1610579868), dnoqVar, this.d, this.h));
                i2 = i5;
            }
            aaqe aaqeVar = new aaqe(arrayList2, b, zsr.a(this.d));
            this.a = 1;
            if (r2.fQ(aaqeVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
