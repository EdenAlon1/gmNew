package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbii extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ hho c;
    final /* synthetic */ dbip d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbii(hho hhoVar, dbip dbipVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = hhoVar;
        this.d = dbipVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbii) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [axmc, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        hho hhoVar;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            ffci.b(obj);
            hhoVar = obj2;
        } else {
            ffci.b(obj);
            hho hhoVar2 = this.c;
            dbip dbipVar = this.d;
            this.a = hhoVar2;
            this.b = 1;
            Object a = dbipVar.b.c.get().a(this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            hhoVar = hhoVar2;
            obj = a;
        }
        hhoVar.b("Eligibility result: ".concat(String.valueOf(((axlc) obj).name())));
        hho hhoVar3 = this.c;
        cskc cskcVar = dbip.a;
        Object a2 = hhoVar3.a();
        Objects.toString(a2);
        cskcVar.p("getUserEncryptionEligibility ".concat(String.valueOf(a2)));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dbii(this.c, this.d, ffguVar);
    }
}
