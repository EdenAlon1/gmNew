package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwtf extends eyfq implements eyht {
    public dwtf() {
        super(dwti.a);
    }

    public final void a(String str, dwso dwsoVar) {
        str.getClass();
        dwsoVar.getClass();
        copyOnWrite();
        dwti dwtiVar = (dwti) this.instance;
        dwti dwtiVar2 = dwti.a;
        dwtiVar.a().put(str, dwsoVar);
    }

    public final void b(String str) {
        str.getClass();
        copyOnWrite();
        dwti dwtiVar = (dwti) this.instance;
        dwti dwtiVar2 = dwti.a;
        dwtiVar.a().remove(str);
    }
}
