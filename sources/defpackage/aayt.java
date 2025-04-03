package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aayt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abac b;
    final /* synthetic */ abgh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aayt(abac abacVar, abgh abghVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abacVar;
        this.c = abghVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aayt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl b = this.b.h.i().b();
            b.getClass();
            this.a = 1;
            obj = fgfz.c(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        abac abacVar = this.b;
        abgh abghVar = this.c;
        engw engwVar = (engw) obj;
        avjf avjfVar = (avjf) abacVar.D.b();
        engwVar.getClass();
        String str = ((awui) ((ResolvedRecipient) ffdx.K(engwVar)).g().e().get()).d;
        Object obj2 = abac.c.get(abghVar);
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        eqeg eqegVar = (eqeg) eqeq.a.createBuilder();
        eqegVar.copyOnWrite();
        eqeq eqeqVar = (eqeq) eqegVar.instance;
        eqeqVar.e = 1;
        eqeqVar.b |= 1;
        eqeh eqehVar = (eqeh) eqek.a.createBuilder();
        eqehVar.copyOnWrite();
        eqek eqekVar = (eqek) eqehVar.instance;
        eqekVar.c = ((eqej) obj2).e;
        eqekVar.b |= 1;
        eqegVar.copyOnWrite();
        eqeq eqeqVar2 = (eqeq) eqegVar.instance;
        eqek eqekVar2 = (eqek) eqehVar.build();
        eqekVar2.getClass();
        eqeqVar2.d = eqekVar2;
        eqeqVar2.c = 2;
        avjfVar.g((eqeq) eqegVar.build(), str);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aayt(this.b, this.c, ffguVar);
    }
}
