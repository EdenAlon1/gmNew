package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etgm {
    public static etgf a(byte[] bArr) {
        try {
            eyfc eyfcVar = eyfc.a;
            eyib eyibVar = eyib.a;
            etzp etzpVar = (etzp) eyfy.parseFrom(etzp.a, bArr, eyfc.a);
            etsh etshVar = etsh.a;
            ette a = ette.a(etzpVar);
            return !((ettm) etshVar.b.get()).d.containsKey(new ettk(a.getClass(), a.a)) ? new etrs(a) : etshVar.b(a);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] b(etgf etgfVar) {
        return etgfVar instanceof etrs ? ((etrs) etgfVar).a.b.toByteArray() : ((ette) etsh.a.d(etgfVar, ette.class)).b.toByteArray();
    }
}
