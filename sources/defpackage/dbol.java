package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbol extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;

    public dbol(ffgu ffguVar) {
        super(4, ffguVar);
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        dbol dbolVar = new dbol((ffgu) obj4);
        dbolVar.a = (List) obj;
        dbolVar.b = (List) obj2;
        dbolVar.c = (List) obj3;
        return dbolVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return new dboj(this.b, this.a, this.c);
    }
}
