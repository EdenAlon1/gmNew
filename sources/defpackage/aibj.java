package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aibj extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ aibn c;
    final /* synthetic */ ahuu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aibj(aibn aibnVar, ahuu ahuuVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = aibnVar;
        this.d = ahuuVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aibj aibjVar = new aibj(this.c, this.d, (ffgu) obj3);
        aibjVar.a = (ahut) obj;
        aibjVar.b = (aibh) obj2;
        return aibjVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ahut, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        aiba aibaVar;
        Iterator it;
        int i;
        ffci.b(obj);
        ?? r1 = this.a;
        aibh aibhVar = (aibh) this.b;
        engw engwVar = aibhVar.a;
        if (engwVar.isEmpty()) {
            return new aibo(aibhVar.b, 3);
        }
        ArrayList arrayList = new ArrayList();
        final aibn aibnVar = this.c;
        final ahuu ahuuVar = this.d;
        String string = aibnVar.a.getString(R.string.multi_share_recent_conversations_header);
        string.getClass();
        arrayList.add(new aibb("recent_conversation_header", new dngr(string)));
        Iterator it2 = engwVar.iterator();
        final int i2 = 0;
        while (it2.hasNext()) {
            int i3 = i2 + 1;
            final alxn alxnVar = (alxn) it2.next();
            String b = alxnVar.c().b();
            b.getClass();
            alxnVar.getClass();
            Uri b2 = alxnVar.b();
            if (b2 == null) {
                it = it2;
                i = i3;
                b2 = ((crji) aibnVar.e.b()).f(alxnVar.b(), alxnVar.e(), ((aolr) aibnVar.f.b()).f(), null);
            } else {
                it = it2;
                i = i3;
            }
            Uri uri = b2;
            uri.getClass();
            dnyo dnyoVar = new dnyo(new dnwn(uri, Boolean.valueOf(alxnVar.a() <= 1), null, null, null, 28), null, 0, null, 0.0f, null, 62);
            String a = aswb.a() ? cuxh.a(alxnVar.e()) : aibnVar.g.c(alxnVar.e());
            a.getClass();
            arrayList.add(new aibb(b, new dngv(dnyoVar, a, alxnVar.d(), r1.e(alxnVar.c()), null, ((elew) aibnVar.h.b()).a("ConversationEntry.onToggle", new ffix() { // from class: aibi
                @Override // defpackage.ffix
                public final Object invoke() {
                    aifv.d((aifv) aibn.this.i.b(), 4, i2, 0, 4);
                    ahuuVar.c(ahus.a(alxnVar));
                    return ffcu.a;
                }
            }), new dngq((byte[]) null), 16)));
            it2 = it;
            i2 = i;
        }
        final aibn aibnVar2 = this.c;
        boolean z = aibhVar.d;
        if (!aibhVar.c) {
            aibaVar = null;
        } else if (z) {
            String string2 = aibnVar2.a.getString(R.string.multi_share_more_recent_conversations);
            string2.getClass();
            aibaVar = new aiba(string2, ((elew) aibnVar2.h.b()).a("LoadMore.onClick", new ffix() { // from class: aibf
                @Override // defpackage.ffix
                public final Object invoke() {
                    aibn aibnVar3 = aibn.this;
                    aifv.d((aifv) aibnVar3.i.b(), 2, 0, 0, 6);
                    fgcm fgcmVar = aibnVar3.k;
                    long longValue = ((Number) fgcmVar.c()).longValue();
                    Object b3 = aibnVar3.c.b();
                    b3.getClass();
                    fgcmVar.f(Long.valueOf(longValue + ((Number) b3).longValue()));
                    return ffcu.a;
                }
            }));
        } else {
            String string3 = aibnVar2.a.getString(R.string.multi_share_less_recent_conversations);
            string3.getClass();
            aibaVar = new aiba(string3, ((elew) aibnVar2.h.b()).a("LoadLess.onClick", new ffix() { // from class: aibd
                @Override // defpackage.ffix
                public final Object invoke() {
                    aibn aibnVar3 = aibn.this;
                    aifv.d((aifv) aibnVar3.i.b(), 3, 0, 0, 6);
                    aibnVar3.k.f(aibnVar3.b.b());
                    return ffcu.a;
                }
            }));
        }
        return new aibo(aibaVar, arrayList, true);
    }
}
