package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdrs {
    public static final String a(String str, String str2, csgh csghVar, boolean z) {
        str.getClass();
        str2.getClass();
        csghVar.getClass();
        if (!ersy.a("bugle.enable_foreground_service_for_media_backup", "bugle")) {
            return str + "_" + str2 + "_" + csghVar.c();
        }
        String str3 = true != z ? "BACKGROUND" : "FOREGROUND";
        return str + "_" + str2 + "_" + csghVar.c() + "_" + str3;
    }
}
