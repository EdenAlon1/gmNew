package defpackage;

import java.io.EOFException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fizw extends fiwr {
    public fizw(long j) {
        super(SocketChannel.open(), j);
    }

    private final byte[] h(int i) {
        SocketChannel socketChannel = (SocketChannel) this.b.channel();
        byte[] bArr = new byte[i];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.b.interestOps(1);
        int i2 = 0;
        while (i2 < i) {
            try {
                if (this.b.isReadable()) {
                    long read = socketChannel.read(wrap);
                    if (read < 0) {
                        throw new EOFException();
                    }
                    i2 += (int) read;
                    if (i2 < i && System.currentTimeMillis() > this.a) {
                        throw new SocketTimeoutException();
                    }
                } else {
                    a(this.b, this.a);
                }
            } finally {
                if (this.b.isValid()) {
                    this.b.interestOps(0);
                }
            }
        }
        return bArr;
    }

    final void d(SocketAddress socketAddress) {
        ((SocketChannel) this.b.channel()).socket().bind(socketAddress);
    }

    final void e(SocketAddress socketAddress) {
        SocketChannel socketChannel = (SocketChannel) this.b.channel();
        if (socketChannel.connect(socketAddress)) {
            return;
        }
        this.b.interestOps(8);
        while (!socketChannel.finishConnect()) {
            try {
                if (!this.b.isConnectable()) {
                    a(this.b, this.a);
                }
            } catch (Throwable th) {
                if (this.b.isValid()) {
                    this.b.interestOps(0);
                }
                throw th;
            }
        }
        if (this.b.isValid()) {
            this.b.interestOps(0);
        }
    }

    final void f(byte[] bArr) {
        boolean isValid;
        SocketChannel socketChannel = (SocketChannel) this.b.channel();
        socketChannel.socket().getLocalSocketAddress();
        socketChannel.socket().getRemoteSocketAddress();
        c("TCP write", bArr);
        int length = bArr.length;
        ByteBuffer[] byteBufferArr = {ByteBuffer.wrap(new byte[]{(byte) (length >>> 8), (byte) (length & PrivateKeyType.INVALID)}), ByteBuffer.wrap(bArr)};
        this.b.interestOps(4);
        int i = 0;
        while (true) {
            try {
                int length2 = bArr.length + 2;
                if (i >= length2) {
                    if (isValid) {
                        return;
                    } else {
                        return;
                    }
                }
                if (this.b.isWritable()) {
                    long write = socketChannel.write(byteBufferArr);
                    if (write < 0) {
                        throw new EOFException();
                    }
                    i += (int) write;
                    if (i < length2 && System.currentTimeMillis() > this.a) {
                        throw new SocketTimeoutException();
                    }
                } else {
                    a(this.b, this.a);
                }
            } finally {
                if (this.b.isValid()) {
                    this.b.interestOps(0);
                }
            }
        }
    }

    final byte[] g() {
        byte[] h = h(2);
        byte[] h2 = h(((h[0] & 255) << 8) + (h[1] & 255));
        SocketChannel socketChannel = (SocketChannel) this.b.channel();
        socketChannel.socket().getLocalSocketAddress();
        socketChannel.socket().getRemoteSocketAddress();
        c("TCP read", h2);
        return h2;
    }
}
