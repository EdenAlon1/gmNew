package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtb extends IOException {
    private static final long serialVersionUID = 1;
    public final int a;

    public qtb(String str, int i) {
        this(str, i, null);
    }

    public qtb(String str, int i, Throwable th) {
        super(a.g(i, str, ", status code: "), th);
        this.a = i;
    }
}
