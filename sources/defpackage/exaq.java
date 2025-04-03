package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exaq {
    @Deprecated
    public static engw a(ewvi ewviVar) {
        try {
            int i = engw.d;
            engr engrVar = new engr();
            Iterator<E> it = ewviVar.c.iterator();
            while (it.hasNext()) {
                byte[] decode = Base64.decode((String) it.next(), 0);
                eyfc eyfcVar = eyfc.a;
                eyib eyibVar = eyib.a;
                engrVar.h((depm) eyfy.parseFrom(depm.a, decode, eyfc.a));
            }
            return engrVar.g();
        } catch (eygu e) {
            throw new IllegalStateException("Invalid model data.", e);
        }
    }

    public static String b(ParcelFileDescriptor parcelFileDescriptor) {
        return ((Uri) efca.a(parcelFileDescriptor).first).toString();
    }
}
