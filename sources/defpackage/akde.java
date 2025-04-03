package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akde extends ffhv implements ffjm {
    int a;
    final /* synthetic */ akdh b;
    final /* synthetic */ akcv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akde(akdh akdhVar, akcv akcvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = akdhVar;
        this.c = akcvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akde) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            akdh akdhVar = this.b;
            akcv akcvVar = this.c;
            this.a = 1;
            if (akdhVar.k(akcvVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ceyt.i();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new akde(this.b, this.c, ffguVar);
    }
}
