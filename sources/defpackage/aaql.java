package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaql extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fflb c;
    final /* synthetic */ alxr d;
    final /* synthetic */ aaqt e;
    final /* synthetic */ aaqi f;
    final /* synthetic */ dnor g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaql(ffgu ffguVar, fflb fflbVar, alxr alxrVar, aaqt aaqtVar, aaqi aaqiVar, dnor dnorVar) {
        super(3, ffguVar);
        this.c = fflbVar;
        this.d = alxrVar;
        this.e = aaqtVar;
        this.f = aaqiVar;
        this.g = dnorVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aaql aaqlVar = new aaql((ffgu) obj3, this.c, this.d, this.e, this.f, this.g);
        aaqlVar.h = (ffxy) obj;
        aaqlVar.b = obj2;
        return aaqlVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxx axqdVar;
        dmcg dmcgVar;
        dmcg a;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r2 = this.h;
            boolean booleanValue = ((Boolean) this.b).booleanValue();
            Object[] objArr = (Object[]) this.c.a;
            axrc[] axrcVarArr = (axrc[]) Arrays.copyOf(objArr, objArr.length);
            int length = axrcVarArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    axqdVar = new axqd(new aaqp(axrcVarArr, this.d, this.e, this.f, this.g, booleanValue));
                    break;
                }
                axrc axrcVar = axrcVarArr[i3];
                if (axrcVar == null || (axrcVar instanceof axqd)) {
                    i3++;
                    booleanValue = booleanValue;
                } else {
                    axrc[] axrcVarArr2 = (axrc[]) ffdo.J(axrcVarArr).toArray(new axrc[0]);
                    boolean z = booleanValue;
                    aaqs aaqsVar = new aaqs((ffxx[]) Arrays.copyOf(axrcVarArr2, axrcVarArr2.length), axrcVarArr, this.d, this.e, this.f, this.g, z);
                    int length2 = axrcVarArr.length;
                    ArrayList arrayList = new ArrayList(length2);
                    for (int i4 = 0; i4 < length2; i4++) {
                        axrc axrcVar2 = axrcVarArr[i4];
                        arrayList.add(axrcVar2 != null ? axrcVar2.b() : null);
                    }
                    dnoq[] dnoqVarArr = (dnoq[]) arrayList.toArray(new dnoq[0]);
                    MessageId b = this.d.b();
                    List J = ffdo.J(dnoqVarArr);
                    ArrayList arrayList2 = new ArrayList(ffdx.n(J, 10));
                    for (Object obj2 : J) {
                        int i5 = i2 + 1;
                        if (i2 < 0) {
                            ffdx.l();
                        }
                        dnoq dnoqVar = (dnoq) obj2;
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
                        boolean booleanValue2 = ((Boolean) b3).booleanValue();
                        aaqt aaqtVar = this.e;
                        arrayList2.add(new zsn(new dnsh(a2, b2, this.g, a3, dmcgVar, new dnsg(booleanValue2, aaqtVar.f.a(), aaqtVar.g.a(), aaqtVar.h.a(), 15), 1610579868), dnoqVar, this.d, z));
                        i2 = i5;
                    }
                    axqdVar = axrg.b(aaqsVar, new aaqe(arrayList2, b, zsr.a(this.d)));
                }
            }
            this.a = 1;
            if (ffyk.c(r2, axqdVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
