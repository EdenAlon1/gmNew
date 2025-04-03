package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yew extends ffhv implements ffjm {
    final /* synthetic */ yex a;
    final /* synthetic */ xhs b;
    final /* synthetic */ bswn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yew(ffgu ffguVar, yex yexVar, xhs xhsVar, bswn bswnVar) {
        super(2, ffguVar);
        this.a = yexVar;
        this.b = xhsVar;
        this.c = bswnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yew) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        yex yexVar = this.a;
        yexVar.a.a(this.b, yexVar.b.invoke(this.c));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yew yewVar = new yew(ffguVar, this.a, this.b, this.c);
        yewVar.d = obj;
        return yewVar;
    }
}
