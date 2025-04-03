package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvur extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ cvuw c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvur(ffgu ffguVar, cvuw cvuwVar) {
        super(3, ffguVar);
        this.c = cvuwVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cvur cvurVar = new cvur((ffgu) obj3, this.c);
        cvurVar.d = (ffxy) obj;
        cvurVar.b = (Object[]) obj2;
        return cvurVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r15 = this.d;
            Object[] objArr = (Object[]) this.b;
            Object obj2 = objArr[0];
            obj2.getClass();
            engw<amas> engwVar = (engw) obj2;
            Object obj3 = objArr[1];
            obj3.getClass();
            int i2 = 2;
            Object obj4 = objArr[2];
            obj4.getClass();
            cvvz cvvzVar = (cvvz) obj4;
            cvvl cvvlVar = (cvvl) objArr[3];
            Object obj5 = objArr[4];
            obj5.getClass();
            List list = (List) obj5;
            Object obj6 = objArr[5];
            obj6.getClass();
            cvxm cvxmVar = (cvxm) objArr[6];
            boolean isEmpty = ((cvyk) obj3).a.b.isEmpty();
            boolean z = ((cwir) obj6).d == cwjb.a && cvxmVar == null;
            boolean z2 = cvvzVar.a;
            boolean isEmpty2 = list.isEmpty();
            engr engrVar = new engr();
            engrVar.h(new amas("", 0, 1));
            if (z) {
                engrVar.h(new amas("", 1, 1));
            } else {
                i2 = 1;
            }
            if (z2) {
                engrVar.h(new amas("", i2, 1));
                i2++;
            }
            if (!isEmpty) {
                engrVar.h(new amas("★", i2, 1));
                i2++;
            }
            if (!isEmpty2) {
                engrVar.h(new amas("", i2, list.size()));
                i2 += list.size();
            }
            if (cvvlVar != null) {
                engrVar.h(new amas("", i2, 1));
            }
            engw g = engrVar.g();
            g.getClass();
            if (!g.isEmpty()) {
                int i3 = ((enou) g).c;
                engr engrVar2 = new engr();
                engrVar2.j(g);
                for (amas amasVar : engwVar) {
                    engrVar2.h(new amas(amasVar.a, amasVar.b + i3, amasVar.c));
                }
                engwVar = engrVar2.g();
                engwVar.getClass();
            }
            cvux cvuxVar = new cvux(engwVar);
            this.a = 1;
            if (r15.fQ(cvuxVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
