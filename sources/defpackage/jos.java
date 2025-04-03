package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jos extends ffkk implements ffji {
    public static final jos a = new jos();

    public jos() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        jyu jyuVar = obj2 != null ? (jyu) obj2 : null;
        jyuVar.getClass();
        Object obj3 = list.get(1);
        Boolean bool = obj3 != null ? (Boolean) obj3 : null;
        bool.getClass();
        return new jyv(jyuVar.a, bool.booleanValue());
    }
}
