package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cakf extends ffhv implements ffjm {
    final /* synthetic */ cakk a;
    final /* synthetic */ List b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cakf(ffgu ffguVar, cakk cakkVar, List list) {
        super(2, ffguVar);
        this.a = cakkVar;
        this.b = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cakf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ekzz f = eleg.f("E2eeInfoDataLoader#getFreshRemoteInstances");
        try {
            engw d = ((chef) this.a.a.b()).d(engq.a(this.b));
            ffig.a(f, null);
            return d;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cakf cakfVar = new cakf(ffguVar, this.a, this.b);
        cakfVar.c = obj;
        return cakfVar;
    }
}
