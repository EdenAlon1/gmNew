package defpackage;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rox {
    public final DataInputStream a;
    public final InputStream b = new rov(this);
    public final PrintStream c = new PrintStream(new BufferedOutputStream(new row(this, (byte) 49)));
    public final PrintStream d = new PrintStream(new row(this, (byte) 50));
    public final DataOutputStream e;

    public rox(InputStream inputStream, OutputStream outputStream) {
        this.a = new DataInputStream(inputStream);
        this.e = new DataOutputStream(outputStream);
    }

    public final byte a() {
        return this.a.readByte();
    }

    public final int b() {
        return this.a.readInt();
    }

    public final void c(int i) {
        this.c.flush();
        this.d.flush();
        d((byte) 120, i);
    }

    public final void d(byte b, int i) {
        this.e.write(b);
        this.e.writeInt(i);
    }
}
