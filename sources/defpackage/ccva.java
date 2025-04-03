package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccva extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ccvj b;
    final /* synthetic */ String c;
    final /* synthetic */ ccvl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccva(ccvj ccvjVar, String str, ccvl ccvlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ccvjVar;
        this.c = str;
        this.d = ccvlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccva) c((akzw) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object b;
        Object b2;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            b = ((ffch) obj).a;
        } else {
            ccvj ccvjVar = this.b;
            String str = this.c;
            ccvl ccvlVar = this.d;
            this.a = 1;
            b = ccvjVar.f.b(str, ccvlVar, this);
            if (b == ffhhVar) {
                return ffhhVar;
            }
        }
        ffch ffchVar = new ffch(b);
        ccvj ccvjVar2 = this.b;
        ccvl ccvlVar2 = this.d;
        Object obj2 = ffchVar.a;
        ccvlVar2.getClass();
        cdaq cdaqVar = ccvjVar2.i;
        b2 = cdaqVar.b(obj2, axue.CMS_EVENT_TYPE_DELETE_TRIGGERED, ccvlVar2, Optional.empty());
        cdaqVar.g(b2, cdat.b);
        cdaqVar.e(b2, ccvlVar2);
        cdaqVar.d(b2, ccvlVar2);
        if (ffch.d(b2)) {
            ccvn ccvnVar = (ccvn) b2;
            if (ccvnVar.b) {
                ((ensz) cdaq.a.j()).D("Unnecessary deletion; %s row %s was already absent from CMS", cdaqVar.f, ccvnVar.a);
            } else {
                ((ensz) cdaq.a.h()).D("Deleted %s row %s from CMS", cdaqVar.f, ccvnVar.a);
            }
        }
        Throwable c = ffch.c(b2);
        if (c != null) {
            ((ensz) ((ensz) cdaq.a.j()).g(c)).t("Could not delete %s row", cdaqVar.f);
        }
        return ffchVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ccva(this.b, this.c, this.d, ffguVar);
    }
}
