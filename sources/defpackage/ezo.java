package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezo extends ffkk implements ffji {
    final /* synthetic */ ezv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezo(ezv ezvVar) {
        super(1);
        this.a = ezvVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ffcu ffcuVar;
        jlm jlmVar = (jlm) obj;
        ezv ezvVar = this.a;
        if (!ezvVar.d) {
            return false;
        }
        jwj jwjVar = ezvVar.c.c;
        if (jwjVar != null) {
            List g = ffdx.g(new juq(), new juc(jlmVar, 1));
            eva evaVar = ezvVar.c;
            ewe.b(g, evaVar.b, evaVar.p, jwjVar);
            ffcuVar = ffcu.a;
        } else {
            ffcuVar = null;
        }
        if (ffcuVar == null) {
            ezv ezvVar2 = this.a;
            String obj2 = ffpc.w(ezvVar2.b.a(), jpm.e(ezvVar2.b.c), jpm.a(ezvVar2.b.c), jlmVar).toString();
            int e = jpm.e(ezvVar2.b.c) + jlmVar.a();
            ezvVar2.c.p.invoke(new jvu(obj2, jpn.a(e, e), 4));
        }
        return true;
    }
}
