package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dtuy {
    public static void a(dtve dtveVar, String str, Runnable runnable) {
        dtveVar.Y(str, runnable, dtuz.NO_TXN);
    }

    @Deprecated
    public static boolean b(dtve dtveVar) {
        return ((cauy) dtveVar).k().inTransaction();
    }
}
