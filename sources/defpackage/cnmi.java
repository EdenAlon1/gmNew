package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnmi extends ffhv implements ffjm {
    final /* synthetic */ MessageCoreData a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnmi(ffgu ffguVar, MessageCoreData messageCoreData) {
        super(2, ffguVar);
        this.a = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnmi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        bdhg bdhgVar;
        ffci.b(obj);
        cnmd U = this.a.U();
        if (U == null) {
            return this.a;
        }
        cnmd U2 = this.a.U();
        if (U2 == null || !U2.c.k()) {
            bdhgVar = (bdhg) MessagesTable.i(U.b, new Function() { // from class: cnmh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    return ((MessagesTable.BindData) obj2).G();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            cnmd U3 = this.a.U();
            bdhgVar = U3 != null ? U3.c : null;
        }
        if (bdhgVar == null || ffkj.e(bdhgVar, bdhg.a)) {
            throw new IllegalStateException("Can't send a reply to a message without RCS id.");
        }
        MessageCoreData messageCoreData = this.a;
        clbi b = messageCoreData.aa() != null ? clbi.b(messageCoreData.aa()) : clbi.a();
        String str = bdhgVar.b;
        if (str == null) {
            throw new IllegalArgumentException("addGsmaReplyHeaders with empty rcsMessageId");
        }
        b.d(clbg.GSMA_RCS_NAMESPACE, "Reference-ID", str);
        b.d(clbg.GSMA_RCS_NAMESPACE, "Reference-Type", "Reply");
        String str2 = bdhgVar.b;
        if (str2 == null) {
            throw new IllegalArgumentException("addInReplyToMessageIdHeader with empty rcsMessageId");
        }
        b.d(clbg.REPLIES_NAMESPACE, "In-Reply-To-Message-Id", str2);
        messageCoreData.bs(b.c());
        return messageCoreData;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cnmi cnmiVar = new cnmi(ffguVar, this.a);
        cnmiVar.b = obj;
        return cnmiVar;
    }
}
