package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xwt implements ffji {
    final /* synthetic */ boolean a;
    final /* synthetic */ zxl b;
    final /* synthetic */ fgcm c;
    final /* synthetic */ fgcm d;

    public xwt(boolean z, zxl zxlVar, fgcm fgcmVar, fgcm fgcmVar2) {
        this.a = z;
        this.b = zxlVar;
        this.c = fgcmVar;
        this.d = fgcmVar2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        if (this.a) {
            this.b.g();
            this.c.f(true);
        }
        this.d.f(Float.valueOf(floatValue));
        return ffcu.a;
    }
}
