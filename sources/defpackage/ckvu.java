package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckvu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ckwi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckvu(ckwi ckwiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ckwiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckvu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ckwi ckwiVar = this.b;
            this.a = 1;
            obj = ckwiVar.e(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        final Set set = (Set) obj;
        bsob e = bsom.e();
        e.z("getMmsGroupConversations");
        e.r();
        e.i(new Function() { // from class: ckvs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bsol bsolVar = (bsol) obj2;
                bsolVar.j(1);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.i(new Function() { // from class: ckvt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bsol bsolVar = (bsol) obj2;
                engr engrVar = new engr();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    engrVar.h(String.valueOf(bdgq.a((ConversationIdType) it.next())));
                }
                bsolVar.aq(new dtrw("conversations._id", 4, bsol.at(engrVar.g()), true));
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.e(new bsny(bsom.c.r, false));
        e.x((int) ((Number) this.b.m.b()).longValue());
        return e.b().y();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ckvu(this.b, ffguVar);
    }
}
