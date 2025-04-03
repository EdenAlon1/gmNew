package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zfh implements ffix {
    final /* synthetic */ fgcm a;
    final /* synthetic */ ffix b;

    public zfh(fgcm fgcmVar, ffix ffixVar) {
        this.a = fgcmVar;
        this.b = ffixVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (((Boolean) this.a.c()).booleanValue()) {
            this.a.f(false);
        } else {
            this.b.invoke();
        }
        return ffcu.a;
    }
}
