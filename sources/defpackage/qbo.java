package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qbo extends ffhv implements ffjm {
    final /* synthetic */ pyj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbo(pyj pyjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = pyjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qbo) c((pva) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String str = qbp.a;
        ppt c = ppt.c();
        pyj pyjVar = this.a;
        Objects.toString(pyjVar);
        c.a(str, "Constraints changed for ".concat(String.valueOf(pyjVar)));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new qbo(this.a, ffguVar);
    }
}
