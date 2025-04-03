package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lwr extends IOException {
    public final int a;

    public lwr(int i) {
        this.a = i;
    }

    public lwr(String str, Throwable th, int i) {
        super(str, th);
        this.a = i;
    }

    public lwr(Throwable th, int i) {
        super(th);
        this.a = i;
    }
}
