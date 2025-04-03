package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class svv extends ffhv implements ffjm {
    int a;
    /* synthetic */ boolean b;
    final /* synthetic */ fnx c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svv(fnx fnxVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = fnxVar;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((svv) c(bool, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0 && this.b) {
            fnx fnxVar = this.c;
            String str = this.d;
            this.a = 1;
            if (fnxVar.b(str, 1, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        svv svvVar = new svv(this.c, this.d, ffguVar);
        svvVar.b = ((Boolean) obj).booleanValue();
        return svvVar;
    }
}
