package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzqm {
    public static final boqd a(final awui awuiVar) {
        bore a = borh.a();
        a.z("ConversationEncryptionStatus#getRemoteInstanceBindData");
        a.c(new Function() { // from class: bzql
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                borg borgVar = (borg) obj;
                borgVar.aq(new dtrw("remote_user_id_to_registration_id.remote_user_id", 3, borg.av(awui.this.d), false));
                return borgVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtsu o = a.b().o();
        try {
            borc borcVar = (borc) o;
            boqd boqdVar = borcVar.moveToFirst() ? (boqd) borcVar.cO() : null;
            ffig.a(o, null);
            return boqdVar;
        } finally {
        }
    }
}
