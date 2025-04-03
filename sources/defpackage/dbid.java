package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbid extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ hho c;
    final /* synthetic */ dbip d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbid(hho hhoVar, dbip dbipVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = hhoVar;
        this.d = dbipVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbid) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            Object g = dbipVar.b.g(this);
            if (g == ffhhVar) {
                return ffhhVar;
            }
            hhoVar = hhoVar2;
            obj = g;
        }
        hhoVar.b(obj);
        hho hhoVar3 = this.c;
        cskc cskcVar = dbip.a;
        Object a = hhoVar3.a();
        Objects.toString(a);
        cskcVar.p("resetSecurityDomain result ".concat(String.valueOf(a)));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dbid(this.c, this.d, ffguVar);
    }
}
