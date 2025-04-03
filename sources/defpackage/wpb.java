package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpb extends ffhv implements ffjm {
    final /* synthetic */ wpe a;
    final /* synthetic */ List b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpb(ffgu ffguVar, wpe wpeVar, List list) {
        super(2, ffguVar);
        this.a = wpeVar;
        this.b = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wpb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((ctiz) this.a.a.b()).b(this.b, false, true);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        wpb wpbVar = new wpb(ffguVar, this.a, this.b);
        wpbVar.c = obj;
        return wpbVar;
    }
}
