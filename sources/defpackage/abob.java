package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abob extends ffhv implements ffjq {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    final /* synthetic */ abof f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abob(abof abofVar, ffgu ffguVar) {
        super(6, ffguVar);
        this.f = abofVar;
    }

    @Override // defpackage.ffjq
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        abob abobVar = new abob(this.f, (ffgu) obj6);
        abobVar.a = (List) obj;
        abobVar.b = (abmi) obj2;
        abobVar.c = booleanValue;
        abobVar.d = (ResolvedRecipient) obj4;
        abobVar.e = (Optional) obj5;
        return abobVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        abmi abmiVar;
        dmzz dmzzVar;
        aqmo aqmoVar;
        ffci.b(obj);
        ?? r5 = this.a;
        Object obj2 = this.b;
        boolean z = this.c;
        ?? r1 = this.d;
        Optional optional = (Optional) this.e;
        dlss dlssVar = null;
        if (!optional.isPresent()) {
            return null;
        }
        aqmo aqmoVar2 = (aqmo) optional.get();
        if (z || (dmzzVar = (abmiVar = (abmi) obj2).b) == null) {
            aqmoVar = aqmoVar2;
        } else {
            dlss dlssVar2 = new dlss(abmiVar.a, dmzzVar, abmiVar.e);
            aqmoVar = aqmoVar2;
            dlssVar = dlssVar2;
        }
        doaz doazVar = new doaz(r1.c(crjg.b));
        dlss dlssVar3 = dlssVar;
        String c = aqmoVar.c();
        bont bontVar = aqmoVar.a;
        final abof abofVar = this.f;
        final aqmo aqmoVar3 = aqmoVar;
        return new abog(new doba(dlssVar3, doazVar, bontVar.h(), c, r5, new ffix() { // from class: aboa
            @Override // defpackage.ffix
            public final Object invoke() {
                String b = aqmoVar3.b();
                abof abofVar2 = abof.this;
                ((altk) abofVar2.b.b()).aH(2, eorw.BIZINFO_SOURCE_CONVERSATION_AVATAR, b);
                abofVar2.c.h(new ailc(abofVar2.a, b));
                return ffcu.a;
            }
        }), (abmi) obj2);
    }
}
