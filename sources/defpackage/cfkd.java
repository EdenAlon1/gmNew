package defpackage;

import j$.time.Instant;
import j$.util.DateRetargetClass;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfkd extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ Instant b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfkd(Instant instant, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = instant;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfkd) c((ceze) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return Boolean.valueOf(DateRetargetClass.toInstant(((ceze) this.a).s()).isBefore(this.b));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cfkd cfkdVar = new cfkd(this.b, ffguVar);
        cfkdVar.a = obj;
        return cfkdVar;
    }
}
