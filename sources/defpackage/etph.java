package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etph {
    public static final byte[] a = new byte[0];

    public static etpg a(etnt etntVar) {
        etgf etgfVar = etntVar.f;
        if (etgfVar instanceof ethw) {
            return new etpe((ethw) etgfVar);
        }
        if (etgfVar instanceof ethf) {
            return new etpd((ethf) etgfVar);
        }
        if (etgfVar instanceof etmt) {
            return new etpf((etmt) etgfVar);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: ".concat(String.valueOf(String.valueOf(etgfVar))));
    }
}
