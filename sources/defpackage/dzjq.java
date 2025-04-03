package defpackage;

import java.io.Serializable;
import java.security.KeyPair;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzjq implements Serializable {
    public static dzjo a() {
        dzmh dzmhVar = new dzmh();
        dzmhVar.c = dzki.a;
        return dzmhVar;
    }

    public abstract dzjp b();

    public abstract engw c();

    public abstract Long d();

    public abstract Long e();

    public final KeyPair f() {
        return b().a();
    }

    public final int g() {
        return b().b();
    }
}
