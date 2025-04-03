package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aelk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aelp b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aelk(ffgu ffguVar, aelp aelpVar) {
        super(2, ffguVar);
        this.b = aelpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aelk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            elfl b = this.b.b.b();
            b.getClass();
            this.a = 1;
            obj = fgfz.c(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        enhk enhkVar = (enhk) obj;
        enhd enhdVar = new enhd();
        enhkVar.getClass();
        Iterator it = enhkVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aelp aelpVar = this.b;
            Object key = entry.getKey();
            key.getClass();
            final ConversationIdType conversationIdType = (ConversationIdType) key;
            Object value = entry.getValue();
            value.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry2 : ((Map) value).entrySet()) {
                if (((Instant) entry2.getValue()).isAfter(this.b.d.f())) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            Set keySet = linkedHashMap.keySet();
            ArrayList arrayList = new ArrayList(ffdx.n(keySet, 10));
            Iterator it2 = keySet.iterator();
            while (it2.hasNext()) {
                arrayList.add(aelpVar.c.b((awui) it2.next()));
            }
            final Set ar = ffdx.ar(arrayList);
            bvvn e = ParticipantsTable.e();
            bvtg bvtgVar = ParticipantsTable.c;
            e.c(bvtgVar.a, bvtgVar.n, bvtgVar.m, bvtgVar.h);
            e.h(new Function() { // from class: aelj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    Set set = ar;
                    bvvw bvvwVar = (bvvw) obj2;
                    ArrayList arrayList2 = new ArrayList(ffdx.n(set, 10));
                    Iterator it3 = set.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((aoku) it3.next()).o());
                    }
                    final ConversationIdType conversationIdType2 = conversationIdType;
                    bvvwVar.s(arrayList2);
                    bvvwVar.getClass();
                    String[] strArr = bsdr.a;
                    bsdm bsdmVar = new bsdm(bsdr.a);
                    bsdmVar.c(bsdr.c.b);
                    bsdmVar.f(new Function() { // from class: aelh
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj3) {
                            bsdq bsdqVar = (bsdq) obj3;
                            bsdqVar.b(ConversationIdType.this);
                            return bsdqVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bvvwVar.l(bsdmVar.b());
                    return bvvwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            e.z("HomeScreenActiveComposersObservableSupplier#getActiveComposerParticipantData");
            engw cW = ((bvti) e.b().o()).cW();
            cW.getClass();
            enip f = engq.f(cW);
            if (!f.isEmpty()) {
                enhdVar.k(entry.getKey(), f);
            }
        }
        return new aels(enhdVar.c());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aelk aelkVar = new aelk(ffguVar, this.b);
        aelkVar.c = obj;
        return aelkVar;
    }
}
