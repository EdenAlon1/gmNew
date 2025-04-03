package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avjs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ avjw b;
    final /* synthetic */ ConversationIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avjs(avjw avjwVar, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = avjwVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avjs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object apply;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            avjw avjwVar = this.b;
            ConversationIdType conversationIdType = this.c;
            this.a = 1;
            obj = avjwVar.b(conversationIdType, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            return avji.HIDE;
        }
        bqfs a = bqfx.a();
        a.z("getToolstoneState");
        apply = new Function() { // from class: avjq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((bqff) obj2).e;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(bqfx.c);
        bqfg[] bqfgVarArr = {(bqfg) apply};
        int intValue = bqfx.c().intValue();
        if (((Integer) bqfx.b.getOrDefault(bqfgVarArr[0].toString(), -1)).intValue() > intValue) {
            dtub.w("columnReference.toString()", intValue);
        }
        a.m(bqfgVarArr);
        final ConversationIdType conversationIdType2 = this.c;
        a.c(new Function() { // from class: avjr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bqfw bqfwVar = (bqfw) obj2;
                bqfwVar.b(ConversationIdType.this);
                return bqfwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = a.b().y();
        if (y.isEmpty() || ((bqeo) y.get(0)).l() == avji.NOT_SET) {
            this.b.c(this.c);
            Object e = avjy.f.e();
            e.getClass();
            return ((Boolean) e).booleanValue() ? avji.SHOW : avji.HIDE;
        }
        if (((bqeo) y.get(0)).l() != avji.HIDE) {
            avji l = ((bqeo) y.get(0)).l();
            l.getClass();
            return l;
        }
        if (((Boolean) avjy.k.e()).booleanValue()) {
            return this.b.h(4, this.c);
        }
        this.b.i(4, this.c);
        return avji.HIDE;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new avjs(this.b, this.c, ffguVar);
    }
}
