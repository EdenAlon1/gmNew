package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azev extends ffhv implements ffjm {
    final /* synthetic */ azfe a;
    final /* synthetic */ azhq b;
    final /* synthetic */ bseh c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azev(ffgu ffguVar, azfe azfeVar, azhq azhqVar, bseh bsehVar) {
        super(2, ffguVar);
        this.a = azfeVar;
        this.b = azhqVar;
        this.c = bsehVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azev) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final ConversationIdType C = this.c.C();
        C.getClass();
        String[] strArr = bsdr.a;
        bsdm bsdmVar = new bsdm(bsdr.a);
        bsdmVar.z("CachingGroupManager#subscribeConversationToParticipantsChange");
        bsdmVar.f(new Function() { // from class: azel
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bsdq bsdqVar = (bsdq) obj2;
                bsdqVar.b(ConversationIdType.this);
                return bsdqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsdmVar.b().L(new azfb(this.a, this.b));
        return ((bczy) this.a.e.b()).L(this.c.C());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azev azevVar = new azev(ffguVar, this.a, this.b, this.c);
        azevVar.d = obj;
        return azevVar;
    }
}
