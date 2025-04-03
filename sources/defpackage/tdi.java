package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdi implements cigv {
    public static final enru a = enru.c("com/google/android/apps/messaging/cloudstore/cmsrpc/CmsRpcInboxMessageHandler");
    public final eisx b;
    public final ffbr c;
    public final axkm d;
    public final axmm e;
    public final chsb f;
    public final ffbr g;
    public final Map h;
    public final aslr i;
    private final ffsk j;

    public tdi(ffsk ffskVar, eisx eisxVar, ffbr ffbrVar, axkm axkmVar, axmm axmmVar, chsb chsbVar, ffbr ffbrVar2, Map map, aslr aslrVar) {
        ffskVar.getClass();
        eisxVar.getClass();
        ffbrVar.getClass();
        axkmVar.getClass();
        axmmVar.getClass();
        ffbrVar2.getClass();
        aslrVar.getClass();
        this.j = ffskVar;
        this.b = eisxVar;
        this.c = ffbrVar;
        this.d = axkmVar;
        this.e = axmmVar;
        this.f = chsbVar;
        this.g = ffbrVar2;
        this.h = map;
        this.i = aslrVar;
        Iterator<E> it = ((enhk) map).keySet().iterator();
        while (it.hasNext()) {
            ((enrr) a.e().h("com/google/android/apps/messaging/cloudstore/cmsrpc/CmsRpcInboxMessageHandler", "<init>", 45, "CmsRpcInboxMessageHandler.kt")).t("Registered CmsRpcPayloadDelegate for %s ", ((eskq) it.next()).name());
        }
    }

    public static final String b(fbzt fbztVar) {
        fbzs b = fbzs.b(fbztVar.d);
        if (b == null) {
            b = fbzs.UNRECOGNIZED;
        }
        String format = String.format("messageType: %s, messageId: %s", Arrays.copyOf(new Object[]{b.name(), fbztVar.c}, 2));
        format.getClass();
        return format;
    }

    @Override // defpackage.cigv
    public final elfl a(fbzt fbztVar) {
        elfl c;
        fbztVar.getClass();
        c = axol.c(this.j, ffhe.a, ffsm.a, new tdh(this, fbztVar, null));
        return c;
    }
}
