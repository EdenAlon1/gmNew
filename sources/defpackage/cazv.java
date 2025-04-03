package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cazv implements bcyv {
    final /* synthetic */ ffxe a;

    public cazv(ffxe ffxeVar) {
        this.a = ffxeVar;
    }

    @Override // defpackage.bcyv
    public final void a(bcyw bcywVar) {
        ((enrr) cazx.a.i().h("com/google/android/apps/messaging/shared/datamodel/media/VCardCallbackFlow$get$1$1", "onPersonDataFailed", 28, "VCardCallbackFlow.kt")).q("Failed to parse vcard");
        this.a.b(null);
    }

    @Override // defpackage.bcyv
    public final void b(bcyw bcywVar) {
        ((enrr) cazx.a.e().h("com/google/android/apps/messaging/shared/datamodel/media/VCardCallbackFlow$get$1$1", "onPersonDataUpdated", 23, "VCardCallbackFlow.kt")).q("Parsed vcard successfully");
        this.a.b(new cazy(bcywVar.m(), bcywVar.d()));
    }
}
