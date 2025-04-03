package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class djkw {
    public abstract djkx a();

    public abstract void b(String str);

    public abstract void c(int i);

    public abstract void d(eyss eyssVar);

    public abstract void e(eejk eejkVar);

    public abstract void f(enip enipVar);

    public final void g(String str) {
        eysr eysrVar = (eysr) eyss.a.createBuilder();
        eysrVar.copyOnWrite();
        eyss eyssVar = (eyss) eysrVar.instance;
        eyssVar.b |= 1;
        eyssVar.c = str;
        d((eyss) eysrVar.build());
    }
}
