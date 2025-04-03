package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abry extends ffhv implements ffjm {
    final /* synthetic */ absj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abry(absj absjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = absjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abry) c((akzw) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = bsdr.a;
        bsdm bsdmVar = new bsdm(bsdr.a);
        bsdmVar.z("getConversationParticipantMessagingIdentities");
        final absj absjVar = this.a;
        bsdmVar.f(new Function() { // from class: abrv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bsdq bsdqVar = (bsdq) obj2;
                bsdqVar.b(absj.this.f.C());
                return bsdqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsdmVar.d(new Function() { // from class: abrw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return new bsda[]{bsdr.c.b};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvvn e = ParticipantsTable.e();
        e.e(new Function() { // from class: abrx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bvtg bvtgVar = ParticipantsTable.c;
                return new bvth[]{ParticipantsTable.c.g, bvtgVar.f, bvtgVar.h, bvtgVar.z};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = ((bsdm) bsdmVar.j(dtvz.i(e.b(), ParticipantsTable.c.a, bsdr.c.b))).b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            absj absjVar2 = this.a;
            arrayList.add(absjVar2.a.q((ParticipantsTable.BindData) ((bscj) it.next()).aw("participants", ParticipantsTable.BindData.class)));
        }
        return ffdx.ar(arrayList);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abry(this.a, ffguVar);
    }
}
