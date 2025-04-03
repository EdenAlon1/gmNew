package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jof extends ffkk implements ffji {
    public static final jof a = new jof();

    public jof() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Integer num = obj2 != null ? (Integer) obj2 : null;
        num.getClass();
        int intValue = num.intValue();
        Object obj3 = list.get(1);
        Integer num2 = obj3 != null ? (Integer) obj3 : null;
        num2.getClass();
        return new jpm(jpn.a(intValue, num2.intValue()));
    }
}
