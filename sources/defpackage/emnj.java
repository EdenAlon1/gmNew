package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class emnj implements Comparable {
    public static emni f() {
        emne emneVar = new emne();
        emneVar.f("");
        emneVar.d(0.0f);
        int i = engw.d;
        emneVar.b(enou.a);
        return emneVar;
    }

    public abstract float a();

    public abstract engw b();

    public abstract fbrg c();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        emnj emnjVar = (emnj) obj;
        return enem.b.c(d(), emnjVar.d()).d(Float.valueOf(a()), Float.valueOf(emnjVar.a()), enpf.a).a();
    }

    public abstract String d();

    public abstract String e();
}
