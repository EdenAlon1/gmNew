package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degv extends ffhv implements ffjm {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ int b;
    final /* synthetic */ MessageIdType c;
    final /* synthetic */ degw d;
    final /* synthetic */ long e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public degv(ffgu ffguVar, ConversationIdType conversationIdType, int i, MessageIdType messageIdType, degw degwVar, long j) {
        super(2, ffguVar);
        this.a = conversationIdType;
        this.b = i;
        this.c = messageIdType;
        this.d = degwVar;
        this.e = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((degv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensz enszVar = (ensz) degw.a.h();
        enszVar.Y(csux.O, "MessagesPageDataBuilder");
        enszVar.J("#loadNextPage for conversation: %s, with page size: %s, with oldest message: %s", this.a, new Integer(this.b), this.c);
        if (!this.d.f.a()) {
            bcsq bcsqVar = (bcsq) this.d.c.b();
            ConversationIdType conversationIdType = this.a;
            int i = this.b;
            bmpt f = blyg.f(conversationIdType, this.c, this.e, i);
            f.d(new Function() { // from class: bcsm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    bmpx bmpxVar = (bmpx) obj2;
                    bmpxVar.c();
                    return bmpxVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            f.c(new bmpq(bmpy.b.b));
            f.x(i);
            engw y = bcsqVar.a.b(true, false, conversationIdType, f.b()).b().y();
            y.getClass();
            ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
            enqv it = y.iterator();
            while (it.hasNext()) {
                arrayList.add(((cvgy) this.d.b.b()).a(((bcsf) this.d.e.b()).d((bigm) it.next()), null, (Context) this.d.h.b()));
            }
            return arrayList;
        }
        bcsy bcsyVar = (bcsy) this.d.d.b();
        final ConversationIdType conversationIdType2 = this.a;
        int i2 = this.b;
        bmpt f2 = blyg.f(conversationIdType2, this.c, this.e, i2);
        f2.d(new Function() { // from class: bcsv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bmpx bmpxVar = (bmpx) obj2;
                bmpxVar.b(ConversationIdType.this);
                bmpxVar.c();
                return bmpxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        f2.c(new bmpq(bmpy.b.b), new bmpq(bmpy.b.a));
        f2.x(i2);
        bifz d = bcsyVar.a.d(f2.b());
        d.z("ConversationMessageDataQueryHelperV2::getPreviousSentAndReceivedMessagesQuerySql");
        engw y2 = d.b().y();
        y2.getClass();
        ArrayList arrayList2 = new ArrayList(ffdx.n(y2, 10));
        enqv it2 = y2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((cvgy) this.d.b.b()).a(((bcsf) this.d.e.b()).b((bgmp) it2.next()), null, (Context) this.d.h.b()));
        }
        return arrayList2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        degv degvVar = new degv(ffguVar, this.a, this.b, this.c, this.d, this.e);
        degvVar.f = obj;
        return degvVar;
    }
}
