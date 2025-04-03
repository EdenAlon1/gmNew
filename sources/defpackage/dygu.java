package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dygu {
    /* JADX WARN: Multi-variable type inference failed */
    public static eisq a(ewrq ewrqVar) {
        if (ewrqVar.b.isEmpty()) {
            return null;
        }
        return b((ewrw) ewrqVar.b.get(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static eisq b(ewrw ewrwVar) {
        eisi eisiVar = ewrwVar.c;
        if (eisiVar == null) {
            eisiVar = eisi.a;
        }
        eygr<eisq> eygrVar = eisiVar.h;
        if (eygrVar.isEmpty()) {
            return null;
        }
        for (eisq eisqVar : eygrVar) {
            if ((eisqVar.b & 1) != 0) {
                eisk eiskVar = eisqVar.c;
                if (eiskVar == null) {
                    eiskVar = eisk.a;
                }
                if (eiskVar.b) {
                    return eisqVar;
                }
            }
        }
        return (eisq) eygrVar.get(0);
    }
}
