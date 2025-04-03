package defpackage;

import java.io.PushbackReader;
import java.io.Reader;
import java.util.Arrays;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fguj extends PushbackReader {
    private static final char[] b = {'\r', '\n', ' '};
    private static final char[] c = {'\r', '\n', '\t'};
    private static final char[] d = {'\n', ' '};
    private static final char[] e = {'\n', '\t'};
    public int a;
    private Log f;
    private char[][] g;
    private char[][] h;
    private int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fguj(Reader reader) {
        super(reader, 3);
        char[][] cArr;
        char[] cArr2 = b;
        int length = cArr2.length;
        boolean b2 = fhel.b("ical4j.unfolding.relaxed");
        this.f = LogFactory.getLog(fguj.class);
        int i = 0;
        this.i = 0;
        if (b2) {
            cArr = new char[][]{cArr2, c, d, e};
            this.g = cArr;
        } else {
            cArr = new char[][]{cArr2, c};
            this.g = cArr;
        }
        this.h = new char[cArr.length][];
        while (true) {
            char[][] cArr3 = this.g;
            if (i >= cArr3.length) {
                return;
            }
            this.h[i] = new char[cArr3[i].length];
            this.i = Math.max(this.i, cArr3[i].length);
            i++;
        }
    }

    private final void a() {
        boolean z;
        int read;
        do {
            z = false;
            for (int i = 0; i < this.h.length; i++) {
                int i2 = 0;
                while (true) {
                    char[] cArr = this.h[i];
                    int length = cArr.length;
                    if (i2 >= length || (read = super.read(cArr, i2, length - i2)) < 0) {
                        break;
                    } else {
                        i2 += read;
                    }
                }
                if (i2 > 0) {
                    if (Arrays.equals(this.g[i], this.h[i])) {
                        if (this.f.isTraceEnabled()) {
                            this.f.trace("Unfolding...");
                        }
                        this.a++;
                        z = true;
                    } else {
                        unread(this.h[i], 0, i2);
                    }
                }
            }
        } while (z);
    }

    @Override // java.io.PushbackReader, java.io.FilterReader, java.io.Reader
    public final int read() {
        int read = super.read();
        int i = 0;
        while (true) {
            char[][] cArr = this.g;
            if (i >= cArr.length) {
                return read;
            }
            if (read == cArr[i][0]) {
                unread(read);
                a();
                return super.read();
            }
            i++;
        }
    }

    @Override // java.io.PushbackReader, java.io.FilterReader, java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        int read = super.read(cArr, i, i2);
        int i3 = 0;
        while (true) {
            char[][] cArr2 = this.g;
            if (i3 >= cArr2.length) {
                return read;
            }
            if (read > 0 && cArr[0] == cArr2[i3][0]) {
                unread(cArr, i, read);
                a();
                return super.read(cArr, i, this.i);
            }
            for (int i4 = 0; i4 < read; i4++) {
                if (cArr[i4] == this.g[i3][0]) {
                    unread(cArr, i4, read - i4);
                    return i4;
                }
            }
            i3++;
        }
    }
}
