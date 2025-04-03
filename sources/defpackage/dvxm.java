package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvxm {
    public int a;
    private final dvxf b = new dvxf(2);
    private final dvxq c = (dvxq) dvxr.a.createBuilder();

    /* JADX WARN: Multi-variable type inference failed */
    public final dvxn a() {
        emxf.m(this.a != 0, "Semantic events must have a semantic ID.");
        erhj erhjVar = (erhj) erhk.a.createBuilder();
        int i = this.a;
        erhjVar.copyOnWrite();
        erhk erhkVar = (erhk) erhjVar.instance;
        erhkVar.b |= 8;
        erhkVar.d = i;
        erhk erhkVar2 = (erhk) erhjVar.build();
        dvxq dvxqVar = this.c;
        dvxqVar.copyOnWrite();
        dvxr dvxrVar = (dvxr) dvxqVar.instance;
        dvxr dvxrVar2 = dvxr.a;
        erhkVar2.getClass();
        dvxrVar.d = erhkVar2;
        dvxrVar.b |= 1;
        return new dvxn((dvxr) this.c.build(), this.b.a());
    }

    public final void b(dvxg dvxgVar) {
        this.b.b(dvxgVar);
    }

    public final void c(dvxc dvxcVar) {
        this.c.e(dvxcVar.a, dvxcVar.b);
    }
}
