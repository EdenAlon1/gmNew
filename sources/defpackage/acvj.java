package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvj implements acvn {
    private final ctbk a;
    private final errl b;
    private final acwk c;

    public acvj(ctbk ctbkVar, errl errlVar, acwk acwkVar) {
        this.a = ctbkVar;
        this.b = errlVar;
        this.c = acwkVar;
    }

    @Override // defpackage.acvn
    public final acvo a(acyu acyuVar, String str, acve acveVar) {
        acwk acwkVar = this.c;
        aczc aczcVar = (aczc) acwkVar.a.b();
        aczcVar.getClass();
        errl errlVar = (errl) acwkVar.b.b();
        errlVar.getClass();
        return new acvk(this.a, this.b, new acwj(aczcVar, errlVar, acyuVar, str, acveVar));
    }
}
