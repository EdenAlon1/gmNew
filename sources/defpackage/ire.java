package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ire extends ffkk implements ffjm {
    final /* synthetic */ irf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ire(irf irfVar) {
        super(2);
        this.a = irfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        iui iuiVar = (iui) obj;
        ipa ipaVar = iuiVar.z;
        irf irfVar = this.a;
        if (ipaVar == null) {
            ipa ipaVar2 = new ipa(iuiVar, irfVar.a);
            iuiVar.z = ipaVar2;
            ipaVar = ipaVar2;
        }
        irfVar.b = ipaVar;
        this.a.a().i();
        irf irfVar2 = this.a;
        ipa a = irfVar2.a();
        iri iriVar = a.c;
        iri iriVar2 = irfVar2.a;
        if (iriVar != iriVar2) {
            a.c = iriVar2;
            a.j(false);
            iui.az(a.a, false, 7);
        }
        return ffcu.a;
    }
}
