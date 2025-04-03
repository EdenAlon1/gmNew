package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exj extends ffkk implements ffji {
    public static final exj a = new exj();

    public exj() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(1);
        obj2.getClass();
        dqs dqsVar = ((Boolean) obj2).booleanValue() ? dqs.a : dqs.b;
        Object obj3 = list.get(0);
        obj3.getClass();
        return new exk(dqsVar, ((Float) obj3).floatValue());
    }
}
