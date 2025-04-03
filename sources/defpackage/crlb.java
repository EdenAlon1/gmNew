package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crlb implements qtw {
    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ qwv a(Object obj, int i, int i2, qtu qtuVar) {
        InputStream inputStream = (InputStream) obj;
        inputStream.getClass();
        qtuVar.getClass();
        try {
            int i3 = rnh.e;
            rnh b = new rob().b(inputStream);
            if (b.a == null) {
                throw new IllegalArgumentException("SVG document is empty");
            }
            float f = b.b;
            if (b.c().c == -1.0f && i != Integer.MIN_VALUE) {
                rmh rmhVar = b.a;
                if (rmhVar == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                rmhVar.c = new rlr(i);
            }
            if (b.a == null) {
                throw new IllegalArgumentException("SVG document is empty");
            }
            float f2 = b.b;
            if (b.c().d == -1.0f && i2 != Integer.MIN_VALUE) {
                rmh rmhVar2 = b.a;
                if (rmhVar2 == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                rmhVar2.d = new rlr(i2);
            }
            b.getClass();
            return new rcj(new crld(b));
        } catch (rnt e) {
            throw new IOException("Unable to decode SVG from stream.", e);
        }
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ boolean b(Object obj, qtu qtuVar) {
        InputStream inputStream = (InputStream) obj;
        inputStream.getClass();
        qtuVar.getClass();
        int i = eoej.a;
        InputStreamReader inputStreamReader = new InputStreamReader(new eoei(inputStream, 256L), ffoo.a);
        StringBuilder sb = new StringBuilder();
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                break;
            }
            sb.append(cArr, 0, read);
        }
        String sb2 = sb.toString();
        return ffpc.I(sb2, "<svg", true) || ffpc.I(sb2, " svg ", true);
    }
}
