package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsdv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsci b;
    final /* synthetic */ dsed c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsdv(dsci dsciVar, dsed dsedVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dsciVar;
        this.c = dsedVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsdv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                if (this.b.b instanceof drej) {
                    dree bk = this.c.bk();
                    String str = this.b.a;
                    this.a = 1;
                    if (bk.e(str, this) == ffhhVar) {
                        return ffhhVar;
                    }
                }
            }
        } catch (IllegalStateException e) {
            ((enrr) ((enrr) dsed.a.i()).g(e).h("com/google/android/libraries/compose/sticker/ui/screen/StickerScreen$registerMediaUsage$1", "invokeSuspend", 236, "StickerScreen.kt")).p(e);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsdv(this.b, this.c, ffguVar);
    }
}
