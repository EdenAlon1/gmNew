package defpackage;

import java.io.PrintStream;
import java.net.SocketTimeoutException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fiwr {
    protected final long a;
    protected SelectionKey b;

    protected fiwr(SelectableChannel selectableChannel, long j) {
        Selector selector;
        this.a = j;
        try {
            selector = Selector.open();
            try {
                selectableChannel.configureBlocking(false);
                this.b = selectableChannel.register(selector, 1);
            } catch (Throwable th) {
                th = th;
                if (selector != null) {
                    selector.close();
                }
                selectableChannel.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            selector = null;
        }
    }

    protected static void a(SelectionKey selectionKey, long j) {
        int selectNow;
        long currentTimeMillis = j - System.currentTimeMillis();
        if (currentTimeMillis <= 0) {
            if (currentTimeMillis == 0) {
                selectNow = selectionKey.selector().selectNow();
            }
            throw new SocketTimeoutException();
        }
        selectNow = selectionKey.selector().select(currentTimeMillis);
        if (selectNow != 0) {
            return;
        }
        throw new SocketTimeoutException();
    }

    protected static void c(String str, byte[] bArr) {
        if (fiyy.a("verbosemsg")) {
            int length = bArr.length;
            PrintStream printStream = System.err;
            char[] cArr = fjaw.a;
            StringBuffer stringBuffer = new StringBuffer();
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(length);
            stringBuffer2.append("b");
            stringBuffer.append(stringBuffer2.toString());
            StringBuffer stringBuffer3 = new StringBuffer(" (");
            stringBuffer3.append(str);
            stringBuffer3.append(")");
            stringBuffer.append(stringBuffer3.toString());
            stringBuffer.append(':');
            int length2 = stringBuffer.toString().length();
            stringBuffer.append('\t');
            for (int i = 0; i < length; i++) {
                if (i != 0) {
                    int i2 = (length2 + 8) & (-8);
                    if (i % ((80 - i2) / 3) == 0) {
                        stringBuffer.append('\n');
                        for (int i3 = 0; i3 < i2 / 8; i3++) {
                            stringBuffer.append('\t');
                        }
                    }
                }
                byte b = bArr[i];
                stringBuffer.append(fjaw.a[(b & 255) >> 4]);
                stringBuffer.append(fjaw.a[b & 15]);
                stringBuffer.append(' ');
            }
            stringBuffer.append('\n');
            printStream.println(stringBuffer.toString());
        }
    }

    final void b() {
        this.b.selector().close();
        this.b.channel().close();
    }
}
