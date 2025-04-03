package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jna extends ffkk implements ffji {
    public static final jna a = new jna();

    public jna() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        jph jphVar = null;
        String str = obj2 != null ? (String) obj2 : null;
        str.getClass();
        Object obj3 = list.get(1);
        hrh hrhVar = jom.j;
        if (!ffkj.e(obj3, false) && obj3 != null) {
            jphVar = (jph) hrhVar.a(obj3);
        }
        return new jlu(str, jphVar);
    }
}
