package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqlh {
    public static final ProfilesTable.BindData a(final long j) {
        Object apply;
        bwon a = ProfilesTable.a();
        a.z("getProfileRowIfItExists");
        bwor bworVar = new bwor();
        apply = new Function() { // from class: aqlg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bwor bworVar2 = (bwor) obj;
                bworVar2.b(j);
                return bworVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bwor());
        bworVar.ar((bwor) apply);
        a.k(new bwoq(bworVar));
        engw cW = ((bwnm) a.b().o()).cW();
        if (cW.isEmpty()) {
            return null;
        }
        cW.getClass();
        return (ProfilesTable.BindData) ffdx.K(cW);
    }
}
