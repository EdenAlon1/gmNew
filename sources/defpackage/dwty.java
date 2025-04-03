package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwty extends eyfq implements eyht {
    public dwty() {
        super(dwua.a);
    }

    public final void a(String str, dwtx dwtxVar) {
        str.getClass();
        dwtxVar.getClass();
        copyOnWrite();
        dwua dwuaVar = (dwua) this.instance;
        dwua dwuaVar2 = dwua.a;
        dwuaVar.a().put(str, dwtxVar);
    }

    public final void b(String str) {
        str.getClass();
        copyOnWrite();
        dwua dwuaVar = (dwua) this.instance;
        dwua dwuaVar2 = dwua.a;
        dwuaVar.a().remove(str);
    }
}
