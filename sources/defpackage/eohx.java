package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eohx {
    public final eori a;

    public eohx(eori eoriVar) {
        this.a = eoriVar;
    }

    public final /* synthetic */ eorl a() {
        eyfy build = this.a.build();
        build.getClass();
        return (eorl) build;
    }

    public final void b(int i) {
        eori eoriVar = this.a;
        eoriVar.copyOnWrite();
        eorl eorlVar = (eorl) eoriVar.instance;
        eorl eorlVar2 = eorl.a;
        eorlVar.c = i - 1;
        eorlVar.b |= 1;
    }
}
