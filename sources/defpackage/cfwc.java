package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfwc implements cfvu {
    public static final cskc a = cskc.g("Bugle", "BugleFirebaseInstanceIDManagerImpl");
    public static final entd b = entd.c("Bugle");
    public final Context c;
    public final ffbr d;
    public final ffbr e;
    private final errl f;

    public cfwc(Context context, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.c = context;
        this.f = errlVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
    }

    @Override // defpackage.cfvu
    public final elfl a() {
        return elfo.g(new Callable() { // from class: cfwa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                IOException e;
                String str;
                String str2;
                cfwc cfwcVar = cfwc.this;
                try {
                    String string = cfwcVar.c.getResources().getString(R.string.firebase_authorized_entity);
                    Optional a2 = adhj.a(string, "");
                    str = a2.isPresent() ? (String) a2.get() : null;
                } catch (IOException e2) {
                    e = e2;
                    str = null;
                }
                try {
                    cfwc.a.m("Received firebase instance token.");
                    return str;
                } catch (IOException e3) {
                    e = e3;
                    ((ensz) ((ensz) ((ensz) cfwc.b.j()).g(e)).h("com/google/android/apps/messaging/shared/fcm/impl/BugleFirebaseInstanceIDManagerImpl", "logFirebaseRefreshIIDError", 98, "BugleFirebaseInstanceIDManagerImpl.java")).t("Failed to refresh firebase instance ID %s", e.getCause());
                    int[] iArr = {1, 2, 3, 4, 5, 6};
                    int i = 0;
                    while (true) {
                        if (i < 6) {
                            int i2 = iArr[i];
                            String b2 = emxe.b(e.getMessage());
                            switch (i2) {
                                case 1:
                                    str2 = "UNKNOWN";
                                    break;
                                case 2:
                                    str2 = "SERVICE_NOT_AVAILABLE";
                                    break;
                                case 3:
                                    str2 = "INTERNAL_SERVER_ERROR";
                                    break;
                                case 4:
                                    str2 = "MISSING_INSTANCEID_SERVICE";
                                    break;
                                case 5:
                                    str2 = "TIMEOUT";
                                    break;
                                case 6:
                                    str2 = "MAIN_THREAD";
                                    break;
                                default:
                                    str2 = "null";
                                    break;
                            }
                            if (i2 == 0) {
                                throw null;
                            }
                            if (emuz.e(b2, str2)) {
                                ((akzt) cfwcVar.e.b()).e("Bugle.Fcm.Failure.IIDRefresh.Counts", cfwb.a(i2));
                            } else {
                                i++;
                            }
                        } else {
                            ((akzt) cfwcVar.e.b()).e("Bugle.Fcm.Failure.IIDRefresh.Counts", cfwb.a(1));
                        }
                    }
                    return str;
                }
            }
        }, this.f);
    }
}
