package j$.desugar.sun.nio.fs;

import j$.nio.file.FileSystem;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

/* loaded from: classes9.dex */
abstract class p {
    private static final long a;
    private static final long b;
    private static final char[] c;

    static {
        long j = 0;
        for (int max = Math.max(Math.min(48, 63), 0); max <= Math.max(Math.min(57, 63), 0); max++) {
            j |= 1 << max;
        }
        long c2 = c('A', 'Z') | c('a', 'z');
        long e = e("-_.!~*'()");
        long d = c2 | d("-_.!~*'()");
        long e2 = j | e | e(":@&=+$,");
        long d2 = d | d(":@&=+$,");
        a = e2 | e(";/");
        b = d2 | d(";/");
        c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    private static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            throw new AssertionError();
        }
        return c2 - '7';
    }

    static o b(FileSystem fileSystem, URI uri, String str, String str2) {
        byte b2;
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("URI is not absolute");
        }
        if (uri.isOpaque()) {
            throw new IllegalArgumentException("URI is not hierarchical");
        }
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI scheme is not \"file\"");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("URI has an authority component");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("URI has a fragment component");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("URI has a query component");
        }
        String rawPath = uri.getRawPath();
        int length = rawPath.length();
        if (length == 0) {
            throw new IllegalArgumentException("URI path component is empty");
        }
        if (rawPath.endsWith("/") && length > 1) {
            length--;
        }
        byte[] bArr = new byte[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char charAt = rawPath.charAt(i);
            if (charAt == '%') {
                int i4 = i + 2;
                i += 3;
                b2 = (byte) ((a(rawPath.charAt(i3)) << 4) | a(rawPath.charAt(i4)));
                if (b2 == 0) {
                    throw new IllegalArgumentException("Nul character not allowed");
                }
            } else {
                if (charAt == 0 || charAt >= 128) {
                    throw new IllegalArgumentException("Bad escape");
                }
                b2 = (byte) charAt;
                i = i3;
            }
            bArr[i2] = b2;
            i2++;
        }
        if (i2 != length) {
            bArr = Arrays.copyOf(bArr, i2);
        }
        return new o(fileSystem, new String(bArr, q.a()), str, str2);
    }

    private static long c(char c2, char c3) {
        long j = 0;
        for (int max = Math.max(Math.min((int) c2, 127), 64) - 64; max <= Math.max(Math.min((int) c3, 127), 64) - 64; max++) {
            j |= 1 << max;
        }
        return j;
    }

    private static long d(String str) {
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt >= '@' && charAt < 128) {
                j |= 1 << (charAt - '@');
            }
        }
        return j;
    }

    private static long e(String str) {
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < '@') {
                j |= 1 << charAt;
            }
        }
        return j;
    }

    static URI f(o oVar) {
        byte[] o = oVar.toAbsolutePath().o();
        StringBuilder sb = new StringBuilder("file:///");
        for (int i = 1; i < o.length; i++) {
            char c2 = (char) (o[i] & 255);
            if (c2 >= '@' ? c2 >= 128 || ((1 << (c2 - '@')) & b) == 0 : ((1 << c2) & a) == 0) {
                sb.append('%');
                char[] cArr = c;
                sb.append(cArr[(c2 >> 4) & 15]);
                sb.append(cArr[c2 & 15]);
            } else {
                sb.append(c2);
            }
        }
        if (sb.charAt(sb.length() - 1) != '/' && oVar.toFile().isDirectory()) {
            sb.append('/');
        }
        try {
            return new URI(sb.toString());
        } catch (URISyntaxException e) {
            throw new AssertionError(e);
        }
    }
}
