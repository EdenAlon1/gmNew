package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hir {
    public static final void a(hit hitVar) {
        hpg hpgVar;
        hpg hpgVar2;
        do {
            hpgVar = (hpg) hjh.a.c();
            hpf hpfVar = (hpf) hpgVar.d.get(hitVar);
            if (hpfVar == null) {
                hpgVar2 = hpgVar;
            } else {
                hoh hohVar = hpgVar.d;
                hoy j = hohVar.b.j(hitVar != null ? hitVar.hashCode() : 0, hitVar, 0);
                if (hohVar.b != j) {
                    hohVar = j == null ? hoh.a : new hoh(j, hohVar.c() - 1);
                }
                if (hpfVar.c()) {
                    Object obj = hohVar.get(hpfVar.a);
                    obj.getClass();
                    hohVar = hohVar.d(hpfVar.a, ((hpf) obj).a(hpfVar.b));
                }
                if (hpfVar.b()) {
                    Object obj2 = hohVar.get(hpfVar.b);
                    obj2.getClass();
                    hohVar = hohVar.d(hpfVar.b, new hpf(hpfVar.a, ((hpf) obj2).b));
                }
                hpgVar2 = new hpg(!hpfVar.c() ? hpfVar.b : hpgVar.b, !hpfVar.b() ? hpfVar.a : hpgVar.c, hohVar);
            }
            if (hpgVar == hpgVar2) {
                return;
            }
        } while (!hjh.a.g(hpgVar, hpgVar2));
    }
}
