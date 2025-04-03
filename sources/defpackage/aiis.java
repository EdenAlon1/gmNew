package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aiis implements adf {
    final /* synthetic */ ffkx a;
    final /* synthetic */ ffrf b;
    final /* synthetic */ fflb c;

    public aiis(ffkx ffkxVar, ffrf ffrfVar, fflb fflbVar) {
        this.a = ffkxVar;
        this.b = ffrfVar;
        this.c = fflbVar;
    }

    @Override // defpackage.adf
    public final void a(Object obj) {
        ((enrr) aiiu.a.e().h("com/google/android/apps/messaging/navigation/targets/ActivityResultLauncher$launch$2$1", "onActivityResult", 43, "ActivityResultLauncher.kt")).t("Activity result callback invoked. %s", obj);
        this.a.a = true;
        this.b.w(obj);
        adg adgVar = (adg) this.c.a;
        if (adgVar != null) {
            adgVar.b();
        }
    }
}
