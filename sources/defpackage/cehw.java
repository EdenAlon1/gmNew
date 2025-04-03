package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cehw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ cehx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cehw(ffgu ffguVar, Object obj, cehx cehxVar) {
        super(2, ffguVar);
        this.b = obj;
        this.c = cehxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cehw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        Throwable th;
        Object a;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            obj2 = this.d;
            try {
                ffci.b(obj);
            } catch (Throwable th2) {
                th = th2;
                a = ffci.a(th);
                return new ffcf(obj2, new ffch(a));
            }
        } else {
            ffci.b(obj);
            Object obj3 = this.b;
            try {
                elfl d = this.c.j.d(obj3);
                d.getClass();
                this.d = obj3;
                this.a = 1;
                Object c = fgfz.c(d, this);
                if (c == ffhhVar) {
                    return ffhhVar;
                }
                obj2 = obj3;
                obj = c;
            } catch (Throwable th3) {
                obj2 = obj3;
                th = th3;
                a = ffci.a(th);
                return new ffcf(obj2, new ffch(a));
            }
        }
        a = (Void) obj;
        return new ffcf(obj2, new ffch(a));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cehw cehwVar = new cehw(ffguVar, this.b, this.c);
        cehwVar.d = obj;
        return cehwVar;
    }
}
