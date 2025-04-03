package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class emnh {
    public static emng h() {
        emnc emncVar = new emnc();
        emncVar.f("");
        emncVar.d("");
        emncVar.e("");
        emncVar.g("");
        int i = engw.d;
        engw engwVar = enou.a;
        if (engwVar == null) {
            throw new NullPointerException("Null contactAnnotations");
        }
        if (emncVar.a != null) {
            throw new IllegalStateException("Cannot set contactAnnotations after calling contactAnnotationsBuilder()");
        }
        emncVar.b = engwVar;
        if (emncVar.c != null) {
            throw new IllegalStateException("Cannot set annotations after calling annotationsBuilder()");
        }
        emncVar.d = engwVar;
        emncVar.c(fceq.a);
        return emncVar;
    }

    public abstract engw a();

    public abstract engw b();

    public abstract fceq c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();
}
