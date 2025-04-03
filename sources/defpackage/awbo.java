package defpackage;

import j$.util.Optional;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awbo extends ffhv implements ffjm {
    final /* synthetic */ awbp a;
    final /* synthetic */ awai b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awbo(ffgu ffguVar, awbp awbpVar, awai awaiVar) {
        super(2, ffguVar);
        this.a = awbpVar;
        this.b = awaiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awbo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.a.b().openConnection(new URL((String) this.a.b.a(Optional.ofNullable(this.b.d)).orElseThrow()));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        awbo awboVar = new awbo(ffguVar, this.a, this.b);
        awboVar.c = obj;
        return awboVar;
    }
}
