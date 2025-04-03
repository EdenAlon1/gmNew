package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edfg {
    private static volatile febs a;
    private static volatile fedg b;

    private edfg() {
    }

    public static febs a() {
        febs febsVar;
        febs febsVar2 = a;
        if (febsVar2 != null) {
            return febsVar2;
        }
        synchronized (edfg.class) {
            febsVar = a;
            if (febsVar == null) {
                febp a2 = febs.a();
                a2.c = febr.UNARY;
                a2.d = febs.c("com.google.android.libraries.photos.share.apiservice.proto.PhotosMediaShareClientCallback", "LinkSharedAlbumStatusUpdate");
                a2.b();
                edes edesVar = edes.a;
                eyfc eyfcVar = ffag.a;
                a2.a = new ffae(edesVar);
                a2.b = new ffae(eddz.a);
                febsVar = a2.a();
                a = febsVar;
            }
        }
        return febsVar;
    }

    public static fedg b() {
        fedg fedgVar;
        fedg fedgVar2 = b;
        if (fedgVar2 != null) {
            return fedgVar2;
        }
        synchronized (edfg.class) {
            fedgVar = b;
            if (fedgVar == null) {
                fedf fedfVar = new fedf("com.google.android.libraries.photos.share.apiservice.proto.PhotosMediaShareClientCallback");
                fedfVar.a(a());
                fedgVar = new fedg(fedfVar);
                b = fedgVar;
            }
        }
        return fedgVar;
    }
}
