package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class duha {
    public static boolean a(duhb duhbVar, emxc emxcVar, eypl eyplVar) {
        String name;
        try {
            for (eypk eypkVar : eyplVar.b) {
                int i = eypkVar.b;
                if ((i & 8) != 0) {
                    if ((i & 1) == 0 && (i & 64) == 0) {
                    }
                    if ((i & 2) != 0) {
                        ezie ezieVar = eypkVar.g;
                        if (ezieVar == null) {
                            ezieVar = ezie.a;
                        }
                        byte[] byteArray = ezieVar.toByteArray();
                        if ((eypkVar.b & 64) != 0) {
                            name = eypkVar.j;
                        } else {
                            ezib b = ezib.b(eypkVar.c);
                            if (b == null) {
                                b = ezib.UNKNOWN;
                            }
                            name = b.name();
                        }
                        duhb duhbVar2 = duhbVar;
                        emxc emxcVar2 = emxcVar;
                        if (!duhbVar2.g(emxcVar2, name, (String[]) duhf.c(eypkVar.d).toArray(new String[0]), eypkVar.e, eypkVar.f, byteArray)) {
                            return false;
                        }
                        duhbVar = duhbVar2;
                        emxcVar = emxcVar2;
                    }
                }
                return false;
            }
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }
}
