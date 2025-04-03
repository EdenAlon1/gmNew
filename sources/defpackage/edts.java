package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edts {
    static edtx a() {
        try {
            byte[] bArr = edty.a;
            byte[] bArr2 = edty.c;
            etol.a();
            return new edtx((etfr) etga.d(bArr).f(etoq.a(), etfr.class), (etfr) etga.d(bArr2).f(etoq.a(), etfr.class));
        } catch (GeneralSecurityException e) {
            throw new AssertionError("Failed to create TinkEncrypter", e);
        }
    }
}
