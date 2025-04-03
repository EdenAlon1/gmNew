package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axks extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axkt b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axks(axkt axktVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = axktVar;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axks) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            axkt axktVar = this.b;
            boolean z = this.c;
            this.a = 1;
            if (axktVar.a(z, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axks(this.b, this.c, ffguVar);
    }
}
