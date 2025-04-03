package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cunf extends ffhv implements ffjm {
    final /* synthetic */ cung a;
    final /* synthetic */ byte[] b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cunf(ffgu ffguVar, cung cungVar, byte[] bArr) {
        super(2, ffguVar);
        this.a = cungVar;
        this.b = bArr;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cunf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cunh cunhVar = (cunh) this.a.a.b();
        byte[] bArr = this.b;
        ekzz f = eleg.f("TemplatesProtoCipher#decrypt");
        try {
            if (bArr.length == 0) {
                fbru fbruVar = fbru.a;
                fbruVar.getClass();
                ffig.a(f, null);
                return fbruVar;
            }
            fbru fbruVar2 = (fbru) eyfy.parseFrom(fbru.a, cunhVar.a(bArr), eyfc.a());
            fbruVar2.getClass();
            ffig.a(f, null);
            return fbruVar2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ffig.a(f, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cunf cunfVar = new cunf(ffguVar, this.a, this.b);
        cunfVar.c = obj;
        return cunfVar;
    }
}
