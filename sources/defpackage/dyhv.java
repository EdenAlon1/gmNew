package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyhv {
    public static final String[] a = {"http://", "https://", "rtsp://"};

    public static engw a(byte[] bArr) {
        int length = bArr.length;
        return engw.n(length == 0 ? Collections.EMPTY_LIST : new ermd(bArr, 0, length));
    }

    public static byte[] b(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }
}
