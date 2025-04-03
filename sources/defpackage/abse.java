package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abse extends ffhv implements ffjm {
    final /* synthetic */ List a;
    final /* synthetic */ absj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abse(List list, absj absjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = list;
        this.b = absjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abse) c((akzw) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        eniq eniqVar = new eniq();
        String[] strArr = bsdr.a;
        bsdm bsdmVar = new bsdm(bsdr.a);
        bsdmVar.z("getConversationsContainingParticipants");
        final List list = this.a;
        final absj absjVar = this.b;
        bsdmVar.f(new Function() { // from class: absc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bsdq bsdqVar = (bsdq) obj2;
                String[] strArr2 = bsdr.a;
                bsdm bsdmVar2 = new bsdm(bsdr.a);
                final List list2 = list;
                final absj absjVar2 = absjVar;
                bsdmVar2.f(new Function() { // from class: absa
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        List list3 = list2;
                        bsdq bsdqVar2 = (bsdq) obj3;
                        ArrayList arrayList = new ArrayList(ffdx.n(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            String S = ((ParticipantsTable.BindData) it.next()).S();
                            S.getClass();
                            arrayList.add(Long.valueOf(Long.parseLong(S)));
                        }
                        absj absjVar3 = absjVar2;
                        bsdqVar2.g(arrayList);
                        bsdqVar2.aq(new dtrt("conversation_to_participants.conversation_id", 2, Long.valueOf(bdgq.a(absjVar3.f.C()))));
                        return bsdqVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsdmVar2.d(new Function() { // from class: absb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return new bsda[]{((bscz) obj3).a};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsdmVar2.v(bsdr.c.a);
                bsdqVar.d(bsdmVar2.b());
                return bsdqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsdmVar.d(new Function() { // from class: absd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bscz bsczVar = (bscz) obj2;
                return new bsda[]{bsczVar.b, bsczVar.a};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtsu o = bsdmVar.b().o();
        try {
            bsdb bsdbVar = (bsdb) o;
            while (bsdbVar.moveToNext()) {
                eniqVar.b(new Long(bsdbVar.e().a), new Long(bsdbVar.c()));
            }
            ffig.a(o, null);
            return eniqVar.a();
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abse(this.a, this.b, ffguVar);
    }
}
