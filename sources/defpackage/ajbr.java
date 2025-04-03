package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajbr extends ffhv implements ffjp {
    int a;
    /* synthetic */ boolean b;
    /* synthetic */ boolean c;
    /* synthetic */ Object d;
    /* synthetic */ boolean e;
    final /* synthetic */ ajbx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajbr(ajbx ajbxVar, ffgu ffguVar) {
        super(5, ffguVar);
        this.f = ajbxVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        List<aixs> list;
        boolean z4;
        boolean z5;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            z3 = this.e;
            z2 = this.c;
            z = this.b;
            list = (List) this.d;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            z = this.b;
            z2 = this.c;
            aixr aixrVar = (aixr) this.d;
            boolean z6 = this.e;
            List list2 = aixrVar != null ? aixrVar.b : null;
            ajbx ajbxVar = this.f;
            this.d = list2;
            this.a = 1;
            Object c = ajbxVar.f.c(this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
            z3 = z6;
            list = list2;
            obj = c;
        }
        boolean z7 = z2;
        boolean z8 = z;
        boolean z9 = !((Boolean) obj).booleanValue();
        if (list != null && !list.isEmpty()) {
            for (aixs aixsVar : list) {
                if (aixsVar == aixs.c || aixsVar == aixs.d) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        if (list != null && !list.isEmpty()) {
            for (aixs aixsVar2 : list) {
                if (aixsVar2 == aixs.e || aixsVar2 == aixs.f) {
                    z5 = true;
                    break;
                }
            }
        }
        z5 = false;
        return new ajbc(z9, z4, z5, z8 && !z3, z7, z8);
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj4).booleanValue();
        ajbr ajbrVar = new ajbr(this.f, (ffgu) obj5);
        ajbrVar.b = booleanValue;
        ajbrVar.c = booleanValue2;
        ajbrVar.d = (aixr) obj3;
        ajbrVar.e = booleanValue3;
        return ajbrVar.b(ffcu.a);
    }
}
