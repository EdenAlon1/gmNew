package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dljd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dlje b;
    final /* synthetic */ ffji c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dljd(dlje dljeVar, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dljeVar;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dljd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dlje dljeVar = this.b;
            final ffji ffjiVar = this.c;
            final ffji ffjiVar2 = new ffji() { // from class: dljb
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    dlid dlidVar = (dlid) obj2;
                    dlidVar.getClass();
                    eyfq builder = dlidVar.toBuilder();
                    builder.getClass();
                    ffji.this.invoke(builder);
                    return (dlid) ((dlic) builder).build();
                }
            };
            ListenableFuture b = dljeVar.a.b(new emwl() { // from class: dljc
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    return ffji.this.invoke(obj2);
                }
            }, erpp.a);
            this.a = 1;
            if (fgfz.c(b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dljd(this.b, this.c, ffguVar);
    }
}
