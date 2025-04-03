package defpackage;

import com.google.android.apps.messaging.home.select.SelectedConversation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aegn extends ffhv implements ffjm {
    final /* synthetic */ SelectedConversation a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aegn(SelectedConversation selectedConversation, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = selectedConversation;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aegn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bsob e = bsom.e();
        e.z("DebugConversationDetailsMenuExtension#getConversationDetails");
        final SelectedConversation selectedConversation = this.a;
        e.i(new Function() { // from class: aegm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                bsol bsolVar = (bsol) obj2;
                bsolVar.q(SelectedConversation.this.a);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bseh bsehVar = (bseh) ((bskr) e.b().o()).cQ();
        bsehVar.getClass();
        String a = bsehVar.a();
        a.getClass();
        return a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aegn(this.a, ffguVar);
    }
}
