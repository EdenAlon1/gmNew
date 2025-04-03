package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajrm {
    public static final buxm a(final MessageIdType messageIdType) {
        buxo d = MessagesTable.d();
        d.z("messageTimestampByIdQuery");
        d.f(new Function() { // from class: ajri
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((buum) obj).i;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.h(new Function() { // from class: ajrj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.q(MessageIdType.this);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return d.b();
    }

    public static final ajso b(final ajso ajsoVar, final bcse bcseVar) {
        buxo d = MessagesTable.d();
        d.z("setDistanceToRepliedToMessage");
        d.f(new Function() { // from class: ajrk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((buum) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.h(new Function() { // from class: ajrl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                int i = ajrn.b;
                buxzVar.aq(new dtru("messages.received_timestamp", 9, ajrm.a(bdhb.b(ajso.this.c))));
                bcse bcseVar2 = bcseVar;
                MessageIdType u = bcseVar2.u();
                u.getClass();
                buxzVar.aq(new dtru("messages.received_timestamp", 8, ajrm.a(u)));
                buxzVar.B(false);
                buxzVar.m(bcseVar2.t());
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = d.b().i();
        ajsn ajsnVar = (ajsn) ajsoVar.toBuilder();
        ajsnVar.copyOnWrite();
        ((ajso) ajsnVar.instance).f = i;
        eyfy build = ajsnVar.build();
        build.getClass();
        return (ajso) build;
    }
}
