package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djeq {
    public static final diyy a = diyv.b("is_composing_without_cpim_wrapper");
    static final diyy b = diyv.b("enable_instant_messaging_service_exception");
    public static final dktn c = new dktn("SendMessageProducerModule");

    public static dkkq a(dkgw dkgwVar) {
        dkkq dkkqVar = (dkkq) dkgwVar.a(dkkq.class);
        if (dkkqVar != null) {
            return dkkqVar;
        }
        dkty.h(c, "InstantMessagingService is null.", new Object[0]);
        throw new djen();
    }
}
