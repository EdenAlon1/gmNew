package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csci {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;

    public csci(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
    }

    public final Optional a(final String str) {
        return Optional.ofNullable(((bdrr) this.c.b()).b(str)).map(new Function() { // from class: csch
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                csci csciVar = csci.this;
                String str2 = str;
                bxro a = bdtf.a(aqvf.b(str2));
                csbx d = csby.d();
                d.c((ParticipantsTable.BindData) obj);
                d.b(bdvu.d(str2));
                if (a != null && a.l() == -1) {
                    ((crtt) d).a = a;
                }
                return d.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
