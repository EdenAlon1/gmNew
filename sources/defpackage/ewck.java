package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewck extends eyfq implements eyht {
    public ewck() {
        super(ewcl.a);
    }

    public final void a(boolean z) {
        copyOnWrite();
        ewcl ewclVar = (ewcl) this.instance;
        ewcl ewclVar2 = ewcl.a;
        eygc eygcVar = ewclVar.b;
        if (!eygcVar.c()) {
            ewclVar.b = eyfy.mutableCopy(eygcVar);
        }
        ewclVar.b.f(z);
    }
}
