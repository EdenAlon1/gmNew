package defpackage;

import android.util.Base64;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgrt {
    public static final String a(fayv fayvVar) {
        Optional a = clbh.a(fayvVar, clbg.IMAGE_CAPTION_NAMESPACE, "Image-Caption");
        if (!a.isPresent()) {
            return null;
        }
        byte[] decode = Base64.decode((String) a.get(), 2);
        decode.getClass();
        return new String(decode, ffoo.a);
    }
}
