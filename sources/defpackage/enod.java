package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enod {
    static boolean a(enny ennyVar, Object obj) {
        if (obj == ennyVar) {
            return true;
        }
        if (obj instanceof enny) {
            enny ennyVar2 = (enny) obj;
            if (ennyVar.size() == ennyVar2.size() && ennyVar.j().size() == ennyVar2.j().size()) {
                for (ennx ennxVar : ennyVar2.j()) {
                    if (ennyVar.b(ennxVar.b()) != ennxVar.a()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
