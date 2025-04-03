package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvxf {
    final dvxj a;

    /* JADX WARN: Multi-variable type inference failed */
    public dvxf(int i) {
        dvxj dvxjVar = (dvxj) dvxk.a.createBuilder();
        this.a = dvxjVar;
        dvxjVar.copyOnWrite();
        dvxk dvxkVar = (dvxk) dvxjVar.instance;
        dvxkVar.c = i - 1;
        dvxkVar.b |= 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dvxh a() {
        return new dvxh((dvxk) this.a.build());
    }

    public final void b(dvxg dvxgVar) {
        emxf.l(!this.a.d(dvxgVar.a));
        dvxj dvxjVar = this.a;
        int a = dvxgVar.a.a();
        dvxjVar.copyOnWrite();
        dvxk dvxkVar = (dvxk) dvxjVar.instance;
        dvxk dvxkVar2 = dvxk.a;
        eygi eygiVar = dvxkVar.d;
        if (!eygiVar.c()) {
            dvxkVar.d = eyfy.mutableCopy(eygiVar);
        }
        dvxkVar.d.h(a);
        this.a.e(dvxgVar.a, dvxgVar.b);
    }
}
