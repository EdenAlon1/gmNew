package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekqm {
    public final ekqn a;
    public final ekql b;
    public final String c;

    public ekqm(ekqn ekqnVar, ekql ekqlVar, String str) {
        this.a = ekqnVar;
        this.b = ekqlVar;
        this.c = str;
    }

    public final File a() {
        return new File(this.b.b(this.a), this.c);
    }
}
