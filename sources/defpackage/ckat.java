package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckat extends ffhv implements ffjm {
    final /* synthetic */ fcea a;
    final /* synthetic */ ckau b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckat(fcea fceaVar, ckau ckauVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = fceaVar;
        this.b = ckauVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckat) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        eyfy buildPartial = this.a.buildPartial();
        buildPartial.getClass();
        fcea fceaVar = (fcea) ((fceb) buildPartial).toBuilder();
        fceaVar.getClass();
        DesugarCollections.unmodifiableList(((fceb) fceaVar.instance).b).getClass();
        List<String> list = ckau.a;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        for (String str : list) {
            fcdv fcdvVar = (fcdv) fcdx.a.createBuilder();
            fcdvVar.getClass();
            fcdy fcdyVar = (fcdy) fcdz.a.createBuilder();
            fcdyVar.getClass();
            fbda.b("+g.gsma.rcs.botversion", fcdyVar);
            fbcz.b(fbda.a(fcdyVar), fcdvVar);
            fcdy fcdyVar2 = (fcdy) fcdz.a.createBuilder();
            fcdyVar2.getClass();
            fbda.b(str, fcdyVar2);
            fbcz.c(fbda.a(fcdyVar2), fcdvVar);
            fbcz.d(3, fcdvVar);
            arrayList.add(fbcz.a(fcdvVar));
        }
        ckau ckauVar = this.b;
        fceaVar.a(arrayList);
        if (ckauVar.b.a()) {
            DesugarCollections.unmodifiableList(((fceb) fceaVar.instance).b).getClass();
            fcdv fcdvVar2 = (fcdv) fcdx.a.createBuilder();
            fcdvVar2.getClass();
            fcdy fcdyVar3 = (fcdy) fcdz.a.createBuilder();
            fcdyVar3.getClass();
            fbda.b("+g.gsma.rcs.botversion", fcdyVar3);
            fbcz.b(fbda.a(fcdyVar3), fcdvVar2);
            fcdy fcdyVar4 = (fcdy) fcdz.a.createBuilder();
            fcdyVar4.getClass();
            fbda.b("#=0.93", fcdyVar4);
            fbcz.c(fbda.a(fcdyVar4), fcdvVar2);
            fbcz.d(3, fcdvVar2);
            fceaVar.b(fbcz.a(fcdvVar2));
        }
        if (((ersq) ((diwi) ckauVar.c).a.b()).a("cslib.enable_open_url_webview_actions")) {
            DesugarCollections.unmodifiableList(((fceb) fceaVar.instance).b).getClass();
            fcdv fcdvVar3 = (fcdv) fcdx.a.createBuilder();
            fcdvVar3.getClass();
            fcdy fcdyVar5 = (fcdy) fcdz.a.createBuilder();
            fcdyVar5.getClass();
            fbda.b("+g.gsma.rcs.botversion", fcdyVar5);
            fbcz.b(fbda.a(fcdyVar5), fcdvVar3);
            fcdy fcdyVar6 = (fcdy) fcdz.a.createBuilder();
            fcdyVar6.getClass();
            fbda.b("#=1.9", fcdyVar6);
            fbcz.c(fbda.a(fcdyVar6), fcdvVar3);
            fbcz.d(3, fcdvVar3);
            fceaVar.b(fbcz.a(fcdvVar3));
        }
        DesugarCollections.unmodifiableList(((fceb) fceaVar.instance).b).getClass();
        fcdv fcdvVar4 = (fcdv) fcdx.a.createBuilder();
        fcdvVar4.getClass();
        fcdy fcdyVar7 = (fcdy) fcdz.a.createBuilder();
        fcdyVar7.getClass();
        fbda.b("+g.3gpp.iari-ref", fcdyVar7);
        fbcz.b(fbda.a(fcdyVar7), fcdvVar4);
        fcdy fcdyVar8 = (fcdy) fcdz.a.createBuilder();
        fcdyVar8.getClass();
        fbda.b("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot", fcdyVar8);
        fbcz.c(fbda.a(fcdyVar8), fcdvVar4);
        fbcz.d(3, fcdvVar4);
        fceaVar.b(fbcz.a(fcdvVar4));
        eyfy build = fceaVar.build();
        build.getClass();
        eyfq builder = ((fceb) build).toBuilder();
        builder.getClass();
        return builder;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ckat(this.a, this.b, ffguVar);
    }
}
