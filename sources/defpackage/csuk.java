package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csuk {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/file/FileSizeUtils");
    private final ctyx b;
    private final cpbs c;
    private final Optional d;
    private final ffbr e;

    public csuk(ctyx ctyxVar, cpbs cpbsVar, Optional optional, ffbr ffbrVar) {
        this.b = ctyxVar;
        this.c = cpbsVar;
        this.d = optional;
        this.e = ffbrVar;
    }

    public static int c(djtp djtpVar) {
        int i = djtpVar.o().mMaxSizeFileTransfer;
        if (i == 0) {
            return 104857600;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [djry, java.lang.Object] */
    private final Optional g(int i) {
        Optional l = this.d.get().l(i);
        if (l.isEmpty()) {
            ensk j = a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/file/FileSizeUtils", "getConfiguration", 153, "FileSizeUtils.java")).r("No RCS configuration found for subId: %s", i);
        }
        return l;
    }

    public final int a(int i, boolean z) {
        return z ? b(i) : this.c.a(i).d();
    }

    public final int b(int i) {
        if (i < 0) {
            ensk j = a.j();
            j.Y(ente.a, "Bugle");
            enrr enrrVar = (enrr) j;
            enrrVar.aa(ensy.MEDIUM);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/file/FileSizeUtils", "getMaxRcsFileSize", 112, "FileSizeUtils.java")).r("#getMaxRcsFileSize: subId = %s", i);
        }
        return ((Integer) g(i).map(new Function() { // from class: csui
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(csuk.c((djtp) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(104857600)).intValue();
    }

    public final int d(Context context) {
        ctyx ctyxVar = this.b;
        String string = context.getString(R.string.rcs_mobile_data_auto_download_limit_pref_key);
        String string2 = context.getString(R.string.rcs_mobile_data_auto_download_limit_default_entry);
        String f = ctyxVar.f(string, string2);
        if (string2.equals(f) && !f()) {
            return -1;
        }
        int e = e();
        if (!dksg.b(context) && !string2.equals(f)) {
            try {
                return Integer.parseInt(f);
            } catch (NumberFormatException e2) {
                csjy.p("Bugle", e2, "Unable to parse auto downloadable file size from: ".concat(String.valueOf(f)));
            }
        }
        return e;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [djry, java.lang.Object] */
    public final int e() {
        int b = ((ctwb) this.e.b()).b();
        Optional l = this.d.get().l(b);
        if (l.isEmpty()) {
            ensk j = a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/file/FileSizeUtils", "getDefaultDataSimConfiguration", 163, "FileSizeUtils.java")).r("No RCS configuration found for subId: %s", b);
        }
        return ((Integer) l.map(new Function() { // from class: csuh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = ((djtp) obj).o().mWarnSizeFileTransfer;
                if (i == 0) {
                    i = 104857600;
                }
                return Integer.valueOf(i);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(104857600)).intValue();
    }

    public final boolean f() {
        return ((Boolean) g(((ctwb) this.e.b()).b()).map(new Function() { // from class: csuj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((djtp) obj).o().mFileTransferAutoAcceptSupported);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue();
    }
}
