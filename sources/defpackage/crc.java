package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class crc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dbe b;
    final /* synthetic */ hkx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crc(dbe dbeVar, hkx hkxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dbeVar;
        this.c = hkxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crc) c((hij) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            hij hijVar = (hij) this.d;
            ffxx a = hkt.a(new cra(this.b));
            crb crbVar = new crb(hijVar, this.b, this.c);
            this.a = 1;
            if (a.a(crbVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        crc crcVar = new crc(this.b, this.c, ffguVar);
        crcVar.d = obj;
        return crcVar;
    }
}
