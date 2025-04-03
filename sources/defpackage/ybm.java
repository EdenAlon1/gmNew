package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ybm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ybt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybm(ybt ybtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ybtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ybm) c((Instant) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        final ybt ybtVar = this.b;
        ffix ffixVar = new ffix() { // from class: ybl
            @Override // defpackage.ffix
            public final Object invoke() {
                return aygl.b(ybt.this.b);
            }
        };
        this.a = 1;
        Object a = ybtVar.a(ffixVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ybm(this.b, ffguVar);
    }
}
