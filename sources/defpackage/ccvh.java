package defpackage;

import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccvh extends ffhv implements ffjm {
    final /* synthetic */ ccvj a;
    final /* synthetic */ String b;
    final /* synthetic */ EnumSet c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccvh(ffgu ffguVar, ccvj ccvjVar, String str, EnumSet enumSet) {
        super(2, ffguVar);
        this.a = ccvjVar;
        this.b = str;
        this.c = enumSet;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccvh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.e.c(this.b, this.c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccvh ccvhVar = new ccvh(ffguVar, this.a, this.b, this.c);
        ccvhVar.d = obj;
        return ccvhVar;
    }
}
