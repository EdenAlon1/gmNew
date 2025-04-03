package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fand extends IOException {
    public fand(String str) {
        super(str);
    }

    public fand(Throwable th) {
        super("Error in decoding CborValue from bytes", th);
    }
}
