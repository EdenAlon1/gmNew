package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bgh {
    public static bgg g(bdy bdyVar) {
        bbm bbmVar = new bbm();
        if (bdyVar == null) {
            throw new NullPointerException("Null surface");
        }
        bbmVar.a = bdyVar;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            throw new NullPointerException("Null sharedSurfaces");
        }
        bbmVar.b = list;
        bbmVar.c(-1);
        bbmVar.c = -1;
        bbmVar.b(aua.b);
        return bbmVar;
    }

    public abstract int a();

    public abstract aua b();

    public abstract bdy c();

    public abstract List d();

    public abstract void e();

    public abstract void f();
}
