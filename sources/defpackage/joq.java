package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class joq extends ffkk implements ffji {
    public static final joq a = new joq();

    public joq() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Boolean bool = obj2 != null ? (Boolean) obj2 : null;
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        Object obj3 = list.get(1);
        (obj3 != null ? (jlt) obj3 : null).getClass();
        return new jmo(booleanValue);
    }
}
