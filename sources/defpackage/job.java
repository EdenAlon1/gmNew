package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class job extends ffkk implements ffji {
    public static final job a = new job();

    public job() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        long j = kak.a;
        jnn jnnVar = jom.v;
        ffkj.e(obj2, false);
        kak kakVar = obj2 != null ? (kak) jnnVar.a(obj2) : null;
        kakVar.getClass();
        Object obj3 = list.get(1);
        jnn jnnVar2 = jom.v;
        ffkj.e(obj3, false);
        kak kakVar2 = obj3 != null ? (kak) jnnVar2.a(obj3) : null;
        kakVar2.getClass();
        return new jyt(kakVar.b, kakVar2.b);
    }
}
