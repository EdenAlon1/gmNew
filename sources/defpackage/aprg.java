package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aprg extends ffhv implements ffjm {
    final /* synthetic */ MessageId a;
    final /* synthetic */ aprh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aprg(MessageId messageId, aprh aprhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = messageId;
        this.b = aprhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((aprg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (!ffkj.e(this.a, this.b.c)) {
            return null;
        }
        aprh aprhVar = this.b;
        aprhVar.e.c(new Supplier() { // from class: aprf
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "RichCardFileTransferProgressSupplier:Notify");
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aprg(this.a, this.b, ffguVar);
    }
}
