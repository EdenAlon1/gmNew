package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqp implements ffix {
    final /* synthetic */ axrc[] a;
    final /* synthetic */ alxr b;
    final /* synthetic */ aaqt c;
    final /* synthetic */ aaqi d;
    final /* synthetic */ dnor e;
    final /* synthetic */ boolean f;

    public aaqp(axrc[] axrcVarArr, alxr alxrVar, aaqt aaqtVar, aaqi aaqiVar, dnor dnorVar, boolean z) {
        this.a = axrcVarArr;
        this.b = alxrVar;
        this.c = aaqtVar;
        this.d = aaqiVar;
        this.e = dnorVar;
        this.f = z;
    }

    @Override // defpackage.ffix
    public final aaqe invoke() {
        dmcg dmcgVar;
        dmcg a;
        axrc[] axrcVarArr = this.a;
        int length = axrcVarArr.length;
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (i2 >= length) {
                break;
            }
            axrc axrcVar = axrcVarArr[i2];
            if (axrcVar != null) {
                obj = axrcVar.b();
            }
            arrayList.add(obj);
            i2++;
        }
        dnoq[] dnoqVarArr = (dnoq[]) arrayList.toArray(new dnoq[0]);
        MessageId b = this.b.b();
        List J = ffdo.J(dnoqVarArr);
        ArrayList arrayList2 = new ArrayList(ffdx.n(J, 10));
        for (Object obj2 : J) {
            int i3 = i + 1;
            if (i < 0) {
                ffdx.l();
            }
            dnoq dnoqVar = (dnoq) obj2;
            String a2 = b.a();
            a2.getClass();
            if (i == J.size() - 1) {
                a = this.c.c.a(this.b, new dmci(null), null);
                dmcgVar = a;
            } else {
                dmcgVar = null;
            }
            dmzz dmzzVar = this.b.v() ? dmzz.bZ : dmzz.ca;
            aaqi aaqiVar = this.d;
            List b2 = ffdx.b(dmzzVar);
            dnry a3 = aaqj.a(aaqiVar.a, i, J.size());
            Object b3 = this.c.d.b();
            b3.getClass();
            boolean booleanValue = ((Boolean) b3).booleanValue();
            aaqt aaqtVar = this.c;
            arrayList2.add(new zsn(new dnsh(a2, b2, this.e, a3, dmcgVar, new dnsg(booleanValue, aaqtVar.f.a(), aaqtVar.g.a(), aaqtVar.h.a(), 15), 1610579868), dnoqVar, this.b, this.f));
            i = i3;
        }
        return new aaqe(arrayList2, b, zsr.a(this.b));
    }
}
