package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbtb implements axkz {
    private static final entd a = entd.c("BugleSearch");
    private final ffbr b;

    public cbtb(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    @Override // defpackage.axkz
    public final void a() {
        ensz enszVar = (ensz) a.h();
        enszVar.Y(cbrm.g, "IcingFiSettingsDataListener");
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/search/worker/IcingFiSettingsDataListener", "onRestoreComplete", 40, "IcingFiSettingsDataListener.java")).q("Queues icing index rebuild work item.");
        ((cbto) this.b.b()).a();
    }
}
