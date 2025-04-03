package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aztb implements Function {
    public static final aztb a = new aztb();

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        bvvw bvvwVar = (bvvw) obj;
        int intValue = ParticipantsTable.i().intValue();
        if (intValue < 59930) {
            dtub.w("my_identity_token", intValue);
        }
        bvvwVar.aq(new dtrx("participants.my_identity_token", 5));
        return bvvwVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
