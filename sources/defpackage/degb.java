package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class degb extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    int g;
    final /* synthetic */ degd h;
    final /* synthetic */ List i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public degb(degd degdVar, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.h = degdVar;
        this.i = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((degb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        ekzz ekzzVar;
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.g != 0) {
                obj3 = this.f;
                obj2 = this.e;
                obj4 = this.d;
                obj6 = this.c;
                obj5 = this.b;
                Object obj7 = this.a;
                ffci.b(obj);
                ekzzVar = obj7;
            } else {
                ffci.b(obj);
                degd degdVar = this.h;
                List list = this.i;
                ekzz f = eleg.f("LoadPagedConversationHandlerImpl#loadRecentConversationsWithMessageAsFuture");
                cvin cvinVar = (cvin) cvio.a.createBuilder();
                cvinVar.getClass();
                cvip cvipVar = new cvip(cvinVar);
                cvhs cvhsVar = (cvhs) cvht.a.createBuilder();
                cvhsVar.getClass();
                cvhsVar.copyOnWrite();
                ((cvht) cvhsVar.instance).b = 8;
                eyfy build = cvhsVar.build();
                build.getClass();
                cvin cvinVar2 = cvipVar.a;
                cvinVar2.copyOnWrite();
                cvio cvioVar = (cvio) cvinVar2.instance;
                cvioVar.e = (cvht) build;
                cvioVar.b |= 1;
                cvhv a = cvhu.a((cvhw) cvhx.a.createBuilder());
                eyjx b = a.b();
                defp defpVar = (defp) degdVar.b.b();
                this.a = f;
                this.b = cvipVar;
                this.c = a;
                this.d = cvipVar;
                this.e = a;
                this.f = b;
                this.g = 1;
                obj = ffra.a(ekxi.a(defpVar.d), new defn(null, defpVar, list), this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
                obj2 = a;
                obj3 = b;
                obj4 = cvipVar;
                obj5 = obj4;
                obj6 = obj2;
                ekzzVar = f;
            }
            ((cvhv) obj2).c((eyjx) obj3, (Iterable) obj);
            cvhx a2 = ((cvhv) obj6).a();
            cvin cvinVar3 = ((cvip) obj4).a;
            cvinVar3.copyOnWrite();
            cvio cvioVar2 = (cvio) cvinVar3.instance;
            cvio cvioVar3 = cvio.a;
            cvioVar2.d = a2;
            cvioVar2.c = 2;
            eyfy build2 = ((cvip) obj5).a.build();
            build2.getClass();
            cvio cvioVar4 = (cvio) build2;
            ffig.a(ekzzVar, null);
            return cvioVar4;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new degb(this.h, this.i, ffguVar);
    }
}
