package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmrg {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(cmre cmreVar, cmri cmriVar) {
        for (int i = 0; i < ((cmrf) cmreVar.instance).b.size(); i++) {
            cmro a = cmreVar.a(i);
            for (int i2 = 0; i2 < a.d.size(); i2++) {
                cmri cmriVar2 = ((cmrs) a.d.get(i2)).c;
                if (cmriVar2 == null) {
                    cmriVar2 = cmri.a;
                }
                if (cmriVar.equals(cmriVar2)) {
                    if (a.d.size() == 1) {
                        cmreVar.c(i);
                        return;
                    }
                    cmrn cmrnVar = (cmrn) a.toBuilder();
                    cmrnVar.copyOnWrite();
                    cmro cmroVar = (cmro) cmrnVar.instance;
                    cmroVar.a();
                    cmroVar.d.remove(i2);
                    cmreVar.d(i, cmrnVar);
                    return;
                }
            }
        }
    }
}
