package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etfv {
    public final etgf a;

    public etfv(etgf etgfVar) {
        this.a = etgfVar;
    }

    public final etzp a() {
        try {
            etgf etgfVar = this.a;
            return etgfVar instanceof etrs ? ((etrs) etgfVar).a.b : ((ette) etsh.a.d(this.a, ette.class)).b;
        } catch (GeneralSecurityException e) {
            throw new etto("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(String.valueOf(String.valueOf(this.a))), e);
        }
    }
}
