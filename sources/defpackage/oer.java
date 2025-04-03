package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oer extends ffkk implements ffjm {
    final /* synthetic */ ofz a;
    final /* synthetic */ olp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oer(ofz ofzVar, olp olpVar) {
        super(2);
        this.a = ofzVar;
        this.b = olpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        oep oepVar = (oep) obj;
        oep oepVar2 = (oep) obj2;
        oepVar.getClass();
        oepVar2.getClass();
        if (this.a == ofz.b) {
            oepVar.a(this.b);
        } else {
            oepVar2.a(this.b);
        }
        return ffcu.a;
    }
}
