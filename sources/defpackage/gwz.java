package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gwz extends ffkk implements ffji {
    public static final gwz a = new gwz();

    public gwz() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        obj2.getClass();
        int intValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        obj3.getClass();
        return new gxa(intValue, ((Float) obj3).floatValue(), new gwy(list));
    }
}
