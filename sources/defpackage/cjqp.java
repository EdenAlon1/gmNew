package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjqp implements Function {
    public static final cjqp a = new cjqp();

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        bwor bworVar = (bwor) obj;
        int intValue = ProfilesTable.c().intValue();
        if (intValue < 60170) {
            dtub.w("profile_access_token", intValue);
        }
        bworVar.aq(new dtrx("profiles_table.profile_access_token", 6));
        bworVar.aq(new dtrx("profiles_table.display_name", 6));
        return bworVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
