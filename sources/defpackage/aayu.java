package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aayu extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ abac c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aayu(abac abacVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = abacVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aayu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            avjf avjfVar = (avjf) this.c.D.b();
            abac abacVar = this.c;
            this.a = avjfVar;
            this.b = 1;
            Object a = fgbj.a(abacVar.k, this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            obj2 = avjfVar;
            obj = a;
        }
        String str = ((awui) ((ResolvedRecipient) ffdx.K((List) obj)).g().e().get()).d;
        Object obj3 = abac.d.get(new Integer(this.d));
        if (obj3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        eqeg eqegVar = (eqeg) eqeq.a.createBuilder();
        eqegVar.copyOnWrite();
        eqeq eqeqVar = (eqeq) eqegVar.instance;
        eqeqVar.e = 1;
        eqeqVar.b |= 1;
        eqem eqemVar = (eqem) eqep.a.createBuilder();
        eqemVar.copyOnWrite();
        eqep eqepVar = (eqep) eqemVar.instance;
        eqepVar.c = ((eqeo) obj3).d;
        eqepVar.b |= 1;
        eqegVar.copyOnWrite();
        eqeq eqeqVar2 = (eqeq) eqegVar.instance;
        eqep eqepVar2 = (eqep) eqemVar.build();
        eqepVar2.getClass();
        eqeqVar2.d = eqepVar2;
        eqeqVar2.c = 3;
        ((avjf) obj2).g((eqeq) eqegVar.build(), str);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aayu(this.c, this.d, ffguVar);
    }
}
