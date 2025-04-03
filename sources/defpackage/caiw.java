package defpackage;

import com.google.communication.synapse.security.scytale.DecryptState;

/* compiled from: PG */
/* loaded from: classes7.dex */
abstract class caiw extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        caje cajeVar = (caje) obj;
        DecryptState decryptState = DecryptState.UNTRUSTED_IDENTITY_KEY;
        int ordinal = cajeVar.ordinal();
        if (ordinal == 0) {
            return c();
        }
        if (ordinal == 1) {
            return DecryptState.UNTRUSTED_IDENTITY_KEY;
        }
        if (ordinal == 2) {
            return DecryptState.UNTRUSTED_USER_ID;
        }
        if (ordinal == 3) {
            return DecryptState.FAIL_TO_DECRYPT;
        }
        if (ordinal == 4) {
            return DecryptState.SUCCESS;
        }
        if (ordinal == 5) {
            return d();
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(cajeVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        DecryptState decryptState = (DecryptState) obj;
        int ordinal = decryptState.ordinal();
        if (ordinal == 0) {
            return caje.UNTRUSTED_IDENTITY_KEY;
        }
        if (ordinal == 1) {
            return caje.UNTRUSTED_USER_ID;
        }
        if (ordinal == 2) {
            return caje.FAIL_TO_DECRYPT;
        }
        if (ordinal == 3) {
            return caje.DECRYPT_SUCCESS;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(decryptState.toString()));
    }

    public abstract DecryptState c();

    public abstract DecryptState d();
}
