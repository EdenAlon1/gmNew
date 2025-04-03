package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azce extends ffhv implements ffjm {
    final /* synthetic */ azcg a;
    final /* synthetic */ String b;
    final /* synthetic */ azcf c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azce(ffgu ffguVar, azcg azcgVar, String str, azcf azcfVar) {
        super(2, ffguVar);
        this.a = azcgVar;
        this.b = str;
        this.c = azcfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azce) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (this.a == azcg.b) {
            String str = this.b;
            cskc cskcVar = cpdg.a;
            if (!aoqw.h(str)) {
                throw new IllegalArgumentException("BOT address is not an email address.");
            }
        }
        if (this.a != azcg.a || ((ctvb) this.c.d.b()).I(this.b)) {
            return ffcu.a;
        }
        throw new IllegalArgumentException("Phone address is not normalized");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azce azceVar = new azce(ffguVar, this.a, this.b, this.c);
        azceVar.d = obj;
        return azceVar;
    }
}
