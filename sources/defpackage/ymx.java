package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ymx extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    final /* synthetic */ ymy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymx(ymy ymyVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = ymyVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ymx ymxVar = new ymx(this.c, (ffgu) obj3);
        ymxVar.a = (dmpf) obj;
        ymxVar.b = booleanValue;
        return ymxVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        boolean z = this.b;
        if (obj2 != null) {
            return obj2;
        }
        if (z) {
            return this.c.c(null, false);
        }
        return null;
    }
}
