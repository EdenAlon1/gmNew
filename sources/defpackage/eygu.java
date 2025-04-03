package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eygu extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public eygu(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.a = true;
    }

    public eygu(String str) {
        super(str);
    }

    public eygu(IOException iOException, byte[] bArr) {
        super("Unable to decode to byte array", iOException);
    }
}
