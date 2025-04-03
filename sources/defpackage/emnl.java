package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emnl {
    final /* synthetic */ emlo a;
    final /* synthetic */ emjc b;

    public emnl(emlo emloVar, emjc emjcVar) {
        this.a = emloVar;
        this.b = emjcVar;
    }

    public final excx a() {
        emjc emjcVar = this.b;
        int a = emjg.a(emjcVar.g);
        if (a == 0) {
            a = 2;
        }
        emhv emhvVar = emjcVar.c;
        if (emhvVar == null) {
            emhvVar = emhv.a;
        }
        return this.a.b(a, emhvVar);
    }
}
