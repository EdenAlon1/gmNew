package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class cowd implements covx, cskg {
    public static final /* synthetic */ int a = 0;
    private static final cskc b = cskc.g("Bugle", "MmsSmsThreadIdResolverMessagingIdentityImpl");
    private static final entd c = entd.c("Bugle");
    private static final enip d = enip.r("ʼUNKNOWN_SENDER!ʼ", "ʼWAP_PUSH_SI!ʼ");
    private final Context e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final Map i = new HashMap();

    public cowd(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.e = context;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
    }

    private static boolean c(Collection collection, Collection collection2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aoku aokuVar = (aoku) it.next();
            Iterator it2 = collection2.iterator();
            while (it2.hasNext()) {
                if (aokuVar.equals((aoku) it2.next())) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.covx
    public final long a(aoku aokuVar) {
        csix.h();
        if (!aokuVar.x()) {
            return b(engw.r(aokuVar));
        }
        ensz enszVar = (ensz) c.i();
        enszVar.aa(ensy.FULL);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverMessagingIdentityImpl", "safeResolveFromRecipient", 140, "MmsSmsThreadIdResolverMessagingIdentityImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromRecipient returned invalid thread id because parameter was a null recipient");
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0193 A[SYNTHETIC] */
    @Override // defpackage.covx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(java.util.Collection r14) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cowd.b(java.util.Collection):long");
    }

    @Override // defpackage.cskg
    public final void l(int i) {
        synchronized (this.i) {
            this.i.clear();
        }
    }
}
