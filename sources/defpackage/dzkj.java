package defpackage;

import java.security.KeyPair;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dzkj extends dzjp {
    @Override // defpackage.dzjp
    public KeyPair a() {
        throw new UnsupportedOperationException(b() != 1 ? "ECDSA" : "MISSING");
    }
}
