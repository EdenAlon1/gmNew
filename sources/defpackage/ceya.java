package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceya extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceya(String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceya) c((Map) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Map map = (Map) this.a;
        return Boolean.valueOf((map != null ? (cexh) map.get(this.b) : null) == cexh.b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ceya ceyaVar = new ceya(this.b, ffguVar);
        ceyaVar.a = obj;
        return ceyaVar;
    }
}
