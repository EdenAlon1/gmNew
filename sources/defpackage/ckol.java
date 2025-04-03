package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckol implements clwr {
    private static final entd a = entd.c("BugleGroupManagement");
    private final ckok b;

    public ckol(ckok ckokVar) {
        this.b = ckokVar;
    }

    @Override // defpackage.clwr
    public final void a() {
        if (!((Boolean) ((cfup) ckoh.b.get()).e()).booleanValue()) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationScheduler", "onRcsReady", 39, "RcsGroupIdentifiersTelephonyMigrationScheduler.java")).q("Skipping RCS group identifiers telephony batch migration. Disabled by phenotype.");
            return;
        }
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/rcs/groups/datamigration/RcsGroupIdentifiersTelephonyMigrationScheduler", "onRcsReady", 44, "RcsGroupIdentifiersTelephonyMigrationScheduler.java")).q("Scheduling RCS group identifiers telephony batch migration.");
        ((cevh) this.b.a.b()).g(ceyr.g("rcs_group_identifiers_telephony_migration", ckoj.a));
    }
}
