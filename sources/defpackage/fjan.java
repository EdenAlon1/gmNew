package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fjan extends IOException {
    public fjan() {
    }

    public fjan(String str) {
        super(str);
    }

    public fjan(Throwable th) {
        super("invalid address");
        initCause(th);
    }
}
