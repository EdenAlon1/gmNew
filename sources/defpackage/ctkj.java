package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctkj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctko b;
    final /* synthetic */ ffss c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctkj(ffgu ffguVar, ctko ctkoVar, ffss ffssVar) {
        super(2, ffguVar);
        this.b = ctkoVar;
        this.c = ffssVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctkj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ctqh ctqhVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ctqhVar = (ctqh) this.d;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ctqh ctqhVar2 = (ctqh) this.b.b.b();
            ffss ffssVar = this.c;
            this.d = ctqhVar2;
            this.a = 1;
            Object c = ffssVar.c(this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
            ctqhVar = ctqhVar2;
            obj = c;
        }
        ctqhVar.q((List) obj, fbrd.SHOWN_REPLIED);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctkj ctkjVar = new ctkj(ffguVar, this.b, this.c);
        ctkjVar.d = obj;
        return ctkjVar;
    }
}
