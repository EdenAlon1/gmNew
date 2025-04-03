package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccxd extends ffhv implements ffjm {
    final /* synthetic */ ccxe a;
    final /* synthetic */ String b;
    final /* synthetic */ ccvl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccxd(ccxe ccxeVar, String str, ccvl ccvlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ccxeVar;
        this.b = str;
        this.c = ccvlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccxd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final ccxe ccxeVar = this.a;
        final String str = this.b;
        final ccvl ccvlVar = this.c;
        ccxeVar.d.d("CmsMessageBackupDelegate#onSuccess", new Runnable() { // from class: ccxc
            @Override // java.lang.Runnable
            public final void run() {
                engw r = engw.r(str);
                r.getClass();
                ccxe.this.g(ccxe.h(r), ccvlVar);
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ccxd(this.a, this.b, this.c, ffguVar);
    }
}
