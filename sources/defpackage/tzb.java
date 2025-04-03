package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tzb extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ tzc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzb(tzc tzcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = tzcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tzb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        fgjb fgjbVar;
        ffhh ffhhVar = ffhh.a;
        if (this.c != 0) {
            obj2 = this.b;
            Object obj3 = this.a;
            ffci.b(obj);
            fgjbVar = obj3;
        } else {
            ffci.b(obj);
            tzc tzcVar = this.d;
            fgjb fgjbVar2 = tzcVar.f;
            this.a = fgjbVar2;
            this.b = tzcVar;
            this.c = 1;
            if (fgjbVar2.a(null, this) == ffhhVar) {
                return ffhhVar;
            }
            obj2 = tzcVar;
            fgjbVar = fgjbVar2;
        }
        try {
            ((tzc) obj2).g = null;
            fgjbVar.b(null);
            return ffcu.a;
        } catch (Throwable th) {
            fgjbVar.b(null);
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new tzb(this.d, ffguVar);
    }
}
