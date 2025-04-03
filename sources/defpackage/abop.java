package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abop extends ffhv implements ffjs {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    /* synthetic */ boolean f;
    /* synthetic */ Object g;
    final /* synthetic */ abos h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abop(abos abosVar, ffgu ffguVar) {
        super(8, ffguVar);
        this.h = abosVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [alxj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ResolvedRecipient resolvedRecipient;
        String str;
        boolean z;
        dnyo dnyoVar;
        String y;
        ffci.b(obj);
        final ?? r1 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        ?? r4 = this.d;
        Object obj4 = this.e;
        boolean z2 = this.f;
        Object obj5 = this.g;
        if (obj3 != null) {
            return new dosi((String) obj3, null, false, new aboo(this.h), new ffix() { // from class: dosh
                @Override // defpackage.ffix
                public final Object invoke() {
                    return ffcu.a;
                }
            });
        }
        final abos abosVar = this.h;
        List list = ((aaxe) obj2).a;
        if (!list.isEmpty()) {
            return new dosk(String.valueOf(list.size()), null, null, false, null, new dosg((int) ((Number) abosVar.j.b()).longValue()), null, 190);
        }
        ffbr ffbrVar = abosVar.h;
        amny amnyVar = amny.b;
        final engw engwVar = (engw) r4;
        dnwn b = ((crpw) ffbrVar.b()).b(r1, engwVar);
        String i = r1.i();
        if (i == null) {
            i = "";
        }
        if (((ersq) ((armz) abosVar.i).a.b()).a("bugle.limit_conversation_title_length")) {
            i = i.substring(0, Math.min(i.length(), 100));
            i.getClass();
        }
        if (r1.b() != alxi.ONE_ON_ONE) {
            resolvedRecipient = null;
        } else if (((atqx) abosVar.l.b()).a()) {
            resolvedRecipient = (ResolvedRecipient) ffdx.U(r4);
            if (resolvedRecipient == null) {
                ensk j = abos.a.j();
                j.Y(ente.a, "BugleConversation");
                enrr enrrVar = (enrr) j;
                enrrVar.Y(csux.q, r1.c());
                ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation2/topcontent/topappbar/TopAppBarMiddleUiAdapterImpl", "getOneOnOneRecipientOrNull", 264, "TopAppBarMiddleUiAdapterImpl.kt")).q("Missing a single recipient for 1:1 conversation, can't render top bar.");
            }
        } else {
            resolvedRecipient = (ResolvedRecipient) ffdx.T(r4);
        }
        if (resolvedRecipient == null || (y = resolvedRecipient.y()) == null) {
            str = null;
        } else {
            String a = aswb.a() ? cuxh.a(y) : abosVar.e.c(y);
            a.getClass();
            str = cjze.a(a);
        }
        if (b != null) {
            z = false;
            dnyoVar = new dnyo(b, null, 0, null, 0.0f, null, 62);
        } else {
            z = false;
            dnyoVar = null;
        }
        return new dosk(i, str, dnyoVar, (!((Boolean) abosVar.g.b()).booleanValue() || (obj4 == null && !z2)) ? z : true, (dorc) obj4, new dosg((int) ((Number) abosVar.j.b()).longValue()), obj5 == amnyVar ? new ffix() { // from class: abon
            @Override // defpackage.ffix
            public final Object invoke() {
                abos.this.p.a(r1, engwVar);
                return ffcu.a;
            }
        } : null, 8);
    }

    @Override // defpackage.ffjs
    public final /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        boolean booleanValue = ((Boolean) obj6).booleanValue();
        abop abopVar = new abop(this.h, (ffgu) obj8);
        abopVar.a = (alxj) obj;
        abopVar.b = (aaxe) obj2;
        abopVar.c = (String) obj3;
        abopVar.d = (engw) obj4;
        abopVar.e = (dorc) obj5;
        abopVar.f = booleanValue;
        abopVar.g = (amny) obj7;
        return abopVar.b(ffcu.a);
    }
}
