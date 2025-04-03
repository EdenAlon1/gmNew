package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bxi {
    public abstract bxj a();

    public final bxj b() {
        bxj a = a();
        bxm bxmVar = (bxm) a;
        if (Objects.equals(bxmVar.a, "audio/mp4a-latm") && bxmVar.b == -1) {
            throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
        }
        return a;
    }

    public abstract void c(int i);

    public abstract void d(int i);

    public abstract void e(String str);

    public abstract void f(int i);

    public abstract void g(int i);

    public abstract void h();
}
