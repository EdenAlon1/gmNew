package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czgn {
    private static volatile czgn a;

    public static czdq a(fr frVar) {
        czdq czdqVar = (czdq) frVar.h("emojiGallery");
        if (czdqVar != null) {
            czdqVar.a();
        }
        return czdqVar;
    }

    public static void b() {
        if (a == null) {
            synchronized (czgn.class) {
                if (a == null) {
                    a = new czgn();
                }
            }
        }
    }
}
