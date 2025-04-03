package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwls implements jrj {
    public static final dwls a = new dwls();
    public static final Paint b = new Paint();
    private static final Map c = new LinkedHashMap();

    private dwls() {
    }

    public static final File c(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    @Override // defpackage.jrj
    public final Typeface a(Context context, jrk jrkVar) {
        context.getClass();
        jrkVar.getClass();
        Objects.toString(jrkVar);
        throw new IllegalStateException("GoogleFont only support async loading: ".concat(jrkVar.toString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.jrj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r19, defpackage.jrk r20, defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwls.b(android.content.Context, jrk, ffgu):java.lang.Object");
    }
}
