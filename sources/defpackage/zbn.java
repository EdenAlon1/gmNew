package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zbn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ zbo b;
    final /* synthetic */ zch c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbn(zbo zboVar, zch zchVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = zboVar;
        this.c = zchVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zbn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            zbo zboVar = this.b;
            zch zchVar = this.c;
            this.a = 1;
            enrr enrrVar = (enrr) zcb.a.h().h("com/google/android/apps/messaging/conversation2/customthemes/SelectedThemeTracker", "updateSelectedTheme$third_party_java_src_android_app_bugle_phone_java_com_google_android_apps_messaging_conversation2_customthemes_theme_tracker_AUTO_DEPS_ORIGINAL", 119, "SelectedThemeTracker.kt");
            Integer num = zchVar != null ? new Integer(zchVar.a) : null;
            zcb zcbVar = zboVar.b;
            enrrVar.t("Update selected theme to theme id: %s", num);
            elfl q = zcbVar.c.q(zcbVar.b, new zca(zchVar, zcbVar));
            q.getClass();
            Object c = fgfz.c(q, this);
            if (c != ffhh.a) {
                c = ffcu.a;
            }
            if (c == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zbn(this.b, this.c, ffguVar);
    }
}
