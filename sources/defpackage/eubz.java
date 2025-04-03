package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eubz extends eueb {
    public final eucf a;
    public final eujv b;

    private eubz(eucf eucfVar, eujv eujvVar) {
        this.a = eucfVar;
        this.b = eujvVar;
    }

    public static eubz e(eucf eucfVar, eujv eujvVar) {
        if (eujvVar.a() == 32) {
            if (Arrays.equals(eucfVar.b.c(), etqy.j(etqy.i(eujvVar.d())))) {
                return new eubz(eucfVar, eujvVar);
            }
            throw new GeneralSecurityException("Ed25519 keys mismatch");
        }
        throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + eujvVar.a());
    }

    @Override // defpackage.eueb, defpackage.etgg
    public final /* synthetic */ etfs b() {
        return this.a;
    }

    public final euby c() {
        return this.a.a;
    }

    @Override // defpackage.eueb
    public final /* synthetic */ euec d() {
        return this.a;
    }
}
