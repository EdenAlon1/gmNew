package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akdt extends ffhv implements ffjm {
    final /* synthetic */ akee a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akdt(ffgu ffguVar, akee akeeVar) {
        super(2, ffguVar);
        this.a = akeeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akdt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return new Integer(this.a.b.am());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        akdt akdtVar = new akdt(ffguVar, this.a);
        akdtVar.b = obj;
        return akdtVar;
    }
}
