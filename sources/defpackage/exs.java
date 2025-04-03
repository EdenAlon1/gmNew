package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exs extends ffkk implements ffji {
    public static final exs a = new exs();

    public exs() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jou jouVar;
        jlk jlkVar = (jlk) obj;
        Object obj2 = jlkVar.a;
        if (obj2 instanceof jlw) {
            obj2.getClass();
            jlw jlwVar = (jlw) obj2;
            if (!eyi.a(jlwVar.a())) {
                jlk[] jlkVarArr = new jlk[2];
                jlkVarArr[0] = jlkVar;
                obj2.getClass();
                jph a2 = jlwVar.a();
                if (a2 == null || (jouVar = a2.a) == null) {
                    jouVar = new jou(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                }
                jlkVarArr[1] = new jlk(jouVar, jlkVar.b, jlkVar.c);
                return ffdx.f(jlkVarArr);
            }
        }
        return ffdx.f(jlkVar);
    }
}
