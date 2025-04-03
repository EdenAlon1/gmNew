package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgc {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [hld, java.lang.Object] */
    public static final hqb a(hil[] hilVarArr, hqb hqbVar, hqb hqbVar2) {
        hqa hqaVar = new hqa(hqb.d);
        for (hil hilVar : hilVarArr) {
            hfw hfwVar = hilVar.a;
            if (hilVar.f || !hqbVar.containsKey(hfwVar)) {
                ?? r5 = hqbVar2.get(hfwVar);
                hilVar.getClass();
                hqaVar.put(hfwVar, ((hik) hfwVar).b(hilVar, r5));
            }
        }
        return hqaVar.a();
    }

    public static final Object b(hqb hqbVar, hfw hfwVar) {
        hfwVar.getClass();
        Object obj = hqbVar.get(hfwVar);
        if (obj == null) {
            obj = hfwVar.a();
        }
        return ((hld) obj).a(hqbVar);
    }
}
