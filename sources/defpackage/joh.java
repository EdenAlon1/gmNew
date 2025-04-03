package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class joh extends ffkk implements ffji {
    public static final joh a = new joh();

    public joh() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (ffkj.e(obj, false)) {
            return new kak(kak.a);
        }
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f = obj2 != null ? (Float) obj2 : null;
        f.getClass();
        float floatValue = f.floatValue();
        Object obj3 = list.get(1);
        kam kamVar = obj3 != null ? (kam) obj3 : null;
        kamVar.getClass();
        return new kak(kal.d(kamVar.a, floatValue));
    }
}
