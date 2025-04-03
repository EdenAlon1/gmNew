package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wig extends ffhv implements ffjm {
    int a;
    final /* synthetic */ wii b;
    final /* synthetic */ ffxe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wig(ffxe ffxeVar, wii wiiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffxeVar;
        this.b = wiiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wig) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxe ffxeVar = this.c;
            Boolean valueOf = Boolean.valueOf(((ctyz) this.b.h.b()).k());
            this.a = 1;
            if (ffxeVar.a(valueOf, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wig(this.c, this.b, ffguVar);
    }
}
