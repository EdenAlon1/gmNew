package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cibj implements cibn {
    private static final entd b = entd.c("BugleGroupManagement");
    static final emyl a = cfvl.x(213466833, "send_mms_group_upgrade_capability_during_tachyon_registration");

    @Override // defpackage.cibn
    public final elfl a(fcbq fcbqVar, aoku aokuVar, int i) {
        if (!((Boolean) ((cfup) a.get()).e()).booleanValue()) {
            ((ensz) b.n().h("com/google/android/apps/messaging/shared/net/handler/decorators/MmsGroupUpgradeDecorator", "decorate", 40, "MmsGroupUpgradeDecorator.java")).q("Not sending the MMS group upgrade capability during Tachyon registration. Feature is disabled by Phenotype.");
            return elfo.e(fcbqVar);
        }
        ((ensz) b.n().h("com/google/android/apps/messaging/shared/net/handler/decorators/MmsGroupUpgradeDecorator", "decorate", 49, "MmsGroupUpgradeDecorator.java")).q("Decorating Tachyon register data with the MMS group upgrade capability.");
        fcks fcksVar = ((fcbr) fcbqVar.instance).l;
        if (fcksVar == null) {
            fcksVar = fcks.a;
        }
        fckr fckrVar = (fckr) fcksVar.toBuilder();
        fckrVar.a(cgye.MMS_GROUP_UPGRADE_METRICS_COLLECTION.h);
        fcks fcksVar2 = (fcks) fckrVar.build();
        fcbqVar.copyOnWrite();
        fcbr fcbrVar = (fcbr) fcbqVar.instance;
        fcksVar2.getClass();
        fcbrVar.l = fcksVar2;
        fcbrVar.b |= 8;
        return elfo.e(fcbqVar);
    }
}
