package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jng extends ffkk implements ffji {
    public static final jng a = new jng();

    public jng() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        jye jyeVar = obj2 != null ? (jye) obj2 : null;
        jyeVar.getClass();
        Object obj3 = list.get(1);
        jyg jygVar = obj3 != null ? (jyg) obj3 : null;
        jygVar.getClass();
        Object obj4 = list.get(2);
        jyf jyfVar = obj4 != null ? (jyf) obj4 : null;
        jyfVar.getClass();
        return new jyh(jyeVar.c, jygVar.a, jyfVar.a);
    }
}
