package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aalk extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dobs c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aalk(ffgu ffguVar, dobs dobsVar) {
        super(3, ffguVar);
        this.c = dobsVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aalk aalkVar = new aalk((ffgu) obj3, this.c);
        aalkVar.d = (ffxy) obj;
        aalkVar.b = (Object[]) obj2;
        return aalkVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r12 = this.d;
            dodz[] dodzVarArr = (dodz[]) this.b;
            dobs dobsVar = this.c;
            ArrayList arrayList = new ArrayList(dodzVarArr.length);
            for (dodz dodzVar : dodzVarArr) {
                dodzVar.getClass();
                arrayList.add((dody) dodzVar);
            }
            dobs dobsVar2 = new dobs(arrayList, dobsVar.g, dobsVar.b, dobsVar.c, dobsVar.d, dobsVar.e, dobsVar.f);
            this.a = 1;
            if (r12.fQ(dobsVar2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
