package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jms extends ffkk implements ffji {
    public static final jms a = new jms();

    public jms() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(1);
        List list2 = (ffkj.e(obj2, false) || obj2 == null) ? null : (List) jom.b.a(obj2);
        Object obj3 = list.get(0);
        String str = obj3 != null ? (String) obj3 : null;
        str.getClass();
        return new jlm(list2, str);
    }
}
