package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ted b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdq(ffgu ffguVar, ted tedVar) {
        super(2, ffguVar);
        this.b = tedVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tdq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        byte[] q;
        byte[] bArr;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            bArr = (byte[]) this.c;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            bqvj c = ((cryg) this.b.c.b()).c(2);
            if (c == null || (q = c.q()) == null) {
                throw new crvu("Cms backup key not found");
            }
            cgvm cgvmVar = (cgvm) this.b.b.b();
            this.c = q;
            this.a = 1;
            Object e = cgvmVar.e(this);
            if (e == ffhhVar) {
                return ffhhVar;
            }
            bArr = q;
            obj = e;
        }
        byte[] bArr2 = ((bcyo) obj).d;
        try {
            return crvx.b(bArr, bArr2);
        } catch (Exception e2) {
            throw new crvw("Unable to encrypt content", e2);
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        tdq tdqVar = new tdq(ffguVar, this.b);
        tdqVar.c = obj;
        return tdqVar;
    }
}
