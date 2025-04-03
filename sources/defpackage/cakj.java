package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cakj extends ffhv implements ffjm {
    final /* synthetic */ cakk a;
    final /* synthetic */ List b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cakj(ffgu ffguVar, cakk cakkVar, List list) {
        super(2, ffguVar);
        this.a = cakkVar;
        this.b = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cakj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((chef) this.a.a.b()).b(engq.a(this.b));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cakj cakjVar = new cakj(ffguVar, this.a, this.b);
        cakjVar.c = obj;
        return cakjVar;
    }
}
