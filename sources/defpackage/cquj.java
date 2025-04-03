package defpackage;

import org.chromium.net.CallbackException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cquj {
    public static eqob a(CronetException cronetException) {
        if (!(cronetException instanceof NetworkException)) {
            if (cronetException instanceof CallbackException) {
                eqnv eqnvVar = (eqnv) eqob.a.createBuilder();
                eqnvVar.copyOnWrite();
                eqob eqobVar = (eqob) eqnvVar.instance;
                eqobVar.d = 3;
                eqobVar.b |= 4;
                return (eqob) eqnvVar.build();
            }
            if (cronetException instanceof fihr) {
                eqnv eqnvVar2 = (eqnv) eqob.a.createBuilder();
                eqnvVar2.copyOnWrite();
                eqob eqobVar2 = (eqob) eqnvVar2.instance;
                eqobVar2.d = 4;
                eqobVar2.b |= 4;
                return (eqob) eqnvVar2.build();
            }
            eqnv eqnvVar3 = (eqnv) eqob.a.createBuilder();
            eqnvVar3.copyOnWrite();
            eqob eqobVar3 = (eqob) eqnvVar3.instance;
            eqobVar3.d = 0;
            eqobVar3.b |= 4;
            return (eqob) eqnvVar3.build();
        }
        eqnw eqnwVar = (eqnw) eqnz.a.createBuilder();
        NetworkException networkException = (NetworkException) cronetException;
        long cronetInternalErrorCode = networkException.getCronetInternalErrorCode();
        eqnwVar.copyOnWrite();
        eqnz eqnzVar = (eqnz) eqnwVar.instance;
        eqnzVar.b |= 2;
        eqnzVar.d = cronetInternalErrorCode;
        long errorCode = networkException.getErrorCode();
        eqnwVar.copyOnWrite();
        eqnz eqnzVar2 = (eqnz) eqnwVar.instance;
        eqnzVar2.b |= 1;
        eqnzVar2.c = errorCode;
        boolean z = cronetException instanceof QuicException;
        if (z) {
            eqnx eqnxVar = (eqnx) eqny.a.createBuilder();
            long quicDetailedErrorCode = ((QuicException) cronetException).getQuicDetailedErrorCode();
            eqnxVar.copyOnWrite();
            eqny eqnyVar = (eqny) eqnxVar.instance;
            eqnyVar.b |= 1;
            eqnyVar.c = quicDetailedErrorCode;
            eqnwVar.copyOnWrite();
            eqnz eqnzVar3 = (eqnz) eqnwVar.instance;
            eqny eqnyVar2 = (eqny) eqnxVar.build();
            eqnyVar2.getClass();
            eqnzVar3.e = eqnyVar2;
            eqnzVar3.b |= 4;
        }
        eqnv eqnvVar4 = (eqnv) eqob.a.createBuilder();
        int i = true == z ? 2 : 3;
        eqnvVar4.copyOnWrite();
        eqob eqobVar4 = (eqob) eqnvVar4.instance;
        eqobVar4.d = i - 1;
        eqobVar4.b |= 4;
        eqnvVar4.copyOnWrite();
        eqob eqobVar5 = (eqob) eqnvVar4.instance;
        eqnz eqnzVar4 = (eqnz) eqnwVar.build();
        eqnzVar4.getClass();
        eqobVar5.c = eqnzVar4;
        eqobVar5.b |= 1;
        return (eqob) eqnvVar4.build();
    }
}
