package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejer {
    public static final ekqn a = new ekqk(1, 2);
    public final ekql b;
    public final eisx c;
    public final errl d;

    public ejer(ekql ekqlVar, eisx eisxVar, errl errlVar) {
        this.b = ekqlVar;
        this.c = eisxVar;
        this.d = errlVar;
        emxf.m(eisxVar.a() != -1, "Account Id is invalid");
    }

    static String b(eisx eisxVar) {
        return "accounts" + File.separator + eisxVar.a();
    }

    public final ejej a(ekqn ekqnVar, String str) {
        return new ejej(new ekqm(ekqnVar, this.b, b(this.c) + File.separator + str), this.d);
    }
}
