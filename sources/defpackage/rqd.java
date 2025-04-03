package defpackage;

import com.android.vcard.VCardBuilder;
import java.io.BufferedOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rqd {
    public static final byte[] a = VCardBuilder.VCARD_END_OF_LINE.getBytes();

    public static final void a(String str, BufferedOutputStream bufferedOutputStream) {
        for (int i = 0; i < str.length(); i++) {
            bufferedOutputStream.write(str.charAt(i));
        }
        bufferedOutputStream.write(a);
    }
}
