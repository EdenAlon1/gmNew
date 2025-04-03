package defpackage;

import android.content.Context;
import android.telephony.ims.ImsException;
import android.telephony.ims.RcsContactUceCapability;
import android.telephony.ims.RcsUceAdapter;
import j$.time.Instant;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diih implements diij {
    static final diyy a = diyv.b("log_uce_callback_timeout");
    public final ernh b;
    public volatile Instant c;
    public final diid d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final dkwv h;
    public final dkhz i;
    private final Context k;
    private final errl l;
    private final diyy j = dizd.a(189930238);
    private final Random m = new Random();

    public diih(Context context, errl errlVar, diid diidVar, ernh ernhVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, dkwv dkwvVar, dkhz dkhzVar) {
        this.k = context;
        this.l = errlVar;
        this.b = ernhVar;
        this.c = ernhVar.a();
        this.d = diidVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = dkwvVar;
        this.i = dkhzVar;
    }

    public static boolean c(RcsContactUceCapability rcsContactUceCapability) {
        return rcsContactUceCapability.getCapabilityMechanism() == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0122  */
    /* JADX WARN: Type inference failed for: r12v0, types: [int] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v3, types: [diih] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    @Override // defpackage.diij
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.Optional a(int r12, android.net.Uri r13) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.diih.a(int, android.net.Uri):j$.util.Optional");
    }

    public final /* synthetic */ Object b(long j, RcsUceAdapter rcsUceAdapter, List list, kfb kfbVar) {
        try {
            this.d.b(j, 2);
            rcsUceAdapter.requestCapabilities(list, this.l, new diig(this, j, kfbVar));
            return "SingleRegistrationUceProvider.getCapabilities";
        } catch (ImsException | SecurityException e) {
            kfbVar.c(new diii(e));
            return "SingleRegistrationUceProvider.getCapabilities";
        }
    }
}
